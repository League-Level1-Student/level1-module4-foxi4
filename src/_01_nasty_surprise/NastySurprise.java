package _01_nasty_surprise;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements Runnable {
	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton trick = new JButton();
		JButton treat = new JButton();
		
		public void run() {
			trick.setText("Trick");
			treat.setText("Treat");
			panel.add(treat);
			panel.add(trick);
			frame.add(panel);
			frame.setVisible(true);
			//if(trick==) {
			//	showPictureFromTheInternet("cutefox.jpeg");
			//	
			//}
			//if(treat==) {
			//	showPictureFromTheInternet("scaryphotolol.jpeg");
			//}
		}

	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }

	}
}