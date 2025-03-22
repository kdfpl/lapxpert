package com.lapxpert.phieugiamgia.domain.repository;

import com.lapxpert.phieugiamgia.domain.entity.PhieuGiamGia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhieuGiamGiaRepository extends JpaRepository<PhieuGiamGia, Integer> {
    List<PhieuGiamGia> findByTinhTrangTrue();
}