package com.lapxpert.khachhang.domain.service;

import com.lapxpert.khachhang.domain.entity.DiaChiKH;

import java.util.List;
import java.util.Optional;

public interface DiaChiService {

    List<DiaChiKH> getDiaChiByKhachHangId(Long khachHangId);

    Optional<DiaChiKH> getDiaChiMacDinh(Long id , boolean macDinh);

    void saveAll(List<DiaChiKH> diaChi);

    void deleteDiaChi(Long id);

    void resetMacDinh(Long khachHangId);

}
