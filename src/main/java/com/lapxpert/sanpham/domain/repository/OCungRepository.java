package com.lapxpert.sanpham.domain.repository;

import com.lapxpert.sanpham.domain.entity.OCung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OCungRepository extends JpaRepository<OCung, Integer> {
    List<OCung> findByTinhTrangTrue();
}