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
public class KetQua implements Serializable {
    private String maKetQua;
    private String maMonThi;
    private String sBD;
    private float diem;

    public KetQua() {
    }

    public KetQua(String maKetQua, String maMonThi, String sBD, float diem) {
        this.maKetQua = maKetQua;
        this.maMonThi = maMonThi;
        this.sBD = sBD;
        this.diem = diem;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    
    public String getMaKetQua() {
        return maKetQua;
    }

    public String getMaMonThi() {
        return maMonThi;
    }

    public String getsBD() {
        return sBD;
    }

    public void setMaKetQua(String maKetQua) {
        this.maKetQua = maKetQua;
    }

    public void setMaMonThi(String maMonThi) {
        this.maMonThi = maMonThi;
    }

    public void setsBD(String sBD) {
        this.sBD = sBD;
    }
    
    
}
