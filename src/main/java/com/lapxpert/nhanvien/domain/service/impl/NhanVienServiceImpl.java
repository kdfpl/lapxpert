package com.lapxpert.nhanvien.domain.service.impl;

import com.lapxpert.nhanvien.domain.entity.NhanVien;
import com.lapxpert.nhanvien.domain.repository.NhanVienRepository;
import com.lapxpert.nhanvien.domain.service.NhanVienService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    private final NhanVienRepository nhanVienRepository;

    public NhanVienServiceImpl(NhanVienRepository nhanVienRepository) {
        this.nhanVienRepository = nhanVienRepository;
    }

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.findAllByTinhTrang(true);
    }

    @Override
    public Optional<NhanVien> getByID(long id) {
        return nhanVienRepository.findById(id);
    }

    @Override
    public NhanVien save(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public void remove(long id) {
        nhanVienRepository.findById(id).ifPresent(nhanVien -> {
            nhanVien.setTinhTrang(false);
            nhanVienRepository.save(nhanVien);
        });
    }

    @Override
    public boolean existsByEmailOrSdt(String email, String sdt, long id) {
        return nhanVienRepository.existsByEmailAndTinhTrangIsTrueAndIdNot(email, id)
                || nhanVienRepository.existsBySdtAndTinhTrangIsTrueAndIdNot(sdt, id);
    }

    @Override
    public String generateMaNhanVien() {
        String lastMaNV = nhanVienRepository.findLastMaNhanVien();
        int newNumber = 1;
        if (lastMaNV != null && lastMaNV.matches("NV\\d{3}")) {
            int lastNumber = Integer.parseInt(lastMaNV.substring(2));
            newNumber = lastNumber + 1;
        }
        return String.format("NV%03d", newNumber);
    }

    @Override
    public List<NhanVien> searchNhanVien(String searchText) {
        return nhanVienRepository.searchNhanVien(searchText);
    }
}
