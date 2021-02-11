import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.ConferenceRoom;
import rooms.RoomType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before (){
        conferenceRoom = new ConferenceRoom(RoomType.MEETING.getRoomCapacity(), RoomType.MEETING, "Ben Nevis");
    }

    @Test
    public void hasCapacity(){
        assertEquals(12, conferenceRoom.getCapacity());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.MEETING, conferenceRoom.getRoomType());
    }

    @Test
    public void checkRoomIsEmpty(){
        assertEquals(true, conferenceRoom.isEmpty());
    }

    @Test
    public void hasCollectionOfGuests(){
        assertEquals(new ArrayList<Guest>(), conferenceRoom.getCollectionOfGuests());
    }

    @Test
    public void hasName(){
        assertEquals("Ben Nevis", conferenceRoom.getConfRoomName());
    }

}
