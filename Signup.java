package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField f1;
	private JTextField f2;
	private JTextField f3;
	private JTextField f4;
	private JTextField f5;
	private JTextField f6;
	private JTextField f7;
	private JTextField f8;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private int mouseX, mouseY;
	Connection conn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Signup() {

		setResizable(false);
		conn = AccessDB.conn();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1088, 437);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 27, 70, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(63, 127, 185, 14);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(63, 190, 185, 14);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Full Name (F.MI.L)");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(63, 253, 185, 14);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Student Number");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(63, 316, 185, 14);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_8 = new JLabel("Strand");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(535, 127, 185, 14);
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Section");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(535, 190, 185, 14);
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("School Year");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(535, 253, 185, 14);
		lblNewLabel_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("Contact Number");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setBounds(535, 316, 185, 14);
		lblNewLabel_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_11);

		f1 = new JTextField();
		f1.setBounds(263, 124, 262, 20);
		f1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(f1);
		f1.setColumns(10);

		f2 = new JTextField();
		f2.setBounds(263, 187, 262, 20);
		f2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(f2);
		f2.setColumns(10);

		f3 = new JTextField();
		f3.setBounds(263, 250, 262, 20);
		f3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(f3);
		f3.setColumns(10);

		f4 = new JTextField();
		f4.setBounds(263, 313, 262, 20);
		f4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(f4);
		f4.setColumns(10);

		f5 = new JTextField();
		f5.setBounds(735, 124, 262, 20);
		f5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		f5.setColumns(10);
		contentPane.add(f5);

		f6 = new JTextField();
		f6.setBounds(735, 187, 262, 20);
		f6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		f6.setColumns(10);
		contentPane.add(f6);

		f7 = new JTextField();
		f7.setBounds(735, 250, 262, 20);
		f7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		f7.setColumns(10);
		contentPane.add(f7);

		f8 = new JTextField();
		f8.setBounds(735, 313, 262, 20);
		f8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		f8.setColumns(10);
		contentPane.add(f8);

		btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Statement st = conn.createStatement();
					String name = f1.getText();
					String password = f2.getText();
					String s_name = f3.getText();
					String s_number = f4.getText();
					String strand = f5.getText();
					String section = f6.getText();
					String sy = f7.getText();
					String contact = f8.getText();

					String query = "INSERT INTO Userlogin(user_name, user_password, student_name, student_number, "
							+ "strand, section, school_year, contact_number) VALUES ('" + name + "', '" + password
							+ "', '" + s_name + "', '" + s_number + "','" + strand + "','" + section + "', '" + sy
							+ "', '" + contact + "')";
					System.out.println("Executing query: " + query);

					int rowsAffected = st.executeUpdate(query);

					if (rowsAffected > 0) {
						System.out.println("Insert successful.");
					} else {
						System.out.println("Insert failed.");
					}

					st.close(); // Closing the Statement
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 27, 70));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(826, 371, 171, 33);
		contentPane.add(btnNewButton);

		JPanel navypanel1 = new JPanel();
		navypanel1.setLayout(null);
		navypanel1.setBackground(new Color(0, 27, 70));
		navypanel1.setBounds(0, 0, 1088, 88);
		contentPane.add(navypanel1);

		ImageIcon ccsticon = new ImageIcon(getClass().getResource("/images/ccst-icon.png"));
		JLabel icon = new JLabel(ccsticon);
		icon.setBounds(280, 0, 92, 88);
		navypanel1.add(icon);

		JLabel lblNewLabel_16 = new JLabel("CLARK COLLEGE\r\n");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setForeground(Color.WHITE);
		lblNewLabel_16.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel_16.setBounds(342, 7, 403, 42);
		navypanel1.add(lblNewLabel_16);

		JLabel lblNewLabel_1_1 = new JLabel("OF  SCIENCE  AND  TECHNOLOGY");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(349, 56, 389, 24);
		navypanel1.add(lblNewLabel_1_1);

		btnNewButton_1 = new JButton("Exit\r\n");
		btnNewButton_1.setBounds(993, 11, 73, 23);
		navypanel1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 81, 81));

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login second = new Login();
				second.setVisible(true);
				dispose();
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnCancel.setBackground(new Color(0, 27, 70));
		btnCancel.setBounds(644, 371, 171, 33);
		contentPane.add(btnCancel);

		// *******************************||SET-ROUND-RECTANGLE-TO-PANEL||**********************************************//
		setUndecorated(true);
		setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50));
		// ********************************||FUNCTION-TO-ADD-MOUSE-DRAGGING-ON-THE-PANE||********************************//
		contentPane.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});

		contentPane.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen() - mouseX;
				int y = e.getYOnScreen() - mouseY;
				setLocation(x, y);
			}
		});

	}
}
