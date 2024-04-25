import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int mouseX, mouseY;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField2;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 27, 70, 220));
		panel.setBounds(0, 45, 480, 435);
		contentPane.add(panel);

		JLabel lblNewLabel_2 = new JLabel("Student ID No.");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(40, 70, 142, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(40, 100, 92, 14);
		panel.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(222, 70, 217, 20);
		panel.add(textField);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(222, 100, 217, 20);
		panel.add(passwordField);

		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(182, 346, 103, 23);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_3_1 = new JLabel("Confirm Password");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(40, 130, 142, 14);
		panel.add(lblNewLabel_3_1);

		passwordField2 = new JPasswordField();
		passwordField2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField2.setBounds(222, 130, 217, 20);
		panel.add(passwordField2);

		JLabel lblNewLabel_3_1_1 = new JLabel("First Name");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_1.setBounds(40, 160, 142, 14);
		panel.add(lblNewLabel_3_1_1);

		JLabel lblNewLabel_3_1_2 = new JLabel("Last Name");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_2.setBounds(40, 190, 142, 14);
		panel.add(lblNewLabel_3_1_2);

		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField_1.setBounds(222, 160, 217, 20);
		panel.add(passwordField_1);

		passwordField_2 = new JPasswordField();
		passwordField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField_2.setBounds(222, 190, 217, 20);
		panel.add(passwordField_2);

		JLabel lblNewLabel_2_1 = new JLabel("Register Account");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(40, 11, 217, 33);
		panel.add(lblNewLabel_2_1);

		JPanel navypanel1 = new JPanel();
		navypanel1.setLayout(null);
		navypanel1.setBackground(new Color(0, 27, 70));
		navypanel1.setBounds(-30, 0, 604, 45);
		contentPane.add(navypanel1);

		JButton btnNewButton = new JButton("Exit\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 81, 81));
		btnNewButton.setBounds(424, 11, 73, 23);
		navypanel1.add(btnNewButton);

		JPanel navypanel2 = new JPanel();
		navypanel2.setLayout(null);
		navypanel2.setBackground(new Color(0, 27, 70));
		navypanel2.setBounds(10, 57, 594, 464);
		navypanel1.add(navypanel2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-147, -76, 656, 633);
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\Student-Portal\\src\\image\\ccstbackg.jpg"));
		contentPane.add(lblNewLabel);

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
