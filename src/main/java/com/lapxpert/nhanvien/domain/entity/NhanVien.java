package com.lapxpert.nhanvien.domain.entity;

import com.lapxpert.khachhang.domain.entity.DiaChiKH;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "nhan_vien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_chuc_vu", nullable = false, foreignKey = @ForeignKey(name = "fk_nhan_vien_chuc_vu"))
    private ChucVu chucVu;

    @Column(name = "ma_nhan_vien", length = 36, nullable = false)
    private String maNhanVien;

    @Column(name = "ho_ten", length = 255, nullable = false)
    private String hoTen;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @Column(name = "hinh_anh", length = 255, nullable = true)
    private String hinhAnh;

    @Column(name = "sdt", length = 15, nullable = false)
    private String sdt;

    @Column(name = "mat_khau", length = 255, nullable = false)
    private String matKhau = UUID.randomUUID().toString();

    @OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiaChiNV> diaChiList = new ArrayList<>();

    @Column(name = "ngay_tao", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime ngayTao = LocalDateTime.now();

    @Column(name = "tinh_trang", columnDefinition = "BOOLEAN DEFAULT TRUE")
    private Boolean tinhTrang = true;
}
