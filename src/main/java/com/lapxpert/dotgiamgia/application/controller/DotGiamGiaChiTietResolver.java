package com.lapxpert.dotgiamgia.application.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lapxpert.dotgiamgia.application.controller.input.DotGiamGiaChiTietInput;
import com.lapxpert.dotgiamgia.domain.entity.DotGiamGia;
import com.lapxpert.dotgiamgia.domain.entity.DotGiamGiaChiTiet;
import com.lapxpert.dotgiamgia.domain.service.DotGiamGiaChiTietService;
import com.lapxpert.dotgiamgia.domain.service.DotGiamGiaService;
import com.lapxpert.sanpham.domain.entity.SanPhamChiTiet;
import com.lapxpert.sanpham.domain.service.SPCTService;
import com.netflix.graphql.dgs.*;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@DgsComponent
@CrossOrigin(origins = "*")
public class DotGiamGiaChiTietResolver {
    private final DotGiamGiaChiTietService dotGiamGiaChiTietService;
    private final ObjectMapper objectMapper;
    private final DotGiamGiaService dotGiamGiaService;
    private final SPCTService spctService;

    public DotGiamGiaChiTietResolver(DotGiamGiaChiTietService dotGiamGiaChiTietService, ObjectMapper objectMapper, DotGiamGiaService dotGiamGiaService, SPCTService spctService) {
        this.dotGiamGiaChiTietService = dotGiamGiaChiTietService;
        this.objectMapper = objectMapper;
        this.dotGiamGiaService = dotGiamGiaService;
        this.spctService = spctService;
    }

    @DgsData(parentType = "DotGiamGia")
    public List<DotGiamGiaChiTiet> chiTiet(DgsDataFetchingEnvironment dfe) {
        DotGiamGia dotGiamGia = dfe.getSource();
        assert dotGiamGia != null;
        return dotGiamGiaChiTietService.findByIdDotGiamGia(dotGiamGia.getId());
    }

    @DgsQuery
    public List<DotGiamGiaChiTiet> dotGiamGiaChiTiets() {
        return dotGiamGiaChiTietService.findAll();
    }

    @DgsQuery
    public Optional<DotGiamGiaChiTiet> dotGiamGiaChiTietById(@InputArgument String id) {
        return dotGiamGiaChiTietService.findById(Integer.parseInt(id));
    }

    @DgsMutation
    public void createDotGiamGiaChiTiet(@InputArgument DotGiamGiaChiTietInput input) {
        DotGiamGiaChiTiet dotGiamGiaChiTiet = new DotGiamGiaChiTiet();
        dotGiamGiaChiTiet.setMaDotChiTiet(input.getMaDotChiTiet());

        DotGiamGia dotGiamGia = dotGiamGiaService.findById(input.getDotGiamGiaId()).orElse(null);
        dotGiamGiaChiTiet.setDotGiamGia(dotGiamGia);

        SanPhamChiTiet sanPhamChiTiet = spctService.getSPCTById(input.getSanPhamChiTietId());
        dotGiamGiaChiTiet.setSanPhamChiTiet(sanPhamChiTiet);
        dotGiamGiaChiTietService.addOrUpdate(dotGiamGiaChiTiet);
    }

    @DgsMutation
    public void updateDotGiamGiaChiTiet(@Argument String id, @InputArgument DotGiamGiaChiTietInput input) {
        DotGiamGiaChiTiet dotGiamGiaChiTiet = dotGiamGiaChiTietService.findById(Integer.parseInt(id))
                .orElseThrow(() -> new RuntimeException("Không tìm thấy DotGiamGiaChiTiet"));

        // Cập nhật thông tin bình thường
        if (input.getMaDotChiTiet() != null) {
            dotGiamGiaChiTiet.setMaDotChiTiet(input.getMaDotChiTiet());
        }
        if (input.getTinhTrang() != null) {
            dotGiamGiaChiTiet.setTinhTrang(input.getTinhTrang());
        }

        // Xử lý dotGiamGiaId riêng
        if (input.getDotGiamGiaId() != null) {
            DotGiamGia dotGiamGia = dotGiamGiaService.findById(input.getDotGiamGiaId())
                    .orElseThrow(() -> new RuntimeException("Không tìm thấy DotGiamGia"));
            dotGiamGiaChiTiet.setDotGiamGia(dotGiamGia);
        }

        // Xử lý sanPhamChiTietId riêng
        if (input.getSanPhamChiTietId() != null) {
            SanPhamChiTiet sanPhamChiTiet = spctService.getSPCTById(input.getSanPhamChiTietId());
            dotGiamGiaChiTiet.setSanPhamChiTiet(sanPhamChiTiet);
        }

        dotGiamGiaChiTietService.addOrUpdate(dotGiamGiaChiTiet);
    }

}
