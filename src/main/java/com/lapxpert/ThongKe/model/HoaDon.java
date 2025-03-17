package com.lapxpert.ThongKe.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hoa_don")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "id_khach_hang")
    private Integer idKhachHang;
    @NotNull
    @Column(name = "id_giam_gia")
    private Integer idGiamGia;
    @NotNull
    @Column(name = "id_thanh_toan")
    private Integer idThanhToan;
    @NotNull
    @Column(name = "id_nhan_vien")
    private Integer idNhanVien;
    @NotBlank
    @Column(name = "ma_hoa_don")
    private String maHoaDon;

    @NotNull
    @Column(name = "ten_khach_hang")
    private String tenKhachHang;
    @NotBlank
    @Column(name = "sdt")
    private String sdt;
    @NotBlank
    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "tong_tien")
    private BigDecimal tongTien;

    @NotNull
    @Column(name = "ngay_dat")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayDat;

    @NotBlank
    @Column(name = "trang_thai")
    private String trangThai;

    @Column(name = "tinh_trang")
    private boolean tinhTrang;
}
