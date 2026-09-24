package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class highschool {

	private JFrame frame;
	private JTextField firstname;
	private JTextField lastname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					highschool window = new highschool();
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
	public highschool() {
	{
		initialize();
	}
	
	}


	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 620, 356);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		firstname = new JTextField();
		firstname.setText("First Name");
		firstname.setBounds(45, 11, 173, 53);
		frame.getContentPane().add(firstname);
		firstname.setColumns(10);
		firstname.addKeyListener(new KeyAdapter()
				{
		    @Override
			public void keyTyped(KeyEvent e)
			{
				
				if(firstname.getText().equals("Enter first name"))
				{
					firstname.setText("");
				}
			
			}
		    {
		lastname = new JTextField();
		lastname.setText("Last Name");
		lastname.setColumns(10);
		lastname.setBounds(236, 11, 173, 53);
		frame.getContentPane().add(lastname);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBackground(new Color(192, 192, 192));
		button.setBounds(425, 11, 146, 263);
		frame.getContentPane().add(button);
		
		JComboBox dropbox1 = new JComboBox();
		dropbox1.setBounds(45, 85, 173, 41);
		frame.getContentPane().add(dropbox1);
		
		JComboBox school = new JComboBox();
		school.setBounds(236, 85, 173, 41);
		frame.getContentPane().add(school);
		
		JLabel text = new JLabel("");
		text.setHorizontalAlignment(SwingConstants.LEFT);
		text.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		text.setBackground(Color.DARK_GRAY);
		text.setBounds(45, 137, 364, 76);
		frame.getContentPane().add(text);
		
		JLabel image = new JLabel("");
		image.setBounds(45, 224, 202, 121);
		frame.getContentPane().add(image);
	
	}
}
