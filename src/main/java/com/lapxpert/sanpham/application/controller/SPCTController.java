package com.lapxpert.sanpham.application.controller;

import com.lapxpert.sanpham.domain.entity.*;
import com.lapxpert.sanpham.domain.service.SPCTService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/san-pham/san-pham-chi-tiet")
@CrossOrigin(origins = "*")
public class SPCTController {
    private final SPCTService sanPhamService;

    public SPCTController(SPCTService sanPhamService) {
        this.sanPhamService = sanPhamService;
    }

    @GetMapping("/fetch")
    public List<SanPhamChiTiet> getAllSanPhamCT() {
        return sanPhamService.getAllSpct();
    }

    @GetMapping("/ram")
    public List<Ram> getAllRam() {
        return sanPhamService.getAllRam();
    }

    @GetMapping("/man-hinh")
    public List<ManHinh> getAllManHinh() {
        return sanPhamService.getAllManHinh();
    }

    @GetMapping("/pin-sac")
    public List<PinSac> getAllPinSac() {
        return sanPhamService.getAllPinSac();
    }

    @GetMapping("/mau-sac")
    public List<MauSac> getAllMauSac() {
        return sanPhamService.getAllMauSac();
    }

    @GetMapping("/gpu")
    public List<Gpu> getAllGpu() {
        return sanPhamService.getAllGpu();
    }

    @GetMapping("/cpu")
    public List<Cpu> getAllCpu() {
        return sanPhamService.getAllCpu();
    }

    @GetMapping("/o-cung")
    public List<OCung> getAllOCung() {
        return sanPhamService.getAllOCung();
    }

    @GetMapping("/seri")
    public List<Seri> getAllSeri() {
        return sanPhamService.getAllSeri();
    }

    //Cpu
    @PostMapping("/cpu/add")
    public Cpu addCpu(@RequestBody Cpu cpu) {
        return sanPhamService.addCpu(cpu);
    }

    @PutMapping("/cpu/update/{id}")
    public Cpu updateCpu(@PathVariable Integer id, @RequestBody Cpu cpu) {
        return sanPhamService.updateCpu(id, cpu);
    }

    @DeleteMapping("/cpu/delete/{id}")
    public boolean deleteCpu(@PathVariable Integer id) {
        return sanPhamService.deleteCpu(id);
    }

    //Ram
    @PostMapping("/ram/add")
    public Ram addRam(@RequestBody Ram ram) {
        return sanPhamService.addRam(ram);
    }

    @PutMapping("/ram/update/{id}")
    public Ram updateRam(@PathVariable Integer id, @RequestBody Ram ram) {
        return sanPhamService.updateRam(id, ram);
    }

    @DeleteMapping("/ram/delete/{id}")
    public boolean deleteRam(@PathVariable Integer id) {
        return sanPhamService.deleteRam(id);
    }

    //    GPU
    @PostMapping("/gpu/add")
    public Gpu addGpu(@RequestBody Gpu gpu) {
        return sanPhamService.addGpu(gpu);
    }

    @PutMapping("/gpu/update/{id}")
    public Gpu updateGpu(@PathVariable Integer id, @RequestBody Gpu gpu) {
        return sanPhamService.updateGpu(id, gpu);
    }

    @DeleteMapping("/gpu/delete/{id}")
    public boolean deleteGpu(@PathVariable Integer id) {
        return sanPhamService.deleteGpu(id);
    }

    //    Pin
    @PostMapping("/pin-sac/add")
    public PinSac addPin(@RequestBody PinSac psac) {
        return sanPhamService.addPinSac(psac);
    }

    @PutMapping("/pin-sac/update/{id}")
    public PinSac updatePin(@PathVariable Integer id, @RequestBody PinSac psac) {
        return sanPhamService.updatePinSac(id, psac);
    }

    @DeleteMapping("/pin-sac/delete/{id}")
    public boolean deletePin(@PathVariable Integer id) {
        return sanPhamService.deletePinSac(id);
    }

    //    Mau Sac
    @PostMapping("/mau-sac/add")
    public MauSac addMauSac(@RequestBody MauSac msac) {
        return sanPhamService.addMauSac(msac);
    }

    @PutMapping("/mau-sac/update/{id}")
    public MauSac updateMauSac(@PathVariable Integer id, @RequestBody MauSac msac) {
        return sanPhamService.updateMauSac(id, msac);
    }

    @DeleteMapping("/mau-sac/delete/{id}")
    public boolean deleteMauSac(@PathVariable Integer id) {
        return sanPhamService.deleteMauSac(id);
    }

    //    Man Hinh
    @PostMapping("/man-hinh/add")
    public ManHinh addManHinh(@RequestBody ManHinh mh) {
        return sanPhamService.addManHinh(mh);
    }

    @PutMapping("/man-hinh/update/{id}")
    public ManHinh updateManHinh(@PathVariable Integer id, @RequestBody ManHinh mh) {
        return sanPhamService.updateManHinh(id, mh);
    }

    @DeleteMapping("/man-hinh/delete/{id}")
    public boolean deleteManHinh(@PathVariable Integer id) {
        return sanPhamService.deleteManHinh(id);
    }

    //    O Cung
    @PostMapping("/o-cung/add")
    public OCung addOCung(@RequestBody OCung ocung) {
        return sanPhamService.addOCung(ocung);
    }

    @PutMapping("/o-cung/update/{id}")
    public OCung updateOCung(@PathVariable Integer id, @RequestBody OCung ocung) {
        return sanPhamService.updateOCung(id, ocung);
    }

    @DeleteMapping("/o-cung/delete/{id}")
    public boolean deleteOCung(@PathVariable Integer id) {
        return sanPhamService.deleteOCung(id);
    }

    //    San Pham Chi Tiet
    @PostMapping("/add")
    public SanPhamChiTiet addSPCT(@RequestBody SanPhamChiTiet spct) {
        return sanPhamService.addSPCT(spct);
    }

    @PutMapping("/update/{id}")
    public SanPhamChiTiet updateSPCT(@PathVariable Integer id, @RequestBody SanPhamChiTiet spct) {
        return sanPhamService.updateSPCT(id, spct);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteSPCT(@PathVariable Integer id) {
        return sanPhamService.deleteSPCT(id);
    }
}
