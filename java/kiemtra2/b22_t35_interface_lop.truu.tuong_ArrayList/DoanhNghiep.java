/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai22;

/**
 *
 * @author VanCuong
 */
public class DoanhNghiep {
    String tenDN;
    String soDT;
    String diaChi;

    @Override
    public String toString() {
        return "tenDN=" + tenDN + ", soDT=" + soDT + ", diaChi=" + diaChi;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public DoanhNghiep() {
    }
}
