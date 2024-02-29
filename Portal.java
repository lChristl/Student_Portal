import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Portal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel p1, p2, p3, p4, p5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portal frame = new Portal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void switchPanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public Portal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(121, 188, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(291, 0, 973, 681);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		JPanel p1 = new JPanel();
		p1.setBackground(new Color(255, 255, 255));
		layeredPane.add(p1, "name_2996315453700");

		JLabel lblNewLabel_5 = new JLabel("PANEL1");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		p1.add(lblNewLabel_5);

		JPanel p2 = new JPanel();
		p2.setBackground(new Color(255, 255, 255));
		layeredPane.add(p2, "name_2998324163400");

		JLabel lblNewLabel_6 = new JLabel("PANEL2");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		p2.add(lblNewLabel_6);

		JPanel p3 = new JPanel();
		p3.setBackground(new Color(255, 255, 255));
		layeredPane.add(p3, "name_2999651323700");

		JLabel lblPanel = new JLabel("PANEL3");
		lblPanel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		p3.add(lblPanel);

		JPanel p4 = new JPanel();
		p4.setBackground(new Color(255, 255, 255));
		layeredPane.add(p4, "name_3000739084100");

		JLabel lblNewLabel_7 = new JLabel("PANEL4");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		p4.add(lblNewLabel_7);

		JPanel p5 = new JPanel();
		p5.setBackground(new Color(255, 255, 255));
		layeredPane.add(p5, "name_3001971543700");

		JLabel lblNewLabel_8 = new JLabel("PANEL5");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		p5.add(lblNewLabel_8);

		JPanel b1 = new JPanel();
		b1.setBackground(new Color(255, 255, 255));
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p1);
			}
		});
		b1.setBounds(0, 47, 291, 85);
		contentPane.add(b1);
		b1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(76, 23, 139, 26);
		b1.add(lblNewLabel);

		JPanel b2 = new JPanel();
		b2.setBackground(new Color(255, 255, 255));
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p2);
			}
		});
		b2.setBounds(0, 174, 291, 85);
		contentPane.add(b2);
		b2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Attendance");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(76, 23, 141, 26);
		b2.add(lblNewLabel_1);

		JPanel b3 = new JPanel();
		b3.setBackground(new Color(255, 255, 255));
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p3);
			}
		});
		b3.setBounds(0, 301, 291, 85);
		contentPane.add(b3);
		b3.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Events");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(76, 23, 138, 26);
		b3.add(lblNewLabel_2);

		JPanel b4 = new JPanel();
		b4.setBackground(new Color(255, 255, 255));
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p4);
			}
		});
		b4.setBounds(0, 428, 291, 85);
		contentPane.add(b4);
		b4.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Registration");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(76, 23, 128, 26);
		b4.add(lblNewLabel_3);

		JPanel b5 = new JPanel();
		b5.setBackground(new Color(255, 255, 255));
		b5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p5);
			}
		});
		b5.setBounds(0, 555, 291, 85);
		contentPane.add(b5);
		b5.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Schedules");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(76, 23, 142, 26);
		b5.add(lblNewLabel_4);
	}
}
