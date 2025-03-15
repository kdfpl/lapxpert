package com.lapxpert.SanPhamModule.repository;

import com.lapxpert.SanPhamModule.entity.PinSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinSacRepository extends JpaRepository<PinSac, Integer> {
}
