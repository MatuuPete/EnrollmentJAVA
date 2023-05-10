package projectE;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class CannotEnroll extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CannotEnroll frame = new CannotEnroll();
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
	public CannotEnroll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel text = new JLabel("Unfortunately your requirements did not meet the standards.");
		text.setFont(new Font("Bahnschrift", Font.PLAIN, 30));
		text.setBounds(78, 190, 839, 86);
		contentPane.add(text);
		
		JLabel lblTheSchoolWill = new JLabel("The school will review your enrollment to avoid system error. We will contact you to the information you provided");
		lblTheSchoolWill.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblTheSchoolWill.setBounds(105, 230, 839, 86);
		contentPane.add(lblTheSchoolWill);
	}
}
