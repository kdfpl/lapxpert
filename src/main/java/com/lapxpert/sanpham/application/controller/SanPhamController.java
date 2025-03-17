package com.lapxpert.sanpham.application.controller;

import com.lapxpert.sanpham.domain.entity.HeDieuHanh;
import com.lapxpert.sanpham.domain.entity.LoaiSanPham;
import com.lapxpert.sanpham.domain.entity.SanPham;
import com.lapxpert.sanpham.domain.entity.ThuongHieu;
import com.lapxpert.sanpham.domain.service.SanPhamService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/san-pham")
@CrossOrigin(origins = "*")
public class SanPhamController {

    private final SanPhamService sanPhamService;

    public SanPhamController(SanPhamService sanPhamService) {
        this.sanPhamService = sanPhamService;
    }


    @GetMapping("/fetch")
    public List<SanPham> getAllSanPham() {
        return sanPhamService.getAllSP();
    }

    @GetMapping("/thuong-hieu")
    public List<ThuongHieu> getAllThuongHieu() {
        return sanPhamService.getAllThuongHieu();
    }

    @GetMapping("/he-dieu-hanh")
    public List<HeDieuHanh> getAllHeDieuHanh() {
        return sanPhamService.getAllHeDieuHanh();
    }

    @GetMapping("/loai-san-pham")
    public List<LoaiSanPham> getAllLoaiSanPham() {
        return sanPhamService.getAllLoaiSanPham();
    }
}
