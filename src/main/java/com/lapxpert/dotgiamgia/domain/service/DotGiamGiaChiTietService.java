package com.lapxpert.dotgiamgia.domain.service;

import com.lapxpert.dotgiamgia.domain.entity.DotGiamGiaChiTiet;
import com.lapxpert.dotgiamgia.domain.repository.DotGiamGiaChiTietRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DotGiamGiaChiTietService {
    private final DotGiamGiaChiTietRepository dotGiamGiaChiTietRepository;

    public DotGiamGiaChiTietService(DotGiamGiaChiTietRepository dotGiamGiaChiTietRepository) {
        this.dotGiamGiaChiTietRepository = dotGiamGiaChiTietRepository;
    }

    public List<DotGiamGiaChiTiet> findAll() {
        return dotGiamGiaChiTietRepository.findAll();
    }

    public void addOrUpdate(DotGiamGiaChiTiet dotGiamGiaChiTiet) {
        dotGiamGiaChiTietRepository.save(dotGiamGiaChiTiet);
    }

    public void deleteById(Integer id) {
        dotGiamGiaChiTietRepository.deleteById(id);
    }
}
