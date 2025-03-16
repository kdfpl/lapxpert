package com.lapxpert.sanpham.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "loai_ram")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LoaiRam {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loai_ram_id_gen")
    @SequenceGenerator(name = "loai_ram_id_gen", sequenceName = "loai_ram_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_loai", nullable = false, length = 36)
    private String maLoai;

    @Size(max = 255)
    @NotNull
    @Column(name = "ten_loai_ram", nullable = false)
    private String tenLoaiRam;

    @NotNull
    @Column(name = "bus_ram", nullable = false)
    private Integer busRam;

    @NotNull
    @Column(name = "dien_ap", nullable = false)
    private Double dienAp;

    @NotNull
    @ColumnDefault("false")
    @Column(name = "ho_tro_xmp", nullable = false)
    private Boolean hoTroXmp = false;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

}