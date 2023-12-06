package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.cart.*;

import java.util.ArrayList;
import java.util.List;
// Hoang Hai Phong 20210670
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

// Hoang Hai Phong
public class CartTest {
    public static void main(String[] args) {
        // Tạo đối tượng giỏ hàng
        Cart cart = new Cart();
       
        // Tạo và thêm DVD vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Spiderman", "Science Fiction", "Sam Raimi", 152, 38.99f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Avenger", "Science Fiction", "Joss Whedon", 129, 31.50f);
        cart.addMedia(dvd2);
        
        // Tạo và thêm CD vào giỏ hàng
        CompactDisc cd1 = new CompactDisc("Em cua ngay hom qua", "Pop", 19.99f, "Son Tung");
        cd1.addTrack(new Track("Em cua ngay hom qua", 5));
        cd1.addTrack(new Track("Hay trao cho anh", 4));
        cart.addMedia(cd1);
 
        CompactDisc cd2 = new CompactDisc("Le Luu Ly", "Pop", 14.99f, "Vu Phung Tien");
        cd2.addTrack(new Track("Le Luu Ly", 4));
        cd2.addTrack(new Track("Chac em da quen roi", 3));
        cart.addMedia(cd2);
        
        // Tạo và thêm sách có nhiều tác giả vào giỏ hàng
        Book book1 = new Book("White Fang", "Fiction", 12.99f);
        book1.addAuthor("Noble Rin");
        cart.addMedia(book1);
       
        Book book2 = new Book("The Newland", "Fantasy", 18.0f);
        book2.addAuthor("J.R.R. Tolkien");
        book2.addAuthor("Alan Lee");
        cart.addMedia(book2);
        
        // In ra thông tin giỏ hàng
        cart.printCart();
    }
}
