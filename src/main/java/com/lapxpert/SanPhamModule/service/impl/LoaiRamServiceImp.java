package com.lapxpert.SanPhamModule.service.impl;


import com.lapxpert.SanPhamModule.entity.LoaiRam;
import com.lapxpert.SanPhamModule.repository.LoaiRamRepository;
import com.lapxpert.SanPhamModule.service.LoaiRamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiRamServiceImp implements LoaiRamService {
    @Autowired
    LoaiRamRepository loaiRamRepository;

    @Override
    public List<LoaiRam> getAll() {
        return loaiRamRepository.findAll();
    }
}
