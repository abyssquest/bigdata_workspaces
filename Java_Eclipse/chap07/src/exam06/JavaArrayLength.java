package exam06;

public class JavaArrayLength {
	public static void main(String[] args) {
		/* 배열 선언, 정의, 데이터 저장 방법 */
		// dataType[] varName = new dataType[numberOfData] : 배열 선언, 정의
		// dataType varName[] = new dataType[numberOfData] : 배열 선언, 정의
		// dataType[] varName = new dataType[] {Data1, Data2, ...} : 배열 선언, 정의, 데이터 저장
		// dataType varName[] = new dataType[] {Data1, Data2, ...} : 배열 선언, 정의, 데이터 저장
		// dataType[] varName = {varData1, varData2, ...} : 배열 선언, 정의, 데이터 저장
		// dataType varName[] = {varData1, varData2, ...} : 배열 선언, 정의, 데이터 저장
		
		
		int[] age = new int[] {21, 22, 23};
		
		// age[0] = 21;
		// age[1] = 22;
		// age[2] = 23;
		// age[3] = 24; error
		
		for (int i = 0; i < age.length; i++) {
			System.out.println("나이 : " + age[i]);
		}
	}
}
