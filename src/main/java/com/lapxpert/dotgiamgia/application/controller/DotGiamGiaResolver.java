package com.lapxpert.dotgiamgia.application.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lapxpert.dotgiamgia.application.controller.input.DotGiamGiaInput;
import com.lapxpert.dotgiamgia.domain.entity.DotGiamGia;
import com.lapxpert.dotgiamgia.domain.service.DotGiamGiaService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.graphql.data.method.annotation.Argument;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

@DgsComponent
public class DotGiamGiaResolver {

    private final DotGiamGiaService dotGiamGiaService;
    private final ObjectMapper objectMapper;

    public DotGiamGiaResolver(DotGiamGiaService dotGiamGiaService, ObjectMapper objectMapper) {
        this.dotGiamGiaService = dotGiamGiaService;
        this.objectMapper = objectMapper;
    }

    @DgsQuery
    public List<DotGiamGia> dotGiamGias() {
        return dotGiamGiaService.findAll();
    }

    @DgsQuery
    public Optional<DotGiamGia> dotGiamGiaById(@InputArgument String id) {
        return dotGiamGiaService.findById(Integer.parseInt(id));
    }

    @DgsMutation
    public DotGiamGia createDotGiamGia(@InputArgument DotGiamGiaInput input) {
        DotGiamGia dotGiamGia = objectMapper.convertValue(input, DotGiamGia.class);
        return dotGiamGiaService.addOrUpdate(dotGiamGia);
    }

    @DgsMutation
    public DotGiamGia updateDotGiamGia(@Argument String id, @InputArgument DotGiamGiaInput input) {
        DotGiamGia dotGiamGia = dotGiamGiaService.findById(Integer.parseInt(id)).orElse(null);
        for (Field field : DotGiamGiaInput.class.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(input);
                if (value != null) {
                    Field existingField = DotGiamGia.class.getDeclaredField(field.getName());
                    existingField.setAccessible(true);
                    existingField.set(dotGiamGia, value);
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                throw new RuntimeException("Lỗi cập nhật trường " + field.getName(), e);
            }
        }
        return dotGiamGiaService.addOrUpdate(dotGiamGia);
    }

    @DgsMutation
    public void deleteDotGiamGia(@InputArgument String id) {
        dotGiamGiaService.deleteById(Integer.parseInt(id));
    }
}
