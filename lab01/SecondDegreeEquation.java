// SecondDegreeEquation.java
// Hoang Hai Phong- 20210670
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SecondDegreeEquation{
    public static void main(String[] args) {
        double a, b, c, x, x1, x2, d;
        String strNotification = "";

        a = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong- 20210670\n"
                + "a: ",
                "Input a",
                JOptionPane.INFORMATION_MESSAGE));

        b = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong- 20210670\n"
                + "b: ",
                "Input b",
                JOptionPane.INFORMATION_MESSAGE));

        c = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Hoang Hai Phong- 20210670\n"
                + "c: ",
                "Input the c",
                JOptionPane.INFORMATION_MESSAGE));

        d = b * b - 4 * a * c;

        strNotification += "We have solution :\n"; 
        strNotification += formatDecimal(a)+".x^2 + "+formatDecimal(b)+".x + "+formatDecimal(c)+" = 0\n"; 
        strNotification += "Solution:\n"; 

        if (a == 0) {
            if (b == 0 ) {
                if (c == 0) {
                    // a = 0, b = 0, c = 0 -> vô số nghiệm
                    strNotification += "Infinite solutions";
                } else  {
                    // a = 0, b = 0, c != 0 -> vô nghiệm
                    strNotification += "No solution";
                }
            } else {
                // a = 0, b != 0, c != 0 -> 1 nghiệm duy nhất x = -c/b
                x = -c / b;
                strNotification += "x = " + formatDecimal(x);
            }
        } else {
            if (d < 0 ) {
                // delta < 0 -> vô nghiệm
                strNotification += "No solution";
            } else if (d == 0) {
                //  d == 0 -> nghiệm duy nhất x = -b/2a;
                x = -b / (2 * a);
                strNotification += "x = " + formatDecimal(x) + "\n";
            } else {
                // d > 0 -> 2 nghiệm phân biệt
                // x1 = (b + sqrt(d)) / (2 * a)
                // x2 = (b - sqrt(d)) / (2 * a)
                x1 = (b + Math.sqrt(d)) / (2 * a);
                x2 = (b - Math.sqrt(d)) / (2 * a);
                strNotification += "x1 = " + formatDecimal(x1) + "\n";
                strNotification += "x2 = " + formatDecimal(x2) + "\n";
            }
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