package com.example.lapxpert.controller;

import com.example.lapxpert.entity.LoaiRam;
import com.example.lapxpert.service.LoaiRamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/san-pham/loai-ram")
@CrossOrigin(origins = "*")
public class LoaiRamController {
    @Autowired
    LoaiRamService loaiRamService;

    @GetMapping("/list")
    public List<LoaiRam> getLoaiRam() {
        return loaiRamService.getAll();
    }
}
