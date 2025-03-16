package com.lapxpert.phieugiamgia.domain.service;

import com.lapxpert.phieugiamgia.domain.entity.PhieuGiamGia;
import com.lapxpert.phieugiamgia.domain.repository.PhieuGiamGiaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuGiamGiaService {
    private final PhieuGiamGiaRepository phieuGiamGiaRepository;

    public PhieuGiamGiaService(PhieuGiamGiaRepository phieuGiamGiaRepository) {
        this.phieuGiamGiaRepository = phieuGiamGiaRepository;
    }

    public List<PhieuGiamGia> getAll() {
        return phieuGiamGiaRepository.findAll();
    }

    public void addOrUpdate(PhieuGiamGia p) {
        phieuGiamGiaRepository.save(p);
    }

    public void delete(Integer id) {
        phieuGiamGiaRepository.deleteById(id);
    }

    public PhieuGiamGia searchByID(Integer id) {
        return phieuGiamGiaRepository.findById(id).orElse(null);
    }
}
