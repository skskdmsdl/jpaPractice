package hellojpa;

import java.util.Date;
import java.io.FileReader;
import java.util.Calendar;

public class OOTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		// Date�� �����ǵ� toString �޼��尡 ȣ��� ��
		System.out.println(today); // today.toString() => override
		FileReader fr;
		
		// �Ʒ��� println �޼���� ���� �ٸ� �޼�����. �޸� ���� �Ǿ� ����
		// overload => �ߺ� ����
		System.out.println('1'); // PrintStream�� print �޼��带 ����
		System.out.println(1);
		System.out.println("1");
	}
}
