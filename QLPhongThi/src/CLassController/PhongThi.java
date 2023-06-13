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
public class PhongThi implements Serializable {
    private String maPhong;
   
    private String maGiamThi;
    private String maMonThi;
    private String coSo;
    private String diaDiem;
    private String NgayThi;

    public String getMaPhong() {
        return maPhong;
    }

    

    public String getMaGiamThi() {
        return maGiamThi;
    }

    public String getMaMonThi() {
        return maMonThi;
    }

    public String getCoSo() {
        return coSo;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public String getNgayThi() {
        return NgayThi;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

   
    public void setMaGiamThi(String maGiamThi) {
        this.maGiamThi = maGiamThi;
    }

    public void setMaMonThi(String maMonThi) {
        this.maMonThi = maMonThi;
    }

    public void setCoSo(String coSo) {
        this.coSo = coSo;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public void setNgayThi(String NgayThi) {
        this.NgayThi = NgayThi;
    }

    public PhongThi() {
    }

    
    public PhongThi(String maPhong, String maGiamThi, String maMonThi, String coSo, String diaDiem, String NgayThi) {
        this.maPhong = maPhong;
        
        this.maGiamThi = maGiamThi;
        this.maMonThi = maMonThi;
        this.coSo = coSo;
        this.diaDiem = diaDiem;
        this.NgayThi = NgayThi;
    }
    
    
}
