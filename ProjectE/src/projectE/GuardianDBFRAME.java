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

public class GuardianDBFRAME extends JFrame {

	private JPanel contentPane;
	private JTextField txdelete;
	private JTextField txid;
	private JTextField txfname;
	private JTextField txmname;
	private JTextField txlname;
	private JTextField txaddress;
	private JTextField txcity;
	private JTextField txprovince;
	private JTextField txzip;
	private JTextField txoccupation;
	private JTextField txnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuardianDBFRAME frame = new GuardianDBFRAME();
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
	
	public GuardianDBFRAME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminPage = new JLabel("STUDENT DATABASE ADMIN");
		lblAdminPage.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblAdminPage.setBounds(374, 69, 366, 63);
		contentPane.add(lblAdminPage);
		
		JLabel lblTechnologicalUniversityOf = new JLabel("Technological University of the Phillipines\r\n");
		lblTechnologicalUniversityOf.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblTechnologicalUniversityOf.setBounds(184, 29, 673, 47);
		contentPane.add(lblTechnologicalUniversityOf);
		
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
		btnDelete.setBounds(646, 616, 268, 23);
		contentPane.add(btnDelete);
		
		txdelete = new JTextField();
		txdelete.setColumns(10);
		txdelete.setBounds(715, 557, 163, 20);
		contentPane.add(txdelete);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId_1.setBounds(689, 551, 30, 35);
		contentPane.add(lblId_1);
		
		JLabel lblForDeleting = new JLabel("For Deleting");
		lblForDeleting.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblForDeleting.setBounds(721, 474, 111, 25);
		contentPane.add(lblForDeleting);
		
		JButton buttonshow = new JButton("Show Database");
		buttonshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuardianDB.DBGUARDIAN();
			}
		});
		buttonshow.setBounds(646, 319, 249, 23);
		contentPane.add(buttonshow);
		
		JLabel lblDatabaseShow = new JLabel("Database Show");
		lblDatabaseShow.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblDatabaseShow.setBounds(699, 240, 139, 25);
		contentPane.add(lblDatabaseShow);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(598, 183, 348, 252);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(112, 128, 144));
		panel_1.setBounds(598, 455, 348, 252);
		contentPane.add(panel_1);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblId.setBounds(79, 217, 86, 35);
		contentPane.add(lblId);
		
		txid = new JTextField();
		txid.setColumns(10);
		txid.setBounds(219, 223, 239, 20);
		contentPane.add(txid);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblFirstName.setBounds(79, 253, 86, 35);
		contentPane.add(lblFirstName);
		
		txfname = new JTextField();
		txfname.setColumns(10);
		txfname.setBounds(219, 259, 239, 20);
		contentPane.add(txfname);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblMiddleName.setBounds(79, 288, 121, 35);
		contentPane.add(lblMiddleName);
		
		txmname = new JTextField();
		txmname.setColumns(10);
		txmname.setBounds(219, 294, 239, 20);
		contentPane.add(txmname);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblLastName.setBounds(79, 324, 86, 35);
		contentPane.add(lblLastName);
		
		txlname = new JTextField();
		txlname.setColumns(10);
		txlname.setBounds(219, 330, 239, 20);
		contentPane.add(txlname);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblAddress.setBounds(79, 358, 121, 35);
		contentPane.add(lblAddress);
		
		txaddress = new JTextField();
		txaddress.setColumns(10);
		txaddress.setBounds(219, 364, 239, 20);
		contentPane.add(txaddress);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblCity.setBounds(79, 393, 121, 35);
		contentPane.add(lblCity);
		
		txcity = new JTextField();
		txcity.setColumns(10);
		txcity.setBounds(219, 399, 239, 20);
		contentPane.add(txcity);
		
		JLabel lblProvince = new JLabel("Province");
		lblProvince.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblProvince.setBounds(79, 428, 86, 35);
		contentPane.add(lblProvince);
		
		txprovince = new JTextField();
		txprovince.setColumns(10);
		txprovince.setBounds(219, 434, 239, 20);
		contentPane.add(txprovince);
		
		JLabel lblPostalCode = new JLabel("Postal Code");
		lblPostalCode.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblPostalCode.setBounds(79, 465, 86, 35);
		contentPane.add(lblPostalCode);
		
		txzip = new JTextField();
		txzip.setColumns(10);
		txzip.setBounds(219, 468, 239, 20);
		contentPane.add(txzip);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblEmail.setBounds(79, 500, 121, 35);
		contentPane.add(lblEmail);
		
		txoccupation = new JTextField();
		txoccupation.setColumns(10);
		txoccupation.setBounds(219, 503, 239, 20);
		contentPane.add(txoccupation);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNumber.setBounds(79, 534, 121, 35);
		contentPane.add(lblNumber);
		
		txnumber = new JTextField();
		txnumber.setColumns(10);
		txnumber.setBounds(219, 538, 239, 20);
		contentPane.add(txnumber);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				
				 try{ 
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","password");
					 String sql = " update guardinf set first_name =?, middle_name=?, last_name=?, address=?, city=?, province=?, postal_code=?, occupation=?, number=? where id =? ";
					 
					 PreparedStatement statement = con.prepareStatement(sql);
					 statement.setString(1, txfname.getText());
					 statement.setString(2, txmname.getText());
					 statement.setString(3, txlname.getText());
					 statement.setString(4, txaddress.getText());
					 statement.setString(5, txcity.getText());
					 statement.setString(6, txprovince.getText());
					 statement.setString(7, txzip.getText());
					 statement.setString(8, txoccupation.getText());
					 statement.setString(9, txnumber.getText());
					 statement.setInt(10, Integer.parseInt(txid.getText()));
					 
					 statement.executeUpdate();
					 JOptionPane.showMessageDialog(null, "Update successfully.");
					 
					 con.close();
				 }
				 catch(Exception e1){ 
						JOptionPane.showMessageDialog(null, e1); 
					 }
			}
		});
		btnUpdate.setBounds(137, 594, 249, 23);
		contentPane.add(btnUpdate);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(112, 128, 144));
		panel_2.setBounds(52, 144, 447, 568);
		contentPane.add(panel_2);
		
		JLabel lblForUpdate = new JLabel("For Update");
		lblForUpdate.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		panel_2.add(lblForUpdate);
	}

}
