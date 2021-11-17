package exam06;

class Box {
	public void simpleWrap() {
		System.out.println("simpleWrap() 호출");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("paperWrap() 호출");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("goldWrap() 호출");
	}
}

public class InstanceOf {
	public static void main(String[] args) {
		Box box1 = new Box(); // 1000 주소값 가정
		PaperBox box2 = new PaperBox(); // 2000 주소값 가정
		GoldPaperBox box3 = new GoldPaperBox(); // 3000 주소값 가정
		
		wrapBox(box1);
		System.out.println();
		
		wrapBox(box2);
		System.out.println();
		
		wrapBox(box3);
	}
	
	public static void wrapBox(Box box) {
							// Box box = box1;
							// Box box = box2; // 다형성 때문에 가능
							// Box box = box3; // 다형성 때문에 가능

		if (box instanceof GoldPaperBox) {
			GoldPaperBox wrap = (GoldPaperBox) box;
			wrap.goldWrap();
			wrap.paperWrap();
			wrap.simpleWrap();
		}
		else if (box instanceof PaperBox) {
			PaperBox wrap = (PaperBox) box;
			// wrap.goldwrap(); // error
			wrap.paperWrap();
			wrap.simpleWrap();

		}
		else {
			box.simpleWrap();
		}

	}
}