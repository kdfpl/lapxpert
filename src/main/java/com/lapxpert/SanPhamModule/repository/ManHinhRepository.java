package com.lapxpert.SanPhamModule.repository;

import com.lapxpert.SanPhamModule.entity.ManHinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManHinhRepository extends JpaRepository<ManHinh, Integer> {
}
