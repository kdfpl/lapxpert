package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "pin_sac")
public class PinSac {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pin_sac_id_gen")
    @SequenceGenerator(name = "pin_sac_id_gen", sequenceName = "pin_sac_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ma_pin", nullable = false, length = 36)
    private String maPin;

    @Column(name = "dung_luong_pin", nullable = false)
    private Integer dungLuongPin;

    @Column(name = "thoi_luong_pin", nullable = false)
    private Double thoiLuongPin;

    @Column(name = "cong_suat_sac", nullable = false)
    private Integer congSuatSac;

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

    public String getMaPin() {
        return maPin;
    }

    public void setMaPin(String maPin) {
        this.maPin = maPin;
    }

    public Integer getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(Integer dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    public Double getThoiLuongPin() {
        return thoiLuongPin;
    }

    public void setThoiLuongPin(Double thoiLuongPin) {
        this.thoiLuongPin = thoiLuongPin;
    }

    public Integer getCongSuatSac() {
        return congSuatSac;
    }

    public void setCongSuatSac(Integer congSuatSac) {
        this.congSuatSac = congSuatSac;
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