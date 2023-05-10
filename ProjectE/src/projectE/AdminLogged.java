package projectE;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogged extends JFrame {

	private JPanel contentPane;
	public static String toCon;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogged frame = new AdminLogged();
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
	public AdminLogged() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbstud = new JRadioButton("Student Information");
		rdbstud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudDBFRAME student = new StudDBFRAME();
				student.setVisible(true);
				dispose();
			}
		});
		rdbstud.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		rdbstud.setBounds(77, 347, 413, 65);
		contentPane.add(rdbstud);
		
		JRadioButton rdbguard = new JRadioButton("Guardian Information");
		rdbguard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuardianDBFRAME guard = new GuardianDBFRAME();
				guard.setVisible(true);
				dispose();
				
				
			}
		});
		rdbguard.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		rdbguard.setBounds(504, 346, 413, 65);
		contentPane.add(rdbguard);
		
		JRadioButton rdbcourse = new JRadioButton("Course Information");
		rdbcourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseDBFRAME course = new CourseDBFRAME();
				course.setVisible(true);
				dispose();
				
			}
		});
		rdbcourse.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		rdbcourse.setBounds(77, 415, 413, 65);
		contentPane.add(rdbcourse);
		
		JRadioButton rdbgrade = new JRadioButton("Grades Information");
		rdbgrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GradeDBFRAME grade = new GradeDBFRAME();
				grade.setVisible(true);
				dispose();
				
			}
		});
		rdbgrade.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		rdbgrade.setBounds(504, 414, 413, 65);
		contentPane.add(rdbgrade);
		
		JLabel lblTechnologicalUniversityOf = new JLabel("Technological University of the Phillipines\r\n");
		lblTechnologicalUniversityOf.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblTechnologicalUniversityOf.setBounds(171, 27, 874, 47);
		contentPane.add(lblTechnologicalUniversityOf);
		
		JLabel lblDatabaseAdmin = new JLabel(" DATABASE ADMIN");
		lblDatabaseAdmin.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblDatabaseAdmin.setBounds(361, 67, 366, 63);
		contentPane.add(lblDatabaseAdmin);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbgrade);
		group.add(rdbcourse);
		group.add(rdbstud);
		group.add(rdbguard);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(53, 221, 886, 408);
		contentPane.add(panel);
		
		
	}
}
