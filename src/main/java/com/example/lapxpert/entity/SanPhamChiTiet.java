package com.example.lapxpert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "san_pham_chi_tiet")
public class SanPhamChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "san_pham_chi_tiet_id_gen")
    @SequenceGenerator(name = "san_pham_chi_tiet_id_gen", sequenceName = "san_pham_chi_tiet_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_sp")
    private SanPham sanPham;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_ram")
    private Ram ram;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_man_hinh")
    private ManHinh manHinh;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_pin")
    private PinSac pin;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_mau")
    private MauSac mau;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_gpu")
    private Gpu gpu;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_cpu")
    private Cpu cpu;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_o_cung")
    private OCung oCung;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_seri")
    private Seri seri;

    @Column(name = "ma_chi_tiet_sp", nullable = false, length = 36)
    private String maChiTietSp;

    @Column(name = "gia_ban", nullable = false, precision = 12, scale = 2)
    private BigDecimal giaBan;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("true")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public ManHinh getManHinh() {
        return manHinh;
    }

    public void setManHinh(ManHinh manHinh) {
        this.manHinh = manHinh;
    }

    public PinSac getPin() {
        return pin;
    }

    public void setPin(PinSac pin) {
        this.pin = pin;
    }

    public MauSac getMau() {
        return mau;
    }

    public void setMau(MauSac mau) {
        this.mau = mau;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public OCung getOCung() {
        return oCung;
    }

    public void setOCung(OCung oCung) {
        this.oCung = oCung;
    }

    public Seri getSeri() {
        return seri;
    }

    public void setSeri(Seri seri) {
        this.seri = seri;
    }

    public String getMaChiTietSp() {
        return maChiTietSp;
    }

    public void setMaChiTietSp(String maChiTietSp) {
        this.maChiTietSp = maChiTietSp;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
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

}