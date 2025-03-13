package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "gpu")
public class Gpu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gpu_id_gen")
    @SequenceGenerator(name = "gpu_id_gen", sequenceName = "gpu_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ma_gpu", nullable = false, length = 36)
    private String maGpu;

    @Column(name = "loai_gpu", nullable = false)
    private String loaiGpu;

    @Column(name = "ten_gpu", nullable = false)
    private String tenGpu;

    @Column(name = "bo_nho_vram", nullable = false)
    private Integer boNhoVram;

    @Column(name = "cong_nghe_gpu", nullable = false)
    private String congNgheGpu;

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

    public Integer getBoNhoVram() {
        return boNhoVram;
    }

    public void setBoNhoVram(Integer boNhoVram) {
        this.boNhoVram = boNhoVram;
    }

    public String getCongNgheGpu() {
        return congNgheGpu;
    }

    public void setCongNgheGpu(String congNgheGpu) {
        this.congNgheGpu = congNgheGpu;
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