package movies.oo.after.oop;

public class Movie {
	private String title, genre, hero;
	private int audiences;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public int getAudiences() {
		return audiences;
	}
	public void setAudiences(int audiences) {
		this.audiences = audiences;
	}
	
	public String getBoxOffice() {
		String boxOffice = "";
		if(audiences >= 1000) {
			boxOffice = "S";
		} else if(audiences >= 700) {
			boxOffice = "A";
		} else if(audiences >= 400) {
			boxOffice = "B";
		} else if(audiences >= 100) {
			boxOffice = "C";
		} else if(audiences < 100) {
			boxOffice = "F";
		}
		return boxOffice;
	}
	
	@Override
	public String toString() {
		return String.format("Movie [title=%s, genre=%s, hero=%s, audiences=%s, boxOffice=%s]", title, genre, hero, audiences, getBoxOffice());
	}
	
	
	
}
