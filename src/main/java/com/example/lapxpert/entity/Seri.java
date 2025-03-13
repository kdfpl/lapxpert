package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "seri")
public class Seri {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seri_id_gen")
    @SequenceGenerator(name = "seri_id_gen", sequenceName = "seri_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ma_seri", nullable = false, length = 36)
    private String maSeri;

    @Column(name = "trang_thai", nullable = false, length = 50)
    private String trangThai;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_nhap_kho")
    private Instant ngayNhapKho;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaSeri() {
        return maSeri;
    }

    public void setMaSeri(String maSeri) {
        this.maSeri = maSeri;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Instant getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Instant ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public Boolean getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Instant getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Instant ngayTao) {
        this.ngayTao = ngayTao;
    }

}