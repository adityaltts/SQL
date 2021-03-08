import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatement {
	public static void main(String[] args) throws Exception {
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	PreparedStatement ps = c.prepareStatement("select * from customer");
	ResultSet rs=ps.executeQuery();
	System.out.println("ITS Preapred Statement");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
}
}