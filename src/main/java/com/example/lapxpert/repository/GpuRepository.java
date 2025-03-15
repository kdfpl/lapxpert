package com.example.lapxpert.repository;

import com.example.lapxpert.entity.Gpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GpuRepository extends JpaRepository<Gpu, Integer> {
    List<Gpu> findByTinhTrangTrue();
}
