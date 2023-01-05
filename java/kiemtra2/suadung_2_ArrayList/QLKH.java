/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VanCuong
 */
public class QLKH {

    public static void main(String[] args) {
        KH k;
        ArrayList<KH> arrcho = new ArrayList<>();
        ArrayList<KH> arrban = new ArrayList<>();
        int choise;
        Scanner nhap = new Scanner(System.in);
        do {
            System.out.println("1. Thêm KH vào ds đợi mua vé"
                    + "\n2. Bán vé cho KH(Chỉ KH đã đký)"
                    + "\n3. Hủy một KH khỏi ds"
                    + "\n4. Thông kê ds bán vé(Số lượng, ds chờ mua,khách đã mua, tổng tiền)"
                    + "\n0. Exit");
            System.out.print("Nhập lựa chọn:");
            choise = nhap.nextInt();
            switch (choise) {
                case 1: {
                try {
                    addKh(arrcho);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                }
                break;
                case 2:
                    banVe(arrcho, arrban);
                    break;
                case 3:
                    removeKh(arrcho);
                    break;
                case 4:
                    thongKe(arrcho, arrban);
                    break;
            }
        } while (choise != 0);
    }

    public static void addKh(ArrayList<KH> arr) throws Exception{
        KH x;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Số CMND:");
        double cmnd = Double.parseDouble(nhap.nextLine());
        x = new KH(cmnd);
        if (arr.contains(x)) {
            throw new Exception("Đã có KH này trong DS ,thêm thất bại!");
          // System.out.println("Đã có KH này,thêm thất bại!");
        } else {
            System.out.print("Họ tên:");
            String hoten = nhap.nextLine();
            System.out.print("Điểm đến:");
            String diemden = nhap.nextLine();
            System.out.print("Giá tiền:");
            double tien = Double.parseDouble(nhap.nextLine());
            x = new KH(cmnd, hoten, diemden, tien);
            arr.add(x);

        }

    }

    public static void banVe(ArrayList<KH> arr1, ArrayList<KH> arr2) {

//           double cmnd=arr1.get(0).getCMND();
//        if (arr1.contains(cmnd)) {
        arr2.add(arr1.remove(0));
//        }
        System.out.println("Bán vé thành công!");

    }

    public static void removeKh(ArrayList<KH> arr) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Số CMND KH cần xoa vé:");
        double cmnd = nhap.nextDouble();
        KH k=new KH(cmnd);
        if (arr.contains(k)) {
            arr.remove(arr.indexOf(k));
            System.out.println("Xóa thành công!");
        }
        else System.out.println("Xoa thất bại!");
        
    }

    public static void thongKe(ArrayList<KH> arr1, ArrayList<KH> arr2) {
        System.out.println("Số người đã mua vé:" + arr2.size());
        System.out.println("Số người chờ mua vé:" + arr1.size());
        if (arr2.size() != 0) {
            System.out.println("Danh sách KH đã mua vé:");
            for (int i = 0; i < arr2.size(); i++) {
                System.out.println(arr2.get(i).toString());
            }
        } else {
            System.out.println("Chưa có KH nào mua vé!");
        }
        if (arr1.size() != 0) {
            System.out.println("Danh sách KH chờ mua vé:");
            for (int i = 0; i < arr1.size(); i++) {
                System.out.println(arr1.get(i).toString());
            }
        } else {
            System.out.println("Không có KH nào đang chờ mua vé!");
        }
        double tong = 0;

        for (int i = 0; i < arr2.size(); i++) {
            tong += arr2.get(i).getGiatien();
        }
        System.out.println("Tổng tiền bán vé:" + tong);
    }

}
