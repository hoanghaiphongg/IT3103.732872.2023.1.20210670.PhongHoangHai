// ShowTwoNumber.java
//Hoang Hai Phong- 20210670
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
	public static void main(String[] args) {
			String strNum1,strNum2;
			String strNotification="You have just entered: ";
			strNum1=JOptionPane.showInputDialog(null, "Hoang Hai Phong-20210670- Please input the first number: ","Input the first number",
					 JOptionPane.INFORMATION_MESSAGE);	//nhap so thu nhat
			strNotification+=strNum1+" and ";
			strNum2=JOptionPane.showInputDialog(null, "Hoang Hai Phong-20210670- Please input the second number: ","Input the second number",
					 JOptionPane.INFORMATION_MESSAGE);	// nhap so thu hai
			strNotification+=strNum2;
			JOptionPane.showMessageDialog(null, strNotification,"Show two numbers",
					 JOptionPane.INFORMATION_MESSAGE);	// hien thi 2 so vua nhap

			System.exit(0);
	}
}
