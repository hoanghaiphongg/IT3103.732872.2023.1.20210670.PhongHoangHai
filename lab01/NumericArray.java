//Hoang Hai Phong - 20210670
import java.util.Arrays;
public class NumericArray {
	public static void main(String[] args) {
		 int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		 int sum=0;
		 
	        System.out.println("The original array is: ");
	        for (int i=0;i<arr.length;i++) {
	            System.out.print(arr[i] + " ");  // in ra mang ban dau
	            sum+=arr[i];					// tinh tong cac phan tu
	        }
	        double avr=sum/arr.length;			// gia tri trung binh
	        Arrays.sort(arr);
	        System.out.println("\nThe sorted array is: ");
	        for (int i=0;i<arr.length;i++) {
	            System.out.print(arr[i] + " ");	// mang da sap xep
	        }
	        System.out.println("\nThe sum is : "+sum);
	        System.out.println("\nThe average value is : " + avr);


	        
	}
}
