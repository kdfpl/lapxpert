package com.lapxpert.khachhang.domain.service.impl;

import com.lapxpert.khachhang.domain.entity.DiaChi;
import com.lapxpert.khachhang.domain.repository.DiaChiRepository;
import com.lapxpert.khachhang.domain.service.DiaChiService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaChiServiceImpl implements DiaChiService {

    private final DiaChiRepository diaChiRepository;

    public DiaChiServiceImpl(DiaChiRepository diaChiRepository) {
        this.diaChiRepository = diaChiRepository;
    }

    @Override
    public List<DiaChi> getDiaChiByKhachHangId(Long khachHangId) {
        return diaChiRepository.findByKhachHangIdAndTinhTrang(khachHangId, true);
    }

    @Override
    public void saveAll(List<DiaChi> diaChi) {
        diaChiRepository.saveAll(diaChi);
    }

    @Override
    @Transactional
    public void deleteDiaChi(Long id) {
        diaChiRepository.softDeleteByKhachHangId(id);
    }

    @Override
    public void resetMacDinh(Long khachHangId) {
        List<DiaChi> diaChiList = diaChiRepository.findByKhachHangIdAndTinhTrang(khachHangId, true);
        for (DiaChi diaChi : diaChiList) {
            diaChi.setMacDinh(false);
        }
        diaChiRepository.saveAll(diaChiList);
    }

}
