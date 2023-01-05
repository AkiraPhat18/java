package Bai6_1Mang;
import java.util.Scanner;
public class HangHoa {
private String maHang,tenHang,NSX;
private float gia;
public HangHoa(String ma) {
this.maHang = ma;
}
public HangHoa(String maHang, String tenHang, String nSX, float gia) {
	super();
	this.maHang = maHang;
	this.tenHang = tenHang;
	NSX = nSX;
	this.gia = gia;
}
public String getMaHang() {
	return maHang;
}
public void setMaHang(String maHang) {
	this.maHang = maHang;
}
public HangHoa() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((maHang == null) ? 0 : maHang.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	HangHoa other = (HangHoa) obj;
	if (maHang == null) {
		if (other.maHang != null)
			return false;
	} else if (!maHang.equals(other.maHang))
		return false;
	return true;
}
public void nhap() throws Exception{
	
	Scanner in = new Scanner(System.in);
	System.out.print("Ma hang:");
	maHang = in.nextLine();
	if (maHang.trim().equals("")) throw new Exception();
	System.out.print("Ten hang:");
	tenHang = in.nextLine();
	System.out.print("Nha SX:"); NSX = in.nextLine();
	System.out.print("Gia:"); gia = in.nextFloat();
}
public String xuat(){
	return String.format("|%-10s|%-10s|%-10s|%-10f|",maHang,tenHang,NSX,gia);
	// 45
}
}
