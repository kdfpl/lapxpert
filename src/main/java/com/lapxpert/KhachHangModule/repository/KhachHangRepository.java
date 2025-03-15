package com.lapxpert.KhachHangModule.repository;

import com.lapxpert.KhachHangModule.entity.KhachHang;
import com.lapxpert.NhanVienModule.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KhachHangRepository extends JpaRepository<KhachHang, Long> {
    List<KhachHang> findAllByTinhTrang(boolean tinhTrang);
    boolean existsByEmailAndTinhTrangIsTrueAndIdNot(String email, Long id);
    boolean existsBySdtAndTinhTrangIsTrueAndIdNot(String sdt, Long id);


    @Query("SELECT MAX(n.maKhachHang) FROM KhachHang n WHERE n.maKhachHang LIKE 'KH%'")
    String findLastMaKhachHang();
}
