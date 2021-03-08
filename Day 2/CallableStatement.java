import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class CallableStatement  {

	public static void main(String[] args) {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		CallableStatement cs=c.prepareCall("{call getAllStudents}");
		ResultSet rs=cs.executeQuery();
		
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
		c.close();
	}
}
