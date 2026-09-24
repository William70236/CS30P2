package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class comboboxdemo {

	private JFrame frame;
	private JTextField fc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comboboxdemo window = new comboboxdemo();
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
	public comboboxdemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel display = new JLabel("");
		display.setBounds(26, 157, 363, 93);
		frame.getContentPane().add(display);
		
		JComboBox conversion = new JComboBox();
		conversion
		
		conversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(conversion.getSelectedItem().equals("1 inch = 2.54cm"))
				{
					String n = fc.getText();
					double Num = Double.parseDouble(n);
					double answer = Num * 2.54;
					
					
					
					display.setText(Num + "Inches converted to Centimetres is "
							+ answer + "cm");
					
				}
			}
		});
		conversion.setToolTipText("");
		conversion.setBounds(26, 23, 230, 48);
		frame.getContentPane().add(conversion);
		
		fc = new JTextField();
		fc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
			   if (fc.getText().equals(e))
			   {
				   fc.setText("");
			   }
			}
		});
		fc.setHorizontalAlignment(SwingConstants.CENTER);
		fc.setText("Enter your number here:");
		fc.setBounds(55, 82, 175, 70);
		frame.getContentPane().add(fc);
		fc.setColumns(10);
		
	}
}
