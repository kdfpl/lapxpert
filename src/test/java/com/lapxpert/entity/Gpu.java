package com.lapxpert.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Gpu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ma_gpu", nullable = false, length = 36)
    private String maGpu;
    @Basic
    @Column(name = "loai_gpu", nullable = false, length = 255)
    private String loaiGpu;
    @Basic
    @Column(name = "ten_gpu", nullable = false, length = 255)
    private String tenGpu;
    @Basic
    @Column(name = "bo_nho_vram", nullable = false)
    private int boNhoVram;
    @Basic
    @Column(name = "cong_nghe_gpu", nullable = false, length = 255)
    private String congNgheGpu;
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

    public String getMaGpu() {
        return maGpu;
    }

    public void setMaGpu(String maGpu) {
        this.maGpu = maGpu;
    }

    public String getLoaiGpu() {
        return loaiGpu;
    }

    public void setLoaiGpu(String loaiGpu) {
        this.loaiGpu = loaiGpu;
    }

    public String getTenGpu() {
        return tenGpu;
    }

    public void setTenGpu(String tenGpu) {
        this.tenGpu = tenGpu;
    }

    public int getBoNhoVram() {
        return boNhoVram;
    }

    public void setBoNhoVram(int boNhoVram) {
        this.boNhoVram = boNhoVram;
    }

    public String getCongNgheGpu() {
        return congNgheGpu;
    }

    public void setCongNgheGpu(String congNgheGpu) {
        this.congNgheGpu = congNgheGpu;
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
        Gpu gpu = (Gpu) o;
        return id == gpu.id && boNhoVram == gpu.boNhoVram && Objects.equals(maGpu, gpu.maGpu) && Objects.equals(loaiGpu, gpu.loaiGpu) && Objects.equals(tenGpu, gpu.tenGpu) && Objects.equals(congNgheGpu, gpu.congNgheGpu) && Objects.equals(ngayTao, gpu.ngayTao) && Objects.equals(tinhTrang, gpu.tinhTrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maGpu, loaiGpu, tenGpu, boNhoVram, congNgheGpu, ngayTao, tinhTrang);
    }
}
