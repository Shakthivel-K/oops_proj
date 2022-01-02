package hotelmgmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Restaurant {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void showWindow()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
					Restaurant window = new Restaurant();
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
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public   void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1393, 722);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Chinese");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnNorthIndian = new JButton("North Indian");
		btnNorthIndian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnSouthIndian = new JButton("South Indian");
		btnSouthIndian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnContinental = new JButton("Continental");
		btnContinental.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnContinental.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(144)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
							.addGap(129)
							.addComponent(btnNorthIndian, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnSouthIndian, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
							.addGap(129)
							.addComponent(btnContinental, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)))
					.addGap(460))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
						.addComponent(btnNorthIndian, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
					.addGap(60)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSouthIndian, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
						.addComponent(btnContinental, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
					.addGap(80))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
