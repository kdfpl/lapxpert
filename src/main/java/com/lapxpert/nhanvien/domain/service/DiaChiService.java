package com.lapxpert.nhanvien.domain.service;

import com.lapxpert.khachhang.domain.entity.DiaChiKH;
import com.lapxpert.nhanvien.domain.entity.DiaChiNV;

import java.util.List;
import java.util.Optional;

public interface DiaChiService {

    List<DiaChiNV> getDiaChiByNhanVienId(Long NhanVienId);

    Optional<DiaChiNV> getDiaChiMacDinh(Long id , boolean macDinh);

    void saveAll(List<DiaChiNV> diaChi);

    void deleteDiaChi(Long id);

    void resetMacDinh(Long NhanVienId);

}
