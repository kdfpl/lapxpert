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
@Table(name = "ram")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ram {
    @Id
    @ColumnDefault("nextval('ram_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_ram", nullable = false, length = 36)
    private String maRam;

    @NotNull
    @Column(name = "dung_luong_ram", nullable = false)
    private Integer dungLuongRam;

    @NotNull
    @Column(name = "so_khe_ram", nullable = false)
    private Integer soKheRam;

    @NotNull
    @Column(name = "ho_tro_toi_da", nullable = false)
    private Integer hoTroToiDa;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_loai_ram")
    private LoaiRam loaiRam;

}