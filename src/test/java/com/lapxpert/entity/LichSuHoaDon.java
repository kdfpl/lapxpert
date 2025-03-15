package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "lich_su_hoa_don", schema = "public", catalog = "LapXpert")
public class LichSuHoaDon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_hoa_don", nullable = true)
    private Integer idHoaDon;
    @Basic
    @Column(name = "ma_lich_su", nullable = false, length = 36)
    private String maLichSu;
    @Basic
    @Column(name = "hanh_dong", nullable = false, length = -1)
    private String hanhDong;
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

    public String getMaLichSu() {
        return maLichSu;
    }

    public void setMaLichSu(String maLichSu) {
        this.maLichSu = maLichSu;
    }

    public String getHanhDong() {
        return hanhDong;
    }

    public void setHanhDong(String hanhDong) {
        this.hanhDong = hanhDong;
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
        LichSuHoaDon that = (LichSuHoaDon) o;
        return id == that.id && Objects.equals(idHoaDon, that.idHoaDon) && Objects.equals(maLichSu, that.maLichSu) && Objects.equals(hanhDong, that.hanhDong) && Objects.equals(ngayTao, that.ngayTao) && Objects.equals(tinhTrang, that.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idHoaDon, maLichSu, hanhDong, ngayTao, tinhTrang);
    }
}
