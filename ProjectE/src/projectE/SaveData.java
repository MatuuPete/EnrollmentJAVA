package projectE;

import javax.swing.JOptionPane;
import static projectE.EnrollmentProject.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class SaveData {
	
	public static void SaveDB() {
		
		String url = "jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "password";
		String firstname = (fname.getText());
		String middlename = (mname.getText());
		String lastname = (lname.getText());
		String bmonth = (cbMonth.getSelectedItem().toString());
		String bday = (cbDay.getSelectedItem().toString());
		String byear = (cbYear.getSelectedItem().toString());
		String gender = (cbGender.getSelectedItem().toString());
		String address = (txaddress.getText());
		String city = (txcity.getText());
		String province = (txprovince.getText());
		String postal = (txpostal.getText());
		String email = (txemail.getText());
		String number = (txnumber.getText());
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String sql = "INSERT INTO studinf (first_name,middle_name,last_name,birth_month,birth_day,birth_year,gender,address,city,province,postal_code,"
					+ "email,number ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, firstname);
			statement.setString(2, middlename);
			statement.setString(3, lastname);
			statement.setString(4, bmonth);
			statement.setString(5, bday);
			statement.setString(6, byear);
			statement.setString(7, gender);
			statement.setString(8, address);
			statement.setString(9, city);
			statement.setString(10, province);
			statement.setString(11, postal);
			statement.setString(12, email);
			statement.setString(13, number);
			
		
			int rows =statement.executeUpdate();
			if (rows > 0) {
				System.out.println("A row has been inserted");
			}
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Oops, Connection Error!");
			e.printStackTrace();
		}
	
	}
	}
	


