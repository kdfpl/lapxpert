package com.lapxpert.Respository;

import com.lapxpert.Entity.PhieuGiamGia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhieuGiamGiaRespository extends JpaRepository<PhieuGiamGia, Integer> {
    List<PhieuGiamGia> findByTinhTrangTrue();
}
