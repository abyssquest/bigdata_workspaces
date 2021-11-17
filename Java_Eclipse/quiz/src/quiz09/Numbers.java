package quiz09;

public class Numbers {
	
	public static void showNumbers15(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
		System.out.println("입력된 숫자들의 최대값은 " + max15(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15) + "입니다.");
		System.out.println("입력된 숫자들의 최소값은 " + min15(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15) + "입니다.");
		System.out.println("입력된 숫자들의 총  합은 " + sum15(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15) + "입니다.");
		System.out.println("입력된 숫자들의 평균값은 " + average15(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15) + "입니다.");
	}
	
	public static int max15 (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
		int max1 = max8(n1, n2, n3, n4, n5, n6, n7, n8); // n1 ~ n8의 최대값
		return max8(max1, n9, n10, n11, n12, n13, n14, n15); // n1 ~ n15의 최대값
	}
	
	public static int max8 (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) { // 숫자 8개의 최대값
		int max1 = max4(n1, n2, n3, n4);
		int max2 = max4(n5, n6, n7, n8);
		return max2(max1, max2);
	}
	
	public static int max4 (int n1, int n2, int n3, int n4) { // 숫자 4개의 최대값
		int max1 = max2(n1, n2);
		int max2 = max2(n3, n4);
		return max2(max1, max2);
	}
	
	public static int max2 (int p1, int p2) { // 숫자 2개 최대값
		if (p1 > p2)
			return p1;
		else
			return p2;
	}
	
	public static int min15 (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
		int min1 = min8(n1, n2, n3, n4, n5, n6, n7, n8); // n1 ~ n8의 최소값
		return min8(min1, n9, n10, n11, n12, n13, n14, n15);// n1 ~ n15의 최소값
	}
	
	public static int min8 (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) { // 숫자 8개의 최소값
		int min1 = min4(n1, n2, n3, n4);
		int min2 = min4(n5, n6, n7, n8);
		return min2(min1, min2);
	}
	
	public static int min4 (int n1, int n2, int n3, int n4) { // 숫자 4개의 최소값
		int min1 = min2(n1, n2);
		int min2 = min2(n3, n4);
		return min2(min1, min2);
	}

	public static int min2 (int p1, int p2) { // 숫자 2개 최소값
		if (p1 > p2)
			return p2;
		else
			return p1;
	}

	public static int sum15 (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
		int sum1 = sum8(n1, n2, n3, n4, n5, n6, n7, n8); // n1 ~ n8 의 총합
		return sum8(sum1, n9, n10, n11, n12, n13, n14, n15); // n1 ~ n15 의 총합
	}

	public static int sum8 (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) { // 숫자 8개의 총합
		int sum1 = sum4(n1, n2, n3, n4);
		int sum2 = sum4(n5, n6, n7, n8);
		return sum2(sum1, sum2);
	}
	
	public static int sum4 (int n1, int n2, int n3, int n4) { // 숫자 4개 총합
		int sum1 = sum2(n1, n2);
		int sum2 = sum2(n3, n4);
		return sum2(sum1, sum2);
	}
	
	public static int sum2 (int n1, int n2) { // 숫자 2개 총합
		return n1 + n2;
	}
	
	public static double average15 (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
		double sum15 = sum15(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15);
		return sum15 / 15;
	}
}