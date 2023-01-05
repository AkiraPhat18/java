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
public class GiaoDichNha extends GiaoDich{
    private String loaiNha;

    public String getLoaiNha() {
        return loaiNha;
    }
    public GiaoDichNha(String Ma,String ngay,float dongia,float dientich,String loaiNha)
    {
        super(Ma, ngay, dongia, dientich);
        this.loaiNha=loaiNha;
    }
    public GiaoDichNha()
    {
        
    }
    public void nhap1()
    {
        super.nhap();
        Scanner in=new Scanner (System.in);
        System.out.println("Loai nha (caocap,thuong) :");
        loaiNha= in.nextLine();
    }
    public float thanhtien()
    {
        if(loaiNha.equals("caocap"))
            return getDongia()*getDientich();
        else
            return (float) (getDientich()*getDongia()*0.9);
    }
    public void xuat1()
    {
        super.xuat();
        System.out.printf("%-10s%-10f",getLoaiNha(),thanhtien());
    }
    
}
