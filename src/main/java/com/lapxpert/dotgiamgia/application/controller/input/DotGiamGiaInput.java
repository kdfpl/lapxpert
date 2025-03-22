package com.lapxpert.dotgiamgia.application.controller.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DotGiamGiaInput {
    private String maDot;
    private String tenDot;
    private OffsetDateTime thoiGianBatDau;
    private OffsetDateTime thoiGianKetThuc;
    private BigDecimal giaTriGiam;
    private String loaiGiamGia;
    private String moTa;
    private String trangThai;
    private Boolean tinhTrang;
}

