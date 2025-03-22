package com.lapxpert.dotgiamgia.application.controller;

import com.lapxpert.dotgiamgia.domain.entity.DotGiamGia;
import com.lapxpert.dotgiamgia.domain.service.DotGiamGiaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/dot-giam-gia")
public class DotGiamGiaController {
    private final DotGiamGiaService dotGiamGiaService;

    public DotGiamGiaController(DotGiamGiaService dotGiamGiaService) {
        this.dotGiamGiaService = dotGiamGiaService;
    }

    @GetMapping("fetch")
    @ResponseBody
    public List<DotGiamGia> fetchDotGiamGias() {
        return dotGiamGiaService.findAll();
    }

    @PostMapping("add")
    public void addDotGiamGia(@RequestBody DotGiamGia dotGiamGia) {
        dotGiamGiaService.addOrUpdate(dotGiamGia);
    }

    @DeleteMapping("delete/{id}")
    public void deleteDotGiamGia(@PathVariable Integer id) {
        dotGiamGiaService.deleteById(id);
    }
}
