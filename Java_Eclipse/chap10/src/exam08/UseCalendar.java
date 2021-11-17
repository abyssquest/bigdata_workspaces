package exam08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UseCalendar {
	public static void main(String[] args) {
		// 현재 날짜 (완전한 singleton 개념의 클래스는 아님)
		Calendar today = Calendar.getInstance(); // new Calendar();
		
		// 년, 월, 일 구하기
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1; // Month 인덱스는 0부터 시작
		int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d년 %d월 %d일\n", year, month, dayOfMonth);
		
		// 시, 분, 초 구하기
		int hour = today.get(Calendar.HOUR_OF_DAY); // 0 ~ 23
		int minute = today.get(Calendar.MINUTE) + 1; // 
		int second = today.get(Calendar.SECOND);
		
		System.out.printf("%d:%d:%d초\n", hour, minute, second);
		
		// 요일 구하기
		String[] DAY_OF_WEEK = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.printf("오늘은 %s요일입니다.\n", DAY_OF_WEEK[today.get(Calendar.DAY_OF_WEEK) - 1]);
		
		// Date
		Date now = new Date();
		System.out.println("현재 시간 : " + now.toString());
		
		now = today.getTime(); // Date 타입으로 변경
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss a");
		
		String date = sdf.format(now);
		System.out.println(date);
		
		// Calendar -> Date 변환
		Date d1 = new Date(today.getTimeInMillis()); // Date(long date)
		
		// Date -> Calendar
		Date d2 = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
	}
}