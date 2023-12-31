package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

// Hoang Hai Phong 20210670
public class Cart {
	// Hoang Hai Phong - 20210670 
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered=0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered<MAX_NUMBER_ORDERED) { // co the them item
			qtyOrdered++;
			itemsOrdered[qtyOrdered]=disc;
			System.out.println("Hoang Hai Phong 20210670: Da them san pham vao gio hang !");

		}
		else { // gio hang da full
			System.out.println("Hoang Hai Phong 20210670: Gio hang cua ban da day !");
		}
	}
	// Hoang Hai Phong - 20210670 

	public void addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2) {
		if(qtyOrdered+2<=MAX_NUMBER_ORDERED) { // co the them 2 item
			qtyOrdered++;
			itemsOrdered[qtyOrdered]=disc1;
			qtyOrdered++;
			itemsOrdered[qtyOrdered]=disc2;
			System.out.println("Hoang Hai Phong 20210670: "
					+ "Da them 2 san pham vao gio hang !");

		}
		else { // gio hang da full
			System.out.println("Hoang Hai Phong 20210670: "
					+ "Gio hang cua ban da day !");
		}
	}
	// Hoang Hai Phong - 20210670 
	public void addDigitalVideoDisc(DigitalVideoDisc[] disc) {
		if(qtyOrdered+disc.length<=MAX_NUMBER_ORDERED) { // co the them list item
			qtyOrdered+=disc.length;
			for(int i=1;i<=disc.length;i++) {
				qtyOrdered++;
				itemsOrdered[qtyOrdered]=disc[i];
			}
			System.out.println("Hoang Hai Phong 20210670: "
					+ "Da them danh sach san pham vao gio hang !");

		}
		else { // gio hang da full
			System.out.println("Hoang Hai Phong 20210670: Gio hang cua ban da day !");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=1;i<=qtyOrdered;i++) {
			if(itemsOrdered[i].equals(disc)) { // tim thay san pham can xoa
				for(int j=i;j<=qtyOrdered-1;j++) {
					itemsOrdered[j]=itemsOrdered[j+1];
				}
				qtyOrdered--;
				System.out.println("Hoang Hai Phong 20210670: Da xoa san pham !");
				return;
			}
		}
				System.out.println("Hoang Hai Phong 20210670: Khong tim thay san pham !");
				return;
	}
	public float totalCost() {
		float sum=0;
		for(int i=1;i<=qtyOrdered;i++) {
			sum+=itemsOrdered[i].getCost();
		}
		return sum;
	}
	
	//Hoang Hai Phong - 20210670
	public void searchDVDById(int searchId) {
		for(int i=1;i<=qtyOrdered;i++) {
	        if (itemsOrdered[i].getId() == searchId) {
	            System.out.println("Tim thay  " + itemsOrdered[i]);
	            return;
	        }
	    }
	    System.out.println("Khong tim thay DVD co ID: " + searchId);
	}
	public void searchDVDByTitle(String searchTitle) {
		  for(int i=1;i<=qtyOrdered;i++) {
	        if (itemsOrdered[i].getTitle()==searchTitle) {
	            System.out.println("Tim thay  " + itemsOrdered[i]);
	            return;
	        }
	    }
	    System.out.println("Khong tim thay DVD co Title: " + searchTitle);
	}
	
	// Hoang Hai Phong - 20210670
	public void print() {
		float totalcost=0;
		for(int i=1;i<=qtyOrdered;i++) {
			System.out.println(itemsOrdered[i]);
			totalcost+=itemsOrdered[i].getCost();
			}
		System.out.println("Total cost:" + totalcost +"$");
				
	}
	
}
