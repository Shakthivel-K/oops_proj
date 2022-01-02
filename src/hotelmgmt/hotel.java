package hotelmgmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class hotel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotel window = new hotel();
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
	public hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 1238, 642);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Restaurant");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Restaurant rest=new Restaurant();
				rest.showWindow();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnRoomBooking = new JButton("Room Booking");
		btnRoomBooking.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnStaffLogin = new JButton("Staff Login");
		btnStaffLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("Radisson RED");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(83)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnRoomBooking, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
								.addComponent(btnCheckout, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
							.addGap(275)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
							.addGap(9))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnStaffLogin, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
							.addGap(562))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
							.addGap(562)))
					.addGap(243))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
							.addGap(40)
							.addComponent(btnRoomBooking, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
							.addGap(42)
							.addComponent(btnCheckout, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
							.addGap(44)
							.addComponent(btnStaffLogin, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(230)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
					.addGap(88))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
