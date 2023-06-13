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
public class SinhVien implements Serializable {
    private String maSV;
    private String tenSV;
    private int namSinh;
    private String queQuan;
   private String lop;
   private String nghanh;

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getLop() {
        return lop;
    }

    public String getNghanh() {
        return nghanh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNghanh(String nghanh) {
        this.nghanh = nghanh;
    }

    public SinhVien(String maSV, String tenSV, int namSinh, String queQuan, String lop, String nghanh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
        this.lop = lop;
        this.nghanh = nghanh;
    }

    public SinhVien() {
    }
   
}
