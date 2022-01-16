package _01_nasty_surprise;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements Runnable, ActionListener {
	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton trick = new JButton();
		JButton treat = new JButton();
		
		public void run() {
			commands();
		
		}
		public void commands() {
			trick.setText("Trick");
			treat.setText("Treat");
			trick.addActionListener(this);
			treat.addActionListener(this);
			panel.setPreferredSize(new Dimension(500, 500));
			
			panel.add(treat);
			panel.add(trick);
			frame.add(panel);
			frame.setVisible(true);
			
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
	
	public void actionPerformed(ActionEvent e) {
		 //TODO Auto-generated method stub
			if(trick==e.getSource()) {
					showPictureFromTheInternet("https://i.pinimg.com/originals/91/39/01/913901a8b8d9879e9b55feaea99287aa.jpg");
					
				}
			if(treat==e.getSource()) {
					showPictureFromTheInternet("https://static.tvtropes.org/pmwiki/pub/images/0036_018.png");
				}
	}

}