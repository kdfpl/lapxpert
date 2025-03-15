package com.lapxpert.KhachHangModule.service;

import com.lapxpert.KhachHangModule.entity.DiaChi;

import java.util.List;

public interface DiaChiService {

    public List<DiaChi> getDiaChiByKhachHangId(Long khachHangId) ;

    public void saveAll(List<DiaChi> diaChi) ;

    public void deleteDiaChi(Long id) ;

    public void resetMacDinh(Long khachHangId) ;

}
