package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Campus {
    private String campusName;
    private String campusCode;
    private ArrayList<Building> buildings;

    public Campus (String campusName, String campusCode) {
        this.campusName = campusName;
        this.campusCode = campusCode;
        this.buildings = new ArrayList<>();
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getCampusCode() {
        return campusCode;
    }

    public void setCampusCode(String campusCode) {
        this.campusCode = campusCode;
    }

    public ArrayList<Building> getCampus() {
        return buildings;
    }

    public void setCampus(ArrayList<Building> campus) {
        this.buildings = buildings;
    }
}
