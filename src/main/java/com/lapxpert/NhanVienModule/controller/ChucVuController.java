package com.lapxpert.NhanVienModule.controller;

import com.lapxpert.NhanVienModule.entity.ChucVu;
import com.lapxpert.NhanVienModule.entity.NhanVien;
import com.lapxpert.NhanVienModule.service.ChucVuService;
import com.lapxpert.NhanVienModule.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chuc-vu")
@CrossOrigin(origins = "*")
public class ChucVuController {
    @Autowired
    ChucVuService service;

    @GetMapping("list")
    public List<ChucVu> handelGetList(){
        return service.getAll();
    }
}
