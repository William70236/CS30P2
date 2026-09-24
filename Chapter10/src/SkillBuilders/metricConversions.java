package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metricConversions {

	private JFrame frame;
	private JTextField converted;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metricConversions window = new metricConversions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public metricConversions() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 161);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		converted = new JTextField();
		converted.setBounds(10, 59, 97, 52);
		frame.getContentPane().add(converted);
		converted.setColumns(10);
		
		JLabel selection = new JLabel("Select a conversion type:");
		selection.setBounds(10, 0, 141, 25);
		frame.getContentPane().add(selection);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setBounds(10, 21, 364, 27);
		frame.getContentPane().add(comboBox);
	}
}
