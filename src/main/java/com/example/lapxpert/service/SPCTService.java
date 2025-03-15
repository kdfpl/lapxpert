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
    List<Seri> getAllSeri();

    public Cpu addCpu(Cpu cpu);
    public Cpu updateCpu(Integer id, Cpu cpu);
    public boolean deleteCpu(Integer id);

    public Ram addRam(Ram ram);
    public Ram updateRam(Integer id, Ram ram);
    public boolean deleteRam(Integer id);

    public ManHinh addManHinh(ManHinh mh);
    public ManHinh updateManHinh(Integer id,ManHinh mh);
    public boolean deleteManHinh(Integer id);

    public PinSac addPinSac(PinSac psac);
    public PinSac updatePinSac(Integer id, PinSac psac);
    public boolean deletePinSac(Integer id);

    public Gpu addGpu(Gpu gpu);
    public Gpu updateGpu(Integer id, Gpu gpu);
    public boolean deleteGpu(Integer id);

    public MauSac addMauSac(MauSac msac);
    public MauSac updateMauSac(Integer id, MauSac msac);
    public boolean deleteMauSac(Integer id);

    public OCung addOCung(OCung ocung);
    public OCung updateOCung(Integer id, OCung ocung);
    public boolean deleteOCung(Integer id);

    public SanPhamChiTiet addSPCT(SanPhamChiTiet sanPhamChiTiet);
    public SanPhamChiTiet updateSPCT(Integer id, SanPhamChiTiet sanPhamChiTiet);
    public boolean deleteSPCT(Integer id);
}
