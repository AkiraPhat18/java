package b6_trang40;
import java.util.ArrayList;
/*
 * Bài này nhập vào 1 danh sách các mặt hàng( hàng điện máy và sành sứ)
 * Hai mặt hàng được lưu chung vào 1 ArrayList và dùng toán tử
 * instanceof để kiểm tra đối tượng khi in ra
 */
import java.util.Scanner;
public class QLBanHang {
	static ArrayList<HangHoa> dsHang = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapHang();
		inDanhSach();
		System.out.print("ma hang can tim");
		String ma = new Scanner(System.in).nextLine();
		timKiem(ma);
	}
	private static void nhapHang() {
		// nhap hang den khi ma rong
		HangHoa hang;
		do {
			System.out.println("1. Hang dien may \t 2.Hang sanh su");
			System.out.print("ban chon:");
			String tl = new Scanner(System.in).nextLine();
			if (tl.equals("1")) {
				hang = new HangDienMay();
				try {
					hang.nhap();
				} catch (Exception e) {
					System.out.println("dung nhap!");
					break;
				}
			} else {
				hang = new HangSanhSu();
				try {
					hang.nhap();
				} catch (Exception e) {
					System.out.println("dung nhap!");
					break;
				}
			}
			dsHang.add(hang);
		} while (true);

	}
	private static void inDanhSach() {
		System.out.println("Danh sách hàng điện máy:");
		System.out.println("-------------------------------------------------------------------------");
		System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-5s|%-10s|%-10s|\n", "Ma Hang", "Ten Hang", "Nha SX", "Gia",
				"TGBH", "Dien ap", "Cong suat");
		System.out.println("-------------------------------------------------------------------------");
		for (HangHoa hangHoa : dsHang) 
			if (hangHoa instanceof HangDienMay)
				System.out.println(hangHoa.xuat());
			System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("Danh sách hàng sành sứ :");
		System.out.println("------------------------------------------------------");
		System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-8s|\n", "Ma Hang", "Ten Hang", "Nha SX", "Gia", "loai NL");
		System.out.println("------------------------------------------------------");
		for (HangHoa hangHoa : dsHang) 
			if (hangHoa instanceof HangSanhSu)
				System.out.println(hangHoa.xuat());
			System.out.println("------------------------------------------------------");
	}

	private static void timKiem(String ma) {
		HangHoa temp = new HangHoa(ma);
		if (!dsHang.contains(temp)) {
			System.out.println("khong tim thay");
		} else {
			// sua thong tin hàng
			// khong cho sua trung ma
		}
	}

}
