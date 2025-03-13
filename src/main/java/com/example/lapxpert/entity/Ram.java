package com.example.lapxpert.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Entity
@Table(name = "ram")
public class Ram {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ram_id_gen")
    @SequenceGenerator(name = "ram_id_gen", sequenceName = "ram_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties({"hibernate","handle"})
    @JoinColumn(name = "id_loai_ram")
    private LoaiRam loaiRam;

    @Column(name = "ma_ram", nullable = false, length = 36)
    private String maRam;

    @Column(name = "dung_luong_ram", nullable = false)
    private Integer dungLuongRam;

    @Column(name = "so_khe_ram", nullable = false)
    private Integer soKheRam;

    @Column(name = "ho_tro_toi_da", nullable = false)
    private Integer hoTroToiDa;

    @ColumnDefault("CURRENT_TIMESTAMP")
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

    public LoaiRam getIdLoaiRam() {
        return loaiRam;
    }

    public void setIdLoaiRam(LoaiRam loaiRam) {
        this.loaiRam = loaiRam;
    }

    public String getMaRam() {
        return maRam;
    }

    public void setMaRam(String maRam) {
        this.maRam = maRam;
    }

    public Integer getDungLuongRam() {
        return dungLuongRam;
    }

    public void setDungLuongRam(Integer dungLuongRam) {
        this.dungLuongRam = dungLuongRam;
    }

    public Integer getSoKheRam() {
        return soKheRam;
    }

    public void setSoKheRam(Integer soKheRam) {
        this.soKheRam = soKheRam;
    }

    public Integer getHoTroToiDa() {
        return hoTroToiDa;
    }

    public void setHoTroToiDa(Integer hoTroToiDa) {
        this.hoTroToiDa = hoTroToiDa;
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