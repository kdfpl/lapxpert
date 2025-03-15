package com.lapxpert.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "san_pham_chi_tiet", schema = "public", catalog = "LapXpert")
public class SanPhamChiTiet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_sp", nullable = true)
    private Integer idSp;
    @Basic
    @Column(name = "id_ram", nullable = true)
    private Integer idRam;
    @Basic
    @Column(name = "id_man_hinh", nullable = true)
    private Integer idManHinh;
    @Basic
    @Column(name = "id_pin", nullable = true)
    private Integer idPin;
    @Basic
    @Column(name = "id_mau", nullable = true)
    private Integer idMau;
    @Basic
    @Column(name = "id_gpu", nullable = true)
    private Integer idGpu;
    @Basic
    @Column(name = "id_cpu", nullable = true)
    private Integer idCpu;
    @Basic
    @Column(name = "id_o_cung", nullable = true)
    private Integer idOCung;
    @Basic
    @Column(name = "id_seri", nullable = true)
    private Integer idSeri;
    @Basic
    @Column(name = "ma_chi_tiet_sp", nullable = false, length = 36)
    private String maChiTietSp;
    @Basic
    @Column(name = "gia_ban", nullable = false, precision = 2)
    private BigDecimal giaBan;
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

    public Integer getIdSp() {
        return idSp;
    }

    public void setIdSp(Integer idSp) {
        this.idSp = idSp;
    }

    public Integer getIdRam() {
        return idRam;
    }

    public void setIdRam(Integer idRam) {
        this.idRam = idRam;
    }

    public Integer getIdManHinh() {
        return idManHinh;
    }

    public void setIdManHinh(Integer idManHinh) {
        this.idManHinh = idManHinh;
    }

    public Integer getIdPin() {
        return idPin;
    }

    public void setIdPin(Integer idPin) {
        this.idPin = idPin;
    }

    public Integer getIdMau() {
        return idMau;
    }

    public void setIdMau(Integer idMau) {
        this.idMau = idMau;
    }

    public Integer getIdGpu() {
        return idGpu;
    }

    public void setIdGpu(Integer idGpu) {
        this.idGpu = idGpu;
    }

    public Integer getIdCpu() {
        return idCpu;
    }

    public void setIdCpu(Integer idCpu) {
        this.idCpu = idCpu;
    }

    public Integer getIdOCung() {
        return idOCung;
    }

    public void setIdOCung(Integer idOCung) {
        this.idOCung = idOCung;
    }

    public Integer getIdSeri() {
        return idSeri;
    }

    public void setIdSeri(Integer idSeri) {
        this.idSeri = idSeri;
    }

    public String getMaChiTietSp() {
        return maChiTietSp;
    }

    public void setMaChiTietSp(String maChiTietSp) {
        this.maChiTietSp = maChiTietSp;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
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
        SanPhamChiTiet that = (SanPhamChiTiet) o;
        return id == that.id && Objects.equals(idSp, that.idSp) && Objects.equals(idRam, that.idRam) && Objects.equals(idManHinh, that.idManHinh) && Objects.equals(idPin, that.idPin) && Objects.equals(idMau, that.idMau) && Objects.equals(idGpu, that.idGpu) && Objects.equals(idCpu, that.idCpu) && Objects.equals(idOCung, that.idOCung) && Objects.equals(idSeri, that.idSeri) && Objects.equals(maChiTietSp, that.maChiTietSp) && Objects.equals(giaBan, that.giaBan) && Objects.equals(ngayTao, that.ngayTao) && Objects.equals(tinhTrang, that.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idSp, idRam, idManHinh, idPin, idMau, idGpu, idCpu, idOCung, idSeri, maChiTietSp, giaBan, ngayTao, tinhTrang);
    }
}
