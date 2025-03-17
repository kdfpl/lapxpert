package com.lapxpert.sanpham.domain.repository;

import com.lapxpert.sanpham.domain.entity.Ram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RamRepository extends JpaRepository<Ram, Integer> {
    List<Ram> findByTinhTrangTrue();
}