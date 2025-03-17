package com.lapxpert.khachhang.domain.repository;

import com.lapxpert.khachhang.domain.entity.DiaChi;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaChiRepository extends JpaRepository<DiaChi, Long> {
    List<DiaChi> findByKhachHangIdAndTinhTrang(Long khachHangId, boolean tinhTrang);

    @Transactional
    @Modifying
    @Query("UPDATE DiaChi d SET d.tinhTrang = false WHERE d.khachHang.id = :khachHangId")
    void softDeleteByKhachHangId(Long khachHangId);
}