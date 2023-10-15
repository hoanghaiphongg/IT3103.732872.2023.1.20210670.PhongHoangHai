//Hoang Hai Phong -20210670
import java.util.Scanner;
public class InputFromKeyboard{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Hi,I'm Hoang Hai Phong-20210670. What's your name?");
		String strName= keyboard.nextLine();	// doc String tu ban phim
		System.out.println("How old are you?");
		int iAge= keyboard.nextInt();			// doc integer tu ban phim
		System.out.println("How tall are you");
		double dHeight = keyboard.nextDouble();	// doc so thuc double tu ban phim 
		System.out.println("Mrs/MS. "+strName+", "+iAge+" years old. "+
							"Your height is "+dHeight+".");	// in ten, tuoi, chieu cao
	}
}
