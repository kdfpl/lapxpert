package com.example.lapxpert.service;

import com.example.lapxpert.entity.*;

import java.util.List;

public interface SPCTService {
    List<SanPhamChiTiet> getAllSpct();
    List<Ram> getAllRam();
    List<ManHinh> getAllManHinh();
    List<PinSac> getAllPinSac();
    List<MauSac> getAllMauSac();
    List<Gpu> getAllGpu();
    List<Cpu> getAllCpu();
    List<OCung> getAllOCung();

    public Cpu addCpu(Cpu cpu);
    public Cpu updateCpu(Integer id, Cpu cpu);
    public boolean deleteCpu(Integer id);
}
