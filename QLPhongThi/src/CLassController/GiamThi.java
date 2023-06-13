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
public class GiamThi implements Serializable {
    private String maGiamThi;
    private String tenGiamThi;

    public GiamThi() {
    }

    public GiamThi(String maGiamThi, String tenGiamThi) {
        this.maGiamThi = maGiamThi;
        this.tenGiamThi = tenGiamThi;
    }

    public String getMaGiamThi() {
        return maGiamThi;
    }

    public String getTenGiamThi() {
        return tenGiamThi;
    }

    public void setMaGiamThi(String maGiamThi) {
        this.maGiamThi = maGiamThi;
    }

    public void setTenGiamThi(String tenGiamThi) {
        this.tenGiamThi = tenGiamThi;
    }
    
}
