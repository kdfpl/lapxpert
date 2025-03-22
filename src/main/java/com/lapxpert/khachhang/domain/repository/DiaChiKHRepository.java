package com.lapxpert.khachhang.domain.repository;

import com.lapxpert.khachhang.domain.entity.DiaChiKH;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DiaChiKHRepository extends JpaRepository<DiaChiKH, Long> {
    List<DiaChiKH> findByKhachHangIdAndTinhTrang(Long khachHangId, boolean tinhTrang);

    Optional<DiaChiKH> findByKhachHangIdAndAndMacDinh(Long khachHangId, boolean tinhTrang);

    @Transactional
    @Modifying
    @Query("UPDATE DiaChiKH d SET d.macDinh = false ,d.tinhTrang = false WHERE d.khachHang.id = :khachHangId")
    void softDeleteByKhachHangId(Long khachHangId);
}