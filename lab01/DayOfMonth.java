import java.util.Scanner;
//Hoang Hai Phong -20210670


public class DayOfMonth {
	public static void main(String[] args) {
		int mm, yy; // mm = month, yy= year;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Month:  ");
			mm = sc.nextInt();		// doc so tu nhien ->month
			System.out.println("Year: ");
			yy = sc.nextInt();		// doc so tu nhien -> year
			if(mm>=1&&mm<=12&&yy>=0) {	// kiem tra month, year hop le ?
				break;
			}
			System.out.println("Invalid month or year!");
		}
		switch (mm) {
		case 1, 3, 5, 7, 8, 10, 12:		// nhung thang co 31 ngay
			System.out.println(" 31 days");	
			break;
		case 4, 6, 9, 11:				// nhung thang co 30 ngay
			System.out.println(" 30 days");
			break;
		case 2:
			if (yy % 100 != 0 && yy % 4 == 0) {
				System.out.println(" 29 days");	// thang 2 nam nhuan
			} else {
				System.out.println(" 28 days"); // thang 2 nam khong nhuan
			}
		}
	}
}
