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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class GradeDBFRAME extends JFrame {

	private JPanel contentPane;
	private JTextField txdelete;
	private JTextField txid;
	private JTextField txschool;
	private JTextField txaddress;
	private JTextField txaddress2;
	private JTextField txeng;
	private JTextField txscie;
	private JTextField txmath;
	private JTextField txzip;
	private JTextField txss;
	private JTextField txentrep;
	private JTextField txresearch;
	private JTextField txcom;
	private JTextField txgwa;
	private JTextField txfil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeDBFRAME frame = new GradeDBFRAME();
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
	public GradeDBFRAME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTechnologicalUniversityOf = new JLabel("Technological University of the Phillipines\r\n");
		lblTechnologicalUniversityOf.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblTechnologicalUniversityOf.setBounds(154, 23, 673, 47);
		contentPane.add(lblTechnologicalUniversityOf);
		
		JLabel lblAdminPage = new JLabel("STUDENT DATABASE ADMIN");
		lblAdminPage.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblAdminPage.setBounds(344, 63, 366, 63);
		contentPane.add(lblAdminPage);
		
		JLabel lblDatabaseShow = new JLabel("Database Show");
		lblDatabaseShow.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblDatabaseShow.setBounds(671, 226, 139, 25);
		contentPane.add(lblDatabaseShow);
		
		JButton buttonshow = new JButton("Show Database");
		buttonshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GradeDB.DBGRADE();
			}
		});
		buttonshow.setBounds(618, 305, 249, 23);
		contentPane.add(buttonshow);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(562, 176, 366, 227);
		contentPane.add(panel);
		
		JLabel lblForDeleting = new JLabel("For Deleting");
		lblForDeleting.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblForDeleting.setBounds(693, 488, 111, 25);
		contentPane.add(lblForDeleting);
		
		txdelete = new JTextField();
		txdelete.setColumns(10);
		txdelete.setBounds(687, 571, 163, 20);
		contentPane.add(txdelete);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1.setBounds(661, 565, 30, 35);
		contentPane.add(lblId_1);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				
				 try{ 
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","password");
					 
					 String sql = "delete from guardinf where id = ?";
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
		btnDelete.setBounds(618, 630, 268, 23);
		contentPane.add(btnDelete);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(112, 128, 144));
		panel_1.setBounds(562, 437, 366, 265);
		contentPane.add(panel_1);
		
		JLabel lblId_1_1 = new JLabel("ID");
		lblId_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1.setBounds(89, 197, 30, 35);
		contentPane.add(lblId_1_1);
		
		txid = new JTextField();
		txid.setColumns(10);
		txid.setBounds(256, 201, 235, 20);
		contentPane.add(txid);
		
		txschool = new JTextField();
		txschool.setColumns(10);
		txschool.setBounds(256, 237, 235, 20);
		contentPane.add(txschool);
		
		JLabel lblId_1_1_1 = new JLabel("School Name");
		lblId_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_1.setBounds(89, 233, 110, 35);
		contentPane.add(lblId_1_1_1);
		
		JLabel lblId_1_1_1_1 = new JLabel("Address2");
		lblId_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_1_1.setBounds(89, 306, 86, 35);
		contentPane.add(lblId_1_1_1_1);
		
		JLabel lblId_1_1_2 = new JLabel("Address");
		lblId_1_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_2.setBounds(89, 270, 99, 35);
		contentPane.add(lblId_1_1_2);
		
		txaddress = new JTextField();
		txaddress.setColumns(10);
		txaddress.setBounds(256, 274, 235, 20);
		contentPane.add(txaddress);
		
		txaddress2 = new JTextField();
		txaddress2.setColumns(10);
		txaddress2.setBounds(256, 310, 235, 20);
		contentPane.add(txaddress2);
		
		JLabel lblId_1_1_1_1_1 = new JLabel("Science Grade");
		lblId_1_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_1_1_1.setBounds(89, 452, 124, 35);
		contentPane.add(lblId_1_1_1_1_1);
		
		JLabel lblId_1_1_2_1 = new JLabel("English Grade");
		lblId_1_1_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_2_1.setBounds(89, 416, 110, 35);
		contentPane.add(lblId_1_1_2_1);
		
		txeng = new JTextField();
		txeng.setColumns(10);
		txeng.setBounds(256, 420, 235, 20);
		contentPane.add(txeng);
		
		txscie = new JTextField();
		txscie.setColumns(10);
		txscie.setBounds(256, 456, 235, 20);
		contentPane.add(txscie);
		
		txmath = new JTextField();
		txmath.setColumns(10);
		txmath.setBounds(256, 383, 235, 20);
		contentPane.add(txmath);
		
		JLabel lblId_1_1_1_2 = new JLabel("Math Grade");
		lblId_1_1_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_1_2.setBounds(89, 379, 86, 35);
		contentPane.add(lblId_1_1_1_2);
		
		JLabel lblId_1_1_3 = new JLabel("Postal Code");
		lblId_1_1_3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_3.setBounds(89, 343, 99, 35);
		contentPane.add(lblId_1_1_3);
		
		txzip = new JTextField();
		txzip.setColumns(10);
		txzip.setBounds(256, 347, 235, 20);
		contentPane.add(txzip);
		
		JLabel lblId_1_1_1_1_2 = new JLabel("Entrepreneur Grade");
		lblId_1_1_1_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_1_1_2.setBounds(89, 598, 157, 35);
		contentPane.add(lblId_1_1_1_1_2);
		
		JLabel lblId_1_1_2_2 = new JLabel("Social Science Grade");
		lblId_1_1_2_2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_2_2.setBounds(89, 562, 180, 35);
		contentPane.add(lblId_1_1_2_2);
		
		txss = new JTextField();
		txss.setColumns(10);
		txss.setBounds(256, 566, 235, 20);
		contentPane.add(txss);
		
		txentrep = new JTextField();
		txentrep.setColumns(10);
		txentrep.setBounds(256, 602, 235, 20);
		contentPane.add(txentrep);
		
		txresearch = new JTextField();
		txresearch.setColumns(10);
		txresearch.setBounds(256, 529, 235, 20);
		contentPane.add(txresearch);
		
		JLabel lblId_1_1_1_3 = new JLabel("Research Grade");
		lblId_1_1_1_3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_1_3.setBounds(89, 525, 124, 35);
		contentPane.add(lblId_1_1_1_3);
		
		JLabel lblId_1_1_4 = new JLabel("Computer Grade");
		lblId_1_1_4.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_4.setBounds(89, 489, 110, 35);
		contentPane.add(lblId_1_1_4);
		
		txcom = new JTextField();
		txcom.setColumns(10);
		txcom.setBounds(256, 493, 235, 20);
		contentPane.add(txcom);
		
		txgwa = new JTextField();
		txgwa.setColumns(10);
		txgwa.setBounds(256, 675, 235, 20);
		contentPane.add(txgwa);
		
		txfil = new JTextField();
		txfil.setColumns(10);
		txfil.setBounds(256, 639, 235, 20);
		contentPane.add(txfil);
		
		JLabel lblId_1_1_2_2_1 = new JLabel("Filipino Grade");
		lblId_1_1_2_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_2_2_1.setBounds(89, 635, 99, 35);
		contentPane.add(lblId_1_1_2_2_1);
		
		JLabel lblId_1_1_1_1_2_1 = new JLabel("GWA");
		lblId_1_1_1_1_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1_1_1_1_2_1.setBounds(89, 671, 86, 35);
		contentPane.add(lblId_1_1_1_1_2_1);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = null;
				
				 try{ 
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","password");
					 String sql = " update gradeinf set school_name=?, address=?, address2=?, postal_code =?, Math_Grade=?, English_Grade=?, Science_Grade=?, Computer_Grade=?,Research_Grade=?, SocialScience_Grade=?, Entrepreneur_Grade=?, Filipino_Grade=?, GWA=? where id =? ";
					 
					 PreparedStatement statement = con.prepareStatement(sql);
					 statement.setString(1, txschool.getText());
					 statement.setString(2, txaddress.getText());
					 statement.setString(3, txaddress2.getText());
					 statement.setString(4, txzip.getText());
					 statement.setString(5, txmath.getText());
					 statement.setString(6, txeng.getText());
					 statement.setString(7, txscie.getText());
					 statement.setString(8, txcom.getText());
					 statement.setString(9, txresearch.getText());
					 statement.setString(10, txss.getText());
					 statement.setString(11, txentrep.getText());
					 statement.setString(12, txfil.getText());
					 statement.setString(13, txgwa.getText());
					 statement.setInt(14, Integer.parseInt(txid.getText()));
					 
					 statement.executeUpdate();
					 JOptionPane.showMessageDialog(null, "Update successfully.");
					 
					 con.close();
				 }
				 catch(Exception e1){ 
						JOptionPane.showMessageDialog(null, e1); 
					 }
			}
		});
		btnUpdate.setBounds(182, 740, 199, 23);
		contentPane.add(btnUpdate);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(112, 128, 144));
		panel_2.setBounds(43, 130, 485, 671);
		contentPane.add(panel_2);
		
		JLabel lblForUpdate = new JLabel("For Update");
		lblForUpdate.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		panel_2.add(lblForUpdate);
	}

}
