package com.service;

import com.models.Messaggio;
import java.sql.*;
import java.time.LocalDate;

public class MessageDao {
    private String url = "jdbc:postgresql://localhost:5432/user_crud"; //da modificare
    private String user = "postgres";
    private String password = "password";

    public void createMessage(Messaggio messaggio){
        String query = "INSERT INTO messaggio (sender_message, msg, timestamp) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, this.user, this.password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, user.getCognome());//get del sender msg
            pstmt.setString(2, user.getEmail());//get messaggio
            pstmt.setString(3, user.getPassword());//get data
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
