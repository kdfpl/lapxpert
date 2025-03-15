package com.lapxpert.KhachHangModule.controller;

import com.lapxpert.KhachHangModule.entity.DiaChi;
import com.lapxpert.KhachHangModule.entity.KhachHang;
import com.lapxpert.KhachHangModule.repository.KhachHangRepository;
import com.lapxpert.KhachHangModule.service.DiaChiService;
import com.lapxpert.KhachHangModule.service.KhachHangService;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/khach-hang")
@CrossOrigin(origins = "http://localhost:5173")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private DiaChiService diaChiService;


    @GetMapping("list")
    public List<KhachHang> getAllCustomers() {
        return khachHangService.getAll();
    }

    @GetMapping("getOne/{id}")
    public ResponseEntity<KhachHang> getCustomerById(@PathVariable Long id) {
        return khachHangService.getByID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("add")
    public ResponseEntity<KhachHang> addCustomer(@RequestBody KhachHang khachHang) {
        khachHang.setMaKhachHang(khachHangService.generateMaKhachHang());

        KhachHang savedKhachHang = khachHangService.save(khachHang);

        if (khachHang.getDiaChiList() != null && !khachHang.getDiaChiList().isEmpty()) {
            for (DiaChi diaChi : khachHang.getDiaChiList()) {
                diaChi.setKhachHang(savedKhachHang);
            }
            diaChiService.saveAll(khachHang.getDiaChiList());
        }

        return ResponseEntity.ok(savedKhachHang);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> updateKhachHang(@PathVariable Long id, @RequestBody KhachHang dto) {
        Optional<KhachHang> khachHangOpt = khachHangService.getByID(id);
        if (!khachHangOpt.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìm thấy khách hàng");
        }

        KhachHang khachHang = khachHangOpt.get();
        khachHang.setHoTen(dto.getHoTen());
        khachHang.setEmail(dto.getEmail());
        khachHang.setSdt(dto.getSdt());

        diaChiService.deleteDiaChi(khachHang.getId());

        if (dto.getDiaChiList() != null && !dto.getDiaChiList().isEmpty()) {
            for (DiaChi diaChi : dto.getDiaChiList()) {
                diaChi.setKhachHang(khachHang);
            }
            diaChiService.saveAll(dto.getDiaChiList());
        }

        khachHangService.save(khachHang);
        return ResponseEntity.ok("Cập nhật thành công!");
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        khachHangService.remove(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/check-duplicate/{id}/{email}/{sdt}")
    public ResponseEntity<Boolean> checkDuplicate(
            @PathVariable String email,
            @PathVariable String sdt,
            @PathVariable Long id) {

        boolean check = khachHangService.existsByEmailOrSdt(email,sdt,id);

        return ResponseEntity.ok(check);
    }
}