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
public class ThiSinh implements Serializable {
    private String maSV;
    private String caThi;
    private int lanThi;
    private String sBD;
    private String viTri;
    private String maPhong;

    public String getMaSV() {
        return maSV;
    }

    public String getCaThi() {
        return caThi;
    }

    public int getLanThi() {
        return lanThi;
    }

    public String getsBD() {
        return sBD;
    }

    public String getViTri() {
        return viTri;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setCaThi(String caThi) {
        this.caThi = caThi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }

    public void setsBD(String sBD) {
        this.sBD = sBD;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public ThiSinh(String maSV, String caThi, int lanThi, String sBD, String viTri, String maPhong) {
        this.maSV = maSV;
        this.caThi = caThi;
        this.lanThi = lanThi;
        this.sBD = sBD;
        this.viTri = viTri;
        this.maPhong = maPhong;
    }

    public ThiSinh(String sBD) {
        this.sBD = sBD;
    }

    public ThiSinh() {
    }
    
    
}
