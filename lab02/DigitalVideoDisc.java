package lab02;

import java.util.Objects;
// Hoang Hai Phong - 20210670
public class DigitalVideoDisc {
		private String title;
		private String category;
		private String director;
		private int lenght;
		private float cost;
		
		// Constructor methods
		public DigitalVideoDisc(String title) {
			super();
			this.title = title;
		}
		public DigitalVideoDisc(String title, String category, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.cost = cost;
		}
		public DigitalVideoDisc(String title, String category, int lenght, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.lenght = lenght;
			this.cost = cost;
		}
		public DigitalVideoDisc(String title, String category, String director, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.director = director;
			this.cost = cost;
		}
		
		//Hoang Hai Phong - 20210670
		// getter method
		public String getTitle() {
			return title;
		}
		public String getCategory() {
			return category;
		}
		public String getDirector() {
			return director;
		}
		public int getLenght() {
			return lenght;
		}
		public float getCost() {
			return cost;
		}
		
		@Override
		
		// Hoang Hai Phong 20210670
		// equal method
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DigitalVideoDisc other = (DigitalVideoDisc) obj;
			return Objects.equals(category, other.category)
					&& Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost)
					&& Objects.equals(director, other.director) && lenght == other.lenght
					&& Objects.equals(title, other.title);
		}
		
		
}
