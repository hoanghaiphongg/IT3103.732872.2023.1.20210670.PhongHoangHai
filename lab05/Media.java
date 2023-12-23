package hust.soict.dsai.aims.screen;
// Hoang Hai Phong - 20210670
public class Media {
	protected int id;       // ID của media
    protected String title; // Tiêu đề của media
    protected String category; // Thể loại của media
    protected float cost;   // Giá của media

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isMatch(String title) {
        return this.title.equals(title);
    }
    // Hoang Hai Phong
    // Phương thức equals để so sánh media dựa trên tiêu đề
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Media media)) return false;
        return this.isMatch(media.getTitle());
    }
}
