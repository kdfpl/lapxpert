package com.lapxpert.sanpham.domain.repository;

import com.lapxpert.sanpham.domain.entity.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {
    List<Cpu> findByTinhTrangTrue();
}