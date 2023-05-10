package projectE;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guardian extends JFrame {

	private JPanel contentPane;
	public static JTextField fname;
	public static  JTextField mname;
	public static  JTextField lname;
	public static  JTextField txaddress;
	public static  JTextField txcity;
	public static  JTextField txprovince;
	public static  JTextField txzip;
	public static  JTextField txoccupation;
	public static  JTextField txnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guardian frame = new guardian();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public guardian() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 850);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration Form");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblNewLabel.setBounds(306, 23, 390, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Guardian's Name");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(58, 116, 155, 25);
		contentPane.add(lblNewLabel_1);
		
		fname = new JTextField();
		fname.setColumns(10);
		fname.setBounds(58, 152, 283, 38);
		contentPane.add(fname);
		
		mname = new JTextField();
		mname.setColumns(10);
		mname.setBounds(353, 152, 283, 38);
		contentPane.add(mname);
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(646, 152, 283, 38);
		contentPane.add(lname);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(58, 202, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Name");
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(353, 201, 102, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Last Name");
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(646, 202, 102, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5_1 = new JLabel("Address");
		lblNewLabel_5_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(58, 247, 155, 25);
		contentPane.add(lblNewLabel_5_1);
		
		txaddress = new JTextField();
		txaddress.setColumns(10);
		txaddress.setBounds(58, 283, 871, 38);
		contentPane.add(txaddress);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address Line");
		lblNewLabel_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(58, 332, 102, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txcity = new JTextField();
		txcity.setColumns(10);
		txcity.setBounds(58, 378, 283, 38);
		contentPane.add(txcity);
		
		txprovince = new JTextField();
		txprovince.setColumns(10);
		txprovince.setBounds(353, 378, 283, 38);
		contentPane.add(txprovince);
		
		txzip = new JTextField();
		txzip.setColumns(10);
		txzip.setBounds(646, 378, 283, 38);
		contentPane.add(txzip);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("City");
		lblNewLabel_2_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1_1.setBounds(58, 428, 102, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Province");
		lblNewLabel_2_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1_2.setBounds(353, 427, 102, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Postal Zip Code");
		lblNewLabel_2_1_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1_2_1.setBounds(646, 427, 102, 14);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_10 = new JLabel("Occupation");
		lblNewLabel_10.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(58, 504, 155, 25);
		contentPane.add(lblNewLabel_10);
		
		txoccupation = new JTextField();
		txoccupation.setColumns(10);
		txoccupation.setBounds(58, 540, 430, 38);
		contentPane.add(txoccupation);
		
		JLabel lblNewLabel_11 = new JLabel("Mobile Number");
		lblNewLabel_11.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(499, 504, 155, 25);
		contentPane.add(lblNewLabel_11);
		
		txnumber = new JTextField();
		txnumber.setColumns(10);
		txnumber.setBounds(499, 540, 430, 38);
		contentPane.add(txnumber);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Saveguardian.GuardDB();
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int YesorNo = JOptionPane.showConfirmDialog(null, "Are you sure to insert data?","insert data", JOptionPane.YES_NO_OPTION);
				if(YesorNo == 0) {
					JOptionPane.showMessageDialog(null, "Data is successfully inserted");
					
				}
				Grades grades = new Grades();
				grades.setVisible(true);
				
				dispose();
				
			}
		});
		btnNewButton.setBounds(444, 667, 110, 31);
		contentPane.add(btnNewButton);
	}

}
