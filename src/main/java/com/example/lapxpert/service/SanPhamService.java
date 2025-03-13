package com.example.lapxpert.service;

import com.example.lapxpert.entity.HeDieuHanh;
import com.example.lapxpert.entity.LoaiSanPham;
import com.example.lapxpert.entity.SanPham;
import com.example.lapxpert.entity.ThuongHieu;

import java.util.List;

public interface SanPhamService {
    List<SanPham> getAllSP();
    List<ThuongHieu> getAllThuongHieu();
    List<HeDieuHanh> getAllHeDieuHanh();
    List<LoaiSanPham> getAllLoaiSanPham();
}
