package com.lapxpert.sanpham.application.controller;

import com.lapxpert.sanpham.domain.entity.*;
import com.lapxpert.sanpham.domain.service.SPCTService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/san-pham/san-pham-chi-tiet")
@CrossOrigin(origins = "*")
public class SPCTController {
    private final SPCTService sanPhamService;

    public SPCTController(SPCTService sanPhamService) {
        this.sanPhamService = sanPhamService;
    }

    @GetMapping("/fetch")
    public List<SanPhamChiTiet> getAllSanPhamCT() {
        return sanPhamService.getAllSpct();
    }

    @GetMapping("/ram")
    public List<Ram> getAllRam() {
        return sanPhamService.getAllRam();
    }

    @GetMapping("/man-hinh")
    public List<ManHinh> getAllManHinh() {
        return sanPhamService.getAllManHinh();
    }

    @GetMapping("/pin-sac")
    public List<PinSac> getAllPinSac() {
        return sanPhamService.getAllPinSac();
    }

    @GetMapping("/mau-sac")
    public List<MauSac> getAllMauSac() {
        return sanPhamService.getAllMauSac();
    }

    @GetMapping("/gpu")
    public List<Gpu> getAllGpu() {
        return sanPhamService.getAllGpu();
    }

    @GetMapping("/cpu")
    public List<Cpu> getAllCpu() {
        return sanPhamService.getAllCpu();
    }

    @GetMapping("/o-cung")
    public List<OCung> getAllOCung() {
        return sanPhamService.getAllOCung();
    }
}
