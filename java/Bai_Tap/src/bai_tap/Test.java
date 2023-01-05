/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huong-PC
 */
public class Test {

    static Thue_Bao Tb = new Thue_Bao();
    static ArrayList<Thue_Bao> Danhsach = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int select = 0;
        System.out.println("Nhap vao lua chon: ");
        System.out.println("1. Nhap thong tin Khach hang\n2. xuat danh sach "
                + "thong tin khach hang\n3. Them khach hang vao danh sach khach "
                + "hang\n4. Sua thong tin khach hang\n5. Xoa thong tin khach hang\n"
                + "6. Sap xep danh sach khach hang theo tong tien thanh toan\n7."
                + " Tim max\n8. tim min");
        select = sc.nextInt();
        switch (select) {
            case 1: {
                System.out.println("Nhap thong tin Khach hang\n2. xuat danh sach");
                nhap();
            }
            break;
            case 2: {
                if (Danhsach.isEmpty()) {
                    System.out.println("Loi!!! Danh sach chua dc cap nhat");
                    System.exit(0);
                } else {
                    System.out.println("xuat danh sach thong tin khach hang");
                    xuat();
                }
            }
            break;
            case 3: {
                if (Danhsach.isEmpty()) {
                    System.out.println("Loi!!! Danh sach chua dc cap nhat");
                    System.exit(0);
                } else {
                    System.out.println("Them khach hang vao danh sach khach");
                    them();
                }
            }
            break;
            case 4: {
                if (Danhsach.isEmpty()) {
                    System.out.println("Loi!!! Danh sach chua dc cap nhat");
                    System.exit(0);
                } else {
                    System.out.println("Sua thong tin khach hang");
                    sua();
                }
            }
            break;
            case 5: {
                if (Danhsach.isEmpty()) {
                    System.out.println("Loi!!! Danh sach chua dc cap nhat");
                    System.exit(0);
                } else {
                    System.out.println("Xoa thong tin khach hang");
                    xoa();
                }
            }
            break;
            case 6: {
                if (Danhsach.isEmpty()) {
                    System.out.println("Loi!!! Danh sach chua dc cap nhat");
                    System.exit(0);
                } else {
                    System.out.println("Sap xep danh sach khach hang theo tong tien thanh toan");
                    sapxep();
                }
            }
            break;
            case 7: {
                if (Danhsach.isEmpty()) {
                    System.out.println("Loi!!! Danh sach chua dc cap nhat");
                    System.exit(0);
                } else {
                    System.out.println("Tim Max");
                    max();
                }
            }
            break;
            case 8: {
                if (Danhsach.isEmpty()) {
                    System.out.println("Loi!!! Danh sach chua dc cap nhat");
                    System.exit(0);
                } else {
                    System.out.println("Tim Min");
                    min();
                }
            }
            break;
            default: {
                System.out.println("ban da nhap sai:");
                System.exit(0);
            }
            break;
        }
    }

    public static void nhap() {
        System.out.println("nhap vao so luong danh sach khach hang: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            do {
                Tb = new Thue_Bao();
                Tb.nhap();
                Danhsach.add(Tb);
            } while (Danhsach.get(i).getSothuebao() != Tb.getSothuebao());
        }
        xuat();
    }

    public static void xuat() {
        System.out.println("Thong tin khach hang: ");
        for (Thue_Bao a : Danhsach) {
            a.xuat();
        }
    }

    public static void xoa() {
        Thue_Bao b = new Thue_Bao();
        System.out.println("Nhap vao so thue bao can xoa: ");
        b.setSothuebao(sc.nextLong());

        for (int i = 0; i < n; i++) {
            if (b.getSothuebao() == Danhsach.get(i).getSothuebao()) {
                Danhsach.remove(i);
            } else {
                System.out.println("Khong co so thue bao nao trong du lieu khach"
                        + " hang");
            }
        }
        xuat();
    }

    public static void them() {
        Thue_Bao b = new Thue_Bao();
        int x;
        do {
            System.out.println("Nhap vao vi tri can them: ");
            x = sc.nextInt();
        } while (x > Danhsach.size() || x < 0);
        System.out.println("nhap vao thong tin thue bao can them: ");
        b.nhap();
        Danhsach.set(x, b);

        xuat();
    }

    public static void sua() {
        Thue_Bao b = new Thue_Bao();
        System.out.println("Nhap vao so thue bao can sua doi thong tin: ");
        b.setSothuebao(sc.nextLong());
        for (int i = 0; i < Danhsach.size(); i++) {
            if (b.getSothuebao() == Danhsach.get(i).getSothuebao()) {
                System.out.println("Tim thay Thong tin cua so thue bao: " + Danhsach.get(i).getSothuebao());
                b = new Thue_Bao();
                b.nhap();
                Danhsach.set(i, b);
            } else {
                System.out.println("Khong co thong tin cua so thue bao vua nhap");
            }
        }
        xuat();
    }

    static void sapxep() {
        for (int i = 0; i < Danhsach.size() - 1; i++) {
            for (int j = i + 1; j < Danhsach.size(); j++) {
                if (Danhsach.get(i).tinhtien() < Danhsach.get(j).tinhtien()) {
                    Thue_Bao c = new Thue_Bao();
                    c = Danhsach.get(i);
                    Danhsach.set(i, Danhsach.get(j));
                    Danhsach.set(i, c);
                }
            }
        }
        System.out.println("Danh sach thue bao da duoc sap xep: ");
        xuat();
    }

    static void max() {
        double max = Danhsach.get(0).getGia();
        for (int i = 0; i < Danhsach.size(); i++) {
            if (max < Danhsach.get(i).getGia()) {
                max = Danhsach.get(i).getGia();
            }
        }
        System.out.println("Thong tin thue bao co gia lon nhat la: ");
        for (int i = 0; i < Danhsach.size(); i++) {
            if (max == Danhsach.get(i).getGia()) {
                xuat();
            }
        }
    }

    static void min() {
        double min = Danhsach.get(0).getGia();
        for (int i = 0; i < Danhsach.size(); i++) {
            if (min > Danhsach.get(i).getGia()) {
                min = Danhsach.get(i).getGia();
            }
        }
        System.out.println("Thong tin thue bao co gia lon nhat la: ");
        for (int i = 0; i < Danhsach.size(); i++) {
            if (min == Danhsach.get(i).getGia()) {
                xuat();
            }
        }
    }

}
