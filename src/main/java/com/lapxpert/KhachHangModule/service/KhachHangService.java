package com.lapxpert.KhachHangModule.service;

import com.lapxpert.KhachHangModule.entity.KhachHang;

import java.util.List;
import java.util.Optional;

public interface KhachHangService {
    List<KhachHang> getAll();
    Optional<KhachHang> getByID(long id);
    KhachHang save(KhachHang khachHang);
    void remove(long id);
    String generateMaKhachHang();
    boolean existsByEmailOrSdt(String email, String sdt , long id);

}
