package projectE;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.SQLException;

public class StudDBFRAME extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JLabel lblTechnologicalUniversityOf;
	private JLabel lblAdminPage;
	private JLabel lblStudentDatabase;
	private JLabel lblId;
	private JLabel lblFirstName;
	private JLabel lblMiddleName;
	private JLabel lblBirthDay;
	private JLabel lblBirthMonth;
	private JLabel lblLastName;
	private JLabel lblAddress;
	private JLabel lblGender;
	private JLabel lblBirthYear;
	private JLabel lblEmail;
	private JLabel lblPostalCode;
	private JLabel lblProvince;
	private JLabel lblCity;
	private JLabel lblNumber;
	private JTextField txid;
	private JTextField txfname;
	private JTextField txlname;
	private JTextField txmname;
	private JTextField bmonth;
	private JTextField bday;
	private JTextField txprovince;
	private JTextField txcity;
	private JTextField txaddress;
	private JTextField txgender;
	private JTextField byear;
	private JTextField txnumber;
	private JTextField txemail;
	private JTextField txzip;
	private JButton btnUpdate;
	private JPanel panel_1;
	private JLabel lblDatabaseShow;
	private JLabel lblId_1;
	private JTextField txdelete;
	private JButton btnDelete;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblForDeleting;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudDBFRAME frame = new StudDBFRAME();
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
	public StudDBFRAME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(165, 42, 42));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonshow = new JButton("Show Database");
		buttonshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StudentDB.DBSTUDENT();
				
			
			}
		});
		buttonshow.setBounds(617, 293, 249, 23);
		contentPane.add(buttonshow);
		
		lblTechnologicalUniversityOf = new JLabel("Technological University of the Phillipines\r\n");
		lblTechnologicalUniversityOf.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblTechnologicalUniversityOf.setBounds(166, 32, 874, 47);
		contentPane.add(lblTechnologicalUniversityOf);
		
		lblAdminPage = new JLabel("STUDENT DATABASE ADMIN");
		lblAdminPage.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblAdminPage.setBounds(356, 72, 366, 63);
		contentPane.add(lblAdminPage);
		
		lblId = new JLabel("ID");
		lblId.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId.setBounds(63, 217, 86, 35);
		contentPane.add(lblId);
		
		lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblFirstName.setBounds(63, 253, 86, 35);
		contentPane.add(lblFirstName);
		
		lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblMiddleName.setBounds(63, 288, 121, 35);
		contentPane.add(lblMiddleName);
		
		lblBirthDay = new JLabel("Birth Day");
		lblBirthDay.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblBirthDay.setBounds(63, 395, 121, 35);
		contentPane.add(lblBirthDay);
		
		lblBirthMonth = new JLabel("Birth Month");
		lblBirthMonth.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblBirthMonth.setBounds(63, 360, 86, 35);
		contentPane.add(lblBirthMonth);
		
		lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblLastName.setBounds(63, 324, 86, 35);
		contentPane.add(lblLastName);
		
		lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblAddress.setBounds(63, 525, 121, 35);
		contentPane.add(lblAddress);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblGender.setBounds(63, 490, 86, 35);
		contentPane.add(lblGender);
		
		lblBirthYear = new JLabel("Birth Year");
		lblBirthYear.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblBirthYear.setBounds(63, 454, 86, 35);
		contentPane.add(lblBirthYear);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblEmail.setBounds(63, 696, 121, 35);
		contentPane.add(lblEmail);
		
		lblPostalCode = new JLabel("Postal Code");
		lblPostalCode.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblPostalCode.setBounds(63, 661, 86, 35);
		contentPane.add(lblPostalCode);
		
		lblProvince = new JLabel("Province");
		lblProvince.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblProvince.setBounds(63, 595, 86, 35);
		contentPane.add(lblProvince);
		
		lblCity = new JLabel("City");
		lblCity.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblCity.setBounds(63, 560, 121, 35);
		contentPane.add(lblCity);
		
		lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNumber.setBounds(63, 730, 121, 35);
		contentPane.add(lblNumber);
		
		txid = new JTextField();
		txid.setBounds(203, 223, 239, 20);
		contentPane.add(txid);
		txid.setColumns(10);
		
		txfname = new JTextField();
		txfname.setColumns(10);
		txfname.setBounds(203, 259, 239, 20);
		contentPane.add(txfname);
		
		txlname = new JTextField();
		txlname.setColumns(10);
		txlname.setBounds(203, 330, 239, 20);
		contentPane.add(txlname);
		
		txmname = new JTextField();
		txmname.setColumns(10);
		txmname.setBounds(203, 294, 239, 20);
		contentPane.add(txmname);
		
		bmonth = new JTextField();
		bmonth.setColumns(10);
		bmonth.setBounds(203, 366, 239, 20);
		contentPane.add(bmonth);
		
		bday = new JTextField();
		bday.setColumns(10);
		bday.setBounds(203, 401, 239, 20);
		contentPane.add(bday);
		
		txprovince = new JTextField();
		txprovince.setColumns(10);
		txprovince.setBounds(203, 601, 239, 20);
		contentPane.add(txprovince);
		
		txcity = new JTextField();
		txcity.setColumns(10);
		txcity.setBounds(203, 566, 239, 20);
		contentPane.add(txcity);
		
		txaddress = new JTextField();
		txaddress.setColumns(10);
		txaddress.setBounds(203, 531, 239, 20);
		contentPane.add(txaddress);
		
		txgender = new JTextField();
		txgender.setColumns(10);
		txgender.setBounds(203, 496, 239, 20);
		contentPane.add(txgender);
		
		byear = new JTextField();
		byear.setColumns(10);
		byear.setBounds(203, 460, 239, 20);
		contentPane.add(byear);
		
		txnumber = new JTextField();
		txnumber.setColumns(10);
		txnumber.setBounds(203, 734, 239, 20);
		contentPane.add(txnumber);
		
		txemail = new JTextField();
		txemail.setColumns(10);
		txemail.setBounds(203, 699, 239, 20);
		contentPane.add(txemail);
		
		txzip = new JTextField();
		txzip.setColumns(10);
		txzip.setBounds(203, 664, 239, 20);
		contentPane.add(txzip);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				
				 try{ 
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","password");
					 String sql = " update studinf set first_name =?, middle_name=?, last_name=?, birth_month=?, birth_day=?, birth_year=?, gender=?, address=?, city=?, province=?, postal_code=?, email=?, number=? where id =? ";
					 
					 PreparedStatement statement = con.prepareStatement(sql);
					 statement.setString(1, txfname.getText());
					 statement.setString(2, txmname.getText());
					 statement.setString(3, txlname.getText());
					 statement.setString(4, bmonth.getText());
					 statement.setString(5, bday.getText());
					 statement.setString(6, byear.getText());
					 statement.setString(7, txgender.getText());
					 statement.setString(8, txaddress.getText());
					 statement.setString(9, txcity.getText());
					 statement.setString(10, txprovince.getText());
					 statement.setString(11, txzip.getText());
					 statement.setString(12, txemail.getText());
					 statement.setString(13, txnumber.getText());
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
		btnUpdate.setBounds(166, 806, 276, 23);
		contentPane.add(btnUpdate);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(35, 163, 463, 687);
		contentPane.add(panel);
		
		lblStudentDatabase = new JLabel("For Update");
		panel.add(lblStudentDatabase);
		lblStudentDatabase.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(112, 128, 144));
		panel_1.setBounds(519, 163, 434, 232);
		contentPane.add(panel_1);
		
		lblDatabaseShow = new JLabel("Database Show");
		lblDatabaseShow.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		panel_1.add(lblDatabaseShow);
		
		lblId_1 = new JLabel("ID");
		lblId_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1.setBounds(648, 560, 30, 35);
		contentPane.add(lblId_1);
		
		txdelete = new JTextField();
		txdelete.setColumns(10);
		txdelete.setBounds(674, 566, 163, 20);
		contentPane.add(txdelete);
		
		btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				
				 try{ 
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","password");
					 
					 String sql = "delete from studinf where id = ?";
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
		btnDelete.setBounds(605, 625, 276, 23);
		contentPane.add(btnDelete);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(112, 128, 144));
		panel_2.setBounds(519, 473, 434, 263);
		contentPane.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(112, 128, 144));
		panel_2.add(panel_3);
		
		lblForDeleting = new JLabel("For Deleting");
		lblForDeleting.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		panel_3.add(lblForDeleting);
		
	
		
		
		
	}
}
