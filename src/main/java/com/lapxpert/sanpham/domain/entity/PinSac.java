package com.lapxpert.sanpham.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "pin_sac")
public class PinSac {
    @Id
    @ColumnDefault("nextval('pin_sac_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 36)
    @NotNull
    @Column(name = "ma_pin", nullable = false, length = 36)
    private String maPin;

    @NotNull
    @Column(name = "dung_luong_pin", nullable = false)
    private Integer dungLuongPin;

    @NotNull
    @Column(name = "thoi_luong_pin", nullable = false)
    private Double thoiLuongPin;

    @NotNull
    @Column(name = "cong_suat_sac", nullable = false)
    private Integer congSuatSac;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

}