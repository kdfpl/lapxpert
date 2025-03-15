package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Seri {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_seri", nullable = false, length = 36)
    private String maSeri;
    @Basic
    @Column(name = "trang_thai", nullable = false, length = 50)
    private String trangThai;
    @Basic
    @Column(name = "ngay_nhap_kho", nullable = true)
    private Timestamp ngayNhapKho;
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

    public String getMaSeri() {
        return maSeri;
    }

    public void setMaSeri(String maSeri) {
        this.maSeri = maSeri;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Timestamp getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Timestamp ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
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
        Seri seri = (Seri) o;
        return id == seri.id && Objects.equals(maSeri, seri.maSeri) && Objects.equals(trangThai, seri.trangThai) && Objects.equals(ngayNhapKho, seri.ngayNhapKho) && Objects.equals(tinhTrang, seri.tinhTrang) && Objects.equals(ngayTao, seri.ngayTao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maSeri, trangThai, ngayNhapKho, tinhTrang, ngayTao);
    }
}
