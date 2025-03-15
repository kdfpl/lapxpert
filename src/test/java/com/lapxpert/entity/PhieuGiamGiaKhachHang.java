package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "phieu_giam_gia_khach_hang", schema = "public", catalog = "LapXpert")
public class PhieuGiamGiaKhachHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_khach_hang", nullable = true)
    private Integer idKhachHang;
    @Basic
    @Column(name = "id_giam_gia", nullable = true)
    private Integer idGiamGia;
    @Basic
    @Column(name = "ma_phieu_giam_gia_khach_hang", nullable = false, length = 36)
    private String maPhieuGiamGiaKhachHang;
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

    public Integer getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Integer getIdGiamGia() {
        return idGiamGia;
    }

    public void setIdGiamGia(Integer idGiamGia) {
        this.idGiamGia = idGiamGia;
    }

    public String getMaPhieuGiamGiaKhachHang() {
        return maPhieuGiamGiaKhachHang;
    }

    public void setMaPhieuGiamGiaKhachHang(String maPhieuGiamGiaKhachHang) {
        this.maPhieuGiamGiaKhachHang = maPhieuGiamGiaKhachHang;
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
        PhieuGiamGiaKhachHang that = (PhieuGiamGiaKhachHang) o;
        return id == that.id && Objects.equals(idKhachHang, that.idKhachHang) && Objects.equals(idGiamGia, that.idGiamGia) && Objects.equals(maPhieuGiamGiaKhachHang, that.maPhieuGiamGiaKhachHang) && Objects.equals(ngayTao, that.ngayTao) && Objects.equals(tinhTrang, that.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idKhachHang, idGiamGia, maPhieuGiamGiaKhachHang, ngayTao, tinhTrang);
    }
}
