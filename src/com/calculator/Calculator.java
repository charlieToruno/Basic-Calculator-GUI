package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField txtScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Create the main Frame
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 360, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Create the Screen Text
		txtScreen = new JTextField();
		txtScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtScreen.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtScreen.setBounds(12, 10, 316, 34);
		frame.getContentPane().add(txtScreen);
		txtScreen.setColumns(10);
		
		//Row1
		JButton btnBack = new JButton("\u2190");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(12, 54, 70, 49);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnClear.setBounds(94, 54, 70, 49);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercen = new JButton("%");
		btnPercen.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPercen.setBounds(176, 54, 70, 49);
		frame.getContentPane().add(btnPercen);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAdd.setBounds(258, 54, 70, 49);
		frame.getContentPane().add(btnAdd);
		
		//Row2
		JButton btnSeven = new JButton("7");
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSeven.setBounds(12, 113, 70, 49);
		frame.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnEight.setBounds(94, 113, 70, 49);
		frame.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNine.setBounds(176, 113, 70, 49);
		frame.getContentPane().add(btnNine);
		
		JButton btnSus = new JButton("-");
		btnSus.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSus.setBounds(258, 113, 70, 49);
		frame.getContentPane().add(btnSus);
		
		//Row3
		JButton btnFour = new JButton("4");
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnFour.setBounds(12, 172, 70, 49);
		frame.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnFive.setBounds(94, 172, 70, 49);
		frame.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSix.setBounds(176, 172, 70, 49);
		frame.getContentPane().add(btnSix);
		
		JButton btnMult = new JButton("X");
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnMult.setBounds(258, 172, 70, 49);
		frame.getContentPane().add(btnMult);
		
		//Row4
		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnOne.setBounds(12, 231, 70, 49);
		frame.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnTwo.setBounds(94, 231, 70, 49);
		frame.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnThree.setBounds(176, 231, 70, 49);
		frame.getContentPane().add(btnThree);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDiv.setBounds(258, 231, 70, 49);
		frame.getContentPane().add(btnDiv);
		
		//Row5
		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnZero.setBounds(12, 290, 70, 49);
		frame.getContentPane().add(btnZero);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDot.setBounds(94, 290, 70, 49);
		frame.getContentPane().add(btnDot);
		
		JButton btnPosNeg = new JButton("\u00B1");
		btnPosNeg.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPosNeg.setBounds(176, 290, 70, 49);
		frame.getContentPane().add(btnPosNeg);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnEqual.setBounds(258, 290, 70, 49);
		frame.getContentPane().add(btnEqual);
	}
}
