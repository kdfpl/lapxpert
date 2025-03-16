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
@Table(name = "seri")
public class Seri {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seri_id_gen")
    @SequenceGenerator(name = "seri_id_gen", sequenceName = "seri_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_seri", nullable = false, length = 36)
    private String maSeri;

    @Size(max = 50)
    @NotNull
    @Column(name = "trang_thai", nullable = false, length = 50)
    private String trangThai;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_nhap_kho")
    private Instant ngayNhapKho;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

}