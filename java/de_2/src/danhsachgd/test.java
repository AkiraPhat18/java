package danhsachgd;
import java.util.*;
public class test {
	static ArrayList<giaodichtt> ds= new ArrayList<giaodichtt>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhap();
		//xuat();
		ss();
		check();
	}
	static void nhap(){
		while(true){
			giaodichtt gdt= new giaodichtt();
			gdt.nhap();
			if(gdt.getSol()==0)
				break;
			ds.add(gdt);
		}
	}
	static void xuat(){
		for(giaodichtt gdtt: ds)
			gdtt.xuat();
	}
	static void ss(){
		System.out.println("danh sach duoc ss: ");
		ds.sort(c);
		xuat();
	}
	static Comparator<giaodichtt> c= new Comparator<giaodichtt>() {
		
		@Override
		public int compare(giaodichtt o1, giaodichtt o2) {
			// TODO Auto-generated method stub
			if(o1.getLoait().compareTo(o2.getLoait())==0){
				if(o1.getSol()<o2.getSol())
					return 1;
				else
					return -1;
			}
			else
				return(o1.getLoait().compareTo(o2.getLoait()));

			}
		};
		static void check(){
			int dem=0;
			System.out.println("nhap 1 ma de ktra: ");
			Scanner sc= new Scanner(System.in);
			String ma=sc.nextLine();
			giaodichtt gd= new giaodichtt(ma);
			for(int i=0;i<ds.size();i++){
			if(ds.contains(gd))
				ds.remove(gd);
			dem++;
			}
			if(dem==0)
				System.out.println("khong co ma "+ma);
			else
				System.out.println("co ma "+ma);
			xuat();
		}
	}