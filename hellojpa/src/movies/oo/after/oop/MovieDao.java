package movies.oo.after.oop;

import java.util.ArrayList;
import java.util.List;

import movies.oo.before.db.MovieTable;

public class MovieDao {

	public Movie findByTitle(String title) {
		for (int i = 0; i < MovieTable.ROWS.length; i++) {
			Object[] row = MovieTable.ROWS[i];
			if(row[0].equals(title)) {
				Movie movie = new Movie();
				movie.setTitle(title);
				movie.setGenre((String)row[1]);
				movie.setHero((String)row[2]);
				movie.setAudiences((int)row[3]);
				return movie;
			}
		}
		return null;
	}

	public List<Movie> GetHonors() {
		List<Movie> result= new ArrayList<>();
		for (int i = 0; i < MovieTable.ROWS.length; i++) {
			Object[] row = MovieTable.ROWS[i];
			Movie movie = new Movie();
			movie.setTitle((String)row[0]);
			movie.setGenre((String)row[1]);
			movie.setHero((String)row[2]);
			movie.setAudiences((int)row[3]);
			if(movie.getBoxOffice().equals("S")) {
				result.add(movie);
			}
		}
		return result;
	}
}
