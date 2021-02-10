package _09_sound_effects_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound_effects implements ActionListener {
	static JButton button= new JButton();
	static JButton button2 = new JButton();
public static void main(String[] args) {
	
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	frame.add(panel);
	frame.setVisible(true);
	
	panel.add(button);
	panel.add(button2);
	frame.setSize(500,500);
	Dimension d= new Dimension(100,100);
	button.setPreferredSize(d);
	button2.setPreferredSize(d);
	button.setText("button 1");
	button2.setText("button 2");
sound_effects sound =new sound_effects();
sound.addActionListener();
}
void addActionListener() {
	button.addActionListener(this);
	button2.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("Button clicked");
	
}
}
