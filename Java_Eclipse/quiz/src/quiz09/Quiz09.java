package quiz09;

/*

문제) 다음과 같은 데이터가 존재한다고 할 때, 데이터를 검색하여 최대값, 최소값, 평균값을 
        구하는 프로그램을 OOP로 작성하세요.(단, 배열 이용하지 말 것)

      { 17, 53, 84, 73, 49, 27, 90, 85, 75, 50, 85, 92, 78, 98, 68 }
     
 */

public class Quiz09 {
	public static void main(String[] args) {
		int n1 = 17, n2 = 53, n3 = 84, n4 = 73, n5 = 49; 
		int n6 = 27, n7 =90 , n8 =85 , n9 = 75, n10 = 50;
		int n11 = 85, n12 = 92, n13 = 78, n14 = 98, n15 = 68;
		
		DescriptiveStatistics num = new DescriptiveStatistics(-100, 1000, -100);
		
		num.max(n1);  num.max(n2);  num.max(n3);  num.max(n4);  num.max(n5);  
		num.max(n6);  num.max(n7);  num.max(n8);  num.max(n9);  num.max(n10); 
		num.max(n11);  num.max(n12);  num.max(n13);  num.max(n14);  num.max(n15); 
		System.out.println(num.showMax());
		
		num.min(n1);  num.min(n2);  num.min(n3);  num.min(n4);  num.min(n5);  
		num.min(n6);  num.min(n7);  num.min(n8);  num.min(n9);  num.min(n10); 
		num.min(n11);  num.min(n12);  num.min(n13);  num.min(n14);  num.min(n15);
		System.out.println(num.showMin());
		
		num.sum(n1);  num.sum(n2);  num.sum(n3);  num.sum(n4);  num.sum(n5);  
		num.sum(n6);  num.sum(n7);  num.sum(n8);  num.sum(n9);  num.sum(n10); 
		num.sum(n11);  num.sum(n12);  num.sum(n13);  num.sum(n14);  num.sum(n15); 
		num.avg();
		System.out.println(num.showAvg());
		
		
		System.out.println(" ==  배열 이용  ==");
		
		int[] intArry =  { 17, 53, 84, 73, 49, 27, 90, 85, 75, 50, 85, 92, 78, 98, 68 };
		
		for(int i = 0; i < 15; i++) {
			num.max(intArry[i]);
		}
		
		System.out.println("최대값 : " + num.showMax());
	}
}
