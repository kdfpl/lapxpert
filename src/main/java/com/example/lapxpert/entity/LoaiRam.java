package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "loai_ram")
public class LoaiRam {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loai_ram_id_gen")
    @SequenceGenerator(name = "loai_ram_id_gen", sequenceName = "loai_ram_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ma_loai", nullable = false, length = 36)
    private String maLoai;

    @Column(name = "ten_loai_ram", nullable = false)
    private String tenLoaiRam;

    @Column(name = "bus_ram", nullable = false)
    private Integer busRam;

    @Column(name = "dien_ap", nullable = false)
    private Double dienAp;

    @ColumnDefault("false")
    @Column(name = "ho_tro_xmp", nullable = false)
    private Boolean hoTroXmp = false;

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

    public Integer getBusRam() {
        return busRam;
    }

    public void setBusRam(Integer busRam) {
        this.busRam = busRam;
    }

    public Double getDienAp() {
        return dienAp;
    }

    public void setDienAp(Double dienAp) {
        this.dienAp = dienAp;
    }

    public Boolean getHoTroXmp() {
        return hoTroXmp;
    }

    public void setHoTroXmp(Boolean hoTroXmp) {
        this.hoTroXmp = hoTroXmp;
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