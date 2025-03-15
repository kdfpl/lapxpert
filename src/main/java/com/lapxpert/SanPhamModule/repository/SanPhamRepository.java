package com.lapxpert.SanPhamModule.repository;

import com.lapxpert.SanPhamModule.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
}
