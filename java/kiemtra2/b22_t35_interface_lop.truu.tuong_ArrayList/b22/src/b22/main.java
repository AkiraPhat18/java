/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VanCuong
 */
public class main {

    public static void main(String[] args) {
        ArrayList<Xe> x = new ArrayList<>();
        System.out.println("Nhap ds xe cho den khi ma xe trung nhau hoac rong:");
//        System.out.print("nhap so xe:");
//        Scanner nhap = new Scanner(System.in);
//        int n = nhap.nextInt();
        nhapDs(x);
        System.out.println("danh sach vua nhap:");
        xuatDS(x);
        System.out.println("Xe co trong tai lon nhat la:");
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).trongTai == timTTMax(x)) {
                x.get(i).output();
            }
        }
    }

    public static void nhapDs(ArrayList<Xe> a) {
        Scanner nhap = new Scanner(System.in);
        int i = 1;
        while (true) {
            System.out.println("----nhap xe thu: " + i + "----");
            Xe x = new Xe();
            System.out.print("Ma xe:");
            x.setMaXe(nhap.nextLine());
            if (a.contains(x) == true) {
                break;
            } else {
                x.nhap();
                a.add(x);
                i++;
            }
        }
    }

    public static void suaMa(ArrayList<Xe> x) {

        Scanner nhap = new Scanner(System.in);
        System.out.print("Ma xe:");
        Xe ma = new Xe(nhap.nextLine());
        if (x.contains(ma) == true) {
            Xe a = new Xe();
            System.out.print("Ma xe:");
            a.setMaXe(nhap.nextLine());
            a.nhap();
            x.add(a);
            if (x.contains(a)) {
                System.out.println("trung nhau roi! khong sua dc");
            } else {
                x.set(x.indexOf(ma), a);
                System.out.println("them ok!");
            }
        }

    }

    public static void xuatDS(ArrayList<Xe> x) {
        for (int i = 0; i < x.size(); i++) {
            x.get(i).output();
        }
    }

    public static int timTTMax(ArrayList<Xe> x) {
        int ttmax = x.get(0).trongTai;
        for (int i = 0; i < x.size(); i++) {
            if (ttmax < x.get(i).trongTai) {
                ttmax = x.get(i).trongTai;
            }
        }
        return ttmax;
    }
}
