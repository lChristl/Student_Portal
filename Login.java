import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField uname;
	private JPasswordField pass;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(121, 188, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		uname = new JTextField();
		uname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		uname.setBounds(161, 107, 261, 31);
		contentPane.add(uname);
		uname.setColumns(10);

		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = uname.getText();
				String password = pass.getText();

				if (user.equals("user") && password.equals("password")) {

					JOptionPane.showMessageDialog(null, "Success");

					// Creates the window "Portal"
					Portal second = new Portal();
					second.setVisible(true);
					dispose();
				}

				else

				{
					JOptionPane.showMessageDialog(null, "Failed");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(233, 240, 117, 31);
		contentPane.add(btnNewButton);

		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pass.setBounds(161, 180, 261, 31);
		contentPane.add(pass);

		lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(60, 115, 91, 14);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(60, 190, 91, 14);
		contentPane.add(lblNewLabel_1);
	}
}
