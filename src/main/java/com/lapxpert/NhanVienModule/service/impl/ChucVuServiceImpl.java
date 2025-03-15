package com.lapxpert.NhanVienModule.service.impl;

import com.lapxpert.NhanVienModule.entity.ChucVu;
import com.lapxpert.NhanVienModule.repository.ChucVuRepository;
import com.lapxpert.NhanVienModule.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChucVuServiceImpl implements ChucVuService {

    @Autowired
    ChucVuRepository repository;

    @Override
    public List<ChucVu> getAll() {
        return repository.findAllByTinhTrang(true);
    }
}
