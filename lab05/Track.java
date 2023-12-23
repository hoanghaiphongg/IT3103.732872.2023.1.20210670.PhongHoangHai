package hust.soict.dsai.aims.screen;

// Hoang Hai Phong - 20210670
public class Track implements Playable {
    private String title;
    private int length;

    // Getter và setter cho title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter và setter cho length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Constructor của Track
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
    // Hoang Hai Phong - 20210670

    // Phương thức play()
    public void play() {
        System.out.println("Play Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
//
    // Override phương thức equals() để so sánh hai đối tượng Track
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track track = (Track) obj;
        return this.title.equals(track.getTitle()) && this.length == track.getLength();
    }
}

