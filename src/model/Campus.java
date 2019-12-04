package model;

import java.util.ArrayList;

public class Campus {
    private String campusName;
    private String campusCode;
    private ArrayList<Building> campus;

    public void Campus (String campusName, String campusCode) {
        this.campusName = campusName;
        this.campusCode = campusCode;
        this.campus = new ArrayList<>();
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
        return campus;
    }

    public void setCampus(ArrayList<Building> campus) {
        campus = campus;
    }
}
