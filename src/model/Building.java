package model;

import java.util.ArrayList;

public class Building {
    private String buildingCode;
    private String buildingName;
    private int numRooms;
    private int numFloors;
    private ArrayList<Room> Rooms;

    public void Building(String buildingCode, String buildingName, int numRooms, int numFloors) {
        this.buildingCode = buildingCode;
        this.buildingName = buildingName;
        this.numRooms = numRooms;
        this.numFloors = numFloors;
        this.Rooms = new ArrayList<Room>();
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public ArrayList<Room> getRooms() {
        return Rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        Rooms = rooms;
    }
}
