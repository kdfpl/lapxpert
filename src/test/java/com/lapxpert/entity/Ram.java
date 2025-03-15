package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Ram {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_loai_ram", nullable = true)
    private Integer idLoaiRam;
    @Basic
    @Column(name = "ma_ram", nullable = false, length = 36)
    private String maRam;
    @Basic
    @Column(name = "dung_luong_ram", nullable = false)
    private int dungLuongRam;
    @Basic
    @Column(name = "so_khe_ram", nullable = false)
    private int soKheRam;
    @Basic
    @Column(name = "ho_tro_toi_da", nullable = false)
    private int hoTroToiDa;
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

    public Integer getIdLoaiRam() {
        return idLoaiRam;
    }

    public void setIdLoaiRam(Integer idLoaiRam) {
        this.idLoaiRam = idLoaiRam;
    }

    public String getMaRam() {
        return maRam;
    }

    public void setMaRam(String maRam) {
        this.maRam = maRam;
    }

    public int getDungLuongRam() {
        return dungLuongRam;
    }

    public void setDungLuongRam(int dungLuongRam) {
        this.dungLuongRam = dungLuongRam;
    }

    public int getSoKheRam() {
        return soKheRam;
    }

    public void setSoKheRam(int soKheRam) {
        this.soKheRam = soKheRam;
    }

    public int getHoTroToiDa() {
        return hoTroToiDa;
    }

    public void setHoTroToiDa(int hoTroToiDa) {
        this.hoTroToiDa = hoTroToiDa;
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
        Ram ram = (Ram) o;
        return id == ram.id && dungLuongRam == ram.dungLuongRam && soKheRam == ram.soKheRam && hoTroToiDa == ram.hoTroToiDa && Objects.equals(idLoaiRam, ram.idLoaiRam) && Objects.equals(maRam, ram.maRam) && Objects.equals(ngayTao, ram.ngayTao) && Objects.equals(tinhTrang, ram.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idLoaiRam, maRam, dungLuongRam, soKheRam, hoTroToiDa, ngayTao, tinhTrang);
    }
}
