package com.lapxpert.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "thanh_toan_hoa_don", schema = "public", catalog = "LapXpert")
public class ThanhToanHoaDon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_hoa_don", nullable = true)
    private Integer idHoaDon;
    @Basic
    @Column(name = "id_thanh_toan", nullable = true)
    private Integer idThanhToan;
    @Basic
    @Column(name = "ma_giao_dich", nullable = false, length = 36)
    private String maGiaoDich;
    @Basic
    @Column(name = "so_tien_tra", nullable = false, precision = 2)
    private BigDecimal soTienTra;
    @Basic
    @Column(name = "tinh_trang", nullable = true)
    private Boolean tinhTrang;
    @Basic
    @Column(name = "ngay_tao", nullable = true)
    private Timestamp ngayTao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Integer getIdThanhToan() {
        return idThanhToan;
    }

    public void setIdThanhToan(Integer idThanhToan) {
        this.idThanhToan = idThanhToan;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public BigDecimal getSoTienTra() {
        return soTienTra;
    }

    public void setSoTienTra(BigDecimal soTienTra) {
        this.soTienTra = soTienTra;
    }

    public Boolean getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThanhToanHoaDon that = (ThanhToanHoaDon) o;
        return id == that.id && Objects.equals(idHoaDon, that.idHoaDon) && Objects.equals(idThanhToan, that.idThanhToan) && Objects.equals(maGiaoDich, that.maGiaoDich) && Objects.equals(soTienTra, that.soTienTra) && Objects.equals(tinhTrang, that.tinhTrang) && Objects.equals(ngayTao, that.ngayTao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idHoaDon, idThanhToan, maGiaoDich, soTienTra, tinhTrang, ngayTao);
    }
}
