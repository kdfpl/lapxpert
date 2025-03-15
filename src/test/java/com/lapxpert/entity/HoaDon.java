package com.lapxpert.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hoa_don", schema = "public", catalog = "LapXpert")
public class HoaDon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_khach_hang", nullable = true)
    private Integer idKhachHang;
    @Basic
    @Column(name = "id_giam_gia", nullable = true)
    private Integer idGiamGia;
    @Basic
    @Column(name = "id_thanh_toan", nullable = true)
    private Integer idThanhToan;
    @Basic
    @Column(name = "id_nhan_vien", nullable = true)
    private Integer idNhanVien;
    @Basic
    @Column(name = "ma_hoa_don", nullable = false, length = 36)
    private String maHoaDon;
    @Basic
    @Column(name = "ten_khach_hang", nullable = false, length = 100)
    private String tenKhachHang;
    @Basic
    @Column(name = "sdt", nullable = false, length = 15)
    private String sdt;
    @Basic
    @Column(name = "dia_chi", nullable = false, length = 255)
    private String diaChi;
    @Basic
    @Column(name = "tong_tien", nullable = false, precision = 2)
    private BigDecimal tongTien;
    @Basic
    @Column(name = "ngay_dat", nullable = true)
    private Timestamp ngayDat;
    @Basic
    @Column(name = "trang_thai", nullable = false, length = 50)
    private String trangThai;
    @Basic
    @Column(name = "tinh_trang", nullable = true)
    private Boolean tinhTrang;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Integer getIdGiamGia() {
        return idGiamGia;
    }

    public void setIdGiamGia(Integer idGiamGia) {
        this.idGiamGia = idGiamGia;
    }

    public Integer getIdThanhToan() {
        return idThanhToan;
    }

    public void setIdThanhToan(Integer idThanhToan) {
        this.idThanhToan = idThanhToan;
    }

    public Integer getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public Timestamp getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Timestamp ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
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
        HoaDon hoaDon = (HoaDon) o;
        return id == hoaDon.id && Objects.equals(idKhachHang, hoaDon.idKhachHang) && Objects.equals(idGiamGia, hoaDon.idGiamGia) && Objects.equals(idThanhToan, hoaDon.idThanhToan) && Objects.equals(idNhanVien, hoaDon.idNhanVien) && Objects.equals(maHoaDon, hoaDon.maHoaDon) && Objects.equals(tenKhachHang, hoaDon.tenKhachHang) && Objects.equals(sdt, hoaDon.sdt) && Objects.equals(diaChi, hoaDon.diaChi) && Objects.equals(tongTien, hoaDon.tongTien) && Objects.equals(ngayDat, hoaDon.ngayDat) && Objects.equals(trangThai, hoaDon.trangThai) && Objects.equals(tinhTrang, hoaDon.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idKhachHang, idGiamGia, idThanhToan, idNhanVien, maHoaDon, tenKhachHang, sdt, diaChi, tongTien, ngayDat, trangThai, tinhTrang);
    }
}
