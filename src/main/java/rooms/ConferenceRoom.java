package rooms;

public class ConferenceRoom extends Room {

    private String confRoomName;

    public ConferenceRoom(int capacity, RoomType roomType, String confRoomName) {
        super(capacity, roomType);
        this.confRoomName = confRoomName;
    }

    public String getConfRoomName() {
        return this.confRoomName;
    }
}
