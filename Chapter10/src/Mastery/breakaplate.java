package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class breakaplate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					breakaplate window = new breakaplate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public breakaplate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon placeholder = new ImageIcon("../Chapter10/src/SkillBuilders/placeholder.gif");
		ImageIcon plates = new ImageIcon("../Chapter10/src/SkillBuilders/plates.gif");
		ImageIcon platesallbroken = new ImageIcon("../Chapter10/src/SkillBuilders/platesallbroken.gif");
		ImageIcon platestwobroken = new ImageIcon("../Chapter10/src/SkillBuilders/platestwobroken.gif");
		ImageIcon sticker = new ImageIcon("../Chapter10/src/SkillBuilders/sticker.gif");
		ImageIcon tigerplush = new ImageIcon("../Chapter10/src/SkillBuilders/tigerplush.gif");
		frame = new JFrame();
		frame.setBounds(100, 100, 443, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 427, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel plate1 = new JLabel("");
		plate1.setBounds(73, 23, 276, 93);
		panel.add(plate1);
		
		JButton button = new JButton("Break a Plate!");
		button.setBounds(79, 127, 259, 52);
		panel.add(button);
		
		JLabel outcome = new JLabel("");
		outcome.setBounds(166, 190, 101, 60);
		panel.add(outcome);
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
                int platesbroken;
				
				platesbroken = (int)(3 * Math.random() + 1);
				
				if(platesbroken == 1)
				{
					plate1.setIcon(platesallbroken);
					outcome.setIcon(tigerplush);
					button.setText("You broke all three plates!");
					
				}
				else if(platesbroken == 2)
				{
					plate1.setIcon(plates);
					outcome.setIcon(sticker);
					button.setText("You broke no plates.");
				}
				else if(platesbroken == 3)
				{
					plate1.setIcon(platestwobroken);
					outcome.setIcon(sticker);
					button.setText("You only broke two plates. Close!");
					
				}
			}
		});
	}
}
