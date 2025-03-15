package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Cpu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_cpu", nullable = false, length = 36)
    private String maCpu;
    @Basic
    @Column(name = "hang_cpu", nullable = false, length = 100)
    private String hangCpu;
    @Basic
    @Column(name = "ten_cpu", nullable = false, length = 255)
    private String tenCpu;
    @Basic
    @Column(name = "the_he_cpu", nullable = false, length = 100)
    private String theHeCpu;
    @Basic
    @Column(name = "so_nhan", nullable = false)
    private int soNhan;
    @Basic
    @Column(name = "so_luong", nullable = false)
    private int soLuong;
    @Basic
    @Column(name = "xung_nhip", nullable = false, precision = 0)
    private double xungNhip;
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

    public String getMaCpu() {
        return maCpu;
    }

    public void setMaCpu(String maCpu) {
        this.maCpu = maCpu;
    }

    public String getHangCpu() {
        return hangCpu;
    }

    public void setHangCpu(String hangCpu) {
        this.hangCpu = hangCpu;
    }

    public String getTenCpu() {
        return tenCpu;
    }

    public void setTenCpu(String tenCpu) {
        this.tenCpu = tenCpu;
    }

    public String getTheHeCpu() {
        return theHeCpu;
    }

    public void setTheHeCpu(String theHeCpu) {
        this.theHeCpu = theHeCpu;
    }

    public int getSoNhan() {
        return soNhan;
    }

    public void setSoNhan(int soNhan) {
        this.soNhan = soNhan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getXungNhip() {
        return xungNhip;
    }

    public void setXungNhip(double xungNhip) {
        this.xungNhip = xungNhip;
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
        Cpu cpu = (Cpu) o;
        return id == cpu.id && soNhan == cpu.soNhan && soLuong == cpu.soLuong && Double.compare(cpu.xungNhip, xungNhip) == 0 && Objects.equals(maCpu, cpu.maCpu) && Objects.equals(hangCpu, cpu.hangCpu) && Objects.equals(tenCpu, cpu.tenCpu) && Objects.equals(theHeCpu, cpu.theHeCpu) && Objects.equals(ngayTao, cpu.ngayTao) && Objects.equals(tinhTrang, cpu.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maCpu, hangCpu, tenCpu, theHeCpu, soNhan, soLuong, xungNhip, ngayTao, tinhTrang);
    }
}
