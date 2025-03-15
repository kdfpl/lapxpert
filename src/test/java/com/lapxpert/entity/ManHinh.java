package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "man_hinh", schema = "public", catalog = "LapXpert")
public class ManHinh {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_man_hinh", nullable = false, length = 36)
    private String maManHinh;
    @Basic
    @Column(name = "kich_thuoc", nullable = false, precision = 0)
    private double kichThuoc;
    @Basic
    @Column(name = "tan_so_quet", nullable = false)
    private int tanSoQuet;
    @Basic
    @Column(name = "loai_tam_nen", nullable = false, length = 255)
    private String loaiTamNen;
    @Basic
    @Column(name = "do_sang", nullable = false)
    private int doSang;
    @Basic
    @Column(name = "chuan_mau", nullable = false, length = 255)
    private String chuanMau;
    @Basic
    @Column(name = "do_phan_giai", nullable = false, length = 255)
    private String doPhanGiai;
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

    public String getMaManHinh() {
        return maManHinh;
    }

    public void setMaManHinh(String maManHinh) {
        this.maManHinh = maManHinh;
    }

    public double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(double kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getTanSoQuet() {
        return tanSoQuet;
    }

    public void setTanSoQuet(int tanSoQuet) {
        this.tanSoQuet = tanSoQuet;
    }

    public String getLoaiTamNen() {
        return loaiTamNen;
    }

    public void setLoaiTamNen(String loaiTamNen) {
        this.loaiTamNen = loaiTamNen;
    }

    public int getDoSang() {
        return doSang;
    }

    public void setDoSang(int doSang) {
        this.doSang = doSang;
    }

    public String getChuanMau() {
        return chuanMau;
    }

    public void setChuanMau(String chuanMau) {
        this.chuanMau = chuanMau;
    }

    public String getDoPhanGiai() {
        return doPhanGiai;
    }

    public void setDoPhanGiai(String doPhanGiai) {
        this.doPhanGiai = doPhanGiai;
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
        ManHinh manHinh = (ManHinh) o;
        return id == manHinh.id && Double.compare(manHinh.kichThuoc, kichThuoc) == 0 && tanSoQuet == manHinh.tanSoQuet && doSang == manHinh.doSang && Objects.equals(maManHinh, manHinh.maManHinh) && Objects.equals(loaiTamNen, manHinh.loaiTamNen) && Objects.equals(chuanMau, manHinh.chuanMau) && Objects.equals(doPhanGiai, manHinh.doPhanGiai) && Objects.equals(ngayTao, manHinh.ngayTao) && Objects.equals(tinhTrang, manHinh.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maManHinh, kichThuoc, tanSoQuet, loaiTamNen, doSang, chuanMau, doPhanGiai, ngayTao, tinhTrang);
    }
}
