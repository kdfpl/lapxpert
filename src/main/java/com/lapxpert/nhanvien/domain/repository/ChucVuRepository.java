package com.lapxpert.nhanvien.domain.repository;

import com.lapxpert.nhanvien.domain.entity.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChucVuRepository extends JpaRepository<ChucVu, Long> {
    List<ChucVu> findAllByTinhTrang(boolean tinhTrang);
}