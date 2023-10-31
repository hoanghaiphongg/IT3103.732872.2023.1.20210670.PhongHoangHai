package lab02;
// Hoang Hai Phong 20210670
public class Cart {
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
	
	
}
