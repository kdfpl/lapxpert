package com.lapxpert.SanPhamModule.service;



import com.lapxpert.SanPhamModule.entity.*;

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
}
