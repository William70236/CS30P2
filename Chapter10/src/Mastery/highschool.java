package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon bird = new ImageIcon("../Chapter10/src/SkillBuilders/bird.png");
		ImageIcon chhs = new ImageIcon("../Chapter10/src/SkillBuilders/chhs.png");
		ImageIcon qehs = new ImageIcon("../Chapter10/src/SkillBuilders/qehs.png");
		ImageIcon wahs = new ImageIcon("../Chapter10/src/SkillBuilders/wahs.png");
		ImageIcon bowness = new ImageIcon("../Chapter10/src/SkillBuilders/bowness.png");
		ImageIcon centennial = new ImageIcon("../Chapter10/src/SkillBuilders/centennial.png");
		ImageIcon rams = new ImageIcon("../Chapter10/src/SkillBuilders/rams.jpg");
		ImageIcon forestlawn = new ImageIcon("../Chapter10/src/SkillBuilders/forestlawn.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 766, 727);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 750, 688);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JComboBox school = new JComboBox();
		school.setModel(new DefaultComboBoxModel(new String[] {"Western Canada", "Crescent Heights", "William Aberhart", "Queen Elizabeth", "Bowness", "Centennial", "Central Memorial", "Forest Lawn", "James Fowler",}));
		school.setBounds(281, 113, 223, 40);
		panel.add(school);
		
		JComboBox grade = new JComboBox();
		grade.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		grade.setBounds(27, 113, 215, 40);
		panel.add(grade);
	    
		JLabel picture = new JLabel("");
		picture.setBounds(27, 265, 477, 412);
		panel.add(picture);
		
		
			JLabel print = new JLabel("");
		print.setBounds(27, 164, 477, 90);
		panel.add(print);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fN = firstname.getText();
				String lN = lastname.getText();
				String gN = grade.getSelectedItem().toString();
				String sN = school.getSelectedItem().toString();
			print.setText(fN + " " + lN + " is in Grade " + gN + " and goes to " + sN + " High School.");
			
			if(sN == ("Crescent Heights"))
		    {
		    	picture.setIcon(chhs);
		    }
		    else if(sN == ("Western Canada"))
		    {
		    	picture.setIcon(bird);
		    }
		    else if(sN == ("William Aberhart"))
		    {
		    	picture.setIcon(wahs);
		    }
		    else if(sN == ("Queen Elizabeth"))
		    {
		    	picture.setIcon(qehs);
		    }
		    else if(sN == ("Bowness"))
		    {
		    	picture.setIcon(bowness);
		    }
		    else if(sN == ("Centennial"))
		    {
		    	picture.setIcon(centennial);
		    }
		    else if(sN == ("Central Memorial"))
		    {
		    	picture.setIcon(rams);
		    }
		    else if(sN == ("Forest Lawn"))
		    {
		    	picture.setIcon(forestlawn);
		    }
			}
			
			
			});
		submit.setBounds(525, 36, 204, 641);
		panel.add(submit);
		
		lastname = new JTextField();
		lastname.setBounds(281, 36, 223, 66);
		panel.add(lastname);
		lastname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
			   if(lastname.getText().equals("Enter last name"))
			   {
				   lastname.setText("");
			   }
			
			}
		});
		lastname.setText("Enter last name");
		lastname.setColumns(10);
		
		firstname = new JTextField();
		firstname.setBounds(27, 36, 215, 66);
		panel.add(firstname);
		firstname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if (firstname.getText().equals("Enter first name"))
				   {
					   firstname.setText("");
				   }
				
				}
			});
		firstname.setText("Enter first name");
		firstname.setColumns(10);
		{
			}
	}
		
		

	   
		
	
			{
				
			}
	}

