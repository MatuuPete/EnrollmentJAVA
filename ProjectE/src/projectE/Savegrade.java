package projectE;

import javax.swing.JOptionPane;
import static projectE.Grades.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Savegrade {
public static void GradeDB() {
		
		String url = "jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "password";
		
		
		String schoolname = (txschool.getText());
		String address = (txaddress.getText());
		String address2 = (txaddress2.getText());
		String postal = (txzip.getText());
		String mgrade = (gr1.getText());
		String egrade = (gr2.getText());
		String sgrade = (gr3.getText());
		String cgrade = (gr4.getText());
		String rgrade = (gr5.getText());
		String ssgrade = (gr6.getText());
		String engrade = (gr7.getText());
		String fgrade = (gr8.getText());
		String gwa = (tx_calc.getText());
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String sql = "INSERT INTO gradeinf (school_name,address,address2,postal_code,"
					+ "Math_Grade,English_Grade,Science_Grade,Computer_Grade,Research_Grade,SocialScience_Grade,Entrepreneur_Grade,Filipino_Grade,GWA ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, schoolname);
			statement.setString(2, address);
			statement.setString(3, address2);
			statement.setString(4, postal);
			statement.setString(5, mgrade);
			statement.setString(6, egrade);
			statement.setString(7, sgrade);
			statement.setString(8, cgrade);
			statement.setString(9, rgrade);
			statement.setString(10, ssgrade);
			statement.setString(11, engrade);
			statement.setString(12, fgrade);
			statement.setString(13, gwa);
		
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
