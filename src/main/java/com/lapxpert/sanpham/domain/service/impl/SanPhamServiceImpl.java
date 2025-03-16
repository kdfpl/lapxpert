package com.lapxpert.sanpham.domain.service.impl;

import com.lapxpert.sanpham.domain.entity.HeDieuHanh;
import com.lapxpert.sanpham.domain.entity.LoaiSanPham;
import com.lapxpert.sanpham.domain.entity.SanPham;
import com.lapxpert.sanpham.domain.entity.ThuongHieu;
import com.lapxpert.sanpham.domain.repository.HeDieuHanhRepository;
import com.lapxpert.sanpham.domain.repository.LoaiSanPhamRepository;
import com.lapxpert.sanpham.domain.repository.SanPhamRepository;
import com.lapxpert.sanpham.domain.repository.ThuongHieuRepository;
import com.lapxpert.sanpham.domain.service.SanPhamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {

    private final SanPhamRepository sanPhamRepository;

    private final ThuongHieuRepository thuongHieuRepository;

    private final HeDieuHanhRepository heDieuHanhRepository;

    private final LoaiSanPhamRepository loaiSanPhamRepository;

    public SanPhamServiceImpl(SanPhamRepository sanPhamRepository, ThuongHieuRepository thuongHieuRepository, HeDieuHanhRepository heDieuHanhRepository, LoaiSanPhamRepository loaiSanPhamRepository) {
        this.sanPhamRepository = sanPhamRepository;
        this.thuongHieuRepository = thuongHieuRepository;
        this.heDieuHanhRepository = heDieuHanhRepository;
        this.loaiSanPhamRepository = loaiSanPhamRepository;
    }

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
