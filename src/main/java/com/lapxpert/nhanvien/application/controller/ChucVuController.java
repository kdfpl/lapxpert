package com.lapxpert.nhanvien.application.controller;

import com.lapxpert.nhanvien.domain.entity.ChucVu;
import com.lapxpert.nhanvien.domain.service.ChucVuService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chuc-vu")
@CrossOrigin(origins = "*")
public class ChucVuController {
    private final ChucVuService service;

    public ChucVuController(ChucVuService service) {
        this.service = service;
    }

    @GetMapping("fetch")
    public List<ChucVu> handelGetList() {
        return service.getAll();
    }
}