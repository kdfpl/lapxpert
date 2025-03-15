package com.example.lapxpert.service;

import com.example.lapxpert.entity.*;

import java.util.List;

public interface SanPhamService {
    List<SanPham> getAllSP();
    List<ThuongHieu> getAllThuongHieu();
    List<HeDieuHanh> getAllHeDieuHanh();
    List<LoaiSanPham> getAllLoaiSanPham();

    public SanPham addSanPham(SanPham sanPham);
    public SanPham updateSanPham(Integer id, SanPham sanPham);
    public boolean deleteSanPham(Integer id);
}
