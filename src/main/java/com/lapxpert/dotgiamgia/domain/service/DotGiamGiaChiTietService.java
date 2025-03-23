package com.lapxpert.dotgiamgia.domain.service;

import com.lapxpert.dotgiamgia.domain.entity.DotGiamGiaChiTiet;
import com.lapxpert.dotgiamgia.domain.repository.DotGiamGiaChiTietRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void disableById(Integer id) {
        Optional<DotGiamGiaChiTiet> dotGiamGiaChiTietOptional = dotGiamGiaChiTietRepository.findById(id);
        if (dotGiamGiaChiTietOptional.isPresent()) {
            DotGiamGiaChiTiet dotGiamGiaChiTiet = dotGiamGiaChiTietOptional.get();
            dotGiamGiaChiTiet.setTinhTrang(false);
            dotGiamGiaChiTietRepository.save(dotGiamGiaChiTiet);
        }
    }

    public List<DotGiamGiaChiTiet> findByDotGiamGiaId(Integer id) {
        return dotGiamGiaChiTietRepository.findDotGiamGiaChiTietsByDotGiamGia_Id(id);
    }

    public Optional<DotGiamGiaChiTiet> findById(Integer id) {
        return dotGiamGiaChiTietRepository.findById(id);
    }
}
