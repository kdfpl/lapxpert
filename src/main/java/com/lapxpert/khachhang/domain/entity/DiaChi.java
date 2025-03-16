package com.lapxpert.khachhang.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "dia_chi")
public class DiaChi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang", nullable = false, foreignKey = @ForeignKey(name = "fk_dia_chi_khach_hang"))
    @JsonIgnore
    private KhachHang khachHang;

    @Column(name = "ma_dia_chi", length = 36, nullable = false, unique = true)
    private String maDiaChi;

    @Column(name = "thanh_pho", length = 100, nullable = false)
    private String thanhPho;

    @Column(name = "quan_huyen", length = 100, nullable = false)
    private String quanHuyen;

    @Column(name = "phuong_xa", length = 100, nullable = false)
    private String phuongXa;

    @Column(name = "so_nha_duong", columnDefinition = "TEXT", nullable = false)
    private String soNhaDuong;

    @Column(name = "mac_dinh", nullable = false)
    private boolean macDinh = false;

    @Column(name = "ngay_tao", nullable = false, updatable = false)
    private LocalDateTime ngayTao = LocalDateTime.now();

    @Column(name = "tinh_trang", nullable = false)
    private boolean tinhTrang = true;

    @PrePersist
    protected void onCreate() {
        this.maDiaChi = UUID.randomUUID().toString();
    }
}
