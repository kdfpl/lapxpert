package com.lapxpert.phieugiamgia.domain.service;

import com.lapxpert.khachhang.domain.entity.KhachHang;
import com.lapxpert.khachhang.domain.repository.KhachHangRepository;
import com.lapxpert.phieugiamgia.domain.entity.PhieuGiamGia;
import com.lapxpert.phieugiamgia.domain.entity.PhieuGiamGiaKhachHang;
import com.lapxpert.phieugiamgia.domain.repository.PhieuGiamGiaKhachHangRepository;
import com.lapxpert.phieugiamgia.domain.repository.PhieuGiamGiaRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Service
public class PhieuGiamGiaService {
    private final PhieuGiamGiaRepository phieuGiamGiaRepository;
    private final PhieuGiamGiaKhachHangRepository phieuGiamGiaKhachHangRepository;

    public PhieuGiamGiaService(PhieuGiamGiaRepository phieuGiamGiaRepository,
                               PhieuGiamGiaKhachHangRepository phieuGiamGiaKhachHangRepository) {
        this.phieuGiamGiaRepository = phieuGiamGiaRepository;
        this.phieuGiamGiaKhachHangRepository = phieuGiamGiaKhachHangRepository;
    }

    public List<PhieuGiamGia> getAll() {
        return phieuGiamGiaRepository.findByTinhTrangTrue();
    }

    public void addOrUpdate(PhieuGiamGia p) {
        LocalDate today = LocalDate.now();
        if (p.getThoiGianKetThuc().isBefore(today)) {
            p.setTrangThai("Đã kết thúc");
        } else if (p.getThoiGianBatDau().isBefore(today) || p.getThoiGianBatDau().isEqual(today)) {
            p.setTrangThai("Đã bắt đầu");
        } else {
            p.setTrangThai("Chưa diễn ra");
        }
        phieuGiamGiaRepository.save(p);
    }
    public void delete(Integer id){
        PhieuGiamGia phieuGiamGia = phieuGiamGiaRepository.findById(id).orElse(null);
        if (phieuGiamGia != null) {
            phieuGiamGia.setTinhTrang(false);
            phieuGiamGiaRepository.save(phieuGiamGia);
        }
    }

    public PhieuGiamGia searchByID(Integer id) {
        return phieuGiamGiaRepository.findById(id).orElse(null);
    }
}
