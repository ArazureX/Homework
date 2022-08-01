package hm16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }

        Connection conn = null;
        System.out.println("obtainig ");
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/alco?" +
                            "user=root&password=");
            // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        System.out.println("success");

        Statement st = conn.createStatement();

        st.execute("CREATE TABLE IF NOT EXISTS category( cat_id INT PRIMARY KEY AUTO_INCREMENT, cat_name VARCHAR(100))");
        st.execute("CREATE TABLE IF NOT EXISTS drinks(d_id INT PRIMARY KEY AUTO_INCREMENT, d_name VARCHAR(255) , d_degree TINYINT(127) ,d_category INT, d_volume FLOAT(127 , 2))");
        st.execute("INSERT INTO  category (cat_name) VALUES('Soft Drinks'),('wine'),('beer'),('vodka'),('Shot')");
        st.execute("ALTER TABLE drinks ADD CONSTRAINT fk_d_category FOREIGN KEY (d_category) REFERENCES category(cat_id)");
        st.execute("INSERT INTO drinks (d_name,d_degree,d_category,d_volume)VALUES('Golden ALE', 7, '3' , 0.4)," +
                "('777', 15, '2' , 0.8)," +
                "('kola', 0, '1' , 0.5)," +
                "('vozduh', 45, '4' , 0.7)," +
                "('Б-52', 20, '5' , 0.05)");
        st.close();
        conn.close();
        System.out.println("OK");
    }
}
