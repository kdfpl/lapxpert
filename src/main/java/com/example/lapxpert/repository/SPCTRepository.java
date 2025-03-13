package com.example.lapxpert.repository;

import com.example.lapxpert.entity.SanPhamChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SPCTRepository extends JpaRepository<SanPhamChiTiet, Integer> {
}
