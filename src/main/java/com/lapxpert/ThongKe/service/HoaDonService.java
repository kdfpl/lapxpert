
package com.lapxpert.ThongKe.service;

import com.lapxpert.ThongKe.model.HoaDon;
import com.lapxpert.ThongKe.repository.HoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class HoaDonService {
    @Autowired
    HoaDonRepository hoaDonRepository;

    public List<HoaDon> getAll() {
        return hoaDonRepository.findAll();
    }
    public BigDecimal getTongTien() {
        BigDecimal tongTien = BigDecimal.ZERO;
        for (HoaDon hoaDon : getAll()) {
            tongTien = tongTien.add(hoaDon.getTongTien()); // Sử dụng add() đúng cách
        }
        return tongTien;
    }
    public Integer getCount() {
        return getAll().size();
    }

}
