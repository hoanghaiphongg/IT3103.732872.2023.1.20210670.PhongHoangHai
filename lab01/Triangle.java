//Hoang Hai Phong -20210670
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("I'm Hoang Hai Phong! What's the height of the Triangle?");
		int tHeight= keyboard.nextInt(); // doc integer tu ban phim -> chieu cao
		for(int i=1;i<=tHeight;i++){
			for(int j=1;j<=tHeight-i;j++) {
				System.out.print(" ");	// in ra khoang trong
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");	// in ra *
			}
			    System.out.print("\n"); 

		}
	}
}
