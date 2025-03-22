package com.lapxpert.dotgiamgia.application.controller.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DotGiamGiaChiTietInput {
    private Integer dotGiamGiaId;
    private Integer sanPhamChiTietId;
    private String maDotChiTiet;
    private Boolean tinhTrang;
}
