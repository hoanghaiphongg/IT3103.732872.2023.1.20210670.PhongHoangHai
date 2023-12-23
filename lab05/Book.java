package hust.soict.dsai.aims.screen;
import java.util.ArrayList;
import java.util.List;
//Hoang Hai Phong - 20210670
import java.util.ArrayList;
import java.util.List;
// Hoang Hai Phong 20210670
public class Book extends Media {
    private List<String> authors = new ArrayList<>();
    private static int nbBook = 0;

    // Constructor
    public Book(String title, String category, float cost) {
        super();
        this.id = ++nbBook;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Thêm tác giả
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println(" Hoàng Hải Phong 20210670 - Tác giả đã tồn tại");
        } else {
            authors.add(authorName);
        }
    }

    // Xóa tác giả 
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println(" Hoàng Hải Phong 20210670 -  Tác giả không có trong danh sách");
        }
    }

    // Lấy danh sách tất cả các tác giả
    public List<String> getAuthors() {
        return authors;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        String authorsString = String.join(", ", getAuthors());
        return "ID Sách: " + getId() + " // - Tiêu đề: " + getTitle() + " // - Tác giả: "
                + authorsString + " // - Thể loại: "
                + getCategory() + " // - Giá: " + getCost() + " $";
    }
}

