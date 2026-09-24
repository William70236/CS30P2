package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class classDemo {

	private JFrame frame;
	private JTextField firstName;
	private JTextField lastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classDemo window = new classDemo();
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
	public classDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 659, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		firstName = new JTextField();
		firstName.setText("Enter first name");
		firstName.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				
				if(firstName.getText().equals("Enter first name"))
				{
					firstName.setText("");
				}
				
				
			}
			
			
			
			
		});
		firstName.setBounds(10, 42, 151, 31);
		panel.add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setText("Enter last name");
		lastName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			
			
			   if(lastName.getText().equals("Enter last name"))
			   {
				   lastName.setText("");
			   }
			   
			}
		});
		lastName.setColumns(10);
		lastName.setBounds(171, 42, 151, 31);
		panel.add(lastName);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			  String fN = firstName.getText();
			  String lN = lastName.getText();
			  
			  Display.setText("Your first name is:"
					  + fN + ""
					  + "Your last name is:"
					  + lN);
			}
		});
		Submit.setBounds(332, 46, 89, 204);
		panel.add(Submit);
		
		JLabel Display = new JLabel("");
		Display.setBounds(10, 207, 252, 43);
		panel.add(Display);
	}	
}
