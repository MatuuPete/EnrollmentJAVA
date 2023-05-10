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

public class payment extends JFrame {

	private JPanel contentPane;
	private JTextField payname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment();
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
	public payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayment = new JLabel("Student Registration");
		lblPayment.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblPayment.setBounds(306, 24, 429, 51);
		contentPane.add(lblPayment);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(45, 104, 155, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Course");
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(45, 164, 155, 25);
		contentPane.add(lblNewLabel_1_1);
		
		payname = new JTextField();
		payname.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		payname.setBounds(45, 720, 351, 42);
		contentPane.add(payname);
		payname.setColumns(10);
		String fname = (EnrollmentProject.fname.getText());
		String lname = (EnrollmentProject.lname.getText());
		String mname = (EnrollmentProject.mname.getText());
		
		payname.setText( fname + " " + mname + "." + " " +lname );
		JLabel lblNewLabel_1_1_2_2_2_1_1 = new JLabel("Registrar Name");
		lblNewLabel_1_1_2_2_2_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_1_2_2_2_1_1.setBounds(639, 766, 143, 25);
		contentPane.add(lblNewLabel_1_1_2_2_2_1_1);
		
		JLabel lblNewLabel_1_1_2_2_2_1_1_1 = new JLabel("________________________________________________");
		lblNewLabel_1_1_2_2_2_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_1_2_2_2_1_1_1.setBounds(527, 737, 395, 25);
		contentPane.add(lblNewLabel_1_1_2_2_2_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2_2_1_1_2 = new JLabel("Student's Name");
		lblNewLabel_1_1_2_2_2_1_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_1_2_2_2_1_1_2.setBounds(159, 770, 143, 25);
		contentPane.add(lblNewLabel_1_1_2_2_2_1_1_2);
		
		JButton btnSubmit = new JButton("Submit");
		
		
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int YesorNo = JOptionPane.showConfirmDialog(null, "Are you sure to insert data?","insert data", JOptionPane.YES_NO_OPTION);
				if(YesorNo == 0) {
					JOptionPane.showMessageDialog(null, "Data is successfully inserted");
					
				}
				dispose();
				
			}
		});
	
		
		btnSubmit.setBounds(413, 819, 110, 31);
		contentPane.add(btnSubmit);
		
		JLabel name_student = new JLabel("New label");
		name_student.setBounds(55, 128, 341, 14);
		contentPane.add(name_student);
		
		JLabel outcourse = new JLabel("New label");
		outcourse.setBounds(55, 187, 438, 14);
		contentPane.add(outcourse);
		String ans=null;
		ans= COURSE.dcourse;
		outcourse.setText(ans);
		
		JLabel lblNewLabel_3 = new JLabel("Donna Roberta Paulsen");
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(613, 719, 199, 42);
		contentPane.add(lblNewLabel_3);
		
		String pangalan = (EnrollmentProject.fname.getText());
		
		
		name_student.setText(pangalan);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contact Number");
		lblNewLabel_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(596, 104, 155, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel cnumber = new JLabel("<dynamic>");
		cnumber.setBounds(622, 128, 341, 14);
		contentPane.add(cnumber);
		String setnum= (EnrollmentProject.txnumber.getText());
		cnumber.setText(setnum);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Guardian's Name");
		lblNewLabel_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(45, 235, 155, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("School's Name");
		lblNewLabel_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(45, 305, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Grades");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(45, 401, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Mathematics");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(166, 450, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("English");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(166, 474, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Science");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(166, 498, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_2 = new JLabel("Computer");
		lblNewLabel_1_1_1_1_1_1_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_2.setBounds(166, 521, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Research");
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_2.setBounds(504, 450, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_3 = new JLabel("Social Science");
		lblNewLabel_1_1_1_1_1_1_1_3.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_3.setBounds(504, 474, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Entrepreneur");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(504, 498, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_2_1 = new JLabel("Filipino");
		lblNewLabel_1_1_1_1_1_1_1_2_1.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_2_1.setBounds(504, 521, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_2_2 = new JLabel("GWA");
		lblNewLabel_1_1_1_1_1_1_1_2_2.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_2_2.setBounds(359, 590, 155, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_2_2);
		
		JLabel grd1 = new JLabel("...");
		grd1.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		grd1.setBounds(289, 450, 155, 25);
		contentPane.add(grd1);
		String una = (Grades.gr1.getText());
		grd1.setText(una);
		
		JLabel grd4 = new JLabel("...");
		grd4.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		grd4.setBounds(289, 521, 155, 25);
		contentPane.add(grd4);
		String apat = (Grades.gr4.getText());
		grd4.setText(apat);
		
		JLabel grd3 = new JLabel("...");
		grd3.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		grd3.setBounds(289, 498, 155, 25);
		contentPane.add(grd3);
		String tatlo = (Grades.gr3.getText());
		grd3.setText(tatlo);
		
		JLabel grd2 = new JLabel("....");
		grd2.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		grd2.setBounds(289, 474, 155, 25);
		contentPane.add(grd2);
		String dalawa = (Grades.gr2.getText());
		grd2.setText(dalawa);
		
		JLabel grd5 = new JLabel("...");
		grd5.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		grd5.setBounds(670, 450, 155, 25);
		contentPane.add(grd5);
		String lima = (Grades.gr5.getText());
		grd5.setText(lima);
		
		JLabel grd8 = new JLabel("....");
		grd8.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		grd8.setBounds(670, 521, 155, 25);
		contentPane.add(grd8);
		String walo = (Grades.gr8.getText());
		grd8.setText(walo);
		
		JLabel grd7 = new JLabel("....");
		grd7.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		grd7.setBounds(670, 498, 155, 25);
		contentPane.add(grd7);
		String pito = (Grades.gr7.getText());
		grd7.setText(pito);
		
		JLabel grd6 = new JLabel("....");
		grd6.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		grd6.setBounds(669, 474, 155, 25);
		contentPane.add(grd6);
		String anim = (Grades.gr6.getText());
		grd6.setText(anim);
		
		JLabel totalg = new JLabel("....");
		totalg.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		totalg.setBounds(421, 590, 155, 25);
		contentPane.add(totalg);
		String dtotal = (Grades.tx_calc.getText());
		totalg.setText(dtotal);
		
		JLabel guardname = new JLabel("<dynamic>");
		guardname.setBounds(55, 266, 341, 14);
		contentPane.add(guardname);
		String first = (guardian.fname.getText());
		String middle = (guardian.mname.getText());
		String last = (guardian.lname.getText());
		String gname = (first + " " + middle + " " + last);
		guardname.setText(gname);
		
		JLabel schooln = new JLabel("<dynamic>");
		schooln.setBounds(55, 332, 341, 14);
		contentPane.add(schooln);
		String paaralan = (Grades.txschool.getText());
		schooln.setText(paaralan);
	
	}
}
