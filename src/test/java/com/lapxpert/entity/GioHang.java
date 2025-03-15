package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gio_hang", schema = "public", catalog = "LapXpert")
public class GioHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_khach_hang", nullable = true)
    private Integer idKhachHang;
    @Basic
    @Column(name = "id_chi_tiet_sp", nullable = true)
    private Integer idChiTietSp;
    @Basic
    @Column(name = "ma_gio_hang", nullable = false, length = 36)
    private String maGioHang;
    @Basic
    @Column(name = "so_luong", nullable = true)
    private Integer soLuong;
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

    public Integer getIdChiTietSp() {
        return idChiTietSp;
    }

    public void setIdChiTietSp(Integer idChiTietSp) {
        this.idChiTietSp = idChiTietSp;
    }

    public String getMaGioHang() {
        return maGioHang;
    }

    public void setMaGioHang(String maGioHang) {
        this.maGioHang = maGioHang;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
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
        GioHang gioHang = (GioHang) o;
        return id == gioHang.id && Objects.equals(idKhachHang, gioHang.idKhachHang) && Objects.equals(idChiTietSp, gioHang.idChiTietSp) && Objects.equals(maGioHang, gioHang.maGioHang) && Objects.equals(soLuong, gioHang.soLuong) && Objects.equals(ngayTao, gioHang.ngayTao) && Objects.equals(tinhTrang, gioHang.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idKhachHang, idChiTietSp, maGioHang, soLuong, ngayTao, tinhTrang);
    }
}
