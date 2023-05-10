package projectE;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class CourseDBFRAME extends JFrame {

	private JPanel contentPane;
	private JTextField txdelete;
	private JTextField txid;
	private JTextField txstud;
	private JTextField txgwa;
	private JTextField txcourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseDBFRAME frame = new CourseDBFRAME();
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
	public CourseDBFRAME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminPage = new JLabel("STUDENT DATABASE ADMIN");
		lblAdminPage.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblAdminPage.setBounds(357, 62, 366, 63);
		contentPane.add(lblAdminPage);
		
		JLabel lblTechnologicalUniversityOf = new JLabel("Technological University of the Phillipines\r\n");
		lblTechnologicalUniversityOf.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblTechnologicalUniversityOf.setBounds(167, 22, 673, 47);
		contentPane.add(lblTechnologicalUniversityOf);
		
		JLabel lblDatabaseShow = new JLabel("Database Show");
		lblDatabaseShow.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblDatabaseShow.setBounds(673, 224, 139, 25);
		contentPane.add(lblDatabaseShow);
		
		JButton buttonshow = new JButton("Show Database");
		buttonshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseDB.DBCOURSE();
			}
		});
		buttonshow.setBounds(620, 303, 249, 23);
		contentPane.add(buttonshow);
		
		JLabel lblForDeleting = new JLabel("For Deleting");
		lblForDeleting.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblForDeleting.setBounds(695, 458, 111, 25);
		contentPane.add(lblForDeleting);
		
		txdelete = new JTextField();
		txdelete.setColumns(10);
		txdelete.setBounds(689, 541, 163, 20);
		contentPane.add(txdelete);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1.setBounds(663, 535, 30, 35);
		contentPane.add(lblId_1);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				
				 try{ 
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","password");
					 
					 String sql = "delete from courseinf where id = ?";
					 PreparedStatement statement = con.prepareStatement(sql);
					 statement.setInt(1, Integer.parseInt(txdelete.getText()));
					 statement.executeUpdate();
					 
					 JOptionPane.showMessageDialog(null, "Record Deleted successfully. ");
					 con.close();
				 }
				 catch(Exception e1){ 
						JOptionPane.showMessageDialog(null, e1); 
					 }
			}
		});
		btnDelete.setBounds(620, 600, 268, 23);
		contentPane.add(btnDelete);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(567, 176, 358, 218);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(112, 128, 144));
		panel_1.setBounds(567, 427, 358, 247);
		contentPane.add(panel_1);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId.setBounds(67, 310, 86, 35);
		contentPane.add(lblId);
		
		txid = new JTextField();
		txid.setColumns(10);
		txid.setBounds(173, 310, 307, 20);
		contentPane.add(txid);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblStudentName.setBounds(67, 346, 121, 35);
		contentPane.add(lblStudentName);
		
		txstud = new JTextField();
		txstud.setColumns(10);
		txstud.setBounds(173, 346, 307, 20);
		contentPane.add(txstud);
		
		JLabel lblGwa = new JLabel("GWA");
		lblGwa.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblGwa.setBounds(67, 381, 121, 35);
		contentPane.add(lblGwa);
		
		txgwa = new JTextField();
		txgwa.setColumns(10);
		txgwa.setBounds(173, 381, 307, 20);
		contentPane.add(txgwa);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblCourse.setBounds(67, 417, 86, 35);
		contentPane.add(lblCourse);
		
		txcourse = new JTextField();
		txcourse.setColumns(10);
		txcourse.setBounds(173, 417, 307, 20);
		contentPane.add(txcourse);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = null;
				
				 try{ 
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","password");
					 String sql = " update courseinf set student_name =?, gwa=?, course=? where id =? ";
					 
					 PreparedStatement statement = con.prepareStatement(sql);
					 statement.setString(1, txstud.getText());
					 statement.setString(2, txgwa.getText());
					 statement.setString(3, txcourse.getText());
					
					 statement.setInt(4, Integer.parseInt(txid.getText()));
					 
					 statement.executeUpdate();
					 JOptionPane.showMessageDialog(null, "Update successfully.");
					 
					 con.close();
				 }
				 catch(Exception e1){ 
						JOptionPane.showMessageDialog(null, e1); 
					 }
			}
		});
		btnUpdate.setBounds(202, 475, 249, 23);
		contentPane.add(btnUpdate);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(112, 128, 144));
		panel_2.setBounds(41, 224, 505, 359);
		contentPane.add(panel_2);
		
		JLabel lblForUpdate = new JLabel("For Update");
		lblForUpdate.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		panel_2.add(lblForUpdate);
	}

}
