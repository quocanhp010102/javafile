/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLassController;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class GiaoVien implements Serializable {
    private String maGiaoVien;
    private String tenGiaoVien;
    private int namSinh;
    private String chuyeenNghanh;

    public GiaoVien() {
    }

    public GiaoVien(String maGiaoVien, String tenGiaoVien, int namSinh, String chuyeenNghanh) {
        this.maGiaoVien = maGiaoVien;
        this.tenGiaoVien = tenGiaoVien;
        this.namSinh = namSinh;
        this.chuyeenNghanh = chuyeenNghanh;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public String getTenGiaoVien() {
        return tenGiaoVien;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getChuyeenNghanh() {
        return chuyeenNghanh;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public void setTenGiaoVien(String tenGiaoVien) {
        this.tenGiaoVien = tenGiaoVien;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setChuyeenNghanh(String chuyeenNghanh) {
        this.chuyeenNghanh = chuyeenNghanh;
    }
    
    
}
