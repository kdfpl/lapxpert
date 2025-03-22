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
@Table(name = "he_dieu_hanh")
public class HeDieuHanh {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "he_dieu_hanh_id_gen")
    @SequenceGenerator(name = "he_dieu_hanh_id_gen", sequenceName = "he_dieu_hanh_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_he_dieu_hanh", nullable = false, length = 36)
    private String maHeDieuHanh;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten_he_dieu_hanh", nullable = false)
    private String tenHeDieuHanh;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

}