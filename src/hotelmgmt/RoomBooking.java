package hotelmgmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Checkbox;

public class RoomBooking {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	public void showWindow()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomBooking window = new RoomBooking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomBooking window = new RoomBooking();
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
	public RoomBooking() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setBounds(100, 100, 575, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
	
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Existing Users");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("New User?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnSignup = new JButton("sign-up");
		btnSignup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(222)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
					.addGap(146))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(151)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
					.addGap(228))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(139)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
					.addGap(146))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(151)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
					.addGap(236))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(139)
					.addComponent(passwordField_1, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
					.addGap(146))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(139)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
					.addGap(146))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(139)
					.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
					.addGap(263))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(139)
					.addComponent(btnSignup, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
					.addGap(146))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(89)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addGap(50)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addGap(38)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
					.addGap(17)
					.addComponent(passwordField_1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addGap(51)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
					.addGap(32)
					.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnSignup, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(70))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
	  }
}
