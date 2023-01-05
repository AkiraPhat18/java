/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap1;

import ArrayList_demo1.TheMuon;
import java.util.ArrayList;

/**
 *
 * @author VanCuong
 */
public class KH {
    double CMND;
    String ten;
    String diemDen;
    double giatien;

    public KH(double CMND) {
        this.CMND = CMND;
    }
  
    
    public KH() {
    }

    public KH(double CMND, String ten, String diemDen, double giatien) {
        this.CMND = CMND;
        this.ten = ten;
        this.diemDen = diemDen;
        this.giatien = giatien;
       
    }

  
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.CMND) ^ (Double.doubleToLongBits(this.CMND) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KH other = (KH) obj;
        if (Double.doubleToLongBits(this.CMND) != Double.doubleToLongBits(other.CMND)) {
            return false;
        }
        return true;
    }

    

    

    public double getCMND() {
        return CMND;
    }

    public void setCMND(double CMND) {
        this.CMND = CMND;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    @Override
    public String toString() {
        return "KH{" + "CMND=" + CMND + ", ten=" + ten + ", diemDen=" + diemDen + ", giatien=" + giatien + '}';
    }
    
}
