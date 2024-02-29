import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
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
		layeredPane.add(p1, "name_2996315453700");

		JLabel lblNewLabel_5 = new JLabel("PANEL1");
		p1.add(lblNewLabel_5);

		JPanel p2 = new JPanel();
		layeredPane.add(p2, "name_2998324163400");

		JLabel lblNewLabel_6 = new JLabel("PANEL2");
		p2.add(lblNewLabel_6);

		JPanel p3 = new JPanel();
		layeredPane.add(p3, "name_2999651323700");

		JLabel lblPanel = new JLabel("PANEL3");
		p3.add(lblPanel);

		JPanel p4 = new JPanel();
		layeredPane.add(p4, "name_3000739084100");

		JLabel lblNewLabel_7 = new JLabel("PANEL4");
		p4.add(lblNewLabel_7);

		JPanel p5 = new JPanel();
		layeredPane.add(p5, "name_3001971543700");

		JLabel lblNewLabel_8 = new JLabel("PANEL5");
		p5.add(lblNewLabel_8);

		JPanel b1 = new JPanel();
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p1);
			}
		});
		b1.setBounds(0, 47, 292, 85);
		contentPane.add(b1);
		b1.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(123, 35, 120, 14);
		b1.add(lblNewLabel);

		JPanel b2 = new JPanel();
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p2);
			}
		});
		b2.setBounds(0, 174, 292, 85);
		contentPane.add(b2);
		b2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(119, 39, 124, 14);
		b2.add(lblNewLabel_1);

		JPanel b3 = new JPanel();
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p3);
			}
		});
		b3.setBounds(0, 301, 292, 85);
		contentPane.add(b3);
		b3.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(125, 39, 118, 14);
		b3.add(lblNewLabel_2);

		JPanel b4 = new JPanel();
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p4);
			}
		});
		b4.setBounds(0, 428, 292, 85);
		contentPane.add(b4);
		b4.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(145, 28, 98, 14);
		b4.add(lblNewLabel_3);

		JPanel b5 = new JPanel();
		b5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p5);
			}
		});
		b5.setBounds(0, 555, 292, 85);
		contentPane.add(b5);
		b5.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(118, 32, 125, 14);
		b5.add(lblNewLabel_4);
	}
}
