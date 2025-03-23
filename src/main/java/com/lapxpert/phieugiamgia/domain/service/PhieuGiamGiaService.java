package com.lapxpert.phieugiamgia.domain.service;

import com.lapxpert.khachhang.domain.entity.KhachHang;
import com.lapxpert.khachhang.domain.repository.KhachHangRepository;
import com.lapxpert.phieugiamgia.domain.entity.PhieuGiamGia;
import com.lapxpert.phieugiamgia.domain.entity.PhieuGiamGiaKhachHang;
import com.lapxpert.phieugiamgia.domain.repository.PhieuGiamGiaKhachHangRepository;
import com.lapxpert.phieugiamgia.domain.repository.PhieuGiamGiaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhieuGiamGiaService {
    private final PhieuGiamGiaRepository phieuGiamGiaRepository;
    private final PhieuGiamGiaKhachHangRepository phieuGiamGiaKhachHangRepository;
    private final KhachHangRepository khachHangRepository;

    public PhieuGiamGiaService(PhieuGiamGiaRepository phieuGiamGiaRepository,
                               PhieuGiamGiaKhachHangRepository phieuGiamGiaKhachHangRepository,
                               KhachHangRepository khachHangRepository) {
        this.phieuGiamGiaRepository = phieuGiamGiaRepository;
        this.phieuGiamGiaKhachHangRepository = phieuGiamGiaKhachHangRepository;
        this.khachHangRepository = khachHangRepository;
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
    @Transactional
    public String assignVoucherToCustomers(Integer phieuGiamGiaId, List<Long> customerIds) {
        PhieuGiamGia phieuGiamGia = phieuGiamGiaRepository.findById(phieuGiamGiaId).orElse(null);
        if (phieuGiamGia == null) {
            return "Phiếu giảm giá không tồn tại!";
        }

        if (customerIds == null || customerIds.isEmpty()) {
            return "Danh sách khách hàng không hợp lệ!";
        }

        phieuGiamGiaKhachHangRepository.deleteByPhieuGiamGiaId(phieuGiamGiaId);

        List<KhachHang> customers = khachHangRepository.findAllById(customerIds);
        if (customers.isEmpty()) {
            return "Không tìm thấy khách hàng hợp lệ!";
        }

        List<PhieuGiamGiaKhachHang> phieuGiamGiaKhachHangs = customers.stream()
                .map(kh -> new PhieuGiamGiaKhachHang(phieuGiamGia, kh))
                .collect(Collectors.toList());
        phieuGiamGiaKhachHangRepository.saveAll(phieuGiamGiaKhachHangs);

        return "Gán phiếu giảm giá thành công cho " + customers.size() + " khách hàng!";
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
