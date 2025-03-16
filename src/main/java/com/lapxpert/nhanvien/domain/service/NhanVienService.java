package com.lapxpert.nhanvien.domain.service;

import com.lapxpert.nhanvien.domain.entity.NhanVien;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface NhanVienService {
    List<NhanVien> getAll();

    Optional<NhanVien> getByID(long id);

    NhanVien save(NhanVien NhanVien);

    void remove(long id);

    boolean existsByEmailOrSdt(String email, String sdt, long id);

    String generateMaNhanVien();

    List<NhanVien> searchNhanVien(@Param("searchText") String searchText);
}
