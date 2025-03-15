package com.example.lapxpert.repository;

import com.example.lapxpert.entity.ManHinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManHinhRepository extends JpaRepository<ManHinh, Integer> {
    List<ManHinh> findByTinhTrangTrue();
}
