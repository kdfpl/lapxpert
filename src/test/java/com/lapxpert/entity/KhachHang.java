package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "khach_hang", schema = "public", catalog = "LapXpert")
public class KhachHang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_khach_hang", nullable = false, length = 36)
    private String maKhachHang;
    @Basic
    @Column(name = "ho_ten", nullable = false, length = 100)
    private String hoTen;
    @Basic
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Basic
    @Column(name = "sdt", nullable = false, length = 15)
    private String sdt;
    @Basic
    @Column(name = "mat_khau", nullable = false, length = -1)
    private String matKhau;
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

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
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
        KhachHang khachHang = (KhachHang) o;
        return id == khachHang.id && Objects.equals(maKhachHang, khachHang.maKhachHang) && Objects.equals(hoTen, khachHang.hoTen) && Objects.equals(email, khachHang.email) && Objects.equals(sdt, khachHang.sdt) && Objects.equals(matKhau, khachHang.matKhau) && Objects.equals(tinhTrang, khachHang.tinhTrang) && Objects.equals(ngayTao, khachHang.ngayTao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maKhachHang, hoTen, email, sdt, matKhau, tinhTrang, ngayTao);
    }
}
