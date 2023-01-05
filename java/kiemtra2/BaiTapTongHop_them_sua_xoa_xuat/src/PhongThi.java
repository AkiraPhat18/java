import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhongThi implements Serializable {
private String maPt;
private String dcPt;
private int luongTS;

private ArrayList<ThiSinh> dsTs;

public PhongThi(String maPt, String dcPt, int luongTS, ArrayList<ThiSinh> dsTs) {
	super();
	this.maPt = "";
	this.dcPt = "";
	this.luongTS = 0;
	dsTs=new ArrayList<>();
}

public PhongThi(String maPt, String dcPt, int luongTS) {
	super();
	this.maPt=maPt;
	this.dcPt=dcPt;
	this.luongTS=luongTS;
	// TODO Auto-generated constructor stub
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((maPt == null) ? 0 : maPt.hashCode());
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
	PhongThi other = (PhongThi) obj;
	if (maPt == null) {
		if (other.maPt != null)
			return false;
	} else if (!maPt.equals(other.maPt))
		return false;
	return true;
}
public boolean ThemThiSinh(ThiSinh ts)
{
	if(dsTs.contains(ts)) return false;
	if(dsTs.size()+1>luongTS) return false;
	return dsTs.add(ts);
}
public boolean XoaThiSinh( String sBD) throws Exception{

	ThiSinh ts= new ThiSinh(sBD);
	if(!dsTs.contains(ts)) return false;
	return dsTs.remove(ts);
}
public boolean SuaThongTinThiSinh(String SBD, ThiSinh newTS) throws Exception{
	ThiSinh ts= new ThiSinh(SBD);
	if(!dsTs.contains(ts)) return false;
	dsTs.set(dsTs.indexOf(ts), newTS);
	return true;
}
public ThiSinh LayThongTinThiSinh(String SBD) throws Exception{
	ThiSinh ts= new ThiSinh(SBD);
	if(!dsTs.contains(ts)) return null;
	ts=dsTs.get(dsTs.indexOf(ts));
	return ts;
}
public ThiSinh LayThongTinThiSinh(int index)
{
	if(index<0||index>dsTs.size()) return null;
	return dsTs.get(index);
}
public int soThiSinh()
{
	return dsTs.size();
}
}

