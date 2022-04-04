package movies.oo.after.oop;

import java.util.List;
import java.util.Scanner;

import movies.oo.before.db.MovieTable;

public class App1 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영화제목:");
		String title = sc.nextLine();
		MovieDao dao = new MovieDao();
		if (title.equals("명예의전당")) {
			List<Movie> honors = dao.GetHonors();
			System.out.println(honors);
		} else {
			Movie movie = dao.findByTitle(title);
			System.out.println(movie);
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