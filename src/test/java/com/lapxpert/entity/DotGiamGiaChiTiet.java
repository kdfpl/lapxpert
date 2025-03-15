package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dot_giam_gia_chi_tiet", schema = "public", catalog = "LapXpert")
public class DotGiamGiaChiTiet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_dot", nullable = true)
    private Integer idDot;
    @Basic
    @Column(name = "id_sp_ct", nullable = true)
    private Integer idSpCt;
    @Basic
    @Column(name = "ma_dot_chi_tiet", nullable = false, length = 36)
    private String maDotChiTiet;
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

    public Integer getIdDot() {
        return idDot;
    }

    public void setIdDot(Integer idDot) {
        this.idDot = idDot;
    }

    public Integer getIdSpCt() {
        return idSpCt;
    }

    public void setIdSpCt(Integer idSpCt) {
        this.idSpCt = idSpCt;
    }

    public String getMaDotChiTiet() {
        return maDotChiTiet;
    }

    public void setMaDotChiTiet(String maDotChiTiet) {
        this.maDotChiTiet = maDotChiTiet;
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
        DotGiamGiaChiTiet that = (DotGiamGiaChiTiet) o;
        return id == that.id && Objects.equals(idDot, that.idDot) && Objects.equals(idSpCt, that.idSpCt) && Objects.equals(maDotChiTiet, that.maDotChiTiet) && Objects.equals(ngayTao, that.ngayTao) && Objects.equals(tinhTrang, that.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idDot, idSpCt, maDotChiTiet, ngayTao, tinhTrang);
    }
}
