package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Building {
    private String buildingCode;
    private String buildingName;
    private int numRooms;
    private int numFloors;
    private ArrayList<Room> Rooms;

    public Building(String buildingCode, String buildingName, int numRooms, int numFloors)  throws IOException {
        this.buildingCode = buildingCode;
        // TODO: Change buildingName to be generated
        this.buildingName = buildingName;
        this.numRooms = numRooms;
        this.numFloors = numFloors;
        this.Rooms = new ArrayList<Room>();
        openFile();
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

    public void openFile() {
        // Setting file path
        String absPathSU = System.getProperty( "user.dir" ) + "/src/data/SU.csv";
        int n = 1;
        try {
            // Storing file Path
            File file = new File( absPathSU );

            // Reading file by line
            Scanner scan = new Scanner( file );

            // While loop continue until EOF
            while ( scan.hasNextLine() ) {

                // Splitting each line by it's commas
                String values[] = scan.nextLine().split(",");
                System.out.println("---------------------  Room #" + n );
                System.out.println("Room number - " + values[0]);
                System.out.println("X coordinate - " + values[1]);
                System.out.println("Y coordinate - " + values[2]);
                System.out.println("Floor - " + values[3]);
                System.out.println();

                // Get values needed as integers to be ints
                int coorX = Integer.parseInt( values[1] );
                int coorY = Integer.parseInt( values[2] );
                int floor = Integer.parseInt( values[3] );

                Room room = new Room( values[0], coorX, coorY, floor );
                Rooms.add( room );
                n += 1;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
