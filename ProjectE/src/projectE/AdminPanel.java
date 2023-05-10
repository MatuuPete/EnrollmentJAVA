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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.Color;

public class AdminPanel extends JFrame {

	private JPanel contentPane;
	private JTextField txuser;
	private JPasswordField txpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel frame = new AdminPanel();
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
	public AdminPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Admin");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 50));
		lblNewLabel.setBounds(319, 27, 360, 118);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(115, 259, 271, 80);
		contentPane.add(lblNewLabel_1);
		
		txuser = new JTextField();
		txuser.setFont(new Font("Bahnschrift", Font.PLAIN, 30));
		txuser.setBounds(319, 261, 524, 80);
		contentPane.add(txuser);
		txuser.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(115, 373, 271, 80);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txpass.getText();
				String username = txuser.getText();
				
				
				if(password.contains("password")&& (username.contains("BSIT")))
				{
					txpass.setText(null);
					txuser.setText(null);
					
					
					AdminLogged adminlogged = new AdminLogged();
					adminlogged.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No admin exist","Login Error",JOptionPane.ERROR_MESSAGE);
					txpass.setText(null);
					txuser.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(382, 492, 173, 59);
		contentPane.add(btnNewButton);
		
		JButton bexit = new JButton("Exit");
		bexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		bexit.setFont(new Font("Tahoma", Font.BOLD, 20));
		bexit.setBounds(616, 492, 173, 59);
		contentPane.add(bexit);
		
		txpass = new JPasswordField();
		txpass.setFont(new Font("Bahnschrift", Font.PLAIN, 40));
		txpass.setBounds(319, 372, 524, 80);
		contentPane.add(txpass);
	}
}
