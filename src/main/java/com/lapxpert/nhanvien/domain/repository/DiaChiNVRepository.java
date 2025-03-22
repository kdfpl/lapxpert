package com.lapxpert.nhanvien.domain.repository;

import com.lapxpert.nhanvien.domain.entity.DiaChiNV;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DiaChiNVRepository extends JpaRepository<DiaChiNV, Long> {
    List<DiaChiNV> findByNhanVienIdAndTinhTrang(Long NhanVienId, boolean tinhTrang);

    Optional<DiaChiNV> findByNhanVienIdAndAndMacDinh(Long NhanVienId, boolean tinhTrang);

    @Transactional
    @Modifying
    @Query("UPDATE DiaChiNV d SET d.macDinh = false ,d.tinhTrang = false WHERE d.nhanVien.id = :nhanVienId")
    void softDeleteByNhanVienId(Long nhanVienId);
}