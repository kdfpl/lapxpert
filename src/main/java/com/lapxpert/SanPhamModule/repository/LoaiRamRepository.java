package com.lapxpert.SanPhamModule.repository;

import com.lapxpert.SanPhamModule.entity.LoaiRam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiRamRepository extends JpaRepository<LoaiRam, Integer> {
}
