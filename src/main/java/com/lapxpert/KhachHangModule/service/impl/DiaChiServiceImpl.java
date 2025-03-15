package com.lapxpert.KhachHangModule.service.impl;

import com.lapxpert.KhachHangModule.entity.DiaChi;
import com.lapxpert.KhachHangModule.repository.DiaChiRepository;
import com.lapxpert.KhachHangModule.service.DiaChiService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiaChiServiceImpl implements DiaChiService {

    @Autowired
    DiaChiRepository diaChiRepository;

    @Override
    public List<DiaChi> getDiaChiByKhachHangId(Long khachHangId) {
        return diaChiRepository.findByKhachHangIdAndTinhTrang(khachHangId,true);
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
        List<DiaChi> diaChiList = diaChiRepository.findByKhachHangIdAndTinhTrang(khachHangId,true);
        for (DiaChi diaChi : diaChiList) {
            diaChi.setMacDinh(false);
        }
        diaChiRepository.saveAll(diaChiList);
    }



}
