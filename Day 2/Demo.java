import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Demo {

	public static void main(String[] args) throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		Statement s = c.createStatement();
		s.execute("Insert into customer values(4,'Ishan','7794561222')");
		c.close();
	}

}
