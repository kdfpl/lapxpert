package com.lapxpert.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "chi_tiet_hoa_don", schema = "public", catalog = "LapXpert")
public class ChiTietHoaDon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_hoa_don", nullable = true)
    private Integer idHoaDon;
    @Basic
    @Column(name = "id_chi_tiet_sp", nullable = true)
    private Integer idChiTietSp;
    @Basic
    @Column(name = "ma_chi_tiet_hoa_don", nullable = false, length = 36)
    private String maChiTietHoaDon;
    @Basic
    @Column(name = "so_luong", nullable = true)
    private Integer soLuong;
    @Basic
    @Column(name = "gia_ban", nullable = false, precision = 2)
    private BigDecimal giaBan;
    @Basic
    @Column(name = "thanh_tien", nullable = true, precision = 2)
    private BigDecimal thanhTien;
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

    public Integer getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Integer getIdChiTietSp() {
        return idChiTietSp;
    }

    public void setIdChiTietSp(Integer idChiTietSp) {
        this.idChiTietSp = idChiTietSp;
    }

    public String getMaChiTietHoaDon() {
        return maChiTietHoaDon;
    }

    public void setMaChiTietHoaDon(String maChiTietHoaDon) {
        this.maChiTietHoaDon = maChiTietHoaDon;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public BigDecimal getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
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
        ChiTietHoaDon that = (ChiTietHoaDon) o;
        return id == that.id && Objects.equals(idHoaDon, that.idHoaDon) && Objects.equals(idChiTietSp, that.idChiTietSp) && Objects.equals(maChiTietHoaDon, that.maChiTietHoaDon) && Objects.equals(soLuong, that.soLuong) && Objects.equals(giaBan, that.giaBan) && Objects.equals(thanhTien, that.thanhTien) && Objects.equals(ngayTao, that.ngayTao) && Objects.equals(tinhTrang, that.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idHoaDon, idChiTietSp, maChiTietHoaDon, soLuong, giaBan, thanhTien, ngayTao, tinhTrang);
    }
}
