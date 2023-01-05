/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai22;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author VanCuong
 */
public class Xe implements MayMoc{
    String maXe;
    String tenXe;
    DoanhNghiep DN;
    int trongTai;
    int tienDatCoc;
    String tenKH;
    int namSx;
    String nhienLieu;
    public void nhap(){
        DN=new DoanhNghiep();
        Scanner nhap=new Scanner(System.in);
        System.out.print("Ten xe:");
        tenXe=nhap.nextLine();
        System.out.print("Trong tai:");
        trongTai=Integer.parseInt(nhap.nextLine());
        System.out.print("nam sx:");
        setNamSX(Integer.parseInt(nhap.nextLine()));
        System.out.print("Nhien lieu:");
        setNhienLieu(nhap.nextLine());
        System.out.print("Tien dat coc:");
        tienDatCoc=Integer.parseInt(nhap.nextLine());
        System.out.print("Ten KH:");
        tenKH=nhap.nextLine();
        System.out.print("Ten DN:");
        DN.setTenDN(nhap.nextLine());
        System.out.print("sdt:");
        DN.setSoDT(nhap.nextLine());
        System.out.print("Dia chi:");
        DN.setDiaChi(nhap.nextLine());
    }

    public Xe(String maXe) {
        this.maXe = maXe;
    }

    public Xe() {
    }

    @Override
    public String toString() {
        return "Xe{" + "tenXe=" + tenXe + ", DN:" + DN + ", trongTai=" + trongTai + ", tienDatCoc=" + tienDatCoc + ", tenKH=" + tenKH + ", namSx=" + namSx + ", nhienLieu=" + nhienLieu + '}';
    }

   
    public void output(){
        System.out.println("ma xe:"+maXe+", tenXe=" + tenXe  + ", trongTai=" + trongTai+", namSx=" + namSx + ", nhienLieu=" + nhienLieu + ", tienDatCoc=" + tienDatCoc + ", tenKH=" + tenKH+", DN: " + DN);
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }
    
    @Override
    public void setNhienLieu(String NL) {
        this.nhienLieu=NL;
    }

    @Override
    public void setNamSX(int NamSx) {
        this.namSx=NamSx;
    }

    public int getNamSx() {
        return namSx;
    }

    public String getNhienLieu() {
        return nhienLieu;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.maXe);
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
        final Xe other = (Xe) obj;
        if (!Objects.equals(this.maXe, other.maXe)) {
            return false;
        }
        return true;
    }
    
}
