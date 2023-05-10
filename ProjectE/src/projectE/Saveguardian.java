package projectE;

import javax.swing.JOptionPane;
import static projectE.guardian.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class Saveguardian {

	public static void GuardDB() {
		
		String url = "jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "password";
		String firstname = (fname.getText());
		String middlename = (mname.getText());
		String lastname = (lname.getText());
	
		String address = (txaddress.getText());
		String city = (txcity.getText());
		String province = (txprovince.getText());
		String postal = (txzip.getText());
		String occupation = (txoccupation.getText());
		String number = (txnumber.getText());
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String sql = "INSERT INTO guardinf (first_name,middle_name,last_name,address,city,province,postal_code,"
					+ "occupation,number ) VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, firstname);
			statement.setString(2, middlename);
			statement.setString(3, lastname);
			statement.setString(4, address);
			statement.setString(5, city);
			statement.setString(6, province);
			statement.setString(7, postal);
			statement.setString(8, occupation);
			statement.setString(9, number);
			
		
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
