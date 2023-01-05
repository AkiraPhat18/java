/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodichnhadat;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author LanHuong
 */
public class GiaoDich {
    private String Ma,ngay;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.Ma);
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
        final GiaoDich other = (GiaoDich) obj;
        if (!Objects.equals(this.Ma, other.Ma)) {
            return false;
        }
        return true;
    }

    public String getMa() {
        return Ma;
    }

    public String getNgay() {
        return ngay;
    }

    public float getDongia() {
        return dongia;
    }

    public float getDientich() {
        return dientich;
    }
    private float dongia,dientich;
    public GiaoDich(String Ma,String ngay,float dongia,float dientich)
    {
        super();
        this.Ma=Ma;
        this.ngay=ngay;
        this.dongia=dongia;
        this.dientich=dientich;
    }
    public GiaoDich()
    {
        super();
    }
    public void nhap()
    {


        Scanner in=new Scanner (System.in);
        System.out.println("Ma giao dich: "); Ma=in.nextLine();
        System.out.println("Ngay giao dich :"); ngay=in.nextLine();
        System.out.println("Don gia : "); dongia=in.nextFloat();
        System.out.println("Dien tich : "); dientich=in.nextFloat();
    }
    public  void xuat()
    {
        System.out.printf("\n%-10s%-10s%-10f%-10f",getMa(),getNgay(),getDongia(),getDientich());
    }
}
