package Bai6_1Mang;

import java.util.Scanner;

public class HangSanhSu extends HangHoa {
public HangSanhSu(String ma) {
		super(ma);
}

public HangSanhSu() {
}

private String loaiNL;

public void nhap()throws Exception{
	super.nhap();
	System.out.print("loai nguyen lieu:");
	loaiNL = new Scanner(System.in).nextLine();
}
public String xuat(){
	return super.xuat() + String.format("%-8s|", loaiNL);
}
}
