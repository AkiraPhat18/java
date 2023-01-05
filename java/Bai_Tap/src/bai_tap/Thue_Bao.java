/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap;

import java.util.Scanner;

/**
 *
 * @author Huong-PC
 */
public class Thue_Bao extends Khach_Hang{
    private double gia;
    private int thoiluong;
    private long sothuebao;

    public Thue_Bao(double gia, int thoiluong, long sothuebao) {
        this.gia = gia;
        this.thoiluong = thoiluong;
        this.sothuebao = sothuebao;
    }

    public Thue_Bao() {
    }



    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }

    public long getSothuebao() {
        return sothuebao;
    }

    public void setSothuebao(long sothuebao) {
        this.sothuebao = sothuebao;
    }
    
    
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thue bao: ");
        setSothuebao(sc.nextLong());
        System.out.println("nhap vao gia: ");
        setGia(sc.nextDouble());
        System.out.println("Nhap vao thoi luong cuoc goi: ");
        setThoiluong(sc.nextInt());
    }
    @Override
    public  void xuat(){
        super.xuat();
        System.out.println("So thue bao: " + getSothuebao());
        System.out.println("Thoi luong: " + getThoiluong());
        System.out.println("Gia: " + getGia());
    }
    @Override
    public double tinhtien() {
        return gia*thoiluong;
    }
    
    
}
