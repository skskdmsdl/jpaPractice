package hellojpa;

import java.util.Date;
import java.io.FileReader;
import java.util.Calendar;

public class OOTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		// Date에 재정의된 toString 메서드가 호출된 것
		System.out.println(today); // today.toString() => override
		FileReader fr;
		
		// 아래의 println 메서드는 서로 다른 메서드임. 달리 정의 되어 있음
		// overload => 중복 정의
		System.out.println('1'); // PrintStream의 print 메서드를 실행
		System.out.println(1);
		System.out.println("1");
	}
}
