import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class TicTacToe extends JFrame {
	JPanel panel = new JPanel();
	XOButton[] buttons = new XOButton[9];

	public static void main(String args[]) {
		new TicTacToe();
	}

	public TicTacToe() {
		super("TictacToe");

		setSize(400, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 9; i++) {
			buttons[i] = new XOButton();
			panel.add(buttons[i]);

		}
		add(panel);

		setVisible(true);
	}
}
