package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cooki implements ActionListener {
	        public void showButton() {
	        	JFrame frame  =  new JFrame();
	            frame.setVisible(true);
	            JButton button = new JButton();
	            frame.add(button);
	            frame.pack();
	            button.addActionListener(this);
	           
	            
	        }

			@Override
			public void actionPerformed(ActionEvent arg0 ) {
				// TODO Auto-generated method stub
				System.out.println("Woohoo");
				 System.out.println("Button clicked");
				 int rand = new Random().nextInt(5);
				 if (rand== 0) {
					 JOptionPane.showMessageDialog(null, "You will do good at your hardest point in time");
				 }
				 if (rand== 1) {
					 JOptionPane.showMessageDialog(null, "At your hardest point, your goal will be reached");
				 }
				 if (rand== 2) {
					 JOptionPane.showMessageDialog(null, "Your best point in time might not always show");
				 }
				 if (rand== 3) {
					 JOptionPane.showMessageDialog(null, "Your goal will be reached once you have tried your best");
				 }
				 if (rand== 4) {
					 JOptionPane.showMessageDialog(null, "Once you have reached your tip, your goals will be achived.");
				 }
			}
	 }

