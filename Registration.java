import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
	private JTable table;
	private JScrollPane scrollPane;

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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1447, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Last_Name");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 49, 185, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("First_Name");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 112, 185, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Middle_Name");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 175, 185, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Student_Number");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 238, 185, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Strand");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 301, 185, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Date_Of_Birth");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 364, 185, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 427, 185, 14);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Citizenship");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(10, 490, 185, 14);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Contact_Number");
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(10, 553, 185, 14);
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Email_Address");
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(10, 616, 185, 14);
		contentPane.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Address");
		lblNewLabel_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(10, 679, 185, 14);
		contentPane.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("Guardian");
		lblNewLabel_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(10, 742, 185, 14);
		contentPane.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Relationship");
		lblNewLabel_12.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(10, 805, 185, 14);
		contentPane.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("Contact_Number");
		lblNewLabel_13.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(10, 868, 185, 14);
		contentPane.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("Previous_School_Attended");
		lblNewLabel_14.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(10, 931, 185, 14);
		contentPane.add(lblNewLabel_14);

		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField.setBounds(210, 43, 262, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_1.setBounds(210, 106, 262, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_2.setBounds(210, 169, 262, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_3.setBounds(210, 232, 262, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_4.setBounds(210, 295, 262, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_5.setBounds(210, 358, 262, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_6.setBounds(210, 421, 262, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(210, 484, 262, 20);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_8.setColumns(10);
		textField_8.setBounds(210, 547, 262, 20);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_9.setColumns(10);
		textField_9.setBounds(210, 610, 262, 20);
		contentPane.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_10.setColumns(10);
		textField_10.setBounds(210, 673, 262, 20);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_11.setColumns(10);
		textField_11.setBounds(210, 736, 262, 20);
		contentPane.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_12.setColumns(10);
		textField_12.setBounds(210, 799, 262, 20);
		contentPane.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_13.setColumns(10);
		textField_13.setBounds(210, 862, 262, 20);
		contentPane.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_14.setColumns(10);
		textField_14.setBounds(210, 925, 262, 20);
		contentPane.add(textField_14);

		JLabel lblNewLabel_15 = new JLabel("School_Address");
		lblNewLabel_15.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(10, 994, 185, 14);
		contentPane.add(lblNewLabel_15);

		textField_15 = new JTextField();
		textField_15.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_15.setBounds(210, 988, 262, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);

		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(525, 66, 896, 476);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
								null, null }, },
				new String[] { "ID", "Last_Name", "First_Name", "Middle_Name", "Student_Number", "Strand",
						"Date_Of_Birth", "Gender", "Citizenship", "Contact_Number", "Email_Address", "Address",
						"Guardian", "Relationship", "Contact_Number", "Previous_School_Attended", "School_Address" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(1000);
		table.getColumnModel().getColumn(1).setPreferredWidth(1000);
		table.getColumnModel().getColumn(2).setPreferredWidth(1000);
		table.getColumnModel().getColumn(3).setPreferredWidth(1000);
		table.getColumnModel().getColumn(4).setPreferredWidth(1000);
		table.getColumnModel().getColumn(5).setPreferredWidth(1000);
		table.getColumnModel().getColumn(6).setPreferredWidth(1000);
		table.getColumnModel().getColumn(7).setPreferredWidth(1000);
		table.getColumnModel().getColumn(8).setPreferredWidth(1000);
		table.getColumnModel().getColumn(9).setPreferredWidth(1000);
		table.getColumnModel().getColumn(10).setPreferredWidth(1000);
		table.getColumnModel().getColumn(11).setPreferredWidth(1000);
	}
}
