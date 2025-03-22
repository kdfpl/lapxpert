package com.lapxpert.phieugiamgia.application.controller;

import com.lapxpert.phieugiamgia.domain.entity.PhieuGiamGia;
import com.lapxpert.phieugiamgia.domain.service.PhieuGiamGiaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phieu-giam-gia")
@CrossOrigin(origins = "*")
public class PhieuGiamGiaController {

    private final PhieuGiamGiaService phieuGiamGiaService;

    public PhieuGiamGiaController(PhieuGiamGiaService phieuGiamGiaService) {
        this.phieuGiamGiaService = phieuGiamGiaService;
    }


    @GetMapping("fetch")
    public List<PhieuGiamGia> getAllPhieuGiamGia() {
        return phieuGiamGiaService.getAll();
    }

    @PutMapping("edit")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<String> updatePhieuGiamGia(@RequestBody PhieuGiamGia phieuGiamGia) {
        try {
            if (phieuGiamGia.getMaPhieuGiamGia() != null) {
                phieuGiamGiaService.addOrUpdate(phieuGiamGia);
                return new ResponseEntity<>("Cập nhật phiếu giảm giá thành công!", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Mã phiếu giảm giá không hợp lệ!", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Có lỗi xảy ra khi cập nhật phiếu giảm giá!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody PhieuGiamGia phieuGiamGia) {
        try {
            phieuGiamGiaService.addOrUpdate(phieuGiamGia);
            return new ResponseEntity<>("Thêm hoặc cập nhật phiếu giảm giá thành công!", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Có lỗi xảy ra khi thêm hoặc cập nhật!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deletePhieuGiamGia(@PathVariable("id") Integer id) {
        try {
            phieuGiamGiaService.delete(id);
            return new ResponseEntity<>("Xóa phiếu giảm giá thành công!", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Có lỗi xảy ra khi xóa phiếu giảm giá!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("get-one/{id}")
    public ResponseEntity<PhieuGiamGia> getPhieuGiamGiaById(@PathVariable("id") Integer id) {
        PhieuGiamGia phieuGiamGia = phieuGiamGiaService.searchByID(id);
        if (phieuGiamGia != null) {
            return new ResponseEntity<>(phieuGiamGia, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
