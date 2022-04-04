package movies.oo.before.procedure;

import java.util.Scanner;

import movies.oo.before.db.MovieTable;

public class App1 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("영화제목:");
	String title = sc.nextLine();
	if (title.equals("명예의전당")) {
	    for (int i = 0; i < MovieTable.ROWS.length; i++) {
		Object[] row = MovieTable.ROWS[i];
		int audiences = (int) row[3];
		String boxOffice = getBoxOffice(audiences);
		if (boxOffice.equals("S")) {
		    System.out.printf("제목: %s, 장르: %s, 주인공: %s, 관객수: %s, 흥행등급: %s\n", row[0], row[1], row[2], audiences,
			    boxOffice);
		}
	    }
	} else {
	    for (int i = 0; i < MovieTable.ROWS.length; i++) {
		Object[] row = MovieTable.ROWS[i];
		if (row[0].equals(title)) {
		    int audiences = (int) row[3];
		    String boxOffice = getBoxOffice(audiences);
		    System.out.printf("제목: %s, 장르: %s, 주인공: %s, 관객수: %s, 흥행등급: %s\n", row[0], row[1], row[2], audiences,
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