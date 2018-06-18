import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class XOButton extends JButton implements ActionListener {
	ImageIcon X, O;
	byte value = 0;

	public XOButton() {
		X = new ImageIcon(this.getClass().getResource("X.png"));  //getResource from \eclipse-workspace\TicTacToe mit Swing\bin
		O = new ImageIcon(this.getClass().getResource("O.png"));
		this.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		value++;
		value%=3;
		
		switch (value) {
		case 0:
			setIcon(null);
			break;
		case 1:
			setIcon(X);
			break;
		case 2:
			setIcon(O);
			break;
		}
	}
}
