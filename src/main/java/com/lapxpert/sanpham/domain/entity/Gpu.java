package com.lapxpert.sanpham.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "gpu")
public class Gpu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gpu_id_gen")
    @SequenceGenerator(name = "gpu_id_gen", sequenceName = "gpu_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_gpu", nullable = false, length = 36)
    private String maGpu;

    @Size(max = 255)
    @NotNull
    @Column(name = "loai_gpu", nullable = false)
    private String loaiGpu;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten_gpu", nullable = false)
    private String tenGpu;

    @NotNull
    @Column(name = "bo_nho_vram", nullable = false)
    private Integer boNhoVram;

    @Size(max = 255)
    @NotNull
    @Column(name = "cong_nghe_gpu", nullable = false)
    private String congNgheGpu;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

}