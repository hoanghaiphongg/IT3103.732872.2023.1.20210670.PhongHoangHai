//Example 3: HelloNameDialog.java
// Hoang Hai Phong - 20210670
import javax.swing.JOptionPane;

public class HelloNameDialog {
		public static void main(String[] args) {
			String result;
			result=JOptionPane.showInputDialog(null, "Hoang Hai Phong-20210670- Please enter your name"); 	// Nguoi dung nhap ten
			JOptionPane.showMessageDialog(null, "Toi la Hoang Hai Phong. Hi "+result+"!"); 		//	Hien thi ten vua nhap

			System.exit(0);
		}
}
