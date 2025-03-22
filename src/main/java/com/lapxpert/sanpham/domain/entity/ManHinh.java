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
@Table(name = "man_hinh")
public class ManHinh {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "man_hinh_id_gen")
    @SequenceGenerator(name = "man_hinh_id_gen", sequenceName = "man_hinh_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_man_hinh", nullable = false, length = 36)
    private String maManHinh;

    @NotNull
    @Column(name = "kich_thuoc", nullable = false)
    private Double kichThuoc;

    @NotNull
    @Column(name = "tan_so_quet", nullable = false)
    private Integer tanSoQuet;

    @Size(max = 255)
    @NotNull
    @Column(name = "loai_tam_nen", nullable = false)
    private String loaiTamNen;

    @NotNull
    @Column(name = "do_sang", nullable = false)
    private Integer doSang;

    @Size(max = 255)
    @NotNull
    @Column(name = "chuan_mau", nullable = false)
    private String chuanMau;

    @Size(max = 255)
    @NotNull
    @Column(name = "do_phan_giai", nullable = false)
    private String doPhanGiai;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

}