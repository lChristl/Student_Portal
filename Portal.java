import java.awt.CardLayout;
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Portal extends JFrame {

	private JPanel contentPane;
	private int mouseX, mouseY;
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	private JLabel lblName; // Declare lblName as a class member variable
	private JPanel navypanel1_1;
	private JPanel dashboardpanel;
	private JLabel c1;
	private JPanel eventcalendarpanel;
	private JLabel c2;
	private JPanel curriculumpanel;
	private JLabel c3;
	private JPanel navypanel2;
	private JButton exitbutton;
	private JLabel lblNewLabel;
	private JLabel lblStudentNo;
	private JLabel lblStrand;
	private JLabel lblSection;
	private JLabel lblSchoolYear;
	private JLabel lblContactNo;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_4;
	private JLayeredPane layeredPane;
	private JPanel m1;
	private JPanel panelm1;
	private JLabel c1_1;
	private JPanel panelm12;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel c1_1_1;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel m3;
	private JPanel panelm31;
	private JLabel c1_1_2;
	private JPanel panelm32;
	private JPanel panel_2_1;
	private JPanel m2;
	private JPanel panelm21;
	private JLabel c1_1_3;
	private JPanel panelm22;
	private JPanel panel_2_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portal frame = new Portal(null, "John Doe");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Color defaultcolor, clickedcolor, black, white;

	public void switchPanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public Portal(Connection conn, String fullName) {
		this.conn = conn;

		defaultcolor = new Color(255, 255, 255);
		clickedcolor = new Color(50, 50, 255);
		black = new Color(0, 0, 0);
		white = new Color(255, 255, 255);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		navypanel1_1 = new JPanel();
		navypanel1_1.setLayout(null);
		navypanel1_1.setBackground(new Color(0, 27, 70));
		navypanel1_1.setBounds(0, 0, 300, 720);
		contentPane.add(navypanel1_1);

		dashboardpanel = new JPanel();
		dashboardpanel.setLayout(null);
		dashboardpanel.setBounds(33, 399, 234, 52);
		navypanel1_1.add(dashboardpanel);

		c1 = new JLabel("DASHBOARD");
		c1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(m1);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				dashboardpanel.setBackground(clickedcolor);
				c1.setForeground(white);
			}

			@Override
			public void mouseReleased(MouseEvent e) {

				dashboardpanel.setBackground(defaultcolor);
				c1.setForeground(black);
			}
		});
		c1.setHorizontalAlignment(SwingConstants.CENTER);
		c1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		c1.setBounds(0, 0, 234, 52);
		dashboardpanel.add(c1);

		eventcalendarpanel = new JPanel();
		eventcalendarpanel.setLayout(null);
		eventcalendarpanel.setBounds(33, 579, 234, 52);
		navypanel1_1.add(eventcalendarpanel);

		c2 = new JLabel("EVENT CALENDAR");
		c2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(m3);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				eventcalendarpanel.setBackground(clickedcolor);
				c2.setForeground(white);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				eventcalendarpanel.setBackground(defaultcolor);
				c2.setForeground(black);
			}
		});
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		c2.setBounds(0, 0, 234, 52);
		eventcalendarpanel.add(c2);

		curriculumpanel = new JPanel();
		curriculumpanel.setLayout(null);
		curriculumpanel.setBounds(33, 488, 234, 52);
		navypanel1_1.add(curriculumpanel);

		c3 = new JLabel("CURRICULUM");
		c3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(m2);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				curriculumpanel.setBackground(clickedcolor);
				c3.setForeground(white);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				curriculumpanel.setBackground(defaultcolor);
				c3.setForeground(black);
			}
		});
		c3.setHorizontalAlignment(SwingConstants.CENTER);
		c3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		c3.setBounds(0, 0, 234, 52);
		curriculumpanel.add(c3);

		navypanel2 = new JPanel();
		navypanel2.setLayout(null);
		navypanel2.setBackground(new Color(0, 27, 70));
		navypanel2.setBounds(980, 0, 300, 720);
		contentPane.add(navypanel2);

		exitbutton = new JButton("Exit\r\n");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitbutton.setForeground(Color.WHITE);
		exitbutton.setBorder(null);
		exitbutton.setBackground(new Color(255, 81, 81));
		exitbutton.setBounds(190, 11, 73, 23);
		navypanel2.add(exitbutton);

		lblNewLabel = new JLabel("NAME:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel.setBounds(21, 229, 49, 31);
		navypanel2.add(lblNewLabel);

		lblStudentNo = new JLabel("STUDENT NUMBER:");
		lblStudentNo.setForeground(Color.WHITE);
		lblStudentNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblStudentNo.setBounds(21, 267, 150, 31);
		navypanel2.add(lblStudentNo);

		lblStrand = new JLabel("STRAND:");
		lblStrand.setForeground(Color.WHITE);
		lblStrand.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblStrand.setBounds(21, 335, 73, 31);
		navypanel2.add(lblStrand);

		lblSection = new JLabel("SECTION:");
		lblSection.setForeground(Color.WHITE);
		lblSection.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblSection.setBounds(21, 377, 73, 31);
		navypanel2.add(lblSection);

		lblSchoolYear = new JLabel("SCHOOL YEAR:");
		lblSchoolYear.setForeground(Color.WHITE);
		lblSchoolYear.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblSchoolYear.setBounds(21, 419, 150, 31);
		navypanel2.add(lblSchoolYear);

		lblContactNo = new JLabel("CONTACT NUMBER:");
		lblContactNo.setForeground(Color.WHITE);
		lblContactNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblContactNo.setBounds(21, 489, 150, 31);
		navypanel2.add(lblContactNo);

		panel = new JPanel();
		panel.setBounds(75, 68, 150, 150);
		navypanel2.add(panel);

		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(75, 239, 150, 14);
		navypanel2.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(167, 277, 150, 14);
		navypanel2.add(lblNewLabel_2);

		lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(89, 344, 150, 14);
		navypanel2.add(lblNewLabel_2_1);

		lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(99, 386, 150, 14);
		navypanel2.add(lblNewLabel_2_2);

		lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(140, 428, 150, 14);
		navypanel2.add(lblNewLabel_2_3);

		lblNewLabel_2_4 = new JLabel("New label");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(177, 498, 113, 14);
		navypanel2.add(lblNewLabel_2_4);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(299, 0, 683, 720);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		m1 = new JPanel();
		m1.setLayout(null);
		m1.setBackground(Color.WHITE);
		layeredPane.add(m1, "name_13449560899400");

		panelm1 = new JPanel();
		panelm1.setLayout(null);
		panelm1.setBackground(new Color(0, 27, 70));
		panelm1.setBounds(10, 15, 663, 101);
		m1.add(panelm1);

		c1_1 = new JLabel("DASHBOARD");
		c1_1.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1.setForeground(Color.WHITE);
		c1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1.setBounds(214, 24, 234, 52);
		panelm1.add(c1_1);

		panelm12 = new JPanel();
		panelm12.setLayout(null);
		panelm12.setBackground(new Color(0, 27, 70));
		panelm12.setBounds(10, 131, 663, 574);
		m1.add(panelm12);

		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 11, 643, 552);
		panelm12.add(panel_3);

		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(0, 27, 70));
		panel_4.setBounds(250, 112, 383, 429);
		panel_3.add(panel_4);

		c1_1_1 = new JLabel("SCHOOL ANNOUNCEMENTS");
		c1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_1.setForeground(Color.WHITE);
		c1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		c1_1_1.setBounds(10, 11, 363, 52);
		panel_4.add(c1_1_1);

		panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 27, 70));
		panel_5.setBounds(10, 112, 224, 199);
		panel_3.add(panel_5);

		panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 27, 70));
		panel_6.setBounds(10, 342, 224, 199);
		panel_3.add(panel_6);

		lblName = new JLabel(""); // Initialize lblName
		lblName.setBounds(120, 52, 403, 24);
		panel_3.add(lblName);
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setBounds(120, 11, 403, 42);
		panel_3.add(lblWelcome);
		lblWelcome.setForeground(new Color(0, 0, 0));
		lblWelcome.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);

		m3 = new JPanel();
		m3.setLayout(null);
		m3.setBackground(Color.WHITE);
		layeredPane.add(m3, "name_13450562873800");

		panelm31 = new JPanel();
		panelm31.setLayout(null);
		panelm31.setBackground(new Color(0, 27, 70));
		panelm31.setBounds(10, 15, 663, 101);
		m3.add(panelm31);

		c1_1_2 = new JLabel("EVENT CALENDAR");
		c1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_2.setForeground(Color.WHITE);
		c1_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1_2.setBounds(131, 24, 400, 52);
		panelm31.add(c1_1_2);

		panelm32 = new JPanel();
		panelm32.setLayout(null);
		panelm32.setBackground(new Color(0, 27, 70));
		panelm32.setBounds(10, 131, 663, 574);
		m3.add(panelm32);

		panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(10, 11, 643, 552);
		panelm32.add(panel_2_1);

		m2 = new JPanel();
		m2.setLayout(null);
		m2.setBackground(Color.WHITE);
		layeredPane.add(m2, "name_13451017978300");

		panelm21 = new JPanel();
		panelm21.setLayout(null);
		panelm21.setBackground(new Color(0, 27, 70));
		panelm21.setBounds(10, 15, 663, 101);
		m2.add(panelm21);

		c1_1_3 = new JLabel("CURRICULUM");
		c1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_3.setForeground(Color.WHITE);
		c1_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1_3.setBounds(154, 24, 355, 52);
		panelm21.add(c1_1_3);

		panelm22 = new JPanel();
		panelm22.setLayout(null);
		panelm22.setBackground(new Color(0, 27, 70));
		panelm22.setBounds(10, 131, 663, 574);
		m2.add(panelm22);

		panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(10, 11, 643, 552);
		panelm22.add(panel_2_2);

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

		setWelcomeText(fullName);
	}

	private void setWelcomeText(String fullName) {
		String[] nameParts = fullName.split(" ");
		String firstName = nameParts[0];
		String lastName = nameParts.length > 1 ? nameParts[1] : "";

		lblName.setText(firstName + " " + lastName); // Update text of lblName
	}
}
