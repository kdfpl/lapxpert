package com.lapxpert.SanPhamModule.repository;

import com.lapxpert.SanPhamModule.entity.SanPhamChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SPCTRepository extends JpaRepository<SanPhamChiTiet, Integer> {
}
