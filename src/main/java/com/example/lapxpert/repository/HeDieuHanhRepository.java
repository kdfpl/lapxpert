package com.example.lapxpert.repository;

import com.example.lapxpert.entity.HeDieuHanh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeDieuHanhRepository extends JpaRepository<HeDieuHanh, Integer> {
}
