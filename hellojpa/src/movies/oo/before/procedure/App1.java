package movies.oo.before.procedure;

import java.util.Scanner;

import movies.oo.before.db.MovieTable;

public class App1 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("��ȭ����:");
	String title = sc.nextLine();
	if (title.equals("��������")) {
	    for (int i = 0; i < MovieTable.ROWS.length; i++) {
		Object[] row = MovieTable.ROWS[i];
		int audiences = (int) row[3];
		String boxOffice = getBoxOffice(audiences);
		if (boxOffice.equals("S")) {
		    System.out.printf("����: %s, �帣: %s, ���ΰ�: %s, ������: %s, ������: %s\n", row[0], row[1], row[2], audiences,
			    boxOffice);
		}
	    }
	} else {
	    for (int i = 0; i < MovieTable.ROWS.length; i++) {
		Object[] row = MovieTable.ROWS[i];
		if (row[0].equals(title)) {
		    int audiences = (int) row[3];
		    String boxOffice = getBoxOffice(audiences);
		    System.out.printf("����: %s, �帣: %s, ���ΰ�: %s, ������: %s, ������: %s\n", row[0], row[1], row[2], audiences,
			    boxOffice);
		}
	    }
	}
	sc.close();
    }

    private static String getBoxOffice(int audiences) {
	String boxOffice = "";
	if (audiences >= 1000) {
	    boxOffice = "S";
	} else if (audiences >= 700) {
	    boxOffice = "A";
	} else if (audiences >= 400) {
	    boxOffice = "B";
	} else if (audiences >= 100) {
	    boxOffice = "C";
	} else if (audiences < 100) {
	    boxOffice = "F";
	}
	return boxOffice;
    }
}
