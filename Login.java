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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int mouseX, mouseY;
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	private JTextField uname;
	private JPasswordField pass;
	private final JPanel navypanel1 = new JPanel();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		conn = AccessDB.conn();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel navypanel2 = new JPanel();
		navypanel2.setLayout(null);
		navypanel2.setBackground(new Color(0, 27, 70));
		navypanel2.setBounds(0, 456, 854, 24);
		contentPane.add(navypanel2);
		navypanel1.setBackground(new Color(0, 27, 70));
		navypanel1.setBounds(0, 0, 854, 103);
		contentPane.add(navypanel1);
		navypanel1.setLayout(null);

		JButton btnNewButton_2 = new JButton("Exit\r\n");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\eclipse-workspace\\Student-portal\\src\\images\\ccst-icon.png"));
		lblNewLabel_5.setBounds(171, 11, 94, 82);
		navypanel1.add(lblNewLabel_5);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(255, 81, 81));
		btnNewButton_2.setBounds(742, 11, 73, 23);
		navypanel1.add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("CLARK COLLEGE\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(225, 11, 403, 42);
		navypanel1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("OF  SCIENCE  AND  TECHNOLOGY");
		lblNewLabel_1.setBounds(232, 53, 389, 24);
		navypanel1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 27, 70, 220));
		panel.setBounds(204, 133, 446, 213);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Student ID No.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(45, 61, 127, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(45, 89, 92, 14);
		panel.add(lblNewLabel_3);

		uname = new JTextField();
		uname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		uname.setBounds(182, 58, 217, 20);
		panel.add(uname);
		uname.setColumns(10);

		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pass.setBounds(182, 86, 217, 20);
		panel.add(pass);

		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = uname.getText();
				char[] password = pass.getPassword();
				String userpassword = String.valueOf(password);
				try {
					String sqlquery = "SELECT * FROM Userlogin WHERE user_name = ? and user_password = ? ";
					pst = conn.prepareStatement(sqlquery);
					pst.setString(1, username);
					pst.setString(2, userpassword);

					rs = pst.executeQuery();
					if (!rs.next()) {
						JOptionPane.showMessageDialog(null, "Username and Password is Incorrect");
					} else {
						JOptionPane.showMessageDialog(null, "Login Successful");
						String fullName = rs.getString("student_name");
						String studentname = rs.getString("student_name");
						String studentnumber = rs.getString("student_number");
						String strand = rs.getString("strand");
						String section = rs.getString("section");
						String sy = rs.getString("school_year");
						String contactnumber = rs.getString("contact_number");
						Portal second = new Portal(conn, fullName, studentname, studentnumber, strand, section, sy,
								contactnumber);
						second.setVisible(true);
						dispose();
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(80, 151, 103, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Signup second = new Signup();
				second.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(263, 151, 103, 23);
		panel.add(btnNewButton_1);

		JPanel navypanel2_1 = new JPanel();
		navypanel2_1.setLayout(null);
		navypanel2_1.setBackground(new Color(0, 27, 70));
		navypanel2_1.setBounds(0, 0, 7, 480);
		contentPane.add(navypanel2_1);

		JPanel navypanel2_1_1 = new JPanel();
		navypanel2_1_1.setLayout(null);
		navypanel2_1_1.setBackground(new Color(0, 27, 70));
		navypanel2_1_1.setBounds(847, 0, 7, 480);
		contentPane.add(navypanel2_1_1);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\eclipse-workspace\\Student-portal\\src\\images\\ccstbackg.jpg"));
		lblNewLabel_4.setBounds(0, 0, 854, 480);
		contentPane.add(lblNewLabel_4);

		setUndecorated(true);
		setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 100, 100));

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