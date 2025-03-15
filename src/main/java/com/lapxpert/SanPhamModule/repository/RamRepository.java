package com.lapxpert.SanPhamModule.repository;


import com.lapxpert.SanPhamModule.entity.Ram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RamRepository extends JpaRepository<Ram, Integer> {
}
