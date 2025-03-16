package com.lapxpert.sanpham.domain.repository;

import com.lapxpert.sanpham.domain.entity.PinSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PinSacRepository extends JpaRepository<PinSac, Integer> {
    List<PinSac> findByTinhTrangTrue();
}