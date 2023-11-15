package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

// Hoang Hai Phong - 20210670
public class Aims {
	public static void main(String[] args) {
		Cart Order = new Cart() ;
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece","Anime",20.0f);
		Order.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Infinity War","Sci-fi","Adam Bill",50.5f);
		Order.addDigitalVideoDisc(dvd2);
		System.out.println(" Hoang Hai Phong 20210670: Total Cost is "+ Order.totalCost());

		}
}
