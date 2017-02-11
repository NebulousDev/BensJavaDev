package nebulous.mediaLibraryV2;

public class Song {
	
	private String name;
	private int rating;
	
	public Song(String name, int rating){
		this.name = name;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
