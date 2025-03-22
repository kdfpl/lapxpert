package com.lapxpert.sanpham.domain.service;

import com.lapxpert.sanpham.domain.entity.*;

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
    List<Seri> getAllSeri();

    Cpu addCpu(Cpu cpu);

    Cpu updateCpu(Integer id, Cpu cpu);

    boolean deleteCpu(Integer id);

    Ram addRam(Ram ram);

    Ram updateRam(Integer id, Ram ram);

    boolean deleteRam(Integer id);

    ManHinh addManHinh(ManHinh mh);

    ManHinh updateManHinh(Integer id, ManHinh mh);

    boolean deleteManHinh(Integer id);

    PinSac addPinSac(PinSac psac);

    PinSac updatePinSac(Integer id, PinSac psac);

    boolean deletePinSac(Integer id);

    Gpu addGpu(Gpu gpu);

    Gpu updateGpu(Integer id, Gpu gpu);

    boolean deleteGpu(Integer id);

    MauSac addMauSac(MauSac msac);

    MauSac updateMauSac(Integer id, MauSac msac);

    boolean deleteMauSac(Integer id);

    OCung addOCung(OCung ocung);

    OCung updateOCung(Integer id, OCung ocung);

    boolean deleteOCung(Integer id);

    SanPhamChiTiet addSPCT(SanPhamChiTiet sanPhamChiTiet);

    SanPhamChiTiet updateSPCT(Integer id, SanPhamChiTiet sanPhamChiTiet);

    boolean deleteSPCT(Integer id);

    SanPhamChiTiet getSPCTById(Integer id);
}
