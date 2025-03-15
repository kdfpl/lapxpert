package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dia_chi", schema = "public", catalog = "LapXpert")
public class DiaChi {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_khach_hang", nullable = true)
    private Integer idKhachHang;
    @Basic
    @Column(name = "ma_dia_chi", nullable = false, length = 36)
    private String maDiaChi;
    @Basic
    @Column(name = "thanh_pho", nullable = false, length = 100)
    private String thanhPho;
    @Basic
    @Column(name = "quan_huyen", nullable = false, length = 100)
    private String quanHuyen;
    @Basic
    @Column(name = "phuong_xa", nullable = false, length = 100)
    private String phuongXa;
    @Basic
    @Column(name = "so_nha_duong", nullable = false, length = -1)
    private String soNhaDuong;
    @Basic
    @Column(name = "mac_dinh", nullable = true)
    private Boolean macDinh;
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

    public String getMaDiaChi() {
        return maDiaChi;
    }

    public void setMaDiaChi(String maDiaChi) {
        this.maDiaChi = maDiaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getPhuongXa() {
        return phuongXa;
    }

    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }

    public String getSoNhaDuong() {
        return soNhaDuong;
    }

    public void setSoNhaDuong(String soNhaDuong) {
        this.soNhaDuong = soNhaDuong;
    }

    public Boolean getMacDinh() {
        return macDinh;
    }

    public void setMacDinh(Boolean macDinh) {
        this.macDinh = macDinh;
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
        DiaChi diaChi = (DiaChi) o;
        return id == diaChi.id && Objects.equals(idKhachHang, diaChi.idKhachHang) && Objects.equals(maDiaChi, diaChi.maDiaChi) && Objects.equals(thanhPho, diaChi.thanhPho) && Objects.equals(quanHuyen, diaChi.quanHuyen) && Objects.equals(phuongXa, diaChi.phuongXa) && Objects.equals(soNhaDuong, diaChi.soNhaDuong) && Objects.equals(macDinh, diaChi.macDinh) && Objects.equals(ngayTao, diaChi.ngayTao) && Objects.equals(tinhTrang, diaChi.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idKhachHang, maDiaChi, thanhPho, quanHuyen, phuongXa, soNhaDuong, macDinh, ngayTao, tinhTrang);
    }
}
