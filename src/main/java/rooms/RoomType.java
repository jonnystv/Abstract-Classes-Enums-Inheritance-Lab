package rooms;

public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    MEETING(12),
    FUNCTION(100);

    private final int roomCapacity;

    RoomType(int roomCapacity){
        this.roomCapacity = roomCapacity;
    }

    public int getRoomCapacity(){
        return this.roomCapacity;
    }
}
