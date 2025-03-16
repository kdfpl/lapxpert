package com.lapxpert.sanpham.domain.repository;

import com.lapxpert.sanpham.domain.entity.HeDieuHanh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeDieuHanhRepository extends JpaRepository<HeDieuHanh, Integer> {
}