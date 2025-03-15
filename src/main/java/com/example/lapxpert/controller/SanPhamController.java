package com.example.lapxpert.controller;

import com.example.lapxpert.entity.*;
import com.example.lapxpert.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //    San Pham
    @PostMapping("/add")
    public SanPham addSanPham(@RequestBody SanPham sanPham) {
        return sanPhamService.addSanPham(sanPham);
    }

    @PutMapping("/update/{id}")
    public SanPham updateSanPham(@PathVariable Integer id, @RequestBody SanPham sanPham) {
        return sanPhamService.updateSanPham(id, sanPham);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteSanPham(@PathVariable Integer id) {
        return sanPhamService.deleteSanPham(id);
    }
}
