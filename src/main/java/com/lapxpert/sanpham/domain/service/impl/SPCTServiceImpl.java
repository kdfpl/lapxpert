package com.lapxpert.sanpham.domain.service.impl;

import com.lapxpert.sanpham.domain.entity.*;
import com.lapxpert.sanpham.domain.repository.*;
import com.lapxpert.sanpham.domain.service.SPCTService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SPCTServiceImpl implements SPCTService {

    private final SanPhamChiTietRepository spctRepository;

    private final RamRepository ramRepository;

    private final ManHinhRepository manHinhRepository;

    private final PinSacRepository pinSacRepository;

    private final MauSacRepository mauSacRepository;

    private final GpuRepository gpuRepository;

    private final CpuRepository cpuRepository;

    private final OCungRepository ocungRepository;

    private final SeriRepository seriRepository;

    public SPCTServiceImpl(SanPhamChiTietRepository spctRepository, RamRepository ramRepository, ManHinhRepository manHinhRepository, PinSacRepository pinSacRepository, MauSacRepository mauSacRepository, GpuRepository gpuRepository, CpuRepository cpuRepository, OCungRepository ocungRepository, SeriRepository seriRepository) {
        this.spctRepository = spctRepository;
        this.ramRepository = ramRepository;
        this.manHinhRepository = manHinhRepository;
        this.pinSacRepository = pinSacRepository;
        this.mauSacRepository = mauSacRepository;
        this.gpuRepository = gpuRepository;
        this.cpuRepository = cpuRepository;
        this.ocungRepository = ocungRepository;
        this.seriRepository = seriRepository;
    }

    //Hien Thi
    @Override
    public List<SanPhamChiTiet> getAllSpct() {
        return spctRepository.findByTinhTrangTrue();
    }

    @Override
    public List<Ram> getAllRam() {
        return ramRepository.findByTinhTrangTrue();
    }

    @Override
    public List<ManHinh> getAllManHinh() {
        return manHinhRepository.findByTinhTrangTrue();
    }

    @Override
    public List<PinSac> getAllPinSac() {
        return pinSacRepository.findByTinhTrangTrue();
    }

    @Override
    public List<MauSac> getAllMauSac() {
        return mauSacRepository.findByTinhTrangTrue();
    }

    @Override
    public List<Gpu> getAllGpu() {
        return gpuRepository.findByTinhTrangTrue();
    }

    @Override
    public List<Cpu> getAllCpu() {
        return cpuRepository.findByTinhTrangTrue();
    }

    @Override
    public List<OCung> getAllOCung() {
        return ocungRepository.findByTinhTrangTrue();
    }

    @Override
    public List<Seri> getAllSeri() {
        return seriRepository.findAll();
    }

    @Override
    public Cpu getCpuById(Integer id) {
        return cpuRepository.findById(id).orElse(null);
    }

    //    CPU CRUD
    @Override
    public Cpu addCpu(Cpu cpu) {
        Cpu cpuNew = new Cpu();
        cpuNew.setMaCpu(cpu.getMaCpu());
        cpuNew.setHangCpu(cpu.getHangCpu());
        cpuNew.setTenCpu(cpu.getTenCpu());
        cpuNew.setTheHeCpu(cpu.getTheHeCpu());
        cpuNew.setSoNhan(cpu.getSoNhan());
        cpuNew.setSoLuong(cpu.getSoLuong());
        cpuNew.setXungNhip(cpu.getXungNhip());
        cpuNew.setTinhTrang(true); // Đảm bảo mặc định true

        return cpuRepository.save(cpuNew);
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

    //    RAM CRUD
    @Override
    public Ram addRam(Ram ram) {
        Ram ramNew = new Ram();
        ramNew.setLoaiRam(ram.getLoaiRam());
        ramNew.setMaRam(ram.getMaRam());
        ramNew.setDungLuongRam(ram.getDungLuongRam());
        ramNew.setSoKheRam(ram.getSoKheRam());
        ramNew.setHoTroToiDa(ram.getHoTroToiDa());
        ramNew.setTinhTrang(true); // Đảm bảo mặc định true
        return ramRepository.save(ramNew);
    }

    @Override
    public Ram updateRam(Integer id, Ram ramDetails) {
        Optional<Ram> ramOptional = ramRepository.findById(id);
        if (ramOptional.isPresent()) {
            Ram ram = ramOptional.get();
            ram.setLoaiRam(ramDetails.getLoaiRam());
            ram.setMaRam(ramDetails.getMaRam());
            ram.setDungLuongRam(ramDetails.getDungLuongRam());
            ram.setSoKheRam(ramDetails.getSoKheRam());
            ram.setHoTroToiDa(ramDetails.getHoTroToiDa());
            ram.setTinhTrang(true); // Đảm bảo mặc định true
            return ramRepository.save(ram);
        }
        return null;
    }

    @Override
    public boolean deleteRam(Integer id) {
        Optional<Ram> ramOptional = ramRepository.findById(id);
        if (ramOptional.isPresent()) {
            Ram ram = ramOptional.get();
            ram.setTinhTrang(false); // Xóa mềm
            ramRepository.save(ram);
            return true;
        }
        return false;
    }

    //Man Hinh CRUD
    @Override
    public ManHinh addManHinh(ManHinh mh) {
        ManHinh mhNew = new ManHinh();
        mhNew.setMaManHinh(mh.getMaManHinh());
        mhNew.setKichThuoc(mh.getKichThuoc());
        mhNew.setTanSoQuet(mh.getTanSoQuet());
        mhNew.setLoaiTamNen(mh.getLoaiTamNen());
        mhNew.setDoSang(mh.getDoSang());
        mhNew.setChuanMau(mh.getChuanMau());
        mhNew.setDoPhanGiai(mh.getDoPhanGiai());
        mhNew.setTinhTrang(true); // Đảm bảo mặc định true
        return manHinhRepository.save(mhNew);
    }

    @Override
    public ManHinh updateManHinh(Integer id, ManHinh mhDetails) {
        Optional<ManHinh> mhOptional = manHinhRepository.findById(id);
        if (mhOptional.isPresent()) {
            ManHinh mh = mhOptional.get();
            mh.setMaManHinh(mhDetails.getMaManHinh());
            mh.setKichThuoc(mhDetails.getKichThuoc());
            mh.setTanSoQuet(mhDetails.getTanSoQuet());
            mh.setLoaiTamNen(mhDetails.getLoaiTamNen());
            mh.setDoSang(mhDetails.getDoSang());
            mh.setChuanMau(mhDetails.getChuanMau());
            mh.setDoPhanGiai(mhDetails.getDoPhanGiai());
            mh.setTinhTrang(true); // Đảm bảo mặc định true
            return manHinhRepository.save(mh);
        }
        return null;
    }

    @Override
    public boolean deleteManHinh(Integer id) {
        Optional<ManHinh> mhOptional = manHinhRepository.findById(id);
        if (mhOptional.isPresent()) {
            ManHinh mh = mhOptional.get();
            mh.setTinhTrang(false); // Xóa mềm
            manHinhRepository.save(mh);
            return true;
        }
        return false;
    }

    //    Pin CRUD
    @Override
    public PinSac addPinSac(PinSac psac) {
        PinSac pinNew = new PinSac();
        pinNew.setMaPin(psac.getMaPin());
        pinNew.setDungLuongPin(psac.getDungLuongPin());
        pinNew.setThoiLuongPin(psac.getThoiLuongPin());
        pinNew.setCongSuatSac(psac.getCongSuatSac());
        pinNew.setTinhTrang(true); // Đảm bảo mặc định true
        return pinSacRepository.save(pinNew);
    }

    @Override
    public PinSac updatePinSac(Integer id, PinSac psacDetails) {
        Optional<PinSac> pinOptional = pinSacRepository.findById(id);
        if (pinOptional.isPresent()) {
            PinSac pin = pinOptional.get();
            pin.setMaPin(psacDetails.getMaPin());
            pin.setDungLuongPin(psacDetails.getDungLuongPin());
            pin.setThoiLuongPin(psacDetails.getThoiLuongPin());
            pin.setCongSuatSac(psacDetails.getCongSuatSac());
            pin.setTinhTrang(true); // Đảm bảo mặc định true
            return pinSacRepository.save(pin);
        }
        return null;
    }

    @Override
    public boolean deletePinSac(Integer id) {
        Optional<PinSac> pinOptional = pinSacRepository.findById(id);
        if (pinOptional.isPresent()) {
            PinSac pin = pinOptional.get();
            pin.setTinhTrang(false); // Xóa mềm
            pinSacRepository.save(pin);
            return true;
        }
        return false;
    }

    //GPU CRUD
    @Override
    public Gpu addGpu(Gpu gpu) {
        Gpu gpuNew = new Gpu();
        gpuNew.setMaGpu(gpu.getMaGpu());
        gpuNew.setLoaiGpu(gpu.getLoaiGpu());
        gpuNew.setTenGpu(gpu.getTenGpu());
        gpuNew.setBoNhoVram(gpu.getBoNhoVram());
        gpuNew.setCongNgheGpu(gpu.getCongNgheGpu());
        gpuNew.setTinhTrang(true); // Đảm bảo mặc định true
        return gpuRepository.save(gpuNew);
    }

    @Override
    public Gpu updateGpu(Integer id, Gpu gpuDetails) {
        Optional<Gpu> gpuOptional = gpuRepository.findById(id);
        if (gpuOptional.isPresent()) {
            Gpu gpu = gpuOptional.get();
            gpu.setMaGpu(gpuDetails.getMaGpu());
            gpu.setLoaiGpu(gpuDetails.getLoaiGpu());
            gpu.setTenGpu(gpuDetails.getTenGpu());
            gpu.setBoNhoVram(gpuDetails.getBoNhoVram());
            gpu.setCongNgheGpu(gpuDetails.getCongNgheGpu());
            gpu.setTinhTrang(true); // Đảm bảo mặc định true
            return gpuRepository.save(gpu);
        }
        return null;
    }

    @Override
    public boolean deleteGpu(Integer id) {
        Optional<Gpu> gpuOptional = gpuRepository.findById(id);
        if (gpuOptional.isPresent()) {
            Gpu gpu = gpuOptional.get();
            gpu.setTinhTrang(false); // Xóa mềm
            gpuRepository.save(gpu);
            return true;
        }
        return false;
    }

    //Mau Sac CRUD
    @Override
    public MauSac addMauSac(MauSac msac) {
        MauSac msacNew = new MauSac();
        msacNew.setMaMau(msac.getMaMau());
        msacNew.setTenMau(msac.getTenMau());
        msacNew.setTinhTrang(true); // Đảm bảo mặc định true
        return mauSacRepository.save(msacNew);
    }

    @Override
    public MauSac updateMauSac(Integer id, MauSac msacDetails) {
        Optional<MauSac> msacOptional = mauSacRepository.findById(id);
        if (msacOptional.isPresent()) {
            MauSac msac = msacOptional.get();
            msac.setMaMau(msacDetails.getMaMau());
            msac.setTenMau(msacDetails.getTenMau());
            msac.setTinhTrang(true); // Đảm bảo mặc định true
            return mauSacRepository.save(msac);
        }
        return null;
    }

    @Override
    public boolean deleteMauSac(Integer id) {
        Optional<MauSac> msacOptional = mauSacRepository.findById(id);
        if (msacOptional.isPresent()) {
            MauSac msac = msacOptional.get();
            msac.setTinhTrang(false); // Xóa mềm
            mauSacRepository.save(msac);
            return true;
        }
        return false;
    }

    //O Cung CRUD
    @Override
    public OCung addOCung(OCung ocung) {
        OCung oCungNew = new OCung();
        oCungNew.setMaOCung(ocung.getMaOCung());
        oCungNew.setLoaiOCung(ocung.getLoaiOCung());
        oCungNew.setDungLuong(ocung.getDungLuong());
        oCungNew.setChuanKetNoi(ocung.getChuanKetNoi());
        oCungNew.setTocDoDoc(ocung.getTocDoDoc());
        oCungNew.setTocDoGhi(ocung.getTocDoGhi());
        oCungNew.setHoTroNangCap(ocung.getHoTroNangCap());
        oCungNew.setTinhTrang(true); // Đảm bảo mặc định true
        return ocungRepository.save(oCungNew);
    }

    @Override
    public OCung updateOCung(Integer id, OCung ocungDetails) {
        Optional<OCung> oCungOptional = ocungRepository.findById(id);
        if (oCungOptional.isPresent()) {
            OCung oCung = oCungOptional.get();
            oCung.setMaOCung(ocungDetails.getMaOCung());
            oCung.setLoaiOCung(ocungDetails.getLoaiOCung());
            oCung.setDungLuong(ocungDetails.getDungLuong());
            oCung.setChuanKetNoi(ocungDetails.getChuanKetNoi());
            oCung.setTocDoDoc(ocungDetails.getTocDoDoc());
            oCung.setTocDoGhi(ocungDetails.getTocDoGhi());
            oCung.setHoTroNangCap(ocungDetails.getHoTroNangCap());
            oCung.setTinhTrang(true); // Đảm bảo mặc định true
            return ocungRepository.save(oCung);
        }
        return null;
    }

    @Override
    public boolean deleteOCung(Integer id) {
        Optional<OCung> oCungOptional = ocungRepository.findById(id);
        if (oCungOptional.isPresent()) {
            OCung ocung = oCungOptional.get();
            ocung.setTinhTrang(false); // Xóa mềm
            ocungRepository.save(ocung);
            return true;
        }
        return false;
    }

    //SPCT
    @Override
    @Transactional
    public SanPhamChiTiet addSPCT(SanPhamChiTiet spct) {
        SanPhamChiTiet spctNew = new SanPhamChiTiet();
        spctNew.setSanPham(spct.getSanPham());
        spctNew.setRam(spct.getRam());
        spctNew.setManHinh(spct.getManHinh());
        spctNew.setPin(spct.getPin());
        spctNew.setMau(spct.getMau());
        spctNew.setGpu(spct.getGpu());
        spctNew.setCpu(spct.getCpu());
        spctNew.setOCung(spct.getOCung());
        spctNew.setSeri(spct.getSeri());
        spctNew.setMaChiTietSp(spct.getMaChiTietSp());
        spctNew.setGiaBan(spct.getGiaBan());
        spctNew.setTinhTrang(true); // Đảm bảo mặc định true
        return spctRepository.save(spctNew);
    }

    @Override
    @Transactional
    public SanPhamChiTiet updateSPCT(Integer id, SanPhamChiTiet spctDetails) {
        Optional<SanPhamChiTiet> spctOptional = spctRepository.findById(id);
        if (spctOptional.isPresent()) {
            SanPhamChiTiet spct = spctOptional.get();
            spct.setSanPham(spctDetails.getSanPham());
            spct.setRam(spctDetails.getRam());
            spct.setManHinh(spctDetails.getManHinh());
            spct.setPin(spctDetails.getPin());
            spct.setMau(spctDetails.getMau());
            spct.setGpu(spctDetails.getGpu());
            spct.setCpu(spctDetails.getCpu());
            spct.setOCung(spctDetails.getOCung());
            spct.setSeri(spctDetails.getSeri());
            spct.setMaChiTietSp(spctDetails.getMaChiTietSp());
            spct.setGiaBan(spctDetails.getGiaBan());
            spct.setTinhTrang(true); // Đảm bảo mặc định true
            return spctRepository.save(spct);
        }
        return null;
    }

    @Override
    public boolean deleteSPCT(Integer id) {
        Optional<SanPhamChiTiet> spctOptional = spctRepository.findById(id);
        if (spctOptional.isPresent()) {
            SanPhamChiTiet spct = spctOptional.get();
            spct.setTinhTrang(false); // Xóa mềm
            spctRepository.save(spct);
            return true;
        }
        return false;
    }

    @Override
    public SanPhamChiTiet getSPCTById(Integer id) {
        Optional<SanPhamChiTiet> spctOptional = spctRepository.findById(id);
        return spctOptional.orElse(null);
    }
}
