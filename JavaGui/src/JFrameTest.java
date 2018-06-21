import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest extends JFrame {
	
	JLabel text;
	
	public JFrameTest(){
		
		setLayout(null); //Deaktiviert Layout-Manager, setzt Position Absolut
		setVisible(true);  //JFrame Sichtbar machen, default is JFrames Visible auf false
		setSize(500,500);
		setTitle("Title vom Fenster ABCDS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrames DefaultCloseOperation is HIDE_ON_CLOSE
		
		text = new JLabel("Testtexttest");
		text.setBounds(100, 100, 400, 100); //bindet Text an die angegebene Stelle
		
		Font schriftart = new Font("arial", Font.BOLD + Font.ITALIC, 20);
		text.setFont(schriftart);
		
		add(text); //add text string zum JFrame
		
	}
	
	public static void main (String[] args) {
		JFrame fenster = new JFrameTest();
	}
	
}
