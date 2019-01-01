import java.sql.*;

public class Driver {

    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/e-plastic";
        String uname = "root";
        String pass = "";
        String query = "SELECT *  FROM video";

        Connection con = DriverManager.getConnection(url, uname, pass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();

        int videoId = rs.getInt("video_id");
        System.out.println(videoId);

        st.close();
        con.close();

    }
}
