package com.example.lapxpert.repository;

import com.example.lapxpert.entity.SanPhamChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SPCTRepository extends JpaRepository<SanPhamChiTiet, Integer> {
    List<SanPhamChiTiet> findByTinhTrangTrue();
}
