package com.example.lapxpert.service;

import com.example.lapxpert.entity.LoaiRam;
import com.example.lapxpert.repository.LoaiRamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiRamServiceImp implements LoaiRamService {
    @Autowired
    LoaiRamRepository loaiRamRepository;

    @Override
    public List<LoaiRam> getAll() {
        return loaiRamRepository.findByTinhTrangTrue();
    }
}
