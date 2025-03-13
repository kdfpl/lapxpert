package com.example.lapxpert.service;

import com.example.lapxpert.entity.*;
import com.example.lapxpert.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SPCTServiceImp implements SPCTService {
    @Autowired
    SPCTRepository spctRepository;
    @Autowired
    RamRepository ramRepository;
    @Autowired
    ManHinhRepository manHinhRepository;
    @Autowired
    PinSacRepository pinSacRepository;
    @Autowired
    MauSacRepository mauSacRepository;
    @Autowired
    GpuRepository gpuRepository;
    @Autowired
    CpuRepository cpuRepository;
    @Autowired
    OCungRepository ocungRepository;

    @Override
    public List<SanPhamChiTiet> getAllSpct() {
        return spctRepository.findAll();
    }

    @Override
    public List<Ram> getAllRam() {
        return ramRepository.findAll();
    }

    @Override
    public List<ManHinh> getAllManHinh() {
        return manHinhRepository.findAll();
    }

    @Override
    public List<PinSac> getAllPinSac() {
        return pinSacRepository.findAll();
    }

    @Override
    public List<MauSac> getAllMauSac() {
        return mauSacRepository.findAll();
    }

    @Override
    public List<Gpu> getAllGpu() {
        return gpuRepository.findAll();
    }

    @Override
    public List<Cpu> getAllCpu() {
        return cpuRepository.findAll();
    }

    @Override
    public List<OCung> getAllOCung() {
        return ocungRepository.findAll();
    }
}
