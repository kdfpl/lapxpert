package com.lapxpert.sanpham.domain.repository;

import com.lapxpert.sanpham.domain.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    List<SanPham> findByTinhTrangTrue();
//    List<SanPham> findSanPhamsByIdAndTinhTrangTrue(Integer id, boolean tinhTrang);
}