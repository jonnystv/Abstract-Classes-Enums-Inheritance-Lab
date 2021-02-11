package rooms;
import people.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;

    public Bedroom(int capacity, RoomType roomType, int roomNumber){
        super(capacity, roomType);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }
}
