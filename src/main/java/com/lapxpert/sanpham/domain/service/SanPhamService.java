package com.lapxpert.sanpham.domain.service;

import com.lapxpert.sanpham.domain.entity.HeDieuHanh;
import com.lapxpert.sanpham.domain.entity.LoaiSanPham;
import com.lapxpert.sanpham.domain.entity.SanPham;
import com.lapxpert.sanpham.domain.entity.ThuongHieu;

import java.util.List;

public interface SanPhamService {
    List<SanPham> getAllSP();

    List<ThuongHieu> getAllThuongHieu();

    List<HeDieuHanh> getAllHeDieuHanh();

    List<LoaiSanPham> getAllLoaiSanPham();

    SanPham addSanPham(SanPham sanPham);

    SanPham updateSanPham(Integer id, SanPham sanPham);

    boolean deleteSanPham(Integer id);
}
