package com.lapxpert.nhanvien.domain.service.impl;

import com.lapxpert.nhanvien.domain.entity.DiaChiNV;
import com.lapxpert.nhanvien.domain.repository.DiaChiNVRepository;
import com.lapxpert.nhanvien.domain.service.DiaChiService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiaChiNVServiceImpl implements DiaChiService {

    private final DiaChiNVRepository diaChiRepository;

    public DiaChiNVServiceImpl(DiaChiNVRepository diaChiRepository) {
        this.diaChiRepository = diaChiRepository;
    }

    @Override
    public List<DiaChiNV> getDiaChiByNhanVienId(Long khachHangId) {
        return diaChiRepository.findByNhanVienIdAndTinhTrang(khachHangId, true);
    }

    @Override
    public Optional<DiaChiNV> getDiaChiMacDinh(Long id, boolean macDinh) {
        return diaChiRepository.findByNhanVienIdAndAndMacDinh(id,macDinh);
    }

    @Override
    public void saveAll(List<DiaChiNV> diaChi) {
        diaChiRepository.saveAll(diaChi);
    }

    @Override
    @Transactional
    public void deleteDiaChi(Long id) {
        diaChiRepository.softDeleteByNhanVienId(id);
    }

    @Override
    public void resetMacDinh(Long khachHangId) {
        List<DiaChiNV> diaChiList = diaChiRepository.findByNhanVienIdAndTinhTrang(khachHangId, true);
        for (DiaChiNV diaChi : diaChiList) {
            diaChi.setMacDinh(false);
        }
        diaChiRepository.saveAll(diaChiList);
    }

}
