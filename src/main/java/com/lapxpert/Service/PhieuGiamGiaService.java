package com.lapxpert.Service;

import com.lapxpert.Entity.PhieuGiamGia;
import com.lapxpert.Respository.PhieuGiamGiaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuGiamGiaService {
    @Autowired
    private PhieuGiamGiaRespository phieuGiamGiaRepository;

    public List<PhieuGiamGia> getAll(){
        return phieuGiamGiaRepository.findAll();
    }
    public void addOrUpdate(PhieuGiamGia p){
        phieuGiamGiaRepository.save(p);
    }
    public void delete(Integer id){
        PhieuGiamGia phieuGiamGia = phieuGiamGiaRepository.findById(id).orElse(null);
        if (phieuGiamGia != null) {
            phieuGiamGia.setTinhTrang(false);
            phieuGiamGiaRepository.save(phieuGiamGia);
        }
    }
    public PhieuGiamGia searchByID(Integer id){
        return phieuGiamGiaRepository.findById(id).orElse(null);
    }
}
