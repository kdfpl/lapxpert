package com.lapxpert.SanPhamModule.repository;

import com.lapxpert.SanPhamModule.entity.Gpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GpuRepository extends JpaRepository<Gpu, Integer> {
}
