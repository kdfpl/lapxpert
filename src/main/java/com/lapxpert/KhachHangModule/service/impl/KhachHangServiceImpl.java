package com.lapxpert.KhachHangModule.service.impl;

import com.lapxpert.KhachHangModule.entity.KhachHang;
import com.lapxpert.KhachHangModule.repository.KhachHangRepository;
import com.lapxpert.KhachHangModule.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    KhachHangRepository repository;

    @Override
    public List<KhachHang> getAll() {
        return repository.findAllByTinhTrang(true);
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
