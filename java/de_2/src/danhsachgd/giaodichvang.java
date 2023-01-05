package danhsachgd;

import java.util.Scanner;

public class giaodichvang extends giaodich{
	private String loaiv;
	public String getLoaiv() {
		return loaiv;
	}
	public void setLoaiv(String loaiv) {
		this.loaiv = loaiv;
	}
	private float tt(){
		return getDongia()* getSol();
	}
	public void nhap(){
		super.nhap();
		System.out.println("loai vang: ");
		Scanner sc= new Scanner(System.in);
		loaiv=sc.nextLine();
	}
	public void xuat(){
		super.xuat();
		System.out.println("loai vang: "+loaiv);
		System.out.println("thanh tien: "+tt());
	}

}
