package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

// Hoang Hai Phong 20210670
public class Store {

		private DigitalVideoDisc[] itemsInstore = new DigitalVideoDisc[100];
		private int qty=0;
		public void addDVD(DigitalVideoDisc disc) {
				qty++;
				itemsInstore[qty]=disc;
				System.out.println("Hoang Hai Phong 20210670: Da them san pham vao cua hang !");

			
		}
		public void removeDVD(DigitalVideoDisc disc) {
			for(int i=1;i<=qty;i++) {
				if(itemsInstore[i].equals(disc)) { // tim thay san pham can xoa
					for(int j=i;j<=qty-1;j++) {
						itemsInstore[j]=itemsInstore[j+1];
					}
					qty--;
					System.out.println("Hoang Hai Phong 20210670: Da xoa san pham !");
					return;
				}
			}
					System.out.println("Hoang Hai Phong 20210670: Khong tim thay san pham !");
					return;
		}
		public void print() {
			for(int i=1;i<=qty;i++) {
				System.out.println(itemsInstore[i]);
				}
					
		}
}
