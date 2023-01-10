package 새싹문제.출력.오늘날짜;

/*
	[10699] 오늘날짜
	서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat trans = new SimpleDateFormat("YYYY-MM-DD");
		System.out.println(trans.format(date));
		
	}
}
