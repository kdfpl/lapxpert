package com.lapxpert.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "phieu_giam_gia", schema = "public", catalog = "LapXpert")
public class PhieuGiamGia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "loai_giam_gia", nullable = true)
    private Boolean loaiGiamGia;
    @Basic
    @Column(name = "ma_phieu_giam_gia", nullable = false, length = 36)
    private String maPhieuGiamGia;
    @Basic
    @Column(name = "gia_tri_giam", nullable = false, precision = 2)
    private BigDecimal giaTriGiam;
    @Basic
    @Column(name = "thoi_gian_bat_dau", nullable = false)
    private Timestamp thoiGianBatDau;
    @Basic
    @Column(name = "thoi_gian_ket_thuc", nullable = false)
    private Timestamp thoiGianKetThuc;
    @Basic
    @Column(name = "gia_tri_don_hang_toi_thieu", nullable = true, precision = 2)
    private BigDecimal giaTriDonHangToiThieu;
    @Basic
    @Column(name = "so_luong", nullable = true)
    private Integer soLuong;
    @Basic
    @Column(name = "mo_ta", nullable = true, length = -1)
    private String moTa;
    @Basic
    @Column(name = "trang_thai", nullable = true)
    private Boolean trangThai;
    @Basic
    @Column(name = "tinh_trang", nullable = true)
    private Boolean tinhTrang;
    @Basic
    @Column(name = "ngay_tao", nullable = true)
    private Timestamp ngayTao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getLoaiGiamGia() {
        return loaiGiamGia;
    }

    public void setLoaiGiamGia(Boolean loaiGiamGia) {
        this.loaiGiamGia = loaiGiamGia;
    }

    public String getMaPhieuGiamGia() {
        return maPhieuGiamGia;
    }

    public void setMaPhieuGiamGia(String maPhieuGiamGia) {
        this.maPhieuGiamGia = maPhieuGiamGia;
    }

    public BigDecimal getGiaTriGiam() {
        return giaTriGiam;
    }

    public void setGiaTriGiam(BigDecimal giaTriGiam) {
        this.giaTriGiam = giaTriGiam;
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

    public BigDecimal getGiaTriDonHangToiThieu() {
        return giaTriDonHangToiThieu;
    }

    public void setGiaTriDonHangToiThieu(BigDecimal giaTriDonHangToiThieu) {
        this.giaTriDonHangToiThieu = giaTriDonHangToiThieu;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Boolean getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhieuGiamGia that = (PhieuGiamGia) o;
        return id == that.id && Objects.equals(loaiGiamGia, that.loaiGiamGia) && Objects.equals(maPhieuGiamGia, that.maPhieuGiamGia) && Objects.equals(giaTriGiam, that.giaTriGiam) && Objects.equals(thoiGianBatDau, that.thoiGianBatDau) && Objects.equals(thoiGianKetThuc, that.thoiGianKetThuc) && Objects.equals(giaTriDonHangToiThieu, that.giaTriDonHangToiThieu) && Objects.equals(soLuong, that.soLuong) && Objects.equals(moTa, that.moTa) && Objects.equals(trangThai, that.trangThai) && Objects.equals(tinhTrang, that.tinhTrang) && Objects.equals(ngayTao, that.ngayTao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loaiGiamGia, maPhieuGiamGia, giaTriGiam, thoiGianBatDau, thoiGianKetThuc, giaTriDonHangToiThieu, soLuong, moTa, trangThai, tinhTrang, ngayTao);
    }
}
