package com.project.devtools.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RunMouseWindow {

	private JFrame frmMousemover;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RunMouseWindow window = new RunMouseWindow();
					window.frmMousemover.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RunMouseWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMousemover = new JFrame();
		Dimension dimension = new Dimension();
		dimension.setSize(800, 800);
		frmMousemover.setBackground(Color.RED);
		frmMousemover.setForeground(Color.WHITE);
		frmMousemover.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Divya\\Desktop\\unique'.jpg"));
		frmMousemover.setTitle("MouseMover");
		frmMousemover.setBounds(100, 100, 450, 300);
		frmMousemover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMousemover.getContentPane().setLayout(null);
		frmMousemover.setSize(new Dimension(329, 184));
		JLabel lblTimer = new JLabel("Timer");
		lblTimer.setBounds(15, 16, 69, 20);
		frmMousemover.getContentPane().add(lblTimer);
		
		textField = new JTextField();
		textField.setBounds(79, 13, 98, 26);
		frmMousemover.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblXPos = new JLabel("X Pos");
		lblXPos.setBounds(15, 55, 69, 20);
		frmMousemover.getContentPane().add(lblXPos);
		
		JLabel lblYPos = new JLabel("Y Pos");
		lblYPos.setBounds(15, 88, 69, 20);
		frmMousemover.getContentPane().add(lblYPos);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 52, 98, 26);
		frmMousemover.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(79, 88, 98, 26);
		frmMousemover.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton radioButton = new JRadioButton("Move");
		radioButton.setBounds(208, 31, 146, 29);
		frmMousemover.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Stop");
		radioButton_1.setBounds(208, 68, 138, 29);
		frmMousemover.getContentPane().add(radioButton_1);
	}
}
