//Hoang Hai Phong - 20210670
// Example 5
import javax.swing.JOptionPane;
public class DoubleNumbers {
		public static void main(String[] args) {
			String strNum1,strNum2;
			strNum1=JOptionPane.showInputDialog(null,
					"Hoang Hai Phong-20210670- Please input the first number: ","Input the first number",
					 JOptionPane.INFORMATION_MESSAGE);	// Nhap so thu nhat
			strNum2=JOptionPane.showInputDialog(null,
					"Hoang Hai Phong-20210670- Please input the second number: ","Input the second number",
					 JOptionPane.INFORMATION_MESSAGE);  // Nhap so thu hai
			double num1,num2;
			num1=Double.parseDouble(strNum1);			// ep kieu tu string ve double
			num2=Double.parseDouble(strNum2);			// ep kieu tu string ve double
			JOptionPane.showMessageDialog(null, "Sum: "+(num1+num2)+"\n"+			// hien thi tong
												"Difference: "+(num1-num2)+"\n"+	// hien thi hieu
												"Product: "+(num1*num2)+"\n"+		// hien thi tich
												"Quotient: "+(num1/num2)+"\n");		// hien thi thuong
			

		}
}	
