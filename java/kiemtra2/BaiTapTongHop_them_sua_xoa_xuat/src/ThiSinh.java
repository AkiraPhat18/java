
public class ThiSinh {
private String hoTen;
private String SBD;
private double diemToan;
private double diemLi;
private double diemHoa;


public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) throws Exception {
	if(hoTen.trim().equals("")) throw new Exception("ho ten ko dc trong !");
	
	this.hoTen = hoTen;
}
public String getSBD() {
	return SBD;
}
public void setSBD(String sBD) throws Exception {
	if(SBD.trim().equals("")) throw new Exception("so bao danh khong dc trong !");
	 this.SBD = sBD;
}
public double getDiemToan() {
	return diemToan;
}
public void setDiemToan(double diemToan) throws Exception{
	if(diemToan>10||diemToan<0) throw new Exception("diem toan khong hop le !");
	this.diemToan = diemToan;
}
public double getDiemLi() {
	return diemLi;
}
public void setDiemLi(double diemLi) throws Exception{
	if(diemLi>10||diemLi<0) throw new Exception("diem li khong hop le!");
	this.diemLi = diemLi;
}
public double getDiemHoa() {
	return diemHoa;
}
public void setDiemHoa(double diemHoa) throws Exception{
	if(diemHoa>10||diemHoa<0) throw new Exception("diem hoa khong hop le !");
	this.diemHoa = diemHoa;
}

public ThiSinh()
{
	SBD="";
	hoTen="no-name";
	diemToan=diemLi=diemHoa=0f;
}
public ThiSinh(String hoTen, String sBD, double diemToan, double diemLi, double diemHoa) throws Exception{
	setSBD(sBD);
	setHoTen(hoTen);
	setDiemToan(diemToan);
	setDiemLi(diemLi);
	setDiemHoa(diemHoa);
}
public ThiSinh(String SBD) throws Exception{setSBD(SBD);}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		String tValue;
		tValue ="ho ten: "+hoTen+""+"SBD: "+SBD+" "+"Diem toan: "+diemToan+""+"Diem li: "+diemLi+""+"Diem hoa:"+diemHoa;
		return tValue;
	}
}
