package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField first = new JTextField(10);
	JTextField second = new JTextField(10);
	JButton add = new JButton();
	JButton minus = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();

	JDialog  test = new JDialog();
	
	public void run() {
			frame.add(panel);
	frame.setTitle("Extremely Simple Calculator");
	frame.setSize(500, 500);
	panel.add(add);
	add.setText("+");
	panel.add(minus);
	minus.setText("-");
	panel.add(multiply);
	multiply.setText("x");
	panel.add(divide);
	divide.setText("÷");
	panel.add(first);
	
	panel.add(second);
	
	add.addActionListener(this);
	minus.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String text1 = first.getText();
		String text2 = second.getText();
		int num1 = Integer.parseInt(text1);
		int num2 = Integer.parseInt(text2);
		if(add==buttonPressed) {
			JOptionPane.showMessageDialog(null, num1 + num2);
		}
		if(minus==buttonPressed) {
			JOptionPane.showMessageDialog(null, num1 - num2);
		}
		if(multiply==buttonPressed) {
			JOptionPane.showMessageDialog(null, num1 * num2);
		}
		if(divide==buttonPressed) {
			JOptionPane.showMessageDialog(null, num1 / num2);
		}
	}
}
