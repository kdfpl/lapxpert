package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "o_cung")
public class OCung {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "o_cung_id_gen")
    @SequenceGenerator(name = "o_cung_id_gen", sequenceName = "o_cung_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ma_o_cung", nullable = false, length = 36)
    private String maOCung;

    @Column(name = "loai_o_cung", nullable = false, length = 100)
    private String loaiOCung;

    @Column(name = "dung_luong", nullable = false)
    private Integer dungLuong;

    @Column(name = "chuan_ket_noi", nullable = false, length = 100)
    private String chuanKetNoi;

    @Column(name = "toc_do_doc", nullable = false)
    private Integer tocDoDoc;

    @Column(name = "toc_do_ghi", nullable = false)
    private Integer tocDoGhi;

    @ColumnDefault("false")
    @Column(name = "ho_tro_nang_cap")
    private Boolean hoTroNangCap;

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

    public Integer getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(Integer dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getChuanKetNoi() {
        return chuanKetNoi;
    }

    public void setChuanKetNoi(String chuanKetNoi) {
        this.chuanKetNoi = chuanKetNoi;
    }

    public Integer getTocDoDoc() {
        return tocDoDoc;
    }

    public void setTocDoDoc(Integer tocDoDoc) {
        this.tocDoDoc = tocDoDoc;
    }

    public Integer getTocDoGhi() {
        return tocDoGhi;
    }

    public void setTocDoGhi(Integer tocDoGhi) {
        this.tocDoGhi = tocDoGhi;
    }

    public Boolean getHoTroNangCap() {
        return hoTroNangCap;
    }

    public void setHoTroNangCap(Boolean hoTroNangCap) {
        this.hoTroNangCap = hoTroNangCap;
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