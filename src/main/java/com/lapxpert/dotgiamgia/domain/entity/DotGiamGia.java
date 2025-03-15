package com.lapxpert.dotgiamgia.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "dot_giam_gia")
public class DotGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('dot_giam_gia_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_dot", nullable = false, length = 36)
    private String maDot;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten_dot", nullable = false)
    private String tenDot;

    @NotNull
    @Column(name = "thoi_gian_bat_dau", nullable = false)
    private Instant thoiGianBatDau;

    @NotNull
    @Column(name = "thoi_gian_ket_thuc", nullable = false)
    private Instant thoiGianKetThuc;

    @NotNull
    @Column(name = "gia_tri_giam", nullable = false, precision = 10, scale = 2)
    private BigDecimal giaTriGiam;

    @Size(max = 50)
    @NotNull
    @Column(name = "loai_giam_gia", nullable = false, length = 50)
    private String loaiGiamGia;

    @Column(name = "mo_ta", length = Integer.MAX_VALUE)
    private String moTa;

    @Size(max = 50)
    @Column(name = "trang_thai", length = 50)
    private String trangThai;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @OneToMany(mappedBy = "idDot", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<DotGiamGiaChiTiet> dotGiamGiaChiTiets = new LinkedHashSet<>();

}