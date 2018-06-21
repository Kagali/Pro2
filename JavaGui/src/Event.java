import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Event extends JFrame {

	private JTextField name;
	private JTextField question;
	private JTextField answer;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;

	public Event() {

		super("Event");
		setLayout(new FlowLayout());

		name = new JTextField(20); // Int für Anzahl der verwendbaren Zeichen
		add(name);

		question = new JTextField("Was is drei+four?");
		question.setEditable(false);
		add(question);

		answer = new JTextField("Antwortfeld");
		add(answer);

		passwordField1 = new JPasswordField("asdfasdf");
		add(passwordField1);

		passwordField2 = new JPasswordField("fdasfdas");
		add(passwordField2);
		
		Handler handler = new Handler();
		name.addActionListener(handler);
		answer.addActionListener(handler);
		passwordField1.addActionListener(handler);
		passwordField2.addActionListener(handler);

	}

	public class Handler implements ActionListener{  //ActionListener Performer

		@Override
		public void actionPerformed(ActionEvent e) {
			//e ist ein "Event"
			String string = "";
			if(e.getSource()==name) {   //Wenn Aktion in Feld "name"
				string = String.format("name: %s", e.getActionCommand()); //Dann führe dies aus
				
			} else if (e.getSource() == answer){
				string = String.format("answer: %s", e.getActionCommand());
			} else if (e.getSource() == passwordField1){
				string = String.format("passwordField1: %s", e.getActionCommand());
			} else if (e.getSource() == passwordField2){
				string = String.format("passwordField2: %s", e.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);  //Zeig in neuem Fenster was gemacht wurde
		
		}

	}
	
	public static void main(String[] args) {
		Event unserEvent = new Event();
		unserEvent.setVisible(true);
		unserEvent.setDefaultCloseOperation(EXIT_ON_CLOSE);
		unserEvent.setSize(400, 400);
	}
	
}
