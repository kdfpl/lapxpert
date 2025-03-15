package com.example.lapxpert.repository;

import com.example.lapxpert.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    List<SanPham> findByTinhTrangTrue();
//    List<SanPham> findSanPhamsByIdAndTinhTrangTrue(Integer id, boolean tinhTrang);
}
