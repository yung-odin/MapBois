package model;

public class Room {
    private String buildingCode;
    private String roomNum;
    private int coorX;
    private int coorY;
    private int floorNum;

    public Room(String roomNum, int coorX, int coorY, int floorNum) {
        // TODO: Change buildingCode to be dynamic
        this.buildingCode = "SU";
        this.roomNum = roomNum;
        this.coorX = coorX;
        this.coorY = coorY;
        this.floorNum = floorNum;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public int getCoorX() {
        return coorX;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }
}
