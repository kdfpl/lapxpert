package com.lapxpert.SanPhamModule.repository;

import com.lapxpert.SanPhamModule.entity.HeDieuHanh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeDieuHanhRepository extends JpaRepository<HeDieuHanh, Integer> {
}
