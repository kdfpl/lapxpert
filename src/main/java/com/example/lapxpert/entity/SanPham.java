package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;

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

    @Column(name = "ma_sp", nullable = false, length = 36)
    private String maSp;

    @Column(name = "ten_sp", nullable = false)
    private String tenSp;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @Column(name = "mo_ta", length = Integer.MAX_VALUE)
    private String moTa;

    @Column(name = "bao_hanh_thang", nullable = false)
    private Integer baoHanhThang;

    @Column(name = "trang_thai", nullable = false)
    private Boolean trangThai = false;

    @Column(name = "hinh_anh", length = Integer.MAX_VALUE)
    private String hinhAnh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LoaiSanPham getLoai() {
        return loai;
    }

    public void setLoai(LoaiSanPham loai) {
        this.loai = loai;
    }

    public HeDieuHanh getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(HeDieuHanh heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public ThuongHieu getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(ThuongHieu thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Instant getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Instant ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Boolean getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getBaoHanhThang() {
        return baoHanhThang;
    }

    public void setBaoHanhThang(Integer baoHanhThang) {
        this.baoHanhThang = baoHanhThang;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

}