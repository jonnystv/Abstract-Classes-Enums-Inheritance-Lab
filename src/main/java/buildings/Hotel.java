package buildings;

import rooms.Bedroom;
import rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;
    private String name;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.confRooms = new ArrayList<ConferenceRoom>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }

    public ArrayList<ConferenceRoom> getConfRooms() {
        return this.confRooms;
    }
}
