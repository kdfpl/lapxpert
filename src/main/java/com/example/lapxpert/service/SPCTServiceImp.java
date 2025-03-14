package com.example.lapxpert.service;

import com.example.lapxpert.entity.*;
import com.example.lapxpert.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return cpuRepository.findByTinhTrangTrue();
    }



    @Override
    public List<OCung> getAllOCung() {
        return ocungRepository.findAll();
    }

    @Override
    public Cpu addCpu(Cpu cpu) {
        return cpuRepository.save(cpu);
    }

    @Override
    public Cpu updateCpu(Integer id, Cpu cpuDetails) {
        Optional<Cpu> cpuOptional = cpuRepository.findById(id);
        if (cpuOptional.isPresent()) {
            Cpu cpu = cpuOptional.get();
            cpu.setMaCpu(cpuDetails.getMaCpu());
            cpu.setHangCpu(cpuDetails.getHangCpu());
            cpu.setTenCpu(cpuDetails.getTenCpu());
            cpu.setTheHeCpu(cpuDetails.getTheHeCpu());
            cpu.setSoNhan(cpuDetails.getSoNhan());
            cpu.setSoLuong(cpuDetails.getSoLuong());
            cpu.setXungNhip(cpuDetails.getXungNhip());
            return cpuRepository.save(cpu);
        }
        return null;
    }

    @Override
    public boolean deleteCpu(Integer id) {
        Optional<Cpu> cpuOptional = cpuRepository.findById(id);
        if (cpuOptional.isPresent()) {
            Cpu cpu = cpuOptional.get();
            cpu.setTinhTrang(false); // Xóa mềm
            cpuRepository.save(cpu);
            return true;
        }
        return false;
    }
}
