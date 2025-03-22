package com.lapxpert.phieugiamgia.domain.repository;

import com.lapxpert.phieugiamgia.domain.entity.PhieuGiamGiaKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhieuGiamGiaKhachHangRepository extends JpaRepository<PhieuGiamGiaKhachHang, Integer> {
    List<PhieuGiamGiaKhachHang> findByIdGiamGia_Id(Integer voucherId);
    boolean existsByIdGiamGia_IdAndIdKhachHang_Id(Integer idGiamGia, Long idKhachHang);
}
