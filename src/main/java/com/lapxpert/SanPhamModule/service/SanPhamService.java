package com.lapxpert.SanPhamModule.service;


import com.lapxpert.SanPhamModule.entity.*;

import java.util.List;

public interface SanPhamService {
    List<SanPham> getAllSP();
    List<ThuongHieu> getAllThuongHieu();
    List<HeDieuHanh> getAllHeDieuHanh();
    List<LoaiSanPham> getAllLoaiSanPham();
}
