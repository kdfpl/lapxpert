package com.lapxpert.dotgiamgia.application.controller;

import com.lapxpert.dotgiamgia.domain.entity.DotGiamGia;
import com.lapxpert.dotgiamgia.domain.service.DotGiamGiaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dotgiamgia")
public class DotGiamGiaController {
    private final DotGiamGiaService dotGiamGiaService;

    public DotGiamGiaController(DotGiamGiaService dotGiamGiaService) {
        this.dotGiamGiaService = dotGiamGiaService;
    }

    @GetMapping("/fetch")
    @ResponseBody
    public List<DotGiamGia> fetchDotGiamGias() {
        return dotGiamGiaService.findAll();
    }
}
