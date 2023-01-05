import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DBEngine {
public void LuuFile(String fileName, Object obj) throws Exception{
	//tao luồng ghi file
	FileOutputStream fs= new FileOutputStream(fileName);
	//tạo luồng đê serial đối tượng
	ObjectOutputStream os= new ObjectOutputStream(fs);
	//chuyển đối tượng tới đích
	os.writeObject(obj);
	//đóng luồng
	os.close();
	fs.close();
}
public  Object docFile(String fileName) throws Exception{
	Object kp= null;
	FileInputStream fi= new FileInputStream(fileName);
	ObjectInputStream ois = new ObjectInputStream(fi);
	kp=ois.readObject();
	ois.close();
	fi.close();
	return kp;
	
}
}
