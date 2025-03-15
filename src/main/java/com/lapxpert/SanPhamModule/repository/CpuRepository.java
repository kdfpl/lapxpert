package com.lapxpert.SanPhamModule.repository;

import com.lapxpert.SanPhamModule.entity.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {
}
