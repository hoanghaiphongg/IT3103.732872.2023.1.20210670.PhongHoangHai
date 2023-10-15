
// Hoang Hai Phong - 20210670
import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class LinearEquation {
	
	public static void main(String[] args) {
		double a, b, x;
        String strNotification = "";

        a = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong-20210670\n"+" a: ",
                "Input a",
                JOptionPane.INFORMATION_MESSAGE));

        b = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong-20210670\n"+" b: ",
                "Input b",
                JOptionPane.INFORMATION_MESSAGE));

        strNotification += "We have equation : "+formatDecimal(a)+"x + "+formatDecimal(b)+" = 0\n"; 
        strNotification += "Solution:\n"; 

        if (a == 0 ) {
            if (b == 0) {
                // a = 0, b = 0 -> vô số nghiệm
                strNotification += "Infinite solutions";
            } else  {
                // a = 0, b != 0 -> vô nghiệm
                strNotification += "No solution";
            }
        } else {
            //  a != 0, b != 0 -> 1 nghiệm duy nhất x = -b/a
            x = -b / a;
            strNotification += "x = " + formatDecimal(x);
        }

        JOptionPane.showMessageDialog(null, strNotification, "Show solution", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
	}	
	public static String formatDecimal(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#.########");
        return decimalFormat.format(number);
    }
}
