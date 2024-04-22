import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private int mouseX, mouseY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1088, 623);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 27, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Last_Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(65, 46, 185, 14);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("First_Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(65, 109, 185, 14);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Middle_Name");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(65, 172, 185, 14);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Student_Number");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(65, 235, 185, 14);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Strand");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(65, 298, 185, 14);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Date_Of_Birth");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(65, 361, 185, 14);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(65, 424, 185, 14);
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Citizenship");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(65, 487, 185, 14);
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Contact_Number");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(537, 46, 185, 14);
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Email_Address");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(537, 109, 185, 14);
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Address");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(537, 172, 185, 14);
		lblNewLabel_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("Guardian");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setBounds(537, 235, 185, 14);
		lblNewLabel_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Relationship");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setBounds(537, 298, 185, 14);
		lblNewLabel_12.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("Contact_Number");
		lblNewLabel_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_13.setBounds(537, 361, 185, 14);
		lblNewLabel_13.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("Previous_School_Attended");
		lblNewLabel_14.setForeground(new Color(255, 255, 255));
		lblNewLabel_14.setBounds(537, 424, 185, 14);
		lblNewLabel_14.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_14);

		textField = new JTextField();
		textField.setBounds(265, 43, 262, 20);
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(265, 106, 262, 20);
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(265, 169, 262, 20);
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(265, 232, 262, 20);
		textField_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(265, 295, 262, 20);
		textField_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(265, 358, 262, 20);
		textField_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(265, 421, 262, 20);
		textField_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(265, 484, 262, 20);
		textField_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_7.setColumns(10);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setBounds(737, 43, 262, 20);
		textField_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_8.setColumns(10);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setBounds(737, 106, 262, 20);
		textField_9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_9.setColumns(10);
		contentPane.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setBounds(737, 169, 262, 20);
		textField_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_10.setColumns(10);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setBounds(737, 232, 262, 20);
		textField_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_11.setColumns(10);
		contentPane.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setBounds(737, 295, 262, 20);
		textField_12.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_12.setColumns(10);
		contentPane.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setBounds(737, 358, 262, 20);
		textField_13.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_13.setColumns(10);
		contentPane.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setBounds(737, 421, 262, 20);
		textField_14.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_14.setColumns(10);
		contentPane.add(textField_14);

		JLabel lblNewLabel_15 = new JLabel("School_Address");
		lblNewLabel_15.setForeground(new Color(255, 255, 255));
		lblNewLabel_15.setBounds(537, 487, 185, 14);
		lblNewLabel_15.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_15);

		textField_15 = new JTextField();
		textField_15.setBounds(737, 484, 262, 20);
		textField_15.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(textField_15);
		textField_15.setColumns(10);

		btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(828, 550, 171, 33);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Exit\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 81, 81));
		btnNewButton_1.setBounds(1005, 11, 73, 23);
		contentPane.add(btnNewButton_1);

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
