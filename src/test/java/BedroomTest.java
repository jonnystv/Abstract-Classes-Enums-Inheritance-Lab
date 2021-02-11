import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import people.Guest;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE.getRoomCapacity(), RoomType.DOUBLE, 12);
        guest1 = new Guest("Bob");
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

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.guestCount());
    }


}
