package com.lapxpert.nhanvien.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "chuc_vu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChucVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_chuc_vu", length = 36, nullable = false)
    private String maChucVu;

    @Column(name = "ten_chuc_vu", length = 255, nullable = false)
    private String tenChucVu;

    @Column(name = "ngay_tao", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime ngayTao = LocalDateTime.now();

    @Column(name = "tinh_trang", columnDefinition = "BOOLEAN DEFAULT TRUE")
    private Boolean tinhTrang = true;
}
