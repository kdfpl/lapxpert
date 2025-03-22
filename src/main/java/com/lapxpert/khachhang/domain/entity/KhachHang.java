package com.lapxpert.khachhang.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "khach_hang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_khach_hang", nullable = false, unique = true, updatable = false)
    private String maKhachHang;

    @Column(name = "ho_ten", nullable = false, length = 100)
    private String hoTen;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "sdt", nullable = false, length = 15)
    private String sdt;

    @Column(name = "mat_khau")
    private String matKhau;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang = true;

    @Column(name = "ngay_tao", updatable = false)
    private LocalDateTime ngayTao;

    @Column(name = "hinh_anh", length = 255, nullable = true)
    private String hinhAnh;

    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiaChiKH> diaChiList = new ArrayList<>();

    @PrePersist
    protected void onCreate() {
        this.ngayTao = LocalDateTime.now();
        this.matKhau = UUID.randomUUID().toString();
    }
}
