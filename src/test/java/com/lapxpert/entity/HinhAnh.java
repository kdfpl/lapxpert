package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hinh_anh", schema = "public", catalog = "LapXpert")
public class HinhAnh {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_spct", nullable = true)
    private Integer idSpct;
    @Basic
    @Column(name = "ma_hinh", nullable = true, length = 36)
    private String maHinh;
    @Basic
    @Column(name = "duong_dan", nullable = false, length = -1)
    private String duongDan;
    @Basic
    @Column(name = "ngay_tao", nullable = true)
    private Timestamp ngayTao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdSpct() {
        return idSpct;
    }

    public void setIdSpct(Integer idSpct) {
        this.idSpct = idSpct;
    }

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
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
        HinhAnh hinhAnh = (HinhAnh) o;
        return id == hinhAnh.id && Objects.equals(idSpct, hinhAnh.idSpct) && Objects.equals(maHinh, hinhAnh.maHinh) && Objects.equals(duongDan, hinhAnh.duongDan) && Objects.equals(ngayTao, hinhAnh.ngayTao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idSpct, maHinh, duongDan, ngayTao);
    }
}
