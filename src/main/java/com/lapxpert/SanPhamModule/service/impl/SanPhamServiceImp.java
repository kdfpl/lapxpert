package com.lapxpert.SanPhamModule.service.impl;


import com.lapxpert.SanPhamModule.entity.*;
import com.lapxpert.SanPhamModule.repository.*;
import com.lapxpert.SanPhamModule.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImp implements SanPhamService {
    @Autowired
    SanPhamRepository sanPhamRepository;
    @Autowired
    ThuongHieuRepository thuongHieuRepository;
    @Autowired
    HeDieuHanhRepository heDieuHanhRepository;
    @Autowired
    LoaiSanPhamRepository loaiSanPhamRepository;

    @Override
    public List<SanPham> getAllSP() {
        return sanPhamRepository.findAll();
    }

    @Override
    public List<ThuongHieu> getAllThuongHieu() {
        return thuongHieuRepository.findAll();
    }

    @Override
    public List<HeDieuHanh> getAllHeDieuHanh() {
        return heDieuHanhRepository.findAll();
    }

    @Override
    public List<LoaiSanPham> getAllLoaiSanPham() {
        return loaiSanPhamRepository.findAll();
    }
}
