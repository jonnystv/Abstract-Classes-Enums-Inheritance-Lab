import buildings.Hotel;
import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.RoomType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    Hotel emptyHotel;
    Hotel hotel;
    Bedroom bedroom12;
    ConferenceRoom conferenceRoom1;
    Guest guest1;

    @Before
    public void before() {
        emptyHotel = new Hotel("CodeClan Towers");
        hotel = new Hotel("CodeClan Towers");
        bedroom12 = new Bedroom(RoomType.DOUBLE.getRoomCapacity(), RoomType.DOUBLE, 12);
        conferenceRoom1 = new ConferenceRoom(RoomType.MEETING.getRoomCapacity(), RoomType.MEETING, "Ben Nevis");
        guest1 = new Guest("Bob");
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
//        assertTrue(hotel.getBedrooms() instanceof ArrayList);
        assertEquals(new ArrayList<Bedroom>(), emptyHotel.getBedrooms() );
    }

    @Test
    public void hasConfRooms(){
        assertEquals(new ArrayList<ConferenceRoom>(), emptyHotel.getConfRooms() );
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom12);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.addBedroom(bedroom12);
        hotel.getBedrooms().get(0).addGuest(guest1);
        assertEquals(1, hotel.getBedrooms().get(0).guestCount());
    }

    @Test
    public void canCheckGuestOutOfBedroom(){
        hotel.addBedroom(bedroom12);
        hotel.getBedrooms().get(0).addGuest(guest1);
        hotel.getBedrooms().get(0).removeGuest(guest1);
        assertEquals(0, hotel.getBedrooms().get(0).guestCount());
    }


}
