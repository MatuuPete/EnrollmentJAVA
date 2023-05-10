package projectE;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class COURSE extends JFrame {

	private JPanel contentPane;
	public static JTextField tx_gwa;
	public static JTextField stud_name;
	
	public static String dcourse;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					COURSE frame = new COURSE();
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
	public COURSE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration Form");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblNewLabel.setBounds(290, 24, 390, 51);
		contentPane.add(lblNewLabel);
		
	
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(84, 100, 155, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Courses Offered");
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(84, 206, 155, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdb1 = new JRadioButton("BET Major in Automotive Technology (BETAT-T)");
		rdb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("BET Major in Automotive Technology (BETAT-T)");
			}
		});
		
		rdb1.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb1.setBounds(84, 336, 366, 23);
		contentPane.add(rdb1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("BACHELOR OF ENGINEERING TECHNOLOGY (BET) COURSES");
		lblNewLabel_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(84, 303, 420, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdb2 = new JRadioButton("BET Major in Chemical Technology (BETChT-T)");
		rdb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("BET Major in Chemical Technology (BETChT-T)");
			}
		});
		rdb2.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb2.setBounds(84, 362, 366, 23);
		contentPane.add(rdb2);

		
		
	
		
		
	
	
		JRadioButton rdb3 = new JRadioButton("BET Major in Mechanical Technology (BETMT-T)");
		rdb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("BET Major in Mechanical Technology (BETMT-T)");
			}
		});
		rdb3.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb3.setBounds(84, 388, 366, 23);
		contentPane.add(rdb3);
		
		JRadioButton rdb4 = new JRadioButton("BET Major in Electronics Technology (BETElxT-T)");
		rdb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("BET Major in Electronics Technology (BETElxT-T");
			}
		});
		rdb4.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb4.setBounds(84, 414, 366, 23);
		contentPane.add(rdb4);
		
		JRadioButton rdb5 = new JRadioButton("BET Major in Non-Destructive Testing Technology (BETNDTT-T)");
		rdb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("BET Major in Non-Destructive Testing Technology (BETNDTT-T)");
			}
		});
		rdb5.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb5.setBounds(84, 440, 366, 23);
		contentPane.add(rdb5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("ENGINEERING COURSES");
		lblNewLabel_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1.setBounds(84, 474, 420, 25);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JRadioButton rdb6 = new JRadioButton("Bachelor of Science in Civil Engineering (BSCESEP-T)");
		rdb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("Bachelor of Science in Civil Engineering (BSCESEP-T)");
			}
		});
		rdb6.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb6.setBounds(84, 506, 366, 23);
		contentPane.add(rdb6);
		
		JRadioButton rdb7 = new JRadioButton("Bachelor of Science in Electrical Engineering (BSEESEP-T)");
		rdb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("Bachelor of Science in Electrical Engineering (BSEESEP-T)");
			}
		});
		rdb7.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb7.setBounds(84, 532, 366, 23);
		contentPane.add(rdb7);
	


		
		JRadioButton rdb8 = new JRadioButton("Bachelor of Science in Electronics Engineering (BSECESEP-T)");
		rdb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("Bachelor of Science in Electronics Engineering (BSECESEP-T");
			}
		});
		rdb8.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb8.setBounds(84, 558, 366, 23);
		contentPane.add(rdb8);
		
		JRadioButton rdb9 = new JRadioButton("Bachelor of Science in Mechanical Engineering (BSMESEP-T)");
		rdb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("Bachelor of Science in Mechanical Engineering (BSMESEP-T)");
			}
		});
		rdb9.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb9.setBounds(84, 584, 366, 23);
		contentPane.add(rdb9);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("OTHER SCIENCE COURSES");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1.setBounds(84, 626, 420, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JRadioButton rdb10 = new JRadioButton("Bachelor of Science in Information Technology (BSIT-T)");
		rdb10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("Bachelor of Science in Information Technology (BSIT-T)");
			}
		});
		rdb10.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb10.setBounds(84, 661, 366, 23);
		contentPane.add(rdb10);
		
		JRadioButton rdb11 = new JRadioButton("Bachelor of Science in Information System (BSIS-T)");
		rdb11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("Bachelor of Science in Information System (BSIS-T)");
			}
		});
		rdb11.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb11.setBounds(84, 687, 366, 23);
		contentPane.add(rdb11);
		
		JRadioButton rdb12 = new JRadioButton("Bachelor of Science in Environmental Science (BSESSDP-T)");
		rdb12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcourse = ("Bachelor of Science in Environmental Science (BSESSDP-T)");
			}
		});
		rdb12.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		rdb12.setBounds(84, 713, 366, 23);
		contentPane.add(rdb12);
		
		 ButtonGroup ButtonGroup = new ButtonGroup();
		 ButtonGroup.add(rdb1);
		 ButtonGroup.add(rdb2);
		 ButtonGroup.add(rdb3);
		 ButtonGroup.add(rdb4);
		 ButtonGroup.add(rdb5);
		 ButtonGroup.add(rdb6);
		 ButtonGroup.add(rdb7);
		 ButtonGroup.add(rdb8);
		 ButtonGroup.add(rdb9);
		 ButtonGroup.add(rdb10);
		 ButtonGroup.add(rdb11);
		 ButtonGroup.add(rdb12);
		
		JLabel lblNewLabel_1_2 = new JLabel("GWA");
		lblNewLabel_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(829, 100, 155, 25);
		contentPane.add(lblNewLabel_1_2);
		
		tx_gwa = new JTextField();
		tx_gwa.setFont(new Font("Tahoma", Font.BOLD, 12));
		tx_gwa.setHorizontalAlignment(SwingConstants.CENTER);
		tx_gwa.setBounds(802, 126, 93, 25);
		contentPane.add(tx_gwa);
		tx_gwa.setColumns(10);

		String fname = (EnrollmentProject.fname.getText());
		String lname = (EnrollmentProject.lname.getText());
		String mname = (EnrollmentProject.mname.getText());
		
	
		
		int answer = Integer.parseInt(Grades.tx_calc.getText());
		
		tx_gwa.setText(Integer.toString(answer));
		
	if (answer < 92) {
			
			rdb2.setEnabled(false);
			rdb3.setEnabled(false);
			rdb6.setEnabled(false);
			rdb7.setEnabled(false);
			rdb8.setEnabled(false);
			rdb9.setEnabled(false);
			
		}
		else {
		
			rdb1.setEnabled(true);
			rdb2.setEnabled(true);
			rdb3.setEnabled(true);
			rdb4.setEnabled(true);
			rdb5.setEnabled(true);
			rdb6.setEnabled(true);
			rdb7.setEnabled(true);
			rdb8.setEnabled(true);
			rdb9.setEnabled(true);
			rdb10.setEnabled(true);
			rdb11.setEnabled(true);
			rdb12.setEnabled(true);
			
			
		}
	
	
		stud_name = new JTextField();
		stud_name.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		stud_name.setColumns(10);
		stud_name.setBounds(84, 128, 577, 25);
		contentPane.add(stud_name);
		
		stud_name.setText(lname + "," + " " + fname + " " + mname);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("The courses offered below are the courses offered base on your general weighted average ");
		lblNewLabel_1_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		lblNewLabel_1_1_2.setBounds(94, 261, 736, 25);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("NOTE:");
		lblNewLabel_1_1_3.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(84, 242, 155, 25);
		contentPane.add(lblNewLabel_1_1_3);
		
	
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				Savecourse.CourseDB();
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int YesorNo = JOptionPane.showConfirmDialog(null, "Are you sure to insert data?","insert data", JOptionPane.YES_NO_OPTION);
				if(YesorNo == 0) {
					JOptionPane.showMessageDialog(null, "Data is successfully inserted");
					
				}
				
				payment Payment = new payment();
				Payment.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(415, 783, 110, 31);
		contentPane.add(btnNewButton);
	
		
	}

	
}
