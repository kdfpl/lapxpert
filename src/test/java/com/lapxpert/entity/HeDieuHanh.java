package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "he_dieu_hanh", schema = "public", catalog = "LapXpert")
public class HeDieuHanh {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_he_dieu_hanh", nullable = false, length = 36)
    private String maHeDieuHanh;
    @Basic
    @Column(name = "ten_he_dieu_hanh", nullable = false, length = 255)
    private String tenHeDieuHanh;
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

    public String getMaHeDieuHanh() {
        return maHeDieuHanh;
    }

    public void setMaHeDieuHanh(String maHeDieuHanh) {
        this.maHeDieuHanh = maHeDieuHanh;
    }

    public String getTenHeDieuHanh() {
        return tenHeDieuHanh;
    }

    public void setTenHeDieuHanh(String tenHeDieuHanh) {
        this.tenHeDieuHanh = tenHeDieuHanh;
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
        HeDieuHanh that = (HeDieuHanh) o;
        return id == that.id && Objects.equals(maHeDieuHanh, that.maHeDieuHanh) && Objects.equals(tenHeDieuHanh, that.tenHeDieuHanh) && Objects.equals(ngayTao, that.ngayTao) && Objects.equals(tinhTrang, that.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maHeDieuHanh, tenHeDieuHanh, ngayTao, tinhTrang);
    }
}
