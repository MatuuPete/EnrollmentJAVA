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
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Grades extends JFrame {

	private JPanel contentPane;
	public static JTextField txschool;
	private JLabel lblNewLabel_2;
	public static JTextField txaddress;
	private JLabel lblNewLabel_5;
	public static JTextField txaddress2;
	public static JTextField txzip;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_1_2;
	public static JTextField gr1;
	public static JTextField gr2;
	public static JTextField gr3;
	public static JTextField gr4;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_4;
	private JLabel lblNewLabel_2_5;
	private JLabel lblNewLabel_2_6;
	private JLabel lblNewLabel_2_7;
	private JLabel lblNewLabel_2_8;
	private JLabel lblNewLabel_2_9;
	public static JTextField gr5;
	public static JTextField gr6;
	public static JTextField gr7;
	public static JTextField gr8;
	public static  JTextField tx_calc;
	private JLabel lblNewLabel_2_10;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grades frame = new Grades();
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
	public Grades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration Form");
		lblNewLabel.setBounds(301, 21, 390, 51);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		txschool = new JTextField();
		txschool.setColumns(10);
		txschool.setBounds(63, 119, 871, 38);
		contentPane.add(txschool);
		
		JLabel lblNewLabel_1 = new JLabel("School Name");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(63, 83, 155, 25);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Address Line");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(63, 265, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		txaddress = new JTextField();
		txaddress.setColumns(10);
		txaddress.setBounds(63, 216, 871, 38);
		contentPane.add(txaddress);
		
		lblNewLabel_5 = new JLabel("School Address");
		lblNewLabel_5.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(63, 180, 155, 25);
		contentPane.add(lblNewLabel_5);
		
		txaddress2 = new JTextField();
		txaddress2.setColumns(10);
		txaddress2.setBounds(63, 297, 578, 38);
		contentPane.add(txaddress2);
		
		txzip = new JTextField();
		txzip.setColumns(10);
		txzip.setBounds(651, 297, 283, 38);
		contentPane.add(txzip);
		
		lblNewLabel_2_1 = new JLabel("Address Line 2");
		lblNewLabel_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(63, 347, 102, 14);
		contentPane.add(lblNewLabel_2_1);
		
		lblNewLabel_2_1_2 = new JLabel("Postal Zip Code");
		lblNewLabel_2_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_1_2.setBounds(651, 346, 102, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		gr1 = new JTextField();
		gr1.setHorizontalAlignment(SwingConstants.CENTER);
		gr1.setColumns(10);
		gr1.setBounds(167, 429, 206, 43);
		contentPane.add(gr1);
		
		gr2 = new JTextField();
		gr2.setHorizontalAlignment(SwingConstants.CENTER);
		gr2.setColumns(10);
		gr2.setBounds(167, 483, 206, 43);
		contentPane.add(gr2);
		
		gr3 = new JTextField();
		gr3.setHorizontalAlignment(SwingConstants.CENTER);
		gr3.setColumns(10);
		gr3.setBounds(167, 537, 206, 43);
		contentPane.add(gr3);
		
		gr4 = new JTextField();
		gr4.setHorizontalAlignment(SwingConstants.CENTER);
		gr4.setColumns(10);
		gr4.setBounds(167, 591, 206, 43);
		contentPane.add(gr4);
		
		lblNewLabel_3 = new JLabel("Grades");
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(63, 385, 155, 25);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_2_2 = new JLabel("MATHEMATICS");
		lblNewLabel_2_2.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(63, 443, 102, 14);
		contentPane.add(lblNewLabel_2_2);
		
		lblNewLabel_2_3 = new JLabel("ENGLISH");
		lblNewLabel_2_3.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_3.setBounds(63, 497, 102, 14);
		contentPane.add(lblNewLabel_2_3);
		
		lblNewLabel_2_4 = new JLabel("SCIENCE");
		lblNewLabel_2_4.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_4.setBounds(63, 551, 102, 14);
		contentPane.add(lblNewLabel_2_4);
		
		lblNewLabel_2_5 = new JLabel("COMPUTER");
		lblNewLabel_2_5.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_5.setBounds(63, 605, 102, 14);
		contentPane.add(lblNewLabel_2_5);
		
		lblNewLabel_2_6 = new JLabel("RESEARCH");
		lblNewLabel_2_6.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_6.setBounds(465, 443, 102, 14);
		contentPane.add(lblNewLabel_2_6);
		
		lblNewLabel_2_7 = new JLabel("SOCIEL SCIENCE");
		lblNewLabel_2_7.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_7.setBounds(465, 497, 102, 14);
		contentPane.add(lblNewLabel_2_7);
		
		lblNewLabel_2_8 = new JLabel("ENTREPRENEURIAL");
		lblNewLabel_2_8.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_8.setBounds(465, 551, 129, 14);
		contentPane.add(lblNewLabel_2_8);
		
		lblNewLabel_2_9 = new JLabel("FILIPINO");
		lblNewLabel_2_9.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_9.setBounds(465, 605, 102, 14);
		contentPane.add(lblNewLabel_2_9);
		
		gr5 = new JTextField();
		gr5.setHorizontalAlignment(SwingConstants.CENTER);
		gr5.setColumns(10);
		gr5.setBounds(627, 429, 206, 43);
		contentPane.add(gr5);
		
		gr6 = new JTextField();
		gr6.setHorizontalAlignment(SwingConstants.CENTER);
		gr6.setColumns(10);
		gr6.setBounds(627, 483, 206, 43);
		contentPane.add(gr6);
		
		gr7 = new JTextField();
		gr7.setHorizontalAlignment(SwingConstants.CENTER);
		gr7.setColumns(10);
		gr7.setBounds(627, 537, 206, 43);
		contentPane.add(gr7);
		
		gr8 = new JTextField();
		gr8.setHorizontalAlignment(SwingConstants.CENTER);
		gr8.setColumns(10);
		gr8.setBounds(627, 591, 206, 43);
		contentPane.add(gr8);
		
		tx_calc = new JTextField();
		tx_calc.setFont(new Font("Tahoma", Font.BOLD, 15));
		tx_calc.setHorizontalAlignment(SwingConstants.CENTER);
		tx_calc.setEditable(false);
		tx_calc.setColumns(10);
		tx_calc.setBounds(413, 675, 206, 43);
		contentPane.add(tx_calc);
		
		lblNewLabel_2_10 = new JLabel(" GENERAL WEIGHTED AVERAGE");
		lblNewLabel_2_10.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_2_10.setBounds(197, 689, 214, 14);
		contentPane.add(lblNewLabel_2_10);
		
		btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Savegrade.GradeDB();
			}
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int grd = Integer.parseInt(Grades.tx_calc.getText());
				if(tx_calc.getText().length() <=0 ) {
					JOptionPane.showMessageDialog(null, "Grades are empty");
				}
				else if (grd<= 75) {
					JOptionPane.showMessageDialog(null, "Grades cannot  be below 75");
					
					CannotEnroll cannotenroll = new CannotEnroll();
					cannotenroll.setVisible(true);
							dispose();
				}
				else {
					
					int YesorNo = JOptionPane.showConfirmDialog(null, "Are you sure to insert data?","insert data", JOptionPane.YES_NO_OPTION);
					if(YesorNo == 0) {
						JOptionPane.showMessageDialog(null, "Data is successfully inserted");
						

						
					}
					
					
				}
				COURSE course = new COURSE();
				course.setVisible(true);
				dispose();
				
			
				
			}
			
			
		});
		btnNewButton.setBounds(457, 783, 122, 31);
		contentPane.add(btnNewButton);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one =Integer.parseInt(gr1.getText());
				int two =Integer.parseInt(gr2.getText());
				int three =Integer.parseInt(gr3.getText());
				int four =Integer.parseInt(gr4.getText());
				int five =Integer.parseInt(gr5.getText());
				int six =Integer.parseInt(gr6.getText());
				int seven =Integer.parseInt(gr7.getText());
				int eight =Integer.parseInt(gr8.getText());
				
				String answer =String.valueOf((one+two+three+four+five+six+seven+eight)/8);
				
				tx_calc.setText(answer);
			}
		});
		btnCalculate.setBounds(465, 729, 102, 25);
		contentPane.add(btnCalculate);
		
		JLabel lblNewLabel_1_1 = new JLabel("(Senior High School)");
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(167, 83, 155, 25);
		contentPane.add(lblNewLabel_1_1);
		
		
		
	}
}
