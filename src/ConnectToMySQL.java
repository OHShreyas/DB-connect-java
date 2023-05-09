import java.sql.*;

public class ConnectToMySQL {
    static final String DB_URL = "jdbc:mysql://localhost/world?characterEncoding=UTF-8";
    static final String USER = "root";
    static final String PASS = "Shivam@20";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database...");
            stmt = conn.createStatement();
            String sql = "SELECT * FROM world.city where Countrycode ='AFG'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                // Retrieve data from each column and print to console
                String name = rs.getString("name");
                String CountryCode = rs.getString("CountryCode");
                String district = rs.getString("district");
                int population = rs.getInt("population");
                System.out.println(name + " | " + CountryCode + " | " + district + " | " + population);
            }

 //Feature Exchange - Add Graphical User Console
            }
        }
    }
}
