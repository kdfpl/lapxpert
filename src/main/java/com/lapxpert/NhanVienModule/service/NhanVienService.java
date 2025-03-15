package com.lapxpert.NhanVienModule.service;

import com.lapxpert.KhachHangModule.entity.KhachHang;
import com.lapxpert.NhanVienModule.entity.NhanVien;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface NhanVienService {
    List<NhanVien> getAll();

    Optional<NhanVien> getByID(long id);
    NhanVien save(NhanVien NhanVien);
    void remove(long id);

    boolean existsByEmailOrSdt(String email, String sdt , long id);

    String generateMaNhanVien();

    List<NhanVien> searchNhanVien(@Param("searchText") String searchText);
}
