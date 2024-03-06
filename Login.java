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

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */

	private JTextField uname;
	private JPasswordField pass;
	private final JPanel navypanel1 = new JPanel();

	public Login() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 854, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel logo = new JLabel("New label");
		logo.setBounds(10, 11, 100, 100);
		contentPane.add(logo);
		logo.setIcon(new ImageIcon("D:\\eclipse-workspace\\Student-Portal\\src\\image\\ccst-icon.png"));

		JPanel navypanel2 = new JPanel();
		navypanel2.setLayout(null);
		navypanel2.setBackground(new Color(0, 27, 70));
		navypanel2.setBounds(0, 410, 854, 70);
		contentPane.add(navypanel2);

		JLabel lblNewLabel_1 = new JLabel("OF  SCIENCE  AND  TECHNOLOGY");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_1.setBounds(232, 46, 389, 24);
		contentPane.add(lblNewLabel_1);
		navypanel1.setBackground(new Color(0, 27, 70));
		navypanel1.setBounds(0, 0, 854, 70);
		contentPane.add(navypanel1);
		navypanel1.setLayout(null);
		// ********************************||EXIT-BUTTON||********************************//
		JButton btnNewButton_2 = new JButton("Exit\r\n");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(255, 81, 81));
		btnNewButton_2.setBounds(742, 11, 73, 23);
		navypanel1.add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("CLARK COLLEGE\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(225, 5, 403, 42);
		navypanel1.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 27, 70, 220));
		panel.setBounds(196, 114, 446, 213);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(45, 61, 92, 14);
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

//******************************||SIGN-IN||*******************************************//
//*****************||OPENS-SECOND-PANEL-THEN-CLOSE-CURRENT-PANEL**********************//			
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = uname.getText();
				String password = pass.getText();

				if (user.equals("user") && password.equals("password")) {
					JOptionPane.showMessageDialog(null, "Login Successful!");

					Portal second = new Portal();
					second.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Login Error!");
				}
			}
		});
//*************************************************************************************//		
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(80, 151, 103, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(263, 151, 103, 23);
		panel.add(btnNewButton_1);
//*******************************||SET-ROUND-RECTANGLE-TO-PANEL||**********************************************//
		setUndecorated(true);
		setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 100, 100));
//********************************||FUNCTION-TO-ADD-MOUSE-DRAGGING-ON-THE-PANE||********************************//
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

		JLabel imgpanel = new JLabel("");
		imgpanel.setIcon(new ImageIcon("D:\\eclipse-workspace\\Student-Portal\\src\\image\\ccst.jpg"));
		imgpanel.setBounds(0, 0, 854, 480);
		contentPane.add(imgpanel);
	}
}
