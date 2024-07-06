package com.trek.dataservice;

import com.trek.config.DatabaseConfig;
import com.trek.model.Trek;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TrekDb {
    public List<Trek> getAllTreks() throws SQLException{
        List<Trek> treks = new ArrayList<>();
        Connection connection = DatabaseConfig.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM treks");

        while (resultSet.next()){
            Trek trek = new Trek();
            trek.setId(resultSet.getInt("id"));
            trek.setName(resultSet.getString("name"));
            trek.setDescription(resultSet.getString("description"));
//            String description = resultSet.getString("description");
//            System.out.println("ID: " + id + ", Name: " + name + ", Description: " + description);
//            Trek trek = new Trek(id, name, description);
            treks.add(trek);
        }
        return treks;
    }
}
