package projectE;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import static projectE.COURSE.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class Savecourse {

public static void CourseDB() {
		
		String url = "jdbc:mysql://localhost:3306/schooldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "password";
		String Studentname = (stud_name.getText());
		String gwa = (tx_gwa.getText());
		String course = (dcourse);
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String sql = "INSERT INTO courseinf(student_name,gwa,course) VALUES (?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, Studentname);
			statement.setString(2, gwa);
			statement.setString(3, course);
			
		
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
