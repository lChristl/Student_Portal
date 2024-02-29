import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
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
	Color defaultcolor, clickedcolor, yellow, white;

	public Portal() {

		defaultcolor = new Color(121, 188, 255);
		clickedcolor = new Color(50, 50, 188);
		yellow = new Color(255, 220, 0);
		white = new Color(255, 255, 255);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(121, 188, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(291, 47, 973, 634);
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
		p4.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("REGISTSRATION");
		lblNewLabel_7.setBounds(337, 11, 298, 49);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		p4.add(lblNewLabel_7);

		JLabel lblNewLabel_9 = new JLabel(
				"<html>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"\r\n");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(170, 86, 632, 113);
		p4.add(lblNewLabel_9);

		JButton btnNewButton = new JButton("Register now");
		btnNewButton.setBounds(389, 434, 194, 43);
		p4.add(btnNewButton);

		JPanel p5 = new JPanel();
		p5.setBackground(new Color(255, 255, 255));
		layeredPane.add(p5, "name_3001971543700");

		JLabel lblNewLabel_8 = new JLabel("PANEL5");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		p5.add(lblNewLabel_8);

		JPanel b1 = new JPanel();
		b1.setBackground(new Color(121, 188, 255));
		b1.setBounds(0, 97, 291, 48);
		contentPane.add(b1);
		b1.setLayout(null);
		JLabel m11 = new JLabel("Dashboard");
		// ----------------------- BUTTON PRESS WILL CHANGE COLOR
		// ----------------------- //

		m11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				b1.setBackground(clickedcolor);
				m11.setForeground(yellow);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				b1.setBackground(defaultcolor);
				m11.setForeground(white);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p1);
			}
		});
		m11.setForeground(new Color(255, 255, 255));
		m11.setFont(new Font("Serif", Font.BOLD, 24));
		m11.setBounds(35, 11, 230, 26);
		b1.add(m11);

		JPanel b2 = new JPanel();
		b2.setBackground(new Color(121, 188, 255));

		b2.setBounds(0, 156, 291, 48);
		contentPane.add(b2);
		b2.setLayout(null);

		JLabel m22 = new JLabel("Attendance");
		m22.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				b2.setBackground(clickedcolor);
				m22.setForeground(yellow);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				b2.setBackground(defaultcolor);
				m22.setForeground(white);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p2);
			}
		});
		m22.setForeground(new Color(255, 255, 255));
		m22.setFont(new Font("Serif", Font.BOLD, 24));
		m22.setBounds(35, 11, 230, 26);
		b2.add(m22);

		JPanel b3 = new JPanel();
		b3.setBackground(new Color(121, 188, 255));

		b3.setBounds(0, 215, 291, 48);
		contentPane.add(b3);
		b3.setLayout(null);

		JLabel m33 = new JLabel("Events");
		m33.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				b3.setBackground(clickedcolor);
				m33.setForeground(yellow);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				b3.setBackground(defaultcolor);
				m33.setForeground(white);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p3);
			}
		});
		m33.setForeground(new Color(255, 255, 255));
		m33.setFont(new Font("Serif", Font.BOLD, 24));
		m33.setBounds(35, 11, 230, 26);
		b3.add(m33);

		JPanel b4 = new JPanel();
		b4.setBackground(new Color(121, 188, 255));
		b4.setBounds(0, 274, 291, 48);
		contentPane.add(b4);
		b4.setLayout(null);

		JLabel m44 = new JLabel("Registration");
		m44.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				b4.setBackground(clickedcolor);
				m44.setForeground(yellow);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				b4.setBackground(defaultcolor);
				m44.setForeground(white);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p4);
			}
		});
		m44.setForeground(new Color(255, 255, 255));
		m44.setFont(new Font("Serif", Font.BOLD, 24));
		m44.setBounds(35, 11, 230, 26);
		b4.add(m44);

		JPanel b5 = new JPanel();
		b5.setBackground(new Color(121, 188, 255));
		b5.setBounds(0, 333, 291, 48);
		contentPane.add(b5);
		b5.setLayout(null);

		JLabel m55 = new JLabel("Schedules");
		m55.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				b5.setBackground(clickedcolor);
				m55.setForeground(yellow);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				b5.setBackground(defaultcolor);
				m55.setForeground(white);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(p5);
			}
		});
		m55.setForeground(new Color(255, 255, 255));
		m55.setBounds(35, 8, 230, 32);
		m55.setFont(new Font("Serif", Font.BOLD, 24));
		b5.add(m55);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(0, 0, 1264, 48);
		contentPane.add(panel);
	}
}
