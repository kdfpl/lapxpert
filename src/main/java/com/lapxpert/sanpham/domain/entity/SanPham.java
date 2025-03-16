package com.lapxpert.sanpham.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "san_pham_id_gen")
    @SequenceGenerator(name = "san_pham_id_gen", sequenceName = "san_pham_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_loai")
    private LoaiSanPham loai;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_he_dieu_hanh")
    private HeDieuHanh heDieuHanh;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_thuong_hieu")
    private ThuongHieu thuongHieu;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_sp", nullable = false, length = 36)
    private String maSp;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten_sp", nullable = false)
    private String tenSp;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @Column(name = "mo_ta", length = Integer.MAX_VALUE)
    private String moTa;

    @NotNull
    @Column(name = "bao_hanh_thang", nullable = false)
    private Integer baoHanhThang;

    @NotNull
    @Column(name = "trang_thai", nullable = false)
    private Boolean trangThai = false;

    @Column(name = "hinh_anh", length = Integer.MAX_VALUE)
    private String hinhAnh;

}