package Bai6_1Mang;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Bài này chỉ nhập 1 danh sách hàng điện máy
 */
public class QLHangDienMay {
	static ArrayList<HangDienMay> dsHDM = new ArrayList<>();
	public static void main(String[] args)throws Exception {
	    nhapds();
	    hiends();
	    suaHang();
	    xoaHang();
	}
	  static boolean trungMa(String maHangTG)
	    {
	    	HangDienMay hangTG= new HangDienMay(maHangTG);
	        if(dsHDM.contains(hangTG)) return true;
	        return false;
	    }
	 static void nhapds()
	    {	Scanner in = new Scanner(System.in);
	    HangDienMay hang;
	        do
	        {   System.out.println("Nhap thong tin hang");
	            System.out.println("\tNhan ENTER de dung: ");
	            hang = new HangDienMay();
	            try {
					hang.nhap();
				} catch (Exception e) {
					System.out.println("dung nhap!");
					break;
				}
	            dsHDM.add(hang);
	        }while(true);
	        }
	     static void hiends()
	    {
	        System.out.println("Danh sach hang dien may");
	        System.out.println("-------------------------------------------------------------------------");
	        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-5s|%-10s|%-10s|\n","Ma Hang","Ten Hang","Nha SX","Gia","TGBH","Dien ap","Cong suat");
	        System.out.println("-------------------------------------------------------------------------");
	        for(HangDienMay hangDM:dsHDM)
	            System.out.println(hangDM.xuat());
	        System.out.println("-------------------------------------------------------------------------");
	    }
	    static void suaHang() throws Exception
	    {
	        String maHang;
	        System.out.println("Tim va sua hang dien may");
	        System.out.print("Nhap ma can tim: ");
	        maHang=new Scanner(System.in).nextLine();
	        HangDienMay temp = new HangDienMay(maHang);
	        if(dsHDM.contains(temp))
	        {
	            System.out.println("\tTim thay hang co ma: "+maHang);
	            System.out.println("Sua thong tin hang");
	            HangDienMay  h ;
	            do{
	            	h = new HangDienMay();
	            	h.nhap();
	            	if(trungMa(h.getMaHang()))
	            		{ System.out.println("mat hang da ton tai");
	            		continue;}
	            		else break;
	           }while(true);
	            dsHDM.set(dsHDM.indexOf(temp),h );
	            System.out.println("\nSua thang cong!DS hang sau sua");
	            hiends();
	        }
	        else
	            System.out.println("\nKhong tim thay HangDM co ma = "+maHang);
	    }
	    static void xoaHang()
	    {     String maHang;
	        System.out.println("Tim va xoa hang dien may");
	        System.out.print("Nhap ma can tim: ");
	        maHang=new Scanner(System.in).nextLine();
	        HangDienMay temp = new HangDienMay(maHang);
	        if(trungMa(maHang))
	        {
	            dsHDM.remove(dsHDM.indexOf(temp));
	            System.out.println("\tXoa thanh cong! DS hang sau xoa");
	            hiends();
	        }
	        else
	           System.out.println("\nKhong tim thay HangDM co ma = "+maHang);
	    }

}
