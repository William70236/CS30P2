package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.text.DecimalFormat; 

public class semesterAvg {

	private JFrame frame;
	private JTextField firstgrade;
	private JTextField secondgrade;
	private JTextField thirdgrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					semesterAvg window = new semesterAvg();
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
	public semesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 232);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 532, 243);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		firstgrade = new JTextField();
		firstgrade.setText("Enter first grade");
		firstgrade.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyTyped(KeyEvent e)
			{
				
				if(firstgrade.getText().equals("Enter first grade"))
				{
					firstgrade.setText("");
				}
			
			}
		
		
		});
        firstgrade.setBounds(10, 22, 139, 45);
		panel.add(firstgrade);
		firstgrade.setColumns(10);
	
		secondgrade = new JTextField();
		secondgrade.setText("Enter second grade");
		secondgrade.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyTyped(KeyEvent e)
			{
				
				if(secondgrade.getText().equals("Enter second grade"))
				{
					secondgrade.setText("");
				}
			
			}
		
		
		});
		secondgrade.setColumns(10);
		secondgrade.setBounds(10, 78, 139, 45);
		panel.add(secondgrade);
		
		thirdgrade = new JTextField();
		thirdgrade.setText("Enter third grade");
		thirdgrade.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyTyped(KeyEvent e)
			{
				
				if(thirdgrade.getText().equals("Enter third grade"))
				{
					thirdgrade.setText("");
				}
			
			}
		
		
		});
		thirdgrade.setColumns(10);
		thirdgrade.setBounds(10, 134, 139, 45);
		panel.add(thirdgrade);
		
		JButton display = new JButton("Submit");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fG = firstgrade.getText();
				String sG = secondgrade.getText();
				String lG = thirdgrade.getText(); 
				
				double Fg = Double.parseDouble(fG);
				double Sg = Double.parseDouble(sG);
				double Lg = Double.parseDouble(lG);
				double avgGrade = (Fg + Sg + Lg)/3;
				
				DecimalFormat dc = new DecimalFormat("0.0");
				
						
				        display.setText("Your semester average is:"
						+ dc.format(avgGrade));
					
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 15));
		display.setBounds(159, 21, 311, 158);
		panel.add(display);
		JLabel label = new JLabel("");
		label.setBounds(10, 179, 242, 10);
		panel.add(label);
	}
}
