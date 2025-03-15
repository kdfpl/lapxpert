package com.lapxpert.NhanVienModule.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "nhan_vien", schema = "public", catalog = "LapXpert")
public class NhanVien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_chuc_vu", nullable = true)
    private Integer idChucVu;
    @Basic
    @Column(name = "ma_nhan_vien", nullable = false, length = 36)
    private String maNhanVien;
    @Basic
    @Column(name = "ho_ten", nullable = false, length = 255)
    private String hoTen;
    @Basic
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @Basic
    @Column(name = "sdt", nullable = false, length = 15)
    private String sdt;
    @Basic
    @Column(name = "mat_khau", nullable = false, length = 255)
    private String matKhau;
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

    public Integer getIdChucVu() {
        return idChucVu;
    }

    public void setIdChucVu(Integer idChucVu) {
        this.idChucVu = idChucVu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
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
        NhanVien nhanVien = (NhanVien) o;
        return id == nhanVien.id && Objects.equals(idChucVu, nhanVien.idChucVu) && Objects.equals(maNhanVien, nhanVien.maNhanVien) && Objects.equals(hoTen, nhanVien.hoTen) && Objects.equals(email, nhanVien.email) && Objects.equals(sdt, nhanVien.sdt) && Objects.equals(matKhau, nhanVien.matKhau) && Objects.equals(ngayTao, nhanVien.ngayTao) && Objects.equals(tinhTrang, nhanVien.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idChucVu, maNhanVien, hoTen, email, sdt, matKhau, ngayTao, tinhTrang);
    }
}
