package ex16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class SampleStream {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("CrystalDiskMark8_0_4.zip");
			OutputStream out = new FileOutputStream("CopyTest.zip");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
