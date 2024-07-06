package com.trek.controller;

import com.trek.service.TrekService;

import java.sql.SQLDataException;
import java.sql.SQLException;

public class TrekController {
    private final TrekService trekService;

    public TrekController() {
        this.trekService = new TrekService();
    }
//    public TrekController(TrekService trekService) {
//        this.trekService = trekService;
//    }

    public List<Trek> getAllTreks() throws SQLException {
        return trekService.getAllTreks();
    }
}
