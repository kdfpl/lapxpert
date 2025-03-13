package com.example.lapxpert.service;

import com.example.lapxpert.entity.HeDieuHanh;
import com.example.lapxpert.entity.LoaiSanPham;
import com.example.lapxpert.entity.SanPham;
import com.example.lapxpert.entity.ThuongHieu;
import com.example.lapxpert.repository.HeDieuHanhRepository;
import com.example.lapxpert.repository.LoaiSanPhamRepository;
import com.example.lapxpert.repository.SanPhamRepository;
import com.example.lapxpert.repository.ThuongHieuRepository;
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
