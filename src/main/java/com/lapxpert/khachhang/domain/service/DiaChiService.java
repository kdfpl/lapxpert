package com.lapxpert.khachhang.domain.service;

import com.lapxpert.khachhang.domain.entity.DiaChi;

import java.util.List;

public interface DiaChiService {

    List<DiaChi> getDiaChiByKhachHangId(Long khachHangId);

    void saveAll(List<DiaChi> diaChi);

    void deleteDiaChi(Long id);

    void resetMacDinh(Long khachHangId);

}
