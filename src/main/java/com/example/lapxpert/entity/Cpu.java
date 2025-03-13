package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "cpu")
public class Cpu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cpu_id_gen")
    @SequenceGenerator(name = "cpu_id_gen", sequenceName = "cpu_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ma_cpu", nullable = false, length = 36)
    private String maCpu;

    @Column(name = "hang_cpu", nullable = false, length = 100)
    private String hangCpu;

    @Column(name = "ten_cpu", nullable = false)
    private String tenCpu;

    @Column(name = "the_he_cpu", nullable = false, length = 100)
    private String theHeCpu;

    @Column(name = "so_nhan", nullable = false)
    private Integer soNhan;

    @Column(name = "so_luong", nullable = false)
    private Integer soLuong;

    @Column(name = "xung_nhip", nullable = false)
    private Double xungNhip;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getSoNhan() {
        return soNhan;
    }

    public void setSoNhan(Integer soNhan) {
        this.soNhan = soNhan;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getXungNhip() {
        return xungNhip;
    }

    public void setXungNhip(Double xungNhip) {
        this.xungNhip = xungNhip;
    }

    public Instant getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Instant ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Boolean getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

}