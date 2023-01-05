/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodichnhadat;

import java.util.Scanner;

/**
 *
 * @author LanHuong
 */
public class GiaoDichDat extends GiaoDich{
    private String loaiDat;

    public String getLoaiDat() {
        return loaiDat;
    }
    public void nhap2()
    {
         super.nhap();
        Scanner in=new Scanner (System.in);
        System.out.println("Loai dat (A,B,C) :");
        loaiDat= in.nextLine();
    }
    public float thanhtien()
    {
        if(loaiDat.equals("B")||loaiDat.equals("C"))
        return getDientich()*getDongia();
        else
            return (float) (getDientich()*getDongia()*1.5);
    }
    public void xuat2()
    {
        super.xuat();
        System.out.printf("%-10s%-10f",loaiDat,thanhtien());
    }
}
