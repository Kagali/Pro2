package Taschenrechner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GUITaschenrechner extends JFrame {
	
	private JLabel labelOperand1;
	private JLabel labelOperand2;
	private JLabel labelOperator;
	
	private JTextField fieldOperand1;
	private JTextField fieldOperand2;
	
	
	private JButton buttonRechnen;
	
	private String operator;
	
	public GUITaschenrechner(String titel, String operator) { //grafische Benutzeroberfläche
		
		this.operator = operator;
		
		setTitle(titel);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Beendet Prozess nach Shcließen des Fensters
		setLayout(new FlowLayout());
		
		setSize(250, 125);
		setResizable(false); //Fenster kann nicht verkleinert werden
		
		initComponents();
		
		add(labelOperand1);
		add(labelOperand2);
		add(fieldOperand1);
		add(labelOperator);
		add(fieldOperand2);
		add(buttonRechnen);
		
		setLocationRelativeTo(null); //setz Fenster mittig wenn (null)
		setVisible(true);	
		
	}
	
	private void initComponents() {
		labelOperand1 = new JLabel("1.Operand");
		labelOperand2 = new JLabel("1.Operand");
		labelOperator = new JLabel(operator);
		
		fieldOperand1 = new JTextField(8);
		fieldOperand2 = new JTextField(8);
		
		buttonRechnen = new JButton("ausrechnen");
		buttonRechnen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int op1 = Integer.parseInt(fieldOperand1.getText());
				int op2 = Integer.parseInt(fieldOperand2.getText());
				
				int ergebnis;
				if(operator.equals("+")) { //Strings immer mit .equals() vergleichen
					ergebnis = op1 + op2;
				} else if(operator.equals("-")) {
					ergebnis = op1 - op2;
				} else if(operator.equals("*")) {
					ergebnis = op1 * op2;
				} else if(operator.equals("/")) {
					ergebnis = op1 / op2;
				} else {
					ergebnis = Integer.MAX_VALUE;
				}
				 
				JOptionPane.showMessageDialog(GUITaschenrechner.this, "Ergebnis:" + ergebnis, "wurde errechnet", JOptionPane.INFORMATION_MESSAGE);//Pausiert Vorgang bis OK gedrückt wurde 
				
				fieldOperand1.setText("");
				fieldOperand2.setText("");
				
			}
		});
		
	}
	
}
	

