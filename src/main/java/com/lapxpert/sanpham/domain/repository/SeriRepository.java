package com.lapxpert.sanpham.domain.repository;

import com.lapxpert.sanpham.domain.entity.Seri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriRepository extends JpaRepository<Seri, Integer> {
}