package com.example.lapxpert.controller;

import com.example.lapxpert.entity.HeDieuHanh;
import com.example.lapxpert.entity.LoaiSanPham;
import com.example.lapxpert.entity.SanPham;
import com.example.lapxpert.entity.ThuongHieu;
import com.example.lapxpert.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/san-pham")
@CrossOrigin(origins = "*")
public class SanPhamController {
    @Autowired
    SanPhamService sanPhamService;

    @GetMapping("/list")
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
