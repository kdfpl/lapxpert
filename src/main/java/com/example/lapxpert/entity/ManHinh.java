package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "man_hinh")
public class ManHinh {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "man_hinh_id_gen")
    @SequenceGenerator(name = "man_hinh_id_gen", sequenceName = "man_hinh_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ma_man_hinh", nullable = false, length = 36)
    private String maManHinh;

    @Column(name = "kich_thuoc", nullable = false)
    private Double kichThuoc;

    @Column(name = "tan_so_quet", nullable = false)
    private Integer tanSoQuet;

    @Column(name = "loai_tam_nen", nullable = false)
    private String loaiTamNen;

    @Column(name = "do_sang", nullable = false)
    private Integer doSang;

    @Column(name = "chuan_mau", nullable = false)
    private String chuanMau;

    @Column(name = "do_phan_giai", nullable = false)
    private String doPhanGiai;

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

    public String getMaManHinh() {
        return maManHinh;
    }

    public void setMaManHinh(String maManHinh) {
        this.maManHinh = maManHinh;
    }

    public Double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(Double kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public Integer getTanSoQuet() {
        return tanSoQuet;
    }

    public void setTanSoQuet(Integer tanSoQuet) {
        this.tanSoQuet = tanSoQuet;
    }

    public String getLoaiTamNen() {
        return loaiTamNen;
    }

    public void setLoaiTamNen(String loaiTamNen) {
        this.loaiTamNen = loaiTamNen;
    }

    public Integer getDoSang() {
        return doSang;
    }

    public void setDoSang(Integer doSang) {
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