package com.lapxpert.phieugiamgia.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "phieu_giam_gia")
public class PhieuGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "loai_giam_gia")
    private Boolean loaiGiamGia;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_phieu_giam_gia", nullable = false, length = 36)
    private String maPhieuGiamGia;

    @NotNull
    @Column(name = "gia_tri_giam", nullable = false, precision = 10, scale = 2)
    private BigDecimal giaTriGiam;

    @NotNull
    @Column(name = "thoi_gian_bat_dau", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate thoiGianBatDau;

    @NotNull
    @Column(name = "thoi_gian_ket_thuc", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate thoiGianKetThuc;

    @Column(name = "gia_tri_don_hang_toi_thieu", precision = 10, scale = 2)
    private BigDecimal giaTriDonHangToiThieu;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "mo_ta", length = Integer.MAX_VALUE)
    private String moTa;

    @Column(name = "trang_thai")
    private Boolean trangThai;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @Column(name = "ngay_tao")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayTao;
}
