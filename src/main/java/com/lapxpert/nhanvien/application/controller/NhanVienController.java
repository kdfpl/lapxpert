package com.lapxpert.nhanvien.application.controller;

import com.lapxpert.nhanvien.domain.entity.NhanVien;
import com.lapxpert.nhanvien.domain.service.NhanVienService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nhan-vien")
@CrossOrigin(origins = "*")
public class NhanVienController {

    private final NhanVienService nhanVienService;

    public NhanVienController(NhanVienService nhanVienService) {
        this.nhanVienService = nhanVienService;
    }

    @GetMapping("fetch")
    public List<NhanVien> handelGetList() {
        return nhanVienService.getAll();
    }

    @GetMapping("get-one/{id}")
    public Optional<NhanVien> handelGetOne(@PathVariable Long id) {
        return nhanVienService.getByID(id);
    }

    @PostMapping("add")
    public NhanVien addCustomer(@RequestBody NhanVien nhanVien) {
        nhanVien.setMaNhanVien(nhanVienService.generateMaNhanVien());
        return nhanVienService.save(nhanVien);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> updateKhachHang(@PathVariable Long id, @RequestBody NhanVien dto) {
        Optional<NhanVien> NhanVienOtp = nhanVienService.getByID(id);
        if (!NhanVienOtp.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìm thấy khách hàng");
        }

        NhanVien nhanVien = NhanVienOtp.get();
        nhanVien.setHoTen(dto.getHoTen());
        nhanVien.setEmail(dto.getEmail());
        nhanVien.setSdt(dto.getSdt());

        nhanVienService.save(nhanVien);
        return ResponseEntity.ok("Cập nhật thành công!");
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        nhanVienService.remove(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/check-duplicate/{id}/{email}/{sdt}")
    public ResponseEntity<Boolean> checkDuplicate(
            @PathVariable String email,
            @PathVariable String sdt,
            @PathVariable Long id) {

        boolean check = nhanVienService.existsByEmailOrSdt(email, sdt, id);

        return ResponseEntity.ok(check);
    }

    @GetMapping("/search")
    public ResponseEntity<List<NhanVien>> searchNhanVien(@RequestParam String search) {
        List<NhanVien> results = nhanVienService.searchNhanVien(search);
        return ResponseEntity.ok(results);
    }
}
