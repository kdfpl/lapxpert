package com.lapxpert.khachhang.domain.service.impl;

import com.lapxpert.khachhang.domain.entity.DiaChiKH;
import com.lapxpert.khachhang.domain.repository.DiaChiKHRepository;
import com.lapxpert.khachhang.domain.service.DiaChiService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiaChiKHServiceImpl implements DiaChiService {

    private final DiaChiKHRepository diaChiRepository;

    public DiaChiKHServiceImpl(DiaChiKHRepository diaChiRepository) {
        this.diaChiRepository = diaChiRepository;
    }

    @Override
    public List<DiaChiKH> getDiaChiByKhachHangId(Long khachHangId) {
        return diaChiRepository.findByKhachHangIdAndTinhTrang(khachHangId, true);
    }

    @Override
    public Optional<DiaChiKH> getDiaChiMacDinh(Long id, boolean macDinh) {
        return diaChiRepository.findByKhachHangIdAndAndMacDinh(id,macDinh);
    }

    @Override
    public void saveAll(List<DiaChiKH> diaChi) {
        diaChiRepository.saveAll(diaChi);
    }

    @Override
    @Transactional
    public void deleteDiaChi(Long id) {
        diaChiRepository.softDeleteByKhachHangId(id);
    }

    @Override
    public void resetMacDinh(Long khachHangId) {
        List<DiaChiKH> diaChiList = diaChiRepository.findByKhachHangIdAndTinhTrang(khachHangId, true);
        for (DiaChiKH diaChi : diaChiList) {
            diaChi.setMacDinh(false);
        }
        diaChiRepository.saveAll(diaChiList);
    }

}
