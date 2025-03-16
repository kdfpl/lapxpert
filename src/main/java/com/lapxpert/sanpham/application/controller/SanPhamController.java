package com.lapxpert.sanpham.application.controller;

import com.lapxpert.sanpham.domain.entity.HeDieuHanh;
import com.lapxpert.sanpham.domain.entity.LoaiSanPham;
import com.lapxpert.sanpham.domain.entity.SanPham;
import com.lapxpert.sanpham.domain.entity.ThuongHieu;
import com.lapxpert.sanpham.domain.service.SanPhamService;
import org.springframework.web.bind.annotation.*;

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
