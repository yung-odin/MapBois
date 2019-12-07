package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Campus structure to determine what campus we are looking for a room at
 */
public class Campus {
    private String campusName;
    private String campusCode;
    private ArrayList<Building> buildings;

    public Campus (String campusName, String campusCode) {
        this.campusName = campusName;
        this.campusCode = campusCode;
        this.buildings = new ArrayList<>();
        openFile();
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

    public void openFile() {
        // Setting file path
        String absPath = System.getProperty( "user.dir" ) + "/src/data/" + campusCode + ".csv";
        try {
            // Storing file Path
            File file = new File( absPath );

            // Reading file by line
            Scanner scan = new Scanner( file );

            // While loop continue until EOF
            while ( scan.hasNextLine() ) {

                // Splitting each line by it's commas
                String[] values = scan.nextLine().split(",");
                System.out.println("---------------------  Building " + values[0] );
                System.out.println("Building Name - " + values[1]);
                System.out.println("Number of Rooms - " + values[2]);
                System.out.println("Number of Floors - " + values[3]);
                System.out.println();

                // Get values needed as integers to be ints
                int numRooms = Integer.parseInt( values[2] );
                int numFloors = Integer.parseInt( values[3] );

                Building building = new Building(values[0], values[1], numRooms, numFloors);
                buildings.add( building );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Building findBuilding ( String usrInput ) {
        for ( Building target : buildings ) {
            if ( usrInput.equals( target.getBuildingCode() ) )
                return target;
        }
        return null;
    }
}
