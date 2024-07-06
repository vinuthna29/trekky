package com.trek.service;

import com.trek.dataservice.TrekDb;
import com.trek.model.Trek;

import java.sql.SQLException;
import java.util.List;

public class TrekService {
    public List<Trek> getAllTreks() throws SQLException {
        return TrekDb.getAllTreks();
    }
}
