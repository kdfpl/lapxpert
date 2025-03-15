package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "mau_sac", schema = "public", catalog = "LapXpert")
public class MauSac {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_mau", nullable = false, length = 36)
    private String maMau;
    @Basic
    @Column(name = "ten_mau", nullable = false, length = 255)
    private String tenMau;
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

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
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
        MauSac mauSac = (MauSac) o;
        return id == mauSac.id && Objects.equals(maMau, mauSac.maMau) && Objects.equals(tenMau, mauSac.tenMau) && Objects.equals(ngayTao, mauSac.ngayTao) && Objects.equals(tinhTrang, mauSac.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maMau, tenMau, ngayTao, tinhTrang);
    }
}
