package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
static void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton joke = new JButton();
		JButton punchline = new JButton();
		joke.setText("joke");
		punchline.setText("punchline");
		frame.setTitle("Choose one");
		frame.setVisible(true);
		frame.add(panel);
		frame.add(joke);
		frame.add(punchline);
		joke.addActionListener(null);
		punchline.addActionListener(null);
		//if(event.getSource() == joke);
		//if(joke == getPressed()) {
			JOptionPane.showMessageDialog(null, "hi");
		//}
		
	}
	public static void main(String[] args) {
	makeButtons();
	
}
}
