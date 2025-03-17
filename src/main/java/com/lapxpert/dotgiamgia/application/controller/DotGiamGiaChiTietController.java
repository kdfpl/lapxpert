package com.lapxpert.dotgiamgia.application.controller;

import com.lapxpert.dotgiamgia.domain.entity.DotGiamGiaChiTiet;
import com.lapxpert.dotgiamgia.domain.service.DotGiamGiaChiTietService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/dot-giam-gia-chi-tiet")
public class DotGiamGiaChiTietController {
    private final DotGiamGiaChiTietService dotGiamGiaChiTietService;

    public DotGiamGiaChiTietController(DotGiamGiaChiTietService dotGiamGiaChiTietService) {
        this.dotGiamGiaChiTietService = dotGiamGiaChiTietService;
    }

    @GetMapping("fetch")
    public List<DotGiamGiaChiTiet> fetchDotGiamGiaChiTiets() {
        return dotGiamGiaChiTietService.findAll();
    }

    @PostMapping("add")
    public void addDotGiamGiaChiTiet(@RequestBody DotGiamGiaChiTiet dotGiamGiaChiTiet) {
        dotGiamGiaChiTietService.addOrUpdate(dotGiamGiaChiTiet);
    }
}
