package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

//Hoang Hai Phong - 20210670
public class TestPassingParameter {
		public static void main(String[] args) {
			DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
			DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
			swap(jungleDVD,cinderellaDVD);
			System.out.println("Hoang Hai Phong - jungle dvd title: "+jungleDVD.getTitle());
			System.out.println("Hoang Hai Phong - cinderella dvd title : "+cinderellaDVD.getTitle());
			changeTitle(jungleDVD, cinderellaDVD.getTitle());
			System.out.println("Hoang Hai Phong - jungle dvd title: "+jungleDVD.getTitle());
		}
		public static void swap(Object o1,Object o2) {
// Hoang Hai Phong - 20210670
			Object tmp = o1;
			o1=o2;
			o2=tmp;
		}
		public static void changeTitle(DigitalVideoDisc dvd,String title) {
// Hoang Hai Phong - 20210670
			String oldTitle= dvd.getTitle();
			dvd.setTitle(title);
			dvd = new DigitalVideoDisc(oldTitle);
		}
}
