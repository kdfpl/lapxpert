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
@Table(name = "cpu")
public class Cpu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cpu_id_gen")
    @SequenceGenerator(name = "cpu_id_gen", sequenceName = "cpu_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_cpu", nullable = false, length = 36)
    private String maCpu;

    @Size(max = 100)
    @NotNull
    @Column(name = "hang_cpu", nullable = false, length = 100)
    private String hangCpu;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten_cpu", nullable = false)
    private String tenCpu;

    @Size(max = 100)
    @NotNull
    @Column(name = "the_he_cpu", nullable = false, length = 100)
    private String theHeCpu;

    @NotNull
    @Column(name = "so_nhan", nullable = false)
    private Integer soNhan;

    @NotNull
    @Column(name = "so_luong", nullable = false)
    private Integer soLuong;

    @NotNull
    @Column(name = "xung_nhip", nullable = false)
    private Double xungNhip;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

}