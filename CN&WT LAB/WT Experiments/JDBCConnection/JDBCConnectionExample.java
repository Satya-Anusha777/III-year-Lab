import java.sql.*;
public class JDBCConnectionExample {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wplab","root","1234");
			Statement st = con.createStatement();
			System.out.println("connection established");
			int x = st.executeUpdate("insert into author(id,name) values(1,'Hema')");
					System.out.println(x+" record is inserted");
			ResultSet rs= st.executeQuery("select * from author");
			while(rs.next()){
			System.out.println(rs.getInt(1)+" "+ rs.getString(2));
			con.close();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
