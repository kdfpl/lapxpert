package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "thanh_toan", schema = "public", catalog = "LapXpert")
public class ThanhToan {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_thanh_toan", nullable = false, length = 36)
    private String maThanhToan;
    @Basic
    @Column(name = "hinh_thuc", nullable = false, length = 100)
    private String hinhThuc;
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

    public String getMaThanhToan() {
        return maThanhToan;
    }

    public void setMaThanhToan(String maThanhToan) {
        this.maThanhToan = maThanhToan;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
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
        ThanhToan thanhToan = (ThanhToan) o;
        return id == thanhToan.id && Objects.equals(maThanhToan, thanhToan.maThanhToan) && Objects.equals(hinhThuc, thanhToan.hinhThuc) && Objects.equals(tinhTrang, thanhToan.tinhTrang) && Objects.equals(ngayTao, thanhToan.ngayTao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maThanhToan, hinhThuc, tinhTrang, ngayTao);
    }
}
