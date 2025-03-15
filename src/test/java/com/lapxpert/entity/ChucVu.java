package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "chuc_vu", schema = "public", catalog = "LapXpert")
public class ChucVu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_chuc_vu", nullable = false, length = 36)
    private String maChucVu;
    @Basic
    @Column(name = "ten_chuc_vu", nullable = false, length = 255)
    private String tenChucVu;
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

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
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
        ChucVu chucVu = (ChucVu) o;
        return id == chucVu.id && Objects.equals(maChucVu, chucVu.maChucVu) && Objects.equals(tenChucVu, chucVu.tenChucVu) && Objects.equals(ngayTao, chucVu.ngayTao) && Objects.equals(tinhTrang, chucVu.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maChucVu, tenChucVu, ngayTao, tinhTrang);
    }
}
