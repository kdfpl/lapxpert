package com.lapxpert.nhanvien.domain.service.impl;

import com.lapxpert.nhanvien.domain.entity.ChucVu;
import com.lapxpert.nhanvien.domain.repository.ChucVuRepository;
import com.lapxpert.nhanvien.domain.service.ChucVuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChucVuServiceImpl implements ChucVuService {

    private final ChucVuRepository repository;

    public ChucVuServiceImpl(ChucVuRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ChucVu> getAll() {
        return repository.findAllByTinhTrang(true);
    }
}