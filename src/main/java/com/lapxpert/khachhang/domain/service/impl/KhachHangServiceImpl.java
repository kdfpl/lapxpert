package com.lapxpert.khachhang.domain.service.impl;

import com.lapxpert.khachhang.domain.entity.KhachHang;
import com.lapxpert.khachhang.domain.repository.KhachHangRepository;
import com.lapxpert.khachhang.domain.service.KhachHangService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    private final KhachHangRepository repository;

    public KhachHangServiceImpl(KhachHangRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<KhachHang> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<KhachHang> getByID(long id) {
        return repository.findById(id);
    }


    @Override
    public KhachHang save(KhachHang khachHang) {
        return repository.save(khachHang);
    }

    @Override
    public void remove(long id) {
        repository.findById(id).ifPresent(khachHang -> {
            khachHang.setTinhTrang(false);
            repository.save(khachHang);
        });
    }

    @Override
    public String generateMaKhachHang() {
        String lastMaNV = repository.findLastMaKhachHang();
        int newNumber = 1;
        if (lastMaNV != null && lastMaNV.matches("KH\\d{3}")) {
            int lastNumber = Integer.parseInt(lastMaNV.substring(2));
            newNumber = lastNumber + 1;
        }
        return String.format("KH%03d", newNumber);
    }

    @Override
    public boolean existsByEmailOrSdt(String email, String sdt, long id) {
        return repository.existsByEmailAndTinhTrangIsTrueAndIdNot(email, id)
                || repository.existsBySdtAndTinhTrangIsTrueAndIdNot(sdt, id);
    }

}