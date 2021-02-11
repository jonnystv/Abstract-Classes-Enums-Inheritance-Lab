package Rooms;

public abstract class Room {

    private int capacity;
    private RoomType roomType;
    private ArrayList<Guest> collectionOfGuests;

    public Room(int capacity, RoomType roomType, ArrayList<Guest> collectionOfGuests){
        this.capacity = capacity;
        this.roomType = roomType;
        this.collectionOfGuests = collectionOfGuests;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public ArrayList<Guest> getCollectionOfGuests() {
        return this.collectionOfGuests;
    }
}
