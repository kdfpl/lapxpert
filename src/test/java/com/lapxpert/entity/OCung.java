package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "o_cung", schema = "public", catalog = "LapXpert")
public class OCung {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_o_cung", nullable = false, length = 36)
    private String maOCung;
    @Basic
    @Column(name = "loai_o_cung", nullable = false, length = 100)
    private String loaiOCung;
    @Basic
    @Column(name = "dung_luong", nullable = false)
    private int dungLuong;
    @Basic
    @Column(name = "chuan_ket_noi", nullable = false, length = 100)
    private String chuanKetNoi;
    @Basic
    @Column(name = "toc_do_doc", nullable = false)
    private int tocDoDoc;
    @Basic
    @Column(name = "toc_do_ghi", nullable = false)
    private int tocDoGhi;
    @Basic
    @Column(name = "ho_tro_nang_cap", nullable = true)
    private Boolean hoTroNangCap;
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

    public String getMaOCung() {
        return maOCung;
    }

    public void setMaOCung(String maOCung) {
        this.maOCung = maOCung;
    }

    public String getLoaiOCung() {
        return loaiOCung;
    }

    public void setLoaiOCung(String loaiOCung) {
        this.loaiOCung = loaiOCung;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getChuanKetNoi() {
        return chuanKetNoi;
    }

    public void setChuanKetNoi(String chuanKetNoi) {
        this.chuanKetNoi = chuanKetNoi;
    }

    public int getTocDoDoc() {
        return tocDoDoc;
    }

    public void setTocDoDoc(int tocDoDoc) {
        this.tocDoDoc = tocDoDoc;
    }

    public int getTocDoGhi() {
        return tocDoGhi;
    }

    public void setTocDoGhi(int tocDoGhi) {
        this.tocDoGhi = tocDoGhi;
    }

    public Boolean getHoTroNangCap() {
        return hoTroNangCap;
    }

    public void setHoTroNangCap(Boolean hoTroNangCap) {
        this.hoTroNangCap = hoTroNangCap;
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
        OCung oCung = (OCung) o;
        return id == oCung.id && dungLuong == oCung.dungLuong && tocDoDoc == oCung.tocDoDoc && tocDoGhi == oCung.tocDoGhi && Objects.equals(maOCung, oCung.maOCung) && Objects.equals(loaiOCung, oCung.loaiOCung) && Objects.equals(chuanKetNoi, oCung.chuanKetNoi) && Objects.equals(hoTroNangCap, oCung.hoTroNangCap) && Objects.equals(ngayTao, oCung.ngayTao) && Objects.equals(tinhTrang, oCung.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maOCung, loaiOCung, dungLuong, chuanKetNoi, tocDoDoc, tocDoGhi, hoTroNangCap, ngayTao, tinhTrang);
    }
}
