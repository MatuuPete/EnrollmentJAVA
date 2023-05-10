package projectE;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnrollmentProject extends JFrame {

	private JPanel contentPane;
	public static JTextField mname;
	public static JTextField lname;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	public static JComboBox cbDay;
	public static JComboBox cbYear;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	public static JTextField fname;
	public static JComboBox cbGender;
	public static JTextField txaddress;
	public static JTextField txcity;
	public static JTextField txprovince;
	public static JTextField txpostal;
	public static JComboBox cbMonth;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	public static JTextField txemail;
	private JTextField textField_8;
	public static JTextField txnumber;
	private JLabel lblNewLabel_2_1_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnrollmentProject frame = new EnrollmentProject();
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
	public EnrollmentProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration Form");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblNewLabel.setBounds(291, 21, 447, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(53, 116, 155, 25);
		contentPane.add(lblNewLabel_1);
		
		fname = new JTextField();
		fname.setBounds(53, 152, 283, 38);
		contentPane.add(fname);
		fname.setColumns(10);
		
		mname = new JTextField();
		mname.setColumns(10);
		mname.setBounds(348, 152, 283, 38);
		contentPane.add(mname);
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(641, 152, 283, 38);
		contentPane.add(lname);
		
		lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(53, 201, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Middle Name");
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(348, 200, 102, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Last Name");
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(641, 201, 102, 14);
		contentPane.add(lblNewLabel_4);
		
		cbMonth = new JComboBox();
		cbMonth.setForeground(new Color(0, 0, 0));
		cbMonth.setBackground(new Color(245, 245, 245));
		
		
		//---MONTH ADD ITEM--
		cbMonth.addItem(" ");
		cbMonth.addItem("January");
		cbMonth.addItem("February");
		cbMonth.addItem("March");
		cbMonth.addItem("April");
		cbMonth.addItem("May");
		cbMonth.addItem("June");
		cbMonth.addItem("July");
		cbMonth.addItem("August");
		cbMonth.addItem("September");
		cbMonth.addItem("October");
		cbMonth.addItem("November");
		cbMonth.addItem("December");
		cbMonth.setBackground(Color.WHITE);
		
		cbMonth.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		cbMonth.setBounds(53, 290, 125, 31);
		contentPane.add(cbMonth);
		
		lblNewLabel_5 = new JLabel("Birth Date");
		lblNewLabel_5.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(53, 254, 155, 25);
		contentPane.add(lblNewLabel_5);
		
		//---DAY ADD ITEM--
		cbDay = new JComboBox();
		cbDay.setBackground(Color.WHITE);
		cbDay.addItem(" ");
		cbDay.addItem("1");
		cbDay.addItem("2");
		cbDay.addItem("3");
		cbDay.addItem("4");
		cbDay.addItem("5");
		cbDay.addItem("6");
		cbDay.addItem("7");
		cbDay.addItem("8");
		cbDay.addItem("9");
		cbDay.addItem("10");
		cbDay.addItem("11");
		cbDay.addItem("12");
		cbDay.addItem("13");
		cbDay.addItem("14");
		cbDay.addItem("15");
		cbDay.addItem("16");
		cbDay.addItem("17");
		cbDay.addItem("18");
		cbDay.addItem("19");
		cbDay.addItem("20");
		cbDay.addItem("21");
		cbDay.addItem("22");
		cbDay.addItem("23");
		cbDay.addItem("24");
		cbDay.addItem("25");
		cbDay.addItem("26");
		cbDay.addItem("27");
		cbDay.addItem("28");
		cbDay.addItem("29");
		cbDay.addItem("30");
		cbDay.addItem("31");
		
		
		
		cbDay.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		cbDay.setBounds(188, 290, 125, 31);
		contentPane.add(cbDay);
		
		
		//---YEAR ADD ITEM--
		cbYear = new JComboBox();
		cbYear.setBackground(Color.WHITE);
		cbYear.addItem(" ");
		cbYear.addItem("1990");
		cbYear.addItem("1991");
		cbYear.addItem("1992");
		cbYear.addItem("1993");
		cbYear.addItem("1994");
		cbYear.addItem("1995");
		cbYear.addItem("1996");
		cbYear.addItem("1997");
		cbYear.addItem("1998");
		cbYear.addItem("1999");
		cbYear.addItem("2000");
		cbYear.addItem("2001");
		cbYear.addItem("2002");
		cbYear.addItem("2003");
		cbYear.addItem("2004");
		cbYear.addItem("2005");
		cbYear.addItem("2006");
		cbYear.addItem("2007");
		cbYear.addItem("2008");
		cbYear.addItem("2009");
		cbYear.addItem("2010");
		cbYear.addItem("2011");
		cbYear.addItem("2012");
		cbYear.addItem("2013");
		cbYear.addItem("2014");
		cbYear.addItem("2015");
		
		
		
		cbYear.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		cbYear.setBounds(323, 290, 125, 31);
		contentPane.add(cbYear);
		
		lblNewLabel_6 = new JLabel("Month");
		lblNewLabel_6.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(53, 329, 79, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Day");
		lblNewLabel_7.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(188, 329, 79, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Year");
		lblNewLabel_8.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(323, 329, 79, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Gender");
		lblNewLabel_9.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(525, 254, 155, 25);
		contentPane.add(lblNewLabel_9);
		
		cbGender = new JComboBox();
		cbGender.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		cbGender.setBackground(Color.WHITE);
		cbGender.addItem(" ");
		cbGender.addItem("Male");
		cbGender.addItem("Female");
		
		cbGender.setBounds(525, 290, 260, 31);
		contentPane.add(cbGender);
		
		JLabel lblNewLabel_5_1 = new JLabel("Address");
		lblNewLabel_5_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(53, 376, 155, 25);
		contentPane.add(lblNewLabel_5_1);
		
		txaddress = new JTextField();
		txaddress.setColumns(10);
		txaddress.setBounds(53, 412, 871, 38);
		contentPane.add(txaddress);
		
		txcity = new JTextField();
		txcity.setColumns(10);
		txcity.setBounds(53, 499, 283, 38);
		contentPane.add(txcity);
		
		txprovince = new JTextField();
		txprovince.setColumns(10);
		txprovince.setBounds(348, 499, 283, 38);
		contentPane.add(txprovince);
		
		txpostal = new JTextField();
		txpostal.setColumns(10);
		txpostal.setBounds(641, 499, 283, 38);
		contentPane.add(txpostal);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address Line");
		lblNewLabel_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(53, 461, 102, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("City");
		lblNewLabel_2_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1_1.setBounds(53, 548, 102, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Province");
		lblNewLabel_2_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1_2.setBounds(348, 547, 102, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Postal Zip Code");
		lblNewLabel_2_1_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1_2_1.setBounds(641, 547, 102, 14);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		lblNewLabel_10 = new JLabel("Student E-mail");
		lblNewLabel_10.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(53, 608, 155, 25);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Mobile Number");
		lblNewLabel_11.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(494, 608, 155, 25);
		contentPane.add(lblNewLabel_11);
		
		txemail = new JTextField();
		txemail.setColumns(10);
		txemail.setBounds(53, 644, 430, 38);
		contentPane.add(txemail);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(53, 412, 430, 38);
		contentPane.add(textField_8);
		
		txnumber = new JTextField();
		txnumber.setColumns(10);
		txnumber.setBounds(494, 644, 430, 38);
		contentPane.add(txnumber);
		
		lblNewLabel_2_1_3 = new JLabel("example@example.com");
		lblNewLabel_2_1_3.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1_3.setBounds(53, 693, 173, 14);
		contentPane.add(lblNewLabel_2_1_3);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveData.SaveDB();
			}
		});

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int YesorNo = JOptionPane.showConfirmDialog(null, "Are you sure to insert data?","insert data", JOptionPane.YES_NO_OPTION);
				if(YesorNo == 0) {
					JOptionPane.showMessageDialog(null, "Data is successfully inserted");
					
				}
				
				
				guardian guardian = new guardian();
				guardian.setVisible(true);
				dispose();
			}
		
			
			
		});
		btnNewButton.setBounds(429, 798, 110, 31);
		contentPane.add(btnNewButton);
	}
}
