package hust.soict.dsai.aims.screen;

// Hoang Hai Phong - 20210670
public class Disc extends Media {
	protected String director;
	protected int length;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}