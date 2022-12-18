/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TimelineCaseByProvinces;

/**
 *
 * @author User
 */
public class SaveDataAPI {

    WebClientConfig clientConfig = new WebClientConfig();

    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String JDBC_URL = "jdbc:mysql://localhost:3306/case-covid";
    String USER_ROOT = "root";
    String PASSWORD = "";

    public void getDataAPIFromDB() {

        List<TimelineCaseByProvinces> byProvinceses = clientConfig.timelineCaseByProvinceses();
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, USER_ROOT, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(SaveDataAPI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveDataAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < byProvinceses.size(); i++) {
            String sql = "INSERT INTO time_province(year, weeknum, new_case, total_case, new_case_excludeabroad, total_case_excludeabroad, new_death, total_death) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement = null;
            try {
                statement = conn.prepareStatement(sql);
                
                statement.setInt(1, byProvinceses.get(i).getWeeknum());
                statement.setInt(2, byProvinceses.get(i).getYear());
                statement.setInt(3, byProvinceses.get(i).getNew_case());
                statement.setInt(4, byProvinceses.get(i).getTotal_case());
                statement.setInt(5, byProvinceses.get(i).getNew_case_excludeabroad());
                statement.setInt(6, byProvinceses.get(i).getTotal_case_excludeabroad());
                statement.setInt(7, byProvinceses.get(i).getNew_death());
                statement.setInt(8, byProvinceses.get(i).getTotal_death());
                
                statement.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(SaveDataAPI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public List<TimelineCaseByProvinces> getCaseTimelineProvinces() {

        List<TimelineCaseByProvinces> byProvinceses = new ArrayList<>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, USER_ROOT, PASSWORD);
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from time_province");

            while (rs.next()) {
                int year = rs.getInt(2);
                int weeknum = rs.getInt(3);
                
                    byProvinceses.add(TimelineCaseByProvinces.builder()
                            .year(year)
                            .weeknum(weeknum)
                            .build());
               
            }
            
             con.close();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.fillInStackTrace());
        }
        
        return byProvinceses;
    }

}
