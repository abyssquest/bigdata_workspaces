package exam05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataBufferedFilterStream {
	public static void main(String[] args) {

		try {
			OutputStream fileOut = new FileOutputStream("data.bin");
			BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);
			DataOutputStream filterOut = new DataOutputStream(bufferOut);

			filterOut.writeInt(2048);
			filterOut.close();
			
			InputStream fileIn = new FileInputStream("data.bin");
			BufferedInputStream bufferIn = new BufferedInputStream(fileIn);
			DataInputStream filterIn = new DataInputStream(bufferIn);

			System.out.println(filterIn.readInt());
			filterIn.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
