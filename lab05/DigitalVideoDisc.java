package hust.soict.dsai.aims.screen;

import java.util.Objects;
// Hoang Hai Phong - 20210670
public class DigitalVideoDisc extends Disc implements Playable {
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
	
	// Constructor 1 tham số
	public DigitalVideoDisc(String title) {
				super();
				this.title = title;
				this.id = ++nbDigitalVideoDiscs;
	}
	// Constructor 3 tham số
	public DigitalVideoDisc(String title, String category, float cost) {
				super();
				this.title = title;
				this.category = category;
				this.cost = cost;
				this.id = ++nbDigitalVideoDiscs;
	}
	// Constructor 4 tham số
	public DigitalVideoDisc(String title, String category, String director, float cost) {
				super();
				this.title = title;
				this.category = category;
				this.director = director;
				this.cost = cost;
				this.id = ++nbDigitalVideoDiscs;
	}

	// Constructor 5 tham số
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.director = director;
			this.length = length;
			this.cost = cost;
			this.id = ++nbDigitalVideoDiscs;//gán id
		}
	
	// Hoang Hai Phong - 20210670
	private static int nbDigitalVideoDiscs = 0; // Class attribute

	public static int getNbDigitalVideoDiscs() {
	    return nbDigitalVideoDiscs;
	}
	
	//Phương thức play()
	public void play() {
        System.out.println("Play DVD: " + this.getTitle());
        System.out.println("DVD Length: " + this.getLength());
    }
	
	@Override
	// Phương thức in ra thông tin của đĩa DVD
	public String toString() {
        return "ID DVD: " + id + " //- Tiêu đề:  " + title + " //- Thể loại:  " + category + 
        		" //- Đạo diễn:  " + director + " //- Chiều dài:  " 
        		+ length + " //- Giá:  " + cost + " $";
	}
}

		
		
		
		
