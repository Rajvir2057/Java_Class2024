import java.io.*;
import java.sql.*;

public class Mysql {
    public static void main(String[] args) throws Exception{

        String url ="jdbc;mysql;//localhost;3306/basic_table";

        String username ="root";
        String password ="rajvirkaur123";

        String query = "select * from students";

        Class.forName("com.mysql.cj.jdbc.Driver"); // helps to load in jdbc  and Driver(is the driver name)

        Connection con = DriverManager.getConnection(url, username, password);
        // this was done to get connection in mysql. 
        // the folllowing code will show that it was successful.

        System.out.println("connection was successful.");

        Statement st = con.createStatement();

        ResultSet rs= st.executeQuery(query); // Execute query
        rs.next();
        String name= rs.getString("name");

        System.out.println(name);
        st.close(); // Close statement
        con.close();
        System.out.println("Connection Closed....");

    }
}
