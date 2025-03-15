package com.lapxpert.dotgiamgia.domain.repository;

import com.lapxpert.dotgiamgia.domain.entity.DotGiamGiaChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DotGiamGiaChiTietRepository extends JpaRepository<DotGiamGiaChiTiet, Integer> {
}