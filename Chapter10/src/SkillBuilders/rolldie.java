package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rolldie {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rolldie window = new rolldie();
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
	public rolldie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon die1 = new ImageIcon("../Chapter10/src/SkillBuilders/die1.gif");
		ImageIcon die2 = new ImageIcon("../Chapter10/src/SkillBuilders/die2.gif");
		ImageIcon die3 = new ImageIcon("../Chapter10/src/SkillBuilders/die3.gif");
		ImageIcon die4 = new ImageIcon("../Chapter10/src/SkillBuilders/die4.gif");
		ImageIcon die5 = new ImageIcon("../Chapter10/src/SkillBuilders/die5.gif");
		ImageIcon die6 = new ImageIcon("../Chapter10/src/SkillBuilders/die6.gif");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 376, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel dieface = new JLabel("");
		dieface.setBounds(34, 109, 132, 127);
		panel.add(dieface);
		
		JLabel dieface2 = new JLabel("");
		dieface2.setBounds(176, 109, 132, 127);
		panel.add(dieface2);
		
		JButton rolldie = new JButton("Roll Die");
		rolldie.setBounds(34, 11, 235, 87);
		panel.add(rolldie);
		rolldie.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random()+ 1);
				
				if(newRoll == 1)
				{
					dieface.setIcon(die1);
				}
				else if(newRoll == 2)
				{
					dieface.setIcon(die2);
				}
				else if(newRoll == 3)
				{
					dieface.setIcon(die3);
				}
				else if(newRoll == 4)
				{
					dieface.setIcon(die4);
				}
				else if(newRoll == 5)
				{
					dieface.setIcon(die5);
				}
				else if(newRoll == 6)
				{
					dieface.setIcon(die6);
				}
				
                newRoll2 = (int)(6 * Math.random()+ 1);
				
				if(newRoll2 == 1)
				{
					dieface2.setIcon(die1);
				}
				else if(newRoll2 == 2)
				{
					dieface2.setIcon(die2);
				}
				else if(newRoll2 == 3)
				{
					dieface2.setIcon(die3);
				}
				else if(newRoll2 == 4)
				{
					dieface2.setIcon(die4);
				}
				else if(newRoll2 == 5)
				{
					dieface2.setIcon(die5);
				}
				else if(newRoll2 == 6)
				{
					dieface2.setIcon(die6);
				}
				
				
				
				
			}
		});

	}
}
