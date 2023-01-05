package danhsachgd;

import java.util.Scanner;

public class giaodichtt extends giaodich{
	private float tygia;
	private String loait;
	public giaodichtt(){
		
	}
	public giaodichtt(String ma){
		setMagd(ma);
	}
	public float getTygia() {
		return tygia;
	}
	public void setTygia(float tygia) {
		this.tygia = tygia;
	}
	public String getLoait() {
		return loait;
	}
	public void setLoait(String loait) {
		this.loait = loait;
	}
	private float tt(){
		if(loait.equals("vnd"))
			return getTygia()*getSol()*getDongia();
		else if(loait.equals("usd"))
				return getDongia()*getSol();
		return 0;
	}
	public void nhap(){
		
		
		super.nhap();
		if(getSol()==0)
			return;
		System.out.println("ty gia: ");
		Scanner sc= new Scanner(System.in);
		tygia=sc.nextFloat();
		do{
			System.out.println("loai tien: ");
			loait=sc.nextLine();
		}while(!loait.equals("vnd")&&!loait.equals("usd"));
	}
	public void xuat(){
		super.xuat();
		System.out.println("ty gia: "+tygia);
		System.out.println("loai tien: "+loait);
		System.out.println("thanh tien: "+tt());
	}
}
