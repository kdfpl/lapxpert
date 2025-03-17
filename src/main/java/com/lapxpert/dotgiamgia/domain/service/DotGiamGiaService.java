package com.lapxpert.dotgiamgia.domain.service;

import com.lapxpert.dotgiamgia.domain.entity.DotGiamGia;
import com.lapxpert.dotgiamgia.domain.repository.DotGiamGiaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DotGiamGiaService {
    private final DotGiamGiaRepository dotGiamGiaRepository;

    public DotGiamGiaService(DotGiamGiaRepository dotGiamGiaRepository) {
        this.dotGiamGiaRepository = dotGiamGiaRepository;
    }

    public DotGiamGia addOrUpdate(DotGiamGia dotGiamGia) {
        return dotGiamGiaRepository.save(dotGiamGia);
    }

    public void deleteById(Integer id) {
        dotGiamGiaRepository.deleteById(id);
    }


    public List<DotGiamGia> findAll() {
        return dotGiamGiaRepository.findAll();
    }

}
