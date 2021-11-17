package data.Refernce.Array;

public class Array02_Basic {

	public static void main(String[] args) {

		/* 요약 : 배열 선언, 정의, 데이터 저장 방법 */
		// dataType[] varName = new dataType[numberOfData] : 배열 선언, 정의
		// dataType varName[] = new dataType[numberOfData] : 배열 선언, 정의
		// dataType[] varName = new dataType[] {Data1, Data2, ...} : 배열 선언, 정의, 데이터 저장
		// dataType varName[] = new dataType[] {Data1, Data2, ...} : 배열 선언, 정의, 데이터 저장
		// dataType[] varName = {varData1, varData2, ...} : 배열 선언, 정의, 데이터 저장
		// dataType varName[] = {varData1, varData2, ...} : 배열 선언, 정의, 데이터 저장
		
		/* 참조변수 선언 */
		// 자료형[] 참조변수;
		// 자료형 참조변수[];

		int[] arr1; // 참조변수 선언 방법 1
		int arr2[]; // 참조변수 선언 방법 2 
		
		/* 참조변수 정의 : 인스턴스 생성 */
		arr1 = new int[5]; // 참조변수 = new 자료형[데이터개수];

		// 인스턴스 인덱스에 데이터 저장
		arr1[0] = 95; 
		arr1[1] = 90;
		arr1[2] = 85;
		arr1[3] = 80;
		arr1[4] = 75;

		/* 참조변수 선언, 정의와 메모리 접근 방법 */



		

		// // 참조변수 정의 : 인스턴스 생성


		/* 참조변수 정의 + 데이터 저장 동시 수행 */
//		arr2 = new int[] { 75, 85, 90, 95, 77 };
		// 참조변수 정의 하는 경우에만 {}로 묶어서 저장 가능

		// 참조변수 선언, 정의, 데이터 저장까지 동시에 하는 경우
//		int[] arr3 = new int[] { 35, 79, 53, 62, 55, 45, 55 };

//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < arr3.length; i++) {
//			System.out.println(arr3[i]);
//		}
	}
}
