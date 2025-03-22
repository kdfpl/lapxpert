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
@Table(name = "o_cung")
public class OCung {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "o_cung_id_gen")
    @SequenceGenerator(name = "o_cung_id_gen", sequenceName = "o_cung_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_o_cung", nullable = false, length = 36)
    private String maOCung;

    @Size(max = 100)
    @NotNull
    @Column(name = "loai_o_cung", nullable = false, length = 100)
    private String loaiOCung;

    @NotNull
    @Column(name = "dung_luong", nullable = false)
    private Integer dungLuong;

    @Size(max = 100)
    @NotNull
    @Column(name = "chuan_ket_noi", nullable = false, length = 100)
    private String chuanKetNoi;

    @NotNull
    @Column(name = "toc_do_doc", nullable = false)
    private Integer tocDoDoc;

    @NotNull
    @Column(name = "toc_do_ghi", nullable = false)
    private Integer tocDoGhi;

    @ColumnDefault("false")
    @Column(name = "ho_tro_nang_cap")
    private Boolean hoTroNangCap;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

}