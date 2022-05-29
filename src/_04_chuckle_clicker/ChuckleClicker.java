package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();
public void makeButtons() {
		
		
		joke.setText("joke");
		punchline.setText("punchline");
		joke.addActionListener(this);
		punchline.addActionListener(this);
		
		frame.setTitle("Choose one");
		frame.setVisible(true);
		
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		
	}
	public static void main(String[] args) {
		
		new ChuckleClicker().makeButtons();
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(joke == buttonPressed) {
			JOptionPane.showMessageDialog(null, "hi this is a joke");
		}
		if(punchline ==buttonPressed) {
			JOptionPane.showMessageDialog(null, "wassup bbygirl");
		}
	}
}
