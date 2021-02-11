import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import people.Guest;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Guest guest;
    Bedroom bedroom;

    @Before
    public void before(){
        guest = new Guest("Bob");
        bedroom = new Bedroom(RoomType.DOUBLE.getRoomCapacity(), RoomType.DOUBLE, 12);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void checkRoomIsEmpty(){
        assertEquals(true, bedroom.isEmpty());
    }

    @Test
    public void hasCollectionOfGuests(){
        assertEquals(new ArrayList<Guest>(), bedroom.getCollectionOfGuests());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(12, bedroom.getRoomNumber());
    }

}
