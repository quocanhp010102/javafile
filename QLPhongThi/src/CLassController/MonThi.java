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
public class MonThi implements Serializable {
    private String maMonThi;
    private String tenMonThi;
    private int soTinChi;
    private String hinhThucThi;

    public MonThi() {
    }

    public MonThi(String maMonThi, String tenMonThi, int soTinChi, String hinhThucThi) {
        this.maMonThi = maMonThi;
        this.tenMonThi = tenMonThi;
        this.soTinChi = soTinChi;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMaMonThi() {
        return maMonThi;
    }

    public String getTenMonThi() {
        return tenMonThi;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public void setMaMonThi(String maMonThi) {
        this.maMonThi = maMonThi;
    }

    public void setTenMonThi(String tenMonThi) {
        this.tenMonThi = tenMonThi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public void setHinhThucThi(String hinhThucThi) {
        this.hinhThucThi = hinhThucThi;
    }
    
}
