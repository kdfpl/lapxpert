package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "he_dieu_hanh")
public class HeDieuHanh {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "he_dieu_hanh_id_gen")
    @SequenceGenerator(name = "he_dieu_hanh_id_gen", sequenceName = "he_dieu_hanh_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ma_he_dieu_hanh", nullable = false, length = 36)
    private String maHeDieuHanh;

    @Column(name = "ten_he_dieu_hanh", nullable = false)
    private String tenHeDieuHanh;

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

    public String getMaHeDieuHanh() {
        return maHeDieuHanh;
    }

    public void setMaHeDieuHanh(String maHeDieuHanh) {
        this.maHeDieuHanh = maHeDieuHanh;
    }

    public String getTenHeDieuHanh() {
        return tenHeDieuHanh;
    }

    public void setTenHeDieuHanh(String tenHeDieuHanh) {
        this.tenHeDieuHanh = tenHeDieuHanh;
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