package com.lapxpert.nhanvien.domain.repository;

import com.lapxpert.nhanvien.domain.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {
    List<NhanVien> findAllByTinhTrang(boolean tinhTrang);

    boolean existsByEmailAndTinhTrangIsTrueAndIdNot(String email, Long id);

    boolean existsBySdtAndTinhTrangIsTrueAndIdNot(String sdt, Long id);

    @Query("SELECT MAX(n.maNhanVien) FROM NhanVien n WHERE n.maNhanVien LIKE 'NV%'")
    String findLastMaNhanVien();

    @Query("SELECT nv FROM NhanVien nv " +
            "JOIN nv.chucVu cv " +
            "WHERE (:searchText IS NULL OR " +
            "LOWER(nv.hoTen) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
            "LOWER(nv.email) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
            "LOWER(nv.sdt) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
            "LOWER(cv.tenChucVu) LIKE LOWER(CONCAT('%', :searchText, '%'))) " +
            "AND nv.tinhTrang = TRUE")
    List<NhanVien> searchNhanVien(@Param("searchText") String searchText);
}