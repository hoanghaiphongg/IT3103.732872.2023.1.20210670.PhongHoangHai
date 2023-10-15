// LinearSystem.java
//Hoang Hai Phong - 20210670

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class LinearSystem{
    public static void main(String[] args) {
        double a11, a12, a21, a22, b1, b2, x1, x2, d, d1, d2;  // khai bao bien
        String strNotification = "";

        a11 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong - 20210670\n"
                + "a11: ",
                "Input a11",
                JOptionPane.INFORMATION_MESSAGE));

        a12 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong - 20210670\n"
                + "a12: ",
                "Input a12",
                JOptionPane.INFORMATION_MESSAGE));

        b1 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong - 20210670\n"
                + "b1: ",
                "Input b1",
                JOptionPane.INFORMATION_MESSAGE));

        a21 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong - 20210670\n"
                + "a21: ",
                "Input a21",
                JOptionPane.INFORMATION_MESSAGE));

        a22 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong - 20210670\n"
                + "a22: ",
                "Input a22",
                JOptionPane.INFORMATION_MESSAGE));

        b2 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong - 20210670\n"
                + "b2: ",
                "Input b2",
                JOptionPane.INFORMATION_MESSAGE));

        d = a11 * a22 - a21 * a12;
        d1 = b1 * a22 - b2 * a12;
        d2 = a11 * b2 - a21 * b1;

        strNotification += "We have Linear System :\n"; 
        strNotification += formatDecimal(a11)+".x1 + "+formatDecimal(a12)+".x2 = "+formatDecimal(b1)+"\n"; 
        strNotification += formatDecimal(a21)+".x1 + "+formatDecimal(a22)+".x2 = "+formatDecimal(b2)+"\n"; 
        strNotification += "Solution:\n"; 

        if (d == 0 ) {
            if (d1 == d2) {
                // d = 0, d1 = d2 -> vô số nghiệm
                strNotification += "Infinite solutions";
            } else  {
                // d = 0, d1 != d2 -> vô nghiệm
                strNotification += "No solution";
            }
        } else {
            //  d != 0 -> nghiệm duy nhất x1 = D1/D, x2 = D2/D
            x1 = d1 / d;
            x2 = d2 / d;
            strNotification += "x1 = " + formatDecimal(x1) + "\n";
            strNotification += "x2 = " + formatDecimal(x2) + "\n";
        }
        JOptionPane.showMessageDialog(null, strNotification, "Show solution", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    //  Nếu phần thập phân có số 0 thì không hiển thị
    public static String formatDecimal(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#.########");
        return decimalFormat.format(number);
    }
}