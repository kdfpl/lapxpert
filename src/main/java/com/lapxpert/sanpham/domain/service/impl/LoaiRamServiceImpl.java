package com.lapxpert.sanpham.domain.service.impl;

import com.lapxpert.sanpham.domain.entity.LoaiRam;
import com.lapxpert.sanpham.domain.repository.LoaiRamRepository;
import com.lapxpert.sanpham.domain.service.LoaiRamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiRamServiceImpl implements LoaiRamService {
    private final LoaiRamRepository loaiRamRepository;

    public LoaiRamServiceImpl(LoaiRamRepository loaiRamRepository) {
        this.loaiRamRepository = loaiRamRepository;
    }

    @Override
    public List<LoaiRam> getAll() {
        return loaiRamRepository.findByTinhTrangTrue();
    }
}
