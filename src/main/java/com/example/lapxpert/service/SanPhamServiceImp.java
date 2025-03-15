package com.example.lapxpert.service;

import com.example.lapxpert.entity.*;
import com.example.lapxpert.repository.HeDieuHanhRepository;
import com.example.lapxpert.repository.LoaiSanPhamRepository;
import com.example.lapxpert.repository.SanPhamRepository;
import com.example.lapxpert.repository.ThuongHieuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return sanPhamRepository.findByTinhTrangTrue();
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

    @Override
    public SanPham addSanPham(SanPham sanPham) {
        SanPham spNew = new SanPham();
        spNew.setLoai(sanPham.getLoai());
        spNew.setHeDieuHanh(sanPham.getHeDieuHanh());
        spNew.setThuongHieu(sanPham.getThuongHieu());
        spNew.setMaSp(sanPham.getMaSp());
        spNew.setTenSp(sanPham.getTenSp());
        spNew.setMoTa(sanPham.getMoTa());
        spNew.setBaoHanhThang(sanPham.getBaoHanhThang());
        spNew.setHinhAnh(sanPham.getHinhAnh());
        spNew.setTrangThai(sanPham.getTrangThai());
        spNew.setTinhTrang(true); // Đảm bảo mặc định true
        return sanPhamRepository.save(spNew);
    }

    @Override
    public SanPham updateSanPham(Integer id, SanPham sanPhamDetails) {
        Optional<SanPham> spOptional = sanPhamRepository.findById(id);
        if (spOptional.isPresent()) {
            SanPham sanPham = spOptional.get();
            sanPham.setLoai(sanPhamDetails.getLoai());
            sanPham.setHeDieuHanh(sanPhamDetails.getHeDieuHanh());
            sanPham.setThuongHieu(sanPhamDetails.getThuongHieu());
            sanPham.setMaSp(sanPhamDetails.getMaSp());
            sanPham.setTenSp(sanPhamDetails.getTenSp());
            sanPham.setMoTa(sanPhamDetails.getMoTa());
            sanPham.setBaoHanhThang(sanPhamDetails.getBaoHanhThang());
            sanPham.setHinhAnh(sanPhamDetails.getHinhAnh());
            sanPham.setTrangThai(sanPhamDetails.getTrangThai());
            sanPham.setTinhTrang(true); // Đảm bảo mặc định true
            return sanPhamRepository.save(sanPham);
        }
        return null;
    }

    @Override
    public boolean deleteSanPham(Integer id) {
        Optional<SanPham> spOptional = sanPhamRepository.findById(id);
        if (spOptional.isPresent()) {
            SanPham sanPham = spOptional.get();
            sanPham.setTinhTrang(false); // Xóa mềm
            sanPhamRepository.save(sanPham);
            return true;
        }
        return false;
    }
}
