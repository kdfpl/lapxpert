package com.example.lapxpert.controller;

import com.example.lapxpert.entity.*;
import com.example.lapxpert.service.SPCTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/san-pham/san-pham-chi-tiet")
@CrossOrigin(origins = "*")
public class SPCTController {
    @Autowired
    SPCTService sanPhamService;
    //Hiển Thị
    @GetMapping("/list")
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
    //Cpu
    @PostMapping("/cpu/add")
    public Cpu addCpu(Cpu cpu) {
        return sanPhamService.addCpu(cpu);
    }
    @PutMapping("/{id}")
    public Cpu updateCpu(@PathVariable Integer id, @RequestBody Cpu cpu) {
        return sanPhamService.updateCpu(id, cpu);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCpu(@PathVariable Integer id) {
        return sanPhamService.deleteCpu(id);
    }
}
