package com.lapxpert.phieugiamgia.domain.repository;

import com.lapxpert.phieugiamgia.domain.entity.PhieuGiamGiaKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhieuGiamGiaKhachHangRepository extends JpaRepository<PhieuGiamGiaKhachHang, Integer> {
    @Modifying
    @Query("DELETE FROM PhieuGiamGiaKhachHang p WHERE p.idGiamGia = :phieuGiamGiaId")
    void deleteByPhieuGiamGiaId(@Param("phieuGiamGiaId") Integer phieuGiamGiaId);
    List<PhieuGiamGiaKhachHang> findByIdGiamGia_Id(Integer voucherId);
    boolean existsByIdGiamGia_IdAndIdKhachHang_Id(Integer idGiamGia, Long idKhachHang);
}
