package com.example.lapxpert.repository;

import com.example.lapxpert.entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MauSacRepository extends JpaRepository<MauSac, Integer> {
    List<MauSac> findByTinhTrangTrue();
}
