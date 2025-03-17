package com.lapxpert.sanpham.application.controller;

import com.lapxpert.sanpham.domain.entity.LoaiRam;
import com.lapxpert.sanpham.domain.service.LoaiRamService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/san-pham/loai-ram")
@CrossOrigin(origins = "*")
public class LoaiRamController {

    private final LoaiRamService loaiRamService;

    public LoaiRamController(LoaiRamService loaiRamService) {
        this.loaiRamService = loaiRamService;
    }

    @GetMapping("/fetch")
    public List<LoaiRam> getLoaiRam() {
        return loaiRamService.getAll();
    }
}
