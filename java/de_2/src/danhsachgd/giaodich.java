package danhsachgd;

import java.util.Scanner;

public class giaodich {
	private String magd;
	private String ngay;
	private Float dongia;
	private int sol;
	public giaodich() {
		super();
	}
	public giaodich(String ma){
		setMagd(ma);
	}
	public String getMagd() {
		return magd;
	}
	public void setMagd(String magd) {
		this.magd = magd;
	}
	public String getNgay() {
		return ngay;
	}
	public void setNgay(String ngay) {
		this.ngay = ngay;
	}
	public Float getDongia() {
		return dongia;
	}
	public void setDongia(Float dongia) {
		this.dongia = dongia;
	}
	public int getSol() {
		return sol;
	}
	public void setSol(int sol) {
		this.sol = sol;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((magd == null) ? 0 : magd.hashCode());
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
		giaodich other = (giaodich) obj;
		if (magd == null) {
			if (other.magd != null)
				return false;
		} else if (!magd.equals(other.magd))
			return false;
		return true;
	}
	public void nhap(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Ma giao dich: ");
		magd=sc.nextLine();
		System.out.println("ngay giao dich: ");
		ngay=sc.nextLine();
		System.out.println("don gia: ");
		dongia=sc.nextFloat();
		System.out.println("so luong: ");
		sol=sc.nextInt();
		if(sol==0)
			return;
	}
	public void xuat(){
		System.out.println("ma giao dich: "+magd);
		System.out.println("ngay giao dich: "+ngay);
		System.out.println("don gia: "+dongia);
		System.out.println("so luong: "+sol);
	}

}
