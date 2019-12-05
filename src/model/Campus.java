package model;

import java.util.ArrayList;

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

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }
}
