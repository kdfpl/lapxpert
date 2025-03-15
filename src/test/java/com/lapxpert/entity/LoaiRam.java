package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "loai_ram", schema = "public", catalog = "LapXpert")
public class LoaiRam {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_loai", nullable = false, length = 36)
    private String maLoai;
    @Basic
    @Column(name = "ten_loai_ram", nullable = false, length = 255)
    private String tenLoaiRam;
    @Basic
    @Column(name = "bus_ram", nullable = false)
    private int busRam;
    @Basic
    @Column(name = "dien_ap", nullable = false, precision = 0)
    private double dienAp;
    @Basic
    @Column(name = "ho_tro_xmp", nullable = false)
    private boolean hoTroXmp;
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

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoaiRam() {
        return tenLoaiRam;
    }

    public void setTenLoaiRam(String tenLoaiRam) {
        this.tenLoaiRam = tenLoaiRam;
    }

    public int getBusRam() {
        return busRam;
    }

    public void setBusRam(int busRam) {
        this.busRam = busRam;
    }

    public double getDienAp() {
        return dienAp;
    }

    public void setDienAp(double dienAp) {
        this.dienAp = dienAp;
    }

    public boolean isHoTroXmp() {
        return hoTroXmp;
    }

    public void setHoTroXmp(boolean hoTroXmp) {
        this.hoTroXmp = hoTroXmp;
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
        LoaiRam loaiRam = (LoaiRam) o;
        return id == loaiRam.id && busRam == loaiRam.busRam && Double.compare(loaiRam.dienAp, dienAp) == 0 && hoTroXmp == loaiRam.hoTroXmp && Objects.equals(maLoai, loaiRam.maLoai) && Objects.equals(tenLoaiRam, loaiRam.tenLoaiRam) && Objects.equals(ngayTao, loaiRam.ngayTao) && Objects.equals(tinhTrang, loaiRam.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maLoai, tenLoaiRam, busRam, dienAp, hoTroXmp, ngayTao, tinhTrang);
    }
}
