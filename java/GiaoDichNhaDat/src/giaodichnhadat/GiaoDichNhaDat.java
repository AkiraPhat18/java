/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodichnhadat;

import static giaodichnhadat.GiaoDichNhaDat.ds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LanHuong
 */
public class GiaoDichNhaDat {
static ArrayList<GiaoDichNha> ds=new ArrayList<>();
static ArrayList<GiaoDichDat> dsd=new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nhapds();
        hiends();
        sapsep();
        tbthanhtien();
    }
    static void nhapds()
    {
        do{
        System.out.println("Chon loai gioa dich :");
        System.out.println("1.Giao dich dat\t2. Giao dich nha");
        System.out.println("Bạn chon :");
        String tl = new Scanner(System.in).nextLine();
	if (tl.equals("1")) {
            while(true)
            {
            System.out.println("Danh Sach Giao Dich Dat");
            GiaoDichDat gdd=new GiaoDichDat();
            gdd.nhap2();
            if(gdd.getDientich()==0)
                return;
            dsd.add(gdd);
              break;
            }
          
        }
        else
        {
            while(true)
            {
                System.out.println("Danh Sach Giao Dich Nha");
            GiaoDichNha gdn=new GiaoDichNha();
            gdn.nhap1();
            ds.add(gdn);
              break;
        }
        }
        }while(true);
    }
    static void hiends()
    {
      
         System.out.println("\nDanh Sach Giao Dich Dat");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s","Ma GD","Ngay","Don Gia","Dien Tich","Loai Nha","Thanh Tien");
        for(GiaoDichDat gdd:dsd)
        {
            gdd.xuat2();
        }
         System.out.println("\nDanh Sach Giao Dich Nha");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s","Ma GD","Ngay","Don Gia","Dien Tich","Loai Dat","Thanh Tien");
        for(GiaoDichNha gdn:ds)
        {
            gdn.xuat1();
        }
    }
    static  void sapsep()
    {
         Collections.sort(dsd,new Comparator<GiaoDichDat>() {
             @Override
             public int compare(GiaoDichDat t, GiaoDichDat t1) {
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             return (int)t.thanhtien()-(int)t1.thanhtien();
             }
         });
         System.out.println("\nDanh sach da Xap Sep");
         for(GiaoDichDat gdd:dsd)
         {
             gdd.xuat2();
         }
                 
    }
    static void tbthanhtien()
    {
        float tt = 0;
        System.out.println("\nTrung binh thanh tien giao dich dat loai A");
        for(GiaoDichDat gdd:dsd)
        {
            if(gdd.getLoaiDat().equals("A"))
              tt+=gdd.thanhtien();
        }
        System.out.println(tt);
    }
}
