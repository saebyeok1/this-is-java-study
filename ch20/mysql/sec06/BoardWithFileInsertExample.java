package ch20.mysql.sec06;

import java.sql.*;
import java.io.FileInputStream;

public class BoardWithFileInsertExample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            //JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            //연결하기
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "1234"
            );


            //매개변수화된 SQL문 작성
            String sql = "" +
                    "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
                    "VALUES (?,?,?,now(),?,?)";
            //PreparedStatement 얻기 및 지정
            PreparedStatement pstmt = conn.prepareStatement(sql, new String[]{"bno"});
            pstmt.setString(1, "눈 오늘 날");
            pstmt.setString(2, "함박 눈이 내려요");
            pstmt.setString(3, "winter");
            pstmt.setString(4, "snow.jpg");
            pstmt.setBlob(5, new FileInputStream("F:\\javastudy\\this-is-java-study\\ch20\\mysql\\sec06\\snow.jpg"));

            //SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수: " + rows);

            //bno 갑 얻기
            if (rows == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int bno = rs.getInt(1);
                    System.out.println("저장된 bno: " + bno);
                }
                rs.close();
            }
            //PreparedStatement 닫기
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (conn != null) {
                try {
                    //연결 끊기
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
