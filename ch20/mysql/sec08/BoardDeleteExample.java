package ch20.mysql.sec08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {
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

            //매개변수화된 SQL 문 작성
            String sql = "DELETE FROM boards WHERE bwriter=?";

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            //SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행 수: " + rows);

            //PreparedStatement 닫기
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    //연결끊기
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
