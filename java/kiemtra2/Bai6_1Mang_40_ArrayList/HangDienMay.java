package Bai6_1Mang;
import java.util.Scanner;
public class HangDienMay extends HangHoa{
private int thoiGianBH, dienAp, congSuat;
public HangDienMay(String ma) {
		super(ma);
}
public HangDienMay(String maHang, String tenHang, String nSX, float gia, int thoiGianBH, int dienAp, int congSuat) {
	super(maHang, tenHang, nSX, gia);
	this.thoiGianBH = thoiGianBH;
	this.dienAp = dienAp;
	this.congSuat = congSuat;
}
public HangDienMay() {
	super();
}
public void nhap() throws Exception{
	super.nhap();
	Scanner in = new Scanner(System.in);
	System.out.print("Thoi gian bao hanh:");
	thoiGianBH = in.nextInt();
	System.out.print("Dien ap:");
	dienAp = in.nextInt();
	System.out.print("Cong suat:");
	congSuat = in.nextInt();
}
public String xuat(){
	return super.xuat() + 
		String.format("%-5d|%-10d|%-10d|", thoiGianBH, dienAp, congSuat);
}
}
