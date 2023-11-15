package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

// Hoang Hai Phong
public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		// Hoang Hai Phong
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation"
				,"Roger Allers",87,19.95f);
		cart.addDigitalVideoDisc(dvd1);    // Add The Lion King, id =1
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War","Science Fiction"
				,"George Lucas",87,24.95f);
		cart.addDigitalVideoDisc(dvd2);		//  Add Star War, id = 2
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation"
				,18.99f);
		cart.addDigitalVideoDisc(dvd3);		// Add Aladin, id = 3
		
		System.out.println("**************Cart****************");
		cart.print();						// goi phuong thuc print in ra cac DVD duoc ordered
		// Hoang Hai Phong
		System.out.println("**********************************");
		System.out.println("Hoang Hai Phong 20210670");


		cart.searchDVDById(1);				// tim phim co id =1 
		cart.searchDVDByTitle("Star War");	// tim phim co ten la Star War
		cart.searchDVDById(4);              // tim phim co id = 4
		cart.searchDVDByTitle("The Avenger"); // tim phim co ten la The Avenger 
		
	}
	
}
