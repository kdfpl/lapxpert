package com.lapxpert.phieugiamgia.domain.entity;

import com.lapxpert.khachhang.domain.entity.KhachHang;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "phieu_giam_gia_khach_hang")
public class PhieuGiamGiaKhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang idKhachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_giam_gia")
    private PhieuGiamGia idGiamGia;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_phieu_giam_gia_khach_hang", nullable = false, length = 36)
    private String maPhieuGiamGiaKhachHang;

    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    public PhieuGiamGiaKhachHang(PhieuGiamGia phieuGiamGia, KhachHang kh) {
    }
}
