package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "san_pham", schema = "public", catalog = "LapXpert")
public class SanPham {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_loai", nullable = true)
    private Integer idLoai;
    @Basic
    @Column(name = "id_he_dieu_hanh", nullable = true)
    private Integer idHeDieuHanh;
    @Basic
    @Column(name = "id_thuong_hieu", nullable = true)
    private Integer idThuongHieu;
    @Basic
    @Column(name = "ma_sp", nullable = false, length = 36)
    private String maSp;
    @Basic
    @Column(name = "ten_sp", nullable = false, length = 255)
    private String tenSp;
    @Basic
    @Column(name = "ngay_tao", nullable = true)
    private Timestamp ngayTao;
    @Basic
    @Column(name = "tinh_trang", nullable = true)
    private Boolean tinhTrang;
    @Basic
    @Column(name = "mo_ta", nullable = true, length = -1)
    private String moTa;
    @Basic
    @Column(name = "bao_hanh_thang", nullable = false)
    private int baoHanhThang;
    @Basic
    @Column(name = "trang_thai", nullable = false)
    private boolean trangThai;
    @Basic
    @Column(name = "hinh_anh", nullable = true, length = -1)
    private String hinhAnh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(Integer idLoai) {
        this.idLoai = idLoai;
    }

    public Integer getIdHeDieuHanh() {
        return idHeDieuHanh;
    }

    public void setIdHeDieuHanh(Integer idHeDieuHanh) {
        this.idHeDieuHanh = idHeDieuHanh;
    }

    public Integer getIdThuongHieu() {
        return idThuongHieu;
    }

    public void setIdThuongHieu(Integer idThuongHieu) {
        this.idThuongHieu = idThuongHieu;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getBaoHanhThang() {
        return baoHanhThang;
    }

    public void setBaoHanhThang(int baoHanhThang) {
        this.baoHanhThang = baoHanhThang;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanPham sanPham = (SanPham) o;
        return id == sanPham.id && baoHanhThang == sanPham.baoHanhThang && trangThai == sanPham.trangThai && Objects.equals(idLoai, sanPham.idLoai) && Objects.equals(idHeDieuHanh, sanPham.idHeDieuHanh) && Objects.equals(idThuongHieu, sanPham.idThuongHieu) && Objects.equals(maSp, sanPham.maSp) && Objects.equals(tenSp, sanPham.tenSp) && Objects.equals(ngayTao, sanPham.ngayTao) && Objects.equals(tinhTrang, sanPham.tinhTrang) && Objects.equals(moTa, sanPham.moTa) && Objects.equals(hinhAnh, sanPham.hinhAnh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idLoai, idHeDieuHanh, idThuongHieu, maSp, tenSp, ngayTao, tinhTrang, moTa, baoHanhThang, trangThai, hinhAnh);
    }
}
