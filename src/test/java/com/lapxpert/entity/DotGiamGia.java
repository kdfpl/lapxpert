package com.lapxpert.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dot_giam_gia", schema = "public", catalog = "LapXpert")
public class DotGiamGia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_dot", nullable = false, length = 36)
    private String maDot;
    @Basic
    @Column(name = "ten_dot", nullable = false, length = 255)
    private String tenDot;
    @Basic
    @Column(name = "thoi_gian_bat_dau", nullable = false)
    private Timestamp thoiGianBatDau;
    @Basic
    @Column(name = "thoi_gian_ket_thuc", nullable = false)
    private Timestamp thoiGianKetThuc;
    @Basic
    @Column(name = "gia_tri_giam", nullable = false, precision = 2)
    private BigDecimal giaTriGiam;
    @Basic
    @Column(name = "loai_giam_gia", nullable = false, length = 50)
    private String loaiGiamGia;
    @Basic
    @Column(name = "mo_ta", nullable = true, length = -1)
    private String moTa;
    @Basic
    @Column(name = "trang_thai", nullable = true, length = 50)
    private String trangThai;
    @Basic
    @Column(name = "ngay_tao", nullable = true)
    private Timestamp ngayTao;
    @Basic
    @Column(name = "tinh_trang", nullable = true)
    private Boolean tinhTrang;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaDot() {
        return maDot;
    }

    public void setMaDot(String maDot) {
        this.maDot = maDot;
    }

    public String getTenDot() {
        return tenDot;
    }

    public void setTenDot(String tenDot) {
        this.tenDot = tenDot;
    }

    public Timestamp getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Timestamp thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Timestamp getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Timestamp thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public BigDecimal getGiaTriGiam() {
        return giaTriGiam;
    }

    public void setGiaTriGiam(BigDecimal giaTriGiam) {
        this.giaTriGiam = giaTriGiam;
    }

    public String getLoaiGiamGia() {
        return loaiGiamGia;
    }

    public void setLoaiGiamGia(String loaiGiamGia) {
        this.loaiGiamGia = loaiGiamGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Boolean getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DotGiamGia that = (DotGiamGia) o;
        return id == that.id && Objects.equals(maDot, that.maDot) && Objects.equals(tenDot, that.tenDot) && Objects.equals(thoiGianBatDau, that.thoiGianBatDau) && Objects.equals(thoiGianKetThuc, that.thoiGianKetThuc) && Objects.equals(giaTriGiam, that.giaTriGiam) && Objects.equals(loaiGiamGia, that.loaiGiamGia) && Objects.equals(moTa, that.moTa) && Objects.equals(trangThai, that.trangThai) && Objects.equals(ngayTao, that.ngayTao) && Objects.equals(tinhTrang, that.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maDot, tenDot, thoiGianBatDau, thoiGianKetThuc, giaTriGiam, loaiGiamGia, moTa, trangThai, ngayTao, tinhTrang);
    }
}
