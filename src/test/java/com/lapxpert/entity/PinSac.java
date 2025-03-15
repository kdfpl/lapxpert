package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pin_sac", schema = "public", catalog = "LapXpert")
public class PinSac {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_pin", nullable = false, length = 36)
    private String maPin;
    @Basic
    @Column(name = "dung_luong_pin", nullable = false)
    private int dungLuongPin;
    @Basic
    @Column(name = "thoi_luong_pin", nullable = false, precision = 0)
    private double thoiLuongPin;
    @Basic
    @Column(name = "cong_suat_sac", nullable = false)
    private int congSuatSac;
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

    public String getMaPin() {
        return maPin;
    }

    public void setMaPin(String maPin) {
        this.maPin = maPin;
    }

    public int getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(int dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    public double getThoiLuongPin() {
        return thoiLuongPin;
    }

    public void setThoiLuongPin(double thoiLuongPin) {
        this.thoiLuongPin = thoiLuongPin;
    }

    public int getCongSuatSac() {
        return congSuatSac;
    }

    public void setCongSuatSac(int congSuatSac) {
        this.congSuatSac = congSuatSac;
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
        PinSac pinSac = (PinSac) o;
        return id == pinSac.id && dungLuongPin == pinSac.dungLuongPin && Double.compare(pinSac.thoiLuongPin, thoiLuongPin) == 0 && congSuatSac == pinSac.congSuatSac && Objects.equals(maPin, pinSac.maPin) && Objects.equals(ngayTao, pinSac.ngayTao) && Objects.equals(tinhTrang, pinSac.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maPin, dungLuongPin, thoiLuongPin, congSuatSac, ngayTao, tinhTrang);
    }
}
