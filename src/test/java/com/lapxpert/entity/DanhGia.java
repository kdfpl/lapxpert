package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "danh_gia", schema = "public", catalog = "LapXpert")
public class DanhGia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_spt", nullable = true)
    private Integer idSpt;
    @Basic
    @Column(name = "id_khach_hang", nullable = true)
    private Integer idKhachHang;
    @Basic
    @Column(name = "ma_danh_gia", nullable = false, length = 36)
    private String maDanhGia;
    @Basic
    @Column(name = "so_sao", nullable = true)
    private Integer soSao;
    @Basic
    @Column(name = "binh_luan", nullable = true, length = -1)
    private String binhLuan;
    @Basic
    @Column(name = "ngay_danh_gia", nullable = true)
    private Timestamp ngayDanhGia;
    @Basic
    @Column(name = "tinh_trang", nullable = true)
    private Boolean tinhTrang;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdSpt() {
        return idSpt;
    }

    public void setIdSpt(Integer idSpt) {
        this.idSpt = idSpt;
    }

    public Integer getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getMaDanhGia() {
        return maDanhGia;
    }

    public void setMaDanhGia(String maDanhGia) {
        this.maDanhGia = maDanhGia;
    }

    public Integer getSoSao() {
        return soSao;
    }

    public void setSoSao(Integer soSao) {
        this.soSao = soSao;
    }

    public String getBinhLuan() {
        return binhLuan;
    }

    public void setBinhLuan(String binhLuan) {
        this.binhLuan = binhLuan;
    }

    public Timestamp getNgayDanhGia() {
        return ngayDanhGia;
    }

    public void setNgayDanhGia(Timestamp ngayDanhGia) {
        this.ngayDanhGia = ngayDanhGia;
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
        DanhGia danhGia = (DanhGia) o;
        return id == danhGia.id && Objects.equals(idSpt, danhGia.idSpt) && Objects.equals(idKhachHang, danhGia.idKhachHang) && Objects.equals(maDanhGia, danhGia.maDanhGia) && Objects.equals(soSao, danhGia.soSao) && Objects.equals(binhLuan, danhGia.binhLuan) && Objects.equals(ngayDanhGia, danhGia.ngayDanhGia) && Objects.equals(tinhTrang, danhGia.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idSpt, idKhachHang, maDanhGia, soSao, binhLuan, ngayDanhGia, tinhTrang);
    }
}
