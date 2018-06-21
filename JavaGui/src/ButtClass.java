import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtClass extends JFrame {

	private JButton bLinks, bRechts, bMitte, bUmdrehen;

	public ButtClass() {
		super("Buttons!");
		setLayout(new FlowLayout());

		bLinks = new JButton("links");
		bRechts = new JButton("rechts");
		bMitte = new JButton("midde");

		add(bLinks);
		add(bRechts);
		add(bMitte);
		
		Icon normal = new ImageIcon(getClass().getResource("normal.png")); //F5 auf Leiste um Pfad zu refreshen
		Icon hover = new ImageIcon(getClass().getResource("hover.png"));
		bUmdrehen = new JButton("AAAHHHHN~", normal);
		bUmdrehen.setRolloverIcon(hover);
		add(bUmdrehen);
		

		DerHandler handler = new DerHandler();
		bLinks.addActionListener(handler);
		bRechts.addActionListener(handler);
		bMitte.addActionListener(handler);
		bUmdrehen.addActionListener(handler);
	}
	
	public class DerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==bLinks) {
				JOptionPane.showMessageDialog(null, "go left");
			} else if (e.getSource()==bRechts) {
				JOptionPane.showMessageDialog(null, "go right");
			} else if (e.getSource()==bMitte) {
				JOptionPane.showMessageDialog(null, "go forward");
			} else if (e.getSource()==bUmdrehen) {
				JOptionPane.showMessageDialog(null, "DONT TOUCH ME!");
			}
		}
		
	}
	
	public static void main(String[]args) {
		ButtClass buttFenster = new ButtClass();
		buttFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttFenster.setSize(400, 400);
		buttFenster.setVisible(true);
	}

}
