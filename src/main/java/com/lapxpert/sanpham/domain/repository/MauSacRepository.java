package com.lapxpert.sanpham.domain.repository;

import com.lapxpert.sanpham.domain.entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MauSacRepository extends JpaRepository<MauSac, Integer> {
    List<MauSac> findByTinhTrangTrue();
}