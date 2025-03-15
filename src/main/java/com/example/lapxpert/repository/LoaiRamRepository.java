package com.example.lapxpert.repository;

import com.example.lapxpert.entity.LoaiRam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoaiRamRepository extends JpaRepository<LoaiRam, Integer> {
    List<LoaiRam> findByTinhTrangTrue();
}
