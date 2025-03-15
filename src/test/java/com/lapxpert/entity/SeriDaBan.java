package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "seri_da_ban", schema = "public", catalog = "LapXpert")
public class SeriDaBan {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_hoa_don_chi_tiet", nullable = true)
    private Integer idHoaDonChiTiet;
    @Basic
    @Column(name = "id_seri", nullable = true)
    private Integer idSeri;
    @Basic
    @Column(name = "ma_seri_da_ban", nullable = false, length = 36)
    private String maSeriDaBan;
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

    public Integer getIdHoaDonChiTiet() {
        return idHoaDonChiTiet;
    }

    public void setIdHoaDonChiTiet(Integer idHoaDonChiTiet) {
        this.idHoaDonChiTiet = idHoaDonChiTiet;
    }

    public Integer getIdSeri() {
        return idSeri;
    }

    public void setIdSeri(Integer idSeri) {
        this.idSeri = idSeri;
    }

    public String getMaSeriDaBan() {
        return maSeriDaBan;
    }

    public void setMaSeriDaBan(String maSeriDaBan) {
        this.maSeriDaBan = maSeriDaBan;
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
        SeriDaBan seriDaBan = (SeriDaBan) o;
        return id == seriDaBan.id && Objects.equals(idHoaDonChiTiet, seriDaBan.idHoaDonChiTiet) && Objects.equals(idSeri, seriDaBan.idSeri) && Objects.equals(maSeriDaBan, seriDaBan.maSeriDaBan) && Objects.equals(ngayTao, seriDaBan.ngayTao) && Objects.equals(tinhTrang, seriDaBan.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idHoaDonChiTiet, idSeri, maSeriDaBan, ngayTao, tinhTrang);
    }
}
