package com.lapxpert.khachhang.application.controller;

import com.lapxpert.khachhang.domain.entity.DiaChiKH;
import com.lapxpert.khachhang.domain.entity.KhachHang;
import com.lapxpert.khachhang.domain.service.DiaChiService;
import com.lapxpert.khachhang.domain.service.KhachHangService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/khach-hang")
public class KhachHangController {
    private final KhachHangService khachHangService;

    private final DiaChiService diaChiService;

    public KhachHangController(KhachHangService khachHangService, DiaChiService diaChiService) {
        this.khachHangService = khachHangService;
        this.diaChiService = diaChiService;
    }


    @GetMapping("fetch")
    public List<KhachHang> getAllCustomers() {
        return khachHangService.getAll();
    }

    @GetMapping("get-one/{id}")
    public ResponseEntity<KhachHang> getCustomerById(@PathVariable Long id) {
        return khachHangService.getByID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("dia-chi/get-one/{id}")
    public ResponseEntity<DiaChiKH> getAddressById(@PathVariable Long id) {
        return diaChiService.getDiaChiMacDinh(id,true)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("add")
    public ResponseEntity<KhachHang> addCustomer(@RequestBody KhachHang khachHang) {
        khachHang.setMaKhachHang(khachHangService.generateMaKhachHang());

        KhachHang savedKhachHang = khachHangService.save(khachHang);

        if (khachHang.getDiaChiList() != null && !khachHang.getDiaChiList().isEmpty()) {
            for (DiaChiKH diaChi : khachHang.getDiaChiList()) {
                diaChi.setKhachHang(savedKhachHang);
            }
            diaChiService.saveAll(khachHang.getDiaChiList());
        }

        return ResponseEntity.ok(savedKhachHang);
    }

    @PutMapping("edit/{id}")
    public ResponseEntity<?> updateKhachHang(@PathVariable Long id, @RequestBody KhachHang dto) {
        Optional<KhachHang> khachHangOpt = khachHangService.getByID(id);
        if (!khachHangOpt.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìm thấy khách hàng");
        }

        KhachHang khachHang = khachHangOpt.get();
        khachHang.setHoTen(dto.getHoTen());
        khachHang.setEmail(dto.getEmail());
        khachHang.setSdt(dto.getSdt());
        khachHang.setTinhTrang(dto.getTinhTrang());

        diaChiService.deleteDiaChi(khachHang.getId());

        if (dto.getDiaChiList() != null && !dto.getDiaChiList().isEmpty()) {
            for (DiaChiKH diaChi : dto.getDiaChiList()) {
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

        boolean check = khachHangService.existsByEmailOrSdt(email, sdt, id);

        return ResponseEntity.ok(check);
    }
}
