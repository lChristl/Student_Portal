package main;

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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
	private JPanel curriculumpanel;
	private JLabel c2;
	private JPanel navypanel2;
	private JButton exitbutton;
	private JLabel lblNewLabel;
	private JLabel lblStudentNo;
	private JLabel lblStrand;
	private JLabel lblSection;
	private JLabel lblSchoolYear;
	private JLabel lblContactNo;
	private JLabel lblname;
	private JLabel lblstudent;
	private JLabel lblstrand;
	private JLabel lblsection;
	private JLabel lblsy;
	private JLabel lblcontact;
	private JLayeredPane layeredPane;
	private JPanel m1;
	private JPanel panelm1;
	private JLabel c1_1;
	private JPanel panelm12;
	private JPanel panel_3;
	private JPanel m_ict;
	private JPanel panelm21;
	private JLabel c1_1_3;
	private JPanel panelm22;
	private JPanel panel_ict;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portal frame = new Portal(null, "John Doe", "studentname", "studentnumber", "strand", "section",
							"sy", "contactno.");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Color defaultcolor, clickedcolor, black, white;

	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel m_humms;
	private JPanel panelm31;
	private JLabel c1_1_2;
	private JPanel panelm32;
	private JPanel panel_humms;
	private JLabel headerLabel1_1;
	private JLabel headerLabel2_1;
	private JPanel m_abm;
	private JPanel panelm41;
	private JLabel c1_1_4;
	private JPanel panelm42;
	private JPanel panel_abm;
	private JLabel headerLabel1_2;
	private JLabel headerLabel2_2;
	private JPanel m_stem;
	private JPanel panelm51;
	private JLabel c1_1_5;
	private JPanel panelm52;
	private JPanel panel_stem;
	private JLabel headerLabel1_3;
	private JLabel headerLabel2_3;

	private JTable f_table_ict;
	private JTable s_table_ict;
	private JTable f_table_humms;
	private JTable s_table_humms;
	private JTable f_table_abm;
	private JTable s_table_abm;
	private JTable f_table_stem;
	private JTable s_table_stem;
	private JPanel m_gas;
	private JPanel panelm61;
	private JLabel c1_1_1;
	private JPanel panelm62;
	private JPanel panel_gas;
	private JLabel headerLabel1_4;
	private JLabel headerLabel2_4;
	private JTable f_table_gas;
	private JTable s_table_gas;

	public void switchPanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public Portal(Connection conn, String fullName, String studentname, String studentnumber, String strand,
			String section, String sy, String contactnumber) {
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
		dashboardpanel.setBackground(new Color(255, 255, 255));
		dashboardpanel.setLayout(null);
		dashboardpanel.setBounds(33, 549, 234, 52);
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

		curriculumpanel = new JPanel();
		curriculumpanel.setBackground(new Color(255, 255, 255));
		curriculumpanel.setLayout(null);
		curriculumpanel.setBounds(33, 638, 234, 52);
		navypanel1_1.add(curriculumpanel);

		c2 = new JLabel("CURRICULUM");
		c2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ("ICT".equalsIgnoreCase(lblstrand.getText())) {
					switchPanel(m_ict);
				}
				if ("GAS".equalsIgnoreCase(lblstrand.getText())) {
					switchPanel(m_gas);
				}
				if ("HUMMS".equalsIgnoreCase(lblstrand.getText())) {
					switchPanel(m_humms);
				}
				if ("ABM".equalsIgnoreCase(lblstrand.getText())) {
					switchPanel(m_abm);
				}
				if ("STEM".equalsIgnoreCase(lblstrand.getText())) {
					switchPanel(m_stem);
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				curriculumpanel.setBackground(clickedcolor);
				c2.setForeground(white);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				curriculumpanel.setBackground(defaultcolor);
				c2.setForeground(black);
			}
		});
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		c2.setBounds(0, 0, 234, 52);
		curriculumpanel.add(c2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\eclipse-workspace\\Student-portal\\src\\images\\largeiconccst.png"));
		lblNewLabel_1.setBounds(51, 25, 198, 200);
		navypanel1_1.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("OF  SCIENCE  AND  TECHNOLOGY");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_2.setBounds(0, 277, 300, 24);
		navypanel1_1.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("CLARK COLLEGE\r\n");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_3.setBounds(0, 236, 300, 42);
		navypanel1_1.add(lblNewLabel_3);

		navypanel2 = new JPanel();
		navypanel2.setBackground(new Color(0, 27, 70));
		navypanel2.setBounds(980, 0, 300, 720);
		contentPane.add(navypanel2);

		exitbutton = new JButton("Exit\r\n");
		exitbutton.setBounds(190, 11, 73, 23);
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		navypanel2.setLayout(null);
		exitbutton.setForeground(Color.WHITE);
		exitbutton.setBorder(null);
		exitbutton.setBackground(new Color(255, 81, 81));
		navypanel2.add(exitbutton);

		lblNewLabel = new JLabel("NAME:");
		lblNewLabel.setBounds(6, 40, 49, 31);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		navypanel2.add(lblNewLabel);

		lblStudentNo = new JLabel("STUDENT NUMBER:");
		lblStudentNo.setBounds(6, 78, 150, 31);
		lblStudentNo.setForeground(Color.WHITE);
		lblStudentNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		navypanel2.add(lblStudentNo);

		lblStrand = new JLabel("STRAND:");
		lblStrand.setBounds(6, 146, 73, 31);
		lblStrand.setForeground(Color.WHITE);
		lblStrand.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		navypanel2.add(lblStrand);

		lblSection = new JLabel("SECTION:");
		lblSection.setBounds(6, 188, 73, 31);
		lblSection.setForeground(Color.WHITE);
		lblSection.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		navypanel2.add(lblSection);

		lblSchoolYear = new JLabel("SCHOOL YEAR:");
		lblSchoolYear.setBounds(6, 230, 150, 31);
		lblSchoolYear.setForeground(Color.WHITE);
		lblSchoolYear.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		navypanel2.add(lblSchoolYear);

		lblContactNo = new JLabel("CONTACT NUMBER:");
		lblContactNo.setBounds(6, 300, 150, 31);
		lblContactNo.setForeground(Color.WHITE);
		lblContactNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		navypanel2.add(lblContactNo);

		lblname = new JLabel("New label");
		lblname.setBounds(57, 47, 150, 14);
		lblname.setForeground(Color.WHITE);
		lblname.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		navypanel2.add(lblname);

		lblstudent = new JLabel("New label");
		lblstudent.setBounds(149, 85, 150, 14);
		lblstudent.setForeground(Color.WHITE);
		lblstudent.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		navypanel2.add(lblstudent);

		lblstrand = new JLabel("New label");
		lblstrand.setBounds(74, 155, 201, 14);
		lblstrand.setForeground(Color.WHITE);
		lblstrand.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		navypanel2.add(lblstrand);

		lblsection = new JLabel("New label");
		lblsection.setBounds(84, 197, 150, 14);
		lblsection.setForeground(Color.WHITE);
		lblsection.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		navypanel2.add(lblsection);

		lblsy = new JLabel("New label");
		lblsy.setBounds(125, 239, 150, 14);
		lblsy.setForeground(Color.WHITE);
		lblsy.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		navypanel2.add(lblsy);

		lblcontact = new JLabel("New label");
		lblcontact.setBounds(162, 309, 113, 14);
		lblcontact.setForeground(Color.WHITE);
		lblcontact.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		navypanel2.add(lblcontact);

		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setBounds(21, 686, 89, 23);
		btnNewButton.setBackground(new Color(0, 70, 180));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login second = new Login();
				second.setVisible(true);
			}
		});
		navypanel2.add(btnNewButton);

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

		lblName = new JLabel(fullName); // Initialize lblName
		lblName.setBounds(65, 52, 513, 24);
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

		m_ict = new JPanel();
		m_ict.setLayout(null);
		m_ict.setBackground(Color.WHITE);
		layeredPane.add(m_ict, "name_13451017978300");

		panelm21 = new JPanel();
		panelm21.setLayout(null);
		panelm21.setBackground(new Color(0, 27, 70));
		panelm21.setBounds(10, 15, 663, 101);
		m_ict.add(panelm21);

		c1_1_3 = new JLabel("CURRICULUM IN ICT");
		c1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_3.setForeground(Color.WHITE);
		c1_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1_3.setBounds(130, 24, 403, 52);
		panelm21.add(c1_1_3);

		panelm22 = new JPanel();
		panelm22.setLayout(null);
		panelm22.setBackground(new Color(0, 27, 70));
		panelm22.setBounds(10, 131, 663, 574);
		m_ict.add(panelm22);

		panel_ict = new JPanel();
		panel_ict.setBackground(Color.WHITE);
		panel_ict.setBounds(10, 11, 643, 552);
		panelm22.add(panel_ict);
		panel_ict.setLayout(null);

		// ---------------------------||ICT||------------------------------//

		String[] firstsemcolumn_ict = { "CATEGORY", "SUBJECT" };
		Object[][] firstsemdata_ict = { { "CORE", "DISASTER READINESS AND RISK REDUCTION" },
				{ "CORE", "UNDERSTANDING CULTURE, SOCIETY AND POLITICS" },
				{ "CORE", "INTRODUCTION TO THE PHILOSOPHY OF THE HUMAN PERSON" },
				{ "CORE", "PHYSICAL EDUCATION AND HEALTH" },
				{ "CORE", "KOMUNIKASYON AT PANANALIKSIK SA WIKA AT KULTURANG PILIPINO" },
				{ "APPLIED", "FILIPINO SA PILING LARANGAN" }, { "APPLIED", "PRACTICAL RESEARCH 2" },
				{ "SPECIALIZED", "COMPUTER PROGRAMMING 1" }

		};

		f_table_ict = new JTable(firstsemdata_ict, firstsemcolumn_ict);
		f_table_ict.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane f_sem_ict = new JScrollPane(f_table_ict);
		f_sem_ict.setBounds(0, 62, 643, 159);
		panel_ict.add(f_sem_ict);

		String[] secondsemcolumn_ict = { "CATEGORY", "SUBJECT" };
		Object[][] secondsemdata_ict = { { "CORE", "CONTEMPORARY PHILIPPINE ARTS FROM THE REGIONS" },
				{ "CORE", "PHYSICAL EDUCATION AND HEALTH" },
				{ "APPLIED", "ENGLISH FOR ACADEMIC AND PROFESSIONAL PURPOSES" }, { "APPLIED", "ENTREPRENEURSHIP" },
				{ "APPLIED", "INQUIRIES, INVESTIGATIONS AND IMMERSION" }, { "SPECIALIZED", "COMPUTER PROGRAMMING 2" }

		};

		s_table_ict = new JTable(secondsemdata_ict, secondsemcolumn_ict);
		s_table_ict.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane s_sem_ict = new JScrollPane(s_table_ict);
		s_sem_ict.setBounds(0, 260, 643, 124);
		panel_ict.add(s_sem_ict);

		JLabel headerLabel1 = new JLabel("FIRST SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel1.setForeground(new Color(0, 27, 70));
		headerLabel1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel1.setBounds(7, 31, 629, 20);
		panel_ict.add(headerLabel1);

		JLabel headerLabel2 = new JLabel("SECOND SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel2.setForeground(new Color(0, 27, 70));
		headerLabel2.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel2.setBounds(0, 229, 629, 20);
		panel_ict.add(headerLabel2);

		m_humms = new JPanel();
		m_humms.setLayout(null);
		m_humms.setBackground(Color.WHITE);
		layeredPane.add(m_humms);

		panelm31 = new JPanel();
		panelm31.setLayout(null);
		panelm31.setBackground(new Color(0, 27, 70));
		panelm31.setBounds(10, 15, 663, 101);
		m_humms.add(panelm31);

		c1_1_2 = new JLabel("CURRICULUM IN HUMMS");
		c1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_2.setForeground(Color.WHITE);
		c1_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1_2.setBounds(95, 24, 473, 52);
		panelm31.add(c1_1_2);

		panelm32 = new JPanel();
		panelm32.setLayout(null);
		panelm32.setBackground(new Color(0, 27, 70));
		panelm32.setBounds(10, 131, 663, 574);
		m_humms.add(panelm32);

		panel_humms = new JPanel();
		// ------------------||HUMMS||-----------------//

		String[] firstsemcolumn_humms = { "CATEGORY", "SUBJECT" };
		Object[][] firstsemdata_humms = { { "CORE", "-" }, { "CORE", "-" }, { "CORE", "-" }, { "CORE", "-" },
				{ "CORE", "-" }, { "APPLIED", "-" }, { "APPLIED", "-" }, { "SPECIALIZED", "-" }

		};

		f_table_humms = new JTable(firstsemdata_humms, firstsemcolumn_humms);
		f_table_humms.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane f_sem_humms = new JScrollPane(f_table_humms);
		f_sem_humms.setBounds(0, 62, 643, 159);
		panel_humms.add(f_sem_humms);

		String[] secondsemcolumn_humms = { "CATEGORY", "SUBJECT" };
		Object[][] secondsemdata_humms = { { "CORE", "-" }, { "CORE", "-" }, { "APPLIED", "-" }, { "APPLIED", "-" },
				{ "APPLIED", "-" }, { "SPECIALIZED", "-" }

		};
		s_table_humms = new JTable(secondsemdata_humms, secondsemcolumn_humms);
		s_table_humms.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane s_sem_humms = new JScrollPane(s_table_humms);
		s_sem_humms.setBounds(0, 260, 643, 124);
		panel_humms.add(s_sem_humms);

		panel_humms.setLayout(null);
		panel_humms.setBackground(Color.WHITE);
		panel_humms.setBounds(10, 11, 643, 552);
		panelm32.add(panel_humms);

		headerLabel1_1 = new JLabel("FIRST SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel1_1.setForeground(new Color(0, 27, 70));
		headerLabel1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel1_1.setBounds(7, 31, 629, 20);
		panel_humms.add(headerLabel1_1);

		headerLabel2_1 = new JLabel("SECOND SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel2_1.setForeground(new Color(0, 27, 70));
		headerLabel2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel2_1.setBounds(0, 229, 629, 20);
		panel_humms.add(headerLabel2_1);

		m_abm = new JPanel();
		m_abm.setLayout(null);
		m_abm.setBackground(Color.WHITE);
		layeredPane.add(m_abm, "name_35699368361700");

		panelm41 = new JPanel();
		panelm41.setLayout(null);
		panelm41.setBackground(new Color(0, 27, 70));
		panelm41.setBounds(10, 15, 663, 101);
		m_abm.add(panelm41);

		c1_1_4 = new JLabel("CURRICULUM IN ABM");
		c1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_4.setForeground(Color.WHITE);
		c1_1_4.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1_4.setBounds(95, 24, 473, 52);
		panelm41.add(c1_1_4);

		panelm42 = new JPanel();
		panelm42.setLayout(null);
		panelm42.setBackground(new Color(0, 27, 70));
		panelm42.setBounds(10, 131, 663, 574);
		m_abm.add(panelm42);

		panel_abm = new JPanel();
		panel_abm.setLayout(null);
		panel_abm.setBackground(Color.WHITE);
		panel_abm.setBounds(10, 11, 643, 552);
		panelm42.add(panel_abm);

		// ------------------||ABM||-----------------//

		String[] firstsemcolumn_abm = { "CATEGORY", "SUBJECT" };
		Object[][] firstsemdata_abm = { { "CORE", "-" }, { "CORE", "-" }, { "CORE", "-" }, { "CORE", "-" },
				{ "CORE", "-" }, { "APPLIED", "-" }, { "APPLIED", "-" }, { "SPECIALIZED", "-" }

		};

		f_table_abm = new JTable(firstsemdata_abm, firstsemcolumn_abm);
		f_table_abm.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane f_sem_abm = new JScrollPane(f_table_abm);
		f_sem_abm.setBounds(0, 62, 643, 159);
		panel_abm.add(f_sem_abm);

		String[] secondsemcolumn_abm = { "CATEGORY", "SUBJECT" };
		Object[][] secondsemdata_abm = { { "CORE", "-" }, { "CORE", "-" }, { "APPLIED", "-" }, { "APPLIED", "-" },
				{ "APPLIED", "-" }, { "SPECIALIZED", "-" }

		};
		s_table_abm = new JTable(secondsemdata_abm, secondsemcolumn_abm);
		s_table_abm.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane s_sem_abm = new JScrollPane(s_table_abm);
		s_sem_abm.setBounds(0, 260, 643, 124);
		panel_abm.add(s_sem_abm);

		headerLabel1_2 = new JLabel("FIRST SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel1_2.setForeground(new Color(0, 27, 70));
		headerLabel1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel1_2.setBounds(7, 31, 629, 20);
		panel_abm.add(headerLabel1_2);

		headerLabel2_2 = new JLabel("SECOND SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel2_2.setForeground(new Color(0, 27, 70));
		headerLabel2_2.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel2_2.setBounds(0, 229, 629, 20);
		panel_abm.add(headerLabel2_2);

		m_stem = new JPanel();
		m_stem.setLayout(null);
		m_stem.setBackground(Color.WHITE);
		layeredPane.add(m_stem, "name_35792328331400");

		panelm51 = new JPanel();
		panelm51.setLayout(null);
		panelm51.setBackground(new Color(0, 27, 70));
		panelm51.setBounds(10, 15, 663, 101);
		m_stem.add(panelm51);

		c1_1_5 = new JLabel("CURRICULUM IN STEM");
		c1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_5.setForeground(Color.WHITE);
		c1_1_5.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1_5.setBounds(95, 24, 473, 52);
		panelm51.add(c1_1_5);

		panelm52 = new JPanel();
		panelm52.setLayout(null);
		panelm52.setBackground(new Color(0, 27, 70));
		panelm52.setBounds(10, 131, 663, 574);
		m_stem.add(panelm52);

		panel_stem = new JPanel();
		panel_stem.setLayout(null);
		panel_stem.setBackground(Color.WHITE);
		panel_stem.setBounds(10, 11, 643, 552);
		panelm52.add(panel_stem);

		// ------------------||STEM||-----------------//

		String[] firstsemcolumn_stem = { "CATEGORY", "SUBJECT" };
		Object[][] firstsemdata_stem = { { "CORE", "CONTEMPORARY PHILIPPINE ARTS FROM THE REGIONS	" },
				{ "CORE", "INTRODUCTION TO THE PHILOSOPHY OF THE HUMAN PERSON" },
				{ "CORE", "MEDIA AND INFORMATION LITERACY" }, { "CORE", "UNDERSTANDING CULTURE, SOCIETY AND POLITICS" },
				{ "CORE", "PHYSICAL EDUCATION AND HEALTH" }, { "APPLIED", "RESEARCH IN DAILY LIFE 2" },
				{ "APPLIED", "FILIPINO SA PILING LARANGAN" }, { "SPECIALIZED", "GENERAL PHYSICS 1" },
				{ "SPECIALIZED", "GENERAL BIOLOGY 1" }

		};

		f_table_stem = new JTable(firstsemdata_stem, firstsemcolumn_stem);
		f_table_stem.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane f_sem_stem = new JScrollPane(f_table_stem);
		f_sem_stem.setBounds(0, 62, 643, 180);
		panel_stem.add(f_sem_stem);

		String[] secondsemcolumn_stem = { "CATEGORY", "SUBJECT" };
		Object[][] secondsemdata_stem = { { "CORE", "-" }, { "CORE", "-" }, { "APPLIED", "-" }, { "APPLIED", "-" },
				{ "APPLIED", "-" }, { "SPECIALIZED", "-" }

		};
		s_table_stem = new JTable(secondsemdata_stem, secondsemcolumn_stem);
		s_table_stem.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane s_sem_stem = new JScrollPane(s_table_stem);
		s_sem_stem.setBounds(0, 293, 643, 124);
		panel_stem.add(s_sem_stem);

		headerLabel1_3 = new JLabel("FIRST SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel1_3.setForeground(new Color(0, 27, 70));
		headerLabel1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel1_3.setBounds(7, 31, 629, 20);
		panel_stem.add(headerLabel1_3);

		headerLabel2_3 = new JLabel("SECOND SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel2_3.setForeground(new Color(0, 27, 70));
		headerLabel2_3.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel2_3.setBounds(0, 262, 629, 20);
		panel_stem.add(headerLabel2_3);

		m_gas = new JPanel();
		m_gas.setLayout(null);
		m_gas.setBackground(Color.WHITE);
		layeredPane.add(m_gas, "name_111243073341100");

		panelm61 = new JPanel();
		panelm61.setLayout(null);
		panelm61.setBackground(new Color(0, 27, 70));
		panelm61.setBounds(10, 15, 663, 101);
		m_gas.add(panelm61);

		c1_1_1 = new JLabel("CURRICULUM IN STEM");
		c1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		c1_1_1.setForeground(Color.WHITE);
		c1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		c1_1_1.setBounds(95, 24, 473, 52);
		panelm61.add(c1_1_1);

		panelm62 = new JPanel();
		panelm62.setLayout(null);
		panelm62.setBackground(new Color(0, 27, 70));
		panelm62.setBounds(10, 131, 663, 574);
		m_gas.add(panelm62);

		panel_gas = new JPanel();
		panel_gas.setLayout(null);
		panel_gas.setBackground(Color.WHITE);
		panel_gas.setBounds(10, 11, 643, 552);
		panelm62.add(panel_gas);

		// ------------------||GAS||-----------------//

		String[] firstsemcolumn_gas = { "CATEGORY", "SUBJECT" };
		Object[][] firstsemdata_gas = { { "CORE", "-" }, { "CORE", "-" }, { "CORE", "-" }, { "CORE", "-" },
				{ "CORE", "-" }, { "APPLIED", "-" }, { "APPLIED", "-" }, { "SPECIALIZED", "-" }

		};
		f_table_gas = new JTable(firstsemdata_gas, firstsemcolumn_gas);
		f_table_gas.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane f_sem_gas = new JScrollPane(f_table_gas);
		f_sem_gas.setBounds(0, 62, 643, 180);
		panel_gas.add(f_sem_gas);

		String[] secondsemcolumn_gas = { "CATEGORY", "SUBJECT" };
		Object[][] secondsemdata_gas = { { "CORE", "-" }, { "CORE", "-" }, { "APPLIED", "-" }, { "APPLIED", "-" },
				{ "APPLIED", "-" }, { "SPECIALIZED", "-" }

		};

		s_table_gas = new JTable(secondsemdata_gas, secondsemcolumn_gas);
		s_table_gas.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		JScrollPane s_sem_gas = new JScrollPane(s_table_gas);
		s_sem_gas.setBounds(0, 293, 643, 124);
		panel_gas.add(s_sem_gas);

		headerLabel2_4 = new JLabel("SECOND SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel2_4.setForeground(new Color(0, 27, 70));
		headerLabel2_4.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel2_4.setBounds(0, 262, 629, 20);
		panel_gas.add(headerLabel2_4);

		headerLabel1_4 = new JLabel("FIRST SEMESTER SUBJECT INFORMATION", SwingConstants.CENTER);
		headerLabel1_4.setForeground(new Color(0, 27, 70));
		headerLabel1_4.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		headerLabel1_4.setBounds(7, 31, 629, 20);
		panel_gas.add(headerLabel1_4);

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

		setinfo(studentname, studentnumber, strand, section, sy, contactnumber);
	}

	private void setinfo(String studentname, String studentNumber, String strand, String section, String sy,
			String contactnumber) {
		lblname.setText(studentname);
		lblstudent.setText(studentNumber);
		lblstrand.setText(strand);
		lblsection.setText(section);
		lblsy.setText(sy);
		lblcontact.setText(contactnumber);
	}
}