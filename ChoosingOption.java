//Hoang Hai Phong - 20210670
import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option= JOptionPane.showConfirmDialog(null,
				"Hoang Hai Phong- 20210670- Do you want to change the first class ticket?");
		JOptionPane.showMessageDialog(null,
				"You have chosen: "+(option==JOptionPane.YES_OPTION?"YES":"NO"));	// in ra lua chon YES hoac NO
		System.exit(0);
	}
}
