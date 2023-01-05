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
public abstract class Khach_Hang {
    private String hoten;
    private String diachi;

    public Khach_Hang(String hoten, String diachi) {
        this.hoten = hoten;
        this.diachi = diachi;
    }

    public Khach_Hang() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho ten: ");
        hoten = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap vao dia chi: ");
        diachi =  sc.nextLine();
    }
    
    public void xuat(){
        System.out.println("Thong tin khach hang la: ");
        System.out.println("Ho ten: " + getHoten());
        System.out.println("Dia chi: "+ getDiachi());
    }
    
    public abstract double tinhtien();
}
