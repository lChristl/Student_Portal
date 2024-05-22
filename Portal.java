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

	private static final long serialVersionUID = 1L;
	private static JLabel welcome;
	private JPanel contentPane;
	private int mouseX, mouseY;
	private JLayeredPane layeredPane;
	private JPanel m1, m2, m3;
	String fullName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portal frame = new Portal(null);
					frame.setVisible(true);
//					frame.updateWelcomeLabelFromDatabase(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// ********************DATABASE-CONNECTION***************//
	static Connection conn;
	PreparedStatement pst;
	ResultSet rs;

	public void switchPanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	Color defaultcolor, clickedcolor, black, white;

	public void setWelcomeText(String firstName, String lastName) {
		String[] parts = fullName.split(" ");

		if (parts.length >= 2) {
			firstName = parts[0];
			lastName = parts[1];
			String welcomeMessage = "Welcome " + firstName + " " + lastName;
			welcome.setText(welcomeMessage);
		} else {
			// Handle cases where the full name cannot be split into first and last names
			welcome.setText("Welcome " + fullName);
		}
	}

	public Portal(Connection conn) {
		Portal.conn = conn;
		defaultcolor = new Color(255, 255, 255);
		clickedcolor = new Color(50, 50, 255);
		black = new Color(0, 0, 0);
		white = new Color(255, 255, 255);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

//*******************************||SET-ROUND-RECTANGLE-TO-PANEL||**********************************************//

		setUndecorated(true);
		setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 100, 100));

//*************************************************************************************************************//

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
		setContentPane(contentPane);
		contentPane.setLayout(null);

//*************************************************************************************************************//

		JPanel navypanel1 = new JPanel();
		navypanel1.setBounds(0, 0, 300, 720);
		navypanel1.setBackground(new Color(0, 27, 70));
		contentPane.add(navypanel1);
		navypanel1.setLayout(null);

		JPanel dashboardpanel = new JPanel();
		dashboardpanel.setBounds(33, 399, 234, 52);
		navypanel1.add(dashboardpanel);
		dashboardpanel.setLayout(null);

//**********************************||MOUSE-CLICK-ACTION||****************************************************//

		JLabel c1 = new JLabel("DASHBOARD");
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
		c1.setBounds(0, 0, 234, 52);
		c1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		dashboardpanel.add(c1);

		JPanel eventcalendarpanel = new JPanel();
		eventcalendarpanel.setBounds(33, 579, 234, 52);
		navypanel1.add(eventcalendarpanel);
		eventcalendarpanel.setLayout(null);

		JLabel c2 = new JLabel("EVENT CALENDAR");
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
		c2.setBounds(0, 0, 234, 52);
		c2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		eventcalendarpanel.add(c2);

		JPanel curriculumpanel = new JPanel();
		curriculumpanel.setBounds(33, 488, 234, 52);
		navypanel1.add(curriculumpanel);
		curriculumpanel.setLayout(null);

		JLabel c3 = new JLabel("CURRICULUM");
		c3.setBounds(0, 0, 234, 52);
		curriculumpanel.add(c3);
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

		JPanel navypanel2 = new JPanel();
		navypanel2.setBounds(980, 0, 300, 720);
		navypanel2.setBackground(new Color(0, 27, 70));
		contentPane.add(navypanel2);
		navypanel2.setLayout(null);

//******************************************************************************//		

//********************************||CLOSE-SOFTWARE||***************************//

		JButton exitbutton = new JButton("Exit\r\n");
		exitbutton.setBorder(null);
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

