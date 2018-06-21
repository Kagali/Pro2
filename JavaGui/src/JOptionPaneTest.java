import javax.swing.JOptionPane;

public class JOptionPaneTest {

	public static void main(String[] args) {
		
		//JOptionPane.showInputDialog("String") -> Öffnet Fenster zur Eingabe und setzt Eingabe als Variable
		String name1 = JOptionPane.showInputDialog("Gib den Name ein"); 
		String name2 = JOptionPane.showInputDialog("Gib einen anderen Namen ein");

		
		int num1 = name1.length();		
		int num2 = name2.length();		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, sum, name1 + name2, JOptionPane.PLAIN_MESSAGE);
		
	}

}
