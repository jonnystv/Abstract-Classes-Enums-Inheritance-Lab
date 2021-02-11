import buildings.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers");
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(new ArrayList<Bedroom>(), hotel.getBedrooms() );
    }

    @Test
    public void hasConfRooms(){
        assertEquals(new ArrayList<ConferenceRoom>(), hotel.getConfRooms() );
    }


}
