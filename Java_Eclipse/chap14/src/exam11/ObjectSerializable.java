package exam11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializable {

	public static void main(String[] args) {
		Circle c1 = new Circle(1, 1, 2.4);
		Circle c2 = new Circle(2, 2, 4.8);
		
		// 인스턴스 저장
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
			
			out.writeObject(c1);
			out.writeObject(c2);
			out.writeObject("String implements Serializable");
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