//****************************************************************************//		

		exitbutton.setForeground(Color.WHITE);
		exitbutton.setBackground(new Color(255, 81, 81));
		exitbutton.setBounds(190, 11, 73, 23);
		navypanel2.add(exitbutton);

		JLabel lblNewLabel = new JLabel("NAME:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(21, 229, 49, 31);
		navypanel2.add(lblNewLabel);

		JLabel lblStudentNo = new JLabel("STUDENT NUMBER:");
		lblStudentNo.setForeground(Color.WHITE);
		lblStudentNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblStudentNo.setBounds(21, 267, 150, 31);
		navypanel2.add(lblStudentNo);

		JLabel lblStrand = new JLabel("STRAND:");
		lblStrand.setForeground(Color.WHITE);
		lblStrand.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblStrand.setBounds(21, 335, 73, 31);
		navypanel2.add(lblStrand);

		JLabel lblSection = new JLabel("SECTION:");
		lblSection.setForeground(Color.WHITE);
		lblSection.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblSection.setBounds(21, 377, 73, 31);
		navypanel2.add(lblSection);

		JLabel lblSchoolYear = new JLabel("SCHOOL YEAR:");
		lblSchoolYear.setForeground(Color.WHITE);
		lblSchoolYear.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblSchoolYear.setBounds(21, 419, 150, 31);
		navypanel2.add(lblSchoolYear);

		JLabel lblContactNo = new JLabel("CONTACT NUMBER:");
		lblContactNo.setForeground(Color.WHITE);
		lblContactNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblContactNo.setBounds(21, 489, 150, 31);
		navypanel2.add(lblContactNo);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(75, 68, 150, 150);
		navypanel2.add(panel_7);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(75, 239, 150, 14);
		navypanel2.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(167, 277, 150, 14);
		navypanel2.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(89, 344, 150, 14);
		navypanel2.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(99, 386, 150, 14);
		navypanel2.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_4 = new JLabel("New label");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(140, 428, 150, 14);
		navypanel2.add(lblNewLabel_2_4);

		JLabel lblNewLabel_2_5 = new JLabel("New label");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_2_5.setBounds(177, 498, 113, 14);
		navypanel2.add(lblNewLabel_2_5);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(299, 0, 683, 720);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		m1 = new JPanel();
		m1.setBackground(new Color(255, 255, 255));
		layeredPane.add(m1, "name_24052310350600");
		m1.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 15, 663, 101);
		m1.add(panel);
		panel.setBackground(new Color(0, 27, 70));
		panel.setLayout(null);

		JLabel c1_1 = new JLabel("DASHBOARD");
		c1_1.setForeground(new Color(255, 255, 255));
		c1_1.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1.setBounds(214, 24, 234, 52);
		panel.add(c1_1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 27, 70));
		panel_1.setBounds(10, 131, 663, 574);
		m1.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 11, 643, 552);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(0, 27, 70));
		panel_4.setBounds(250, 112, 383, 429);
		panel_2.add(panel_4);

		JLabel c1_1_2 = new JLabel("SCHOOL ANNOUNCEMENTS");
		c1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_2.setForeground(Color.WHITE);
		c1_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		c1_1_2.setBounds(10, 11, 363, 52);
		panel_4.add(c1_1_2);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 27, 70));
		panel_6.setBounds(10, 112, 224, 199);
		panel_2.add(panel_6);

		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(new Color(0, 27, 70));
		panel_6_1.setBounds(10, 342, 224, 199);
		panel_2.add(panel_6_1);

		JLabel welcome = new JLabel("");
		welcome.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setBounds(49, 11, 544, 90);
		panel_2.add(welcome);

		m3 = new JPanel();
		m3.setBackground(new Color(255, 255, 255));
		layeredPane.add(m3, "name_24052350347900");
		m3.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(0, 27, 70));
		panel_5.setBounds(10, 15, 663, 101);
		m3.add(panel_5);

		JLabel c1_1_3 = new JLabel("EVENT CALENDAR");
		c1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_3.setForeground(Color.WHITE);
		c1_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1_3.setBounds(131, 24, 400, 52);
		panel_5.add(c1_1_3);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(new Color(0, 27, 70));
		panel_1_3.setBounds(10, 131, 663, 574);
		m3.add(panel_1_3);

		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setBounds(10, 11, 643, 552);
		panel_1_3.add(panel_2_3);

		m2 = new JPanel();
		m2.setBackground(new Color(255, 255, 255));
		layeredPane.add(m2, "name_24052371200600");
		m2.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(0, 27, 70));
		panel_3.setBounds(10, 15, 663, 101);
		m2.add(panel_3);

		JLabel c1_1_1 = new JLabel("CURRICULUM");
		c1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_1.setForeground(Color.WHITE);
		c1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1_1.setBounds(154, 24, 355, 52);
		panel_3.add(c1_1_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 27, 70));
		panel_1_1.setBounds(10, 131, 663, 574);
		m2.add(panel_1_1);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(10, 11, 643, 552);
		panel_1_1.add(panel_2_1);
		panel_2_1.setLayout(null);
	}
}
