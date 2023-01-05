import java.util.Scanner;

public class QuanLiPhongThiApps {
	private static PhongThi phongthi=null;
	static String fileName="src/MyFile/data.txt";
	static DBEngine db= new DBEngine();
	public static void main(String[] args) {
		System.out.println("*****Quản Lí Phòng thi********");
		phongthi= new PhongThi("101", "a9", 29);
		System.out.println("Phòng thi 101 A9 solg 29 sv");
		Scanner scn= new Scanner(System.in);
		do{
			System.out.println
			("==================================");
			System.out.println("1.thêm thí sinh mới ");
			System.out.println("2.hiệu chỉnh thông tin thí sinh");
			System.out.println("3.Xóa thí sinh ra khỏi phòng thi");
			System.out.println("4.Lấy thông tin thí sinh khi biết số báo danh");
			System.out.println("5.lấy thông tin thí sinh khi biết số thứ thự");
			System.out.println("6.In danh sách thí sinh");
			System.out.println("7.Lưu phong thi vào file");
			System.out.println("8.Đọc phong thi từ file");
			System.out.println("9.Thoát");
			System.out.println("****************************");
			System.out.println("lựa chọn của bạn");
			int lt=scn.nextInt();
			switch (lt) {
			case 1:
				ThemTS();
				break;
			case 2:
				ChinhTTS();
				break;
			case 3:
				XoaTS();
				break;
			case 4:
				LayTTTS_SBD();
				break;
			case 5:
				LayTTTS_TT();
				break;
			case 6:
				InDanhSachTS();
				break;
			case 7:
				LuuFile();
				break;
			case 8:
				DocFile();
				break;
			case 9:
				System.out.println("Bye"); System.exit(1);
			default:
			System.out.println("không có dữ liệu");
			}
		}
			while(true);
		}
	static void InDanhSachTS() {
		System.out.println("=============Danh Sách Thí Sinh==============");
		System.out.println("Số BD\tHọ Tên\tĐiểm Toán\tĐiểm Lí\tĐiểm Hóa");
		for(int i=0;i<phongthi.soThiSinh();i++)
		{
			try
			{
				ThiSinh ts= phongthi.LayThongTinThiSinh(i);
				System.out.println(ts);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("===========================");
		// TODO Auto-generated method stub
		
	}
	static void LayTTTS_TT() {
	try{
		 Scanner scn= new Scanner(System.in);
		System.out.println("nhập thứ tự của sinh vien");
		int stt=scn.nextInt();
		System.out.println("~~~~~~~ Kết quả~~~~~~~");
		ThiSinh ts= phongthi.LayThongTinThiSinh(stt);
		if(ts==null)
		{
			System.out.println("không thể lấy");
		}
		else
		{
			System.out.println(ts);
		// TODO Auto-generated method stub
		}
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
		
	}
	static void LayTTTS_SBD() {
		try{
			Scanner scn= new Scanner(System.in);
			System.out.println("nhập số báo danh của sinh viên cần lấy");
			String sbd=scn.nextLine();
			scn.nextLine();
			ThiSinh ts = phongthi.LayThongTinThiSinh(sbd);
			System.out.println("~~~~~~ Kết quả~~~~~");
			if(ts==null)
			{
				System.out.println("không có kết quả");
			}
			else
			{
				System.out.println(ts);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		// TODO Auto-generated method stub
		
	}
	static void XoaTS() {
		try{
			Scanner scn= new Scanner(System.in);
			System.out.println("nhập số báo danh cần xóa");
			String Sbd= scn.nextLine();
			scn.nextLine();
			if(!phongthi.XoaThiSinh(Sbd)) System.out.println("ko xóa được");
			else System.out.println("đã xóa thành công ");
		}
		catch(Exception ex)
		{
			System.out.println("không tồn tại thí sinh");
		}
		// TODO Auto-generated method stub
	}
	static void ChinhTTS() {
		try{
		String ten,Sbd,Sbdsua;
		float diemToan,diemLi,diemHoa;
		Scanner scn= new Scanner(System.in);
		System.out.println("nhập sbd cần sửa");
		Sbdsua=scn.nextLine();
		System.out.println("nhập tên,Sbd: ");
		ten=scn.nextLine();
		Sbd=scn.nextLine();
		System.out.println("nhập điểm toán lí hóa");
		diemToan=scn.nextFloat();
		diemLi=scn.nextFloat();
		diemHoa=scn.nextFloat();
		ThiSinh ts= new ThiSinh(ten, Sbdsua, diemToan, diemLi, diemHoa);
		if(phongthi.SuaThongTinThiSinh(Sbd, ts)) System.out.println("sửa thành công");
		else
			System.out.println("không sửa được");
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub
		
	}
	// TODO Auto-generated method stub
	static void LuuFile() {
		try
		{
			db.LuuFile(fileName, phongthi);
		}
		catch (Exception ex){
			System.out.println("co loi lưu file"+ex.toString());
		}
	}
		// TODO Auto-generated method stub
	static void DocFile() {
			try
			{
				phongthi=(PhongThi)db.docFile(fileName);
			}
			catch(Exception ex){
			System.out.println("co lỗi đọc file"+ex.toString());
			}
			// TODO Auto-generated method stub
		}
	static void ThemTS()
	{
		try
		{
			String ten,Sbd;
			float diemToan,diemLi,diemHoa;
			Scanner scn= new Scanner(System.in);
			System.out.println("nhập tên,Sbd: ");
			ten=scn.nextLine();
			Sbd=scn.nextLine();
			System.out.println("nhập điểm toán lí hóa");
			diemToan=scn.nextFloat();
			diemLi=scn.nextFloat();
			diemHoa=scn.nextFloat();
			ThiSinh ts = new ThiSinh(ten, Sbd, diemToan, diemLi, diemHoa);
			if(phongthi.ThemThiSinh(ts))
				System.out.println("thêm thành công");
			else
				System.out.println("không thêm được");
		}
			catch (Exception e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
					
		}
		
		
	}


