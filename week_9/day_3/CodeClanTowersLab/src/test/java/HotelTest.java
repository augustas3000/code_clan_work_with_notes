import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;

    Bedroom bedroom_1;
    Bedroom bedroom_2;
    Bedroom bedroom_3;

    ConferenceRoom confRoom_1;

    Guest guest_1;
    Guest guest_2;
    Guest guest_3;
    Guest guest_4;
    Guest guest_5;
    Guest guest_6;

    @Before
    public void before() {
        hotel = new Hotel();

        bedroom_1 = new Bedroom(1, "Single");
        bedroom_2 = new Bedroom(2, "Double");
        bedroom_3 = new Bedroom(3,"Single");

        confRoom_1 = new ConferenceRoom("The Stone", 5);

        guest_1 = new Guest("Jimmy");
        guest_2 = new Guest("Ana");
        guest_3 = new Guest("Lucy");
        guest_4 = new Guest("Alis");
        guest_5 = new Guest("John");
        guest_6 = new Guest("Zoe");

    }

    @Test
    public void canAddBedrooms() {
        hotel.addBedroom(bedroom_1);
        hotel.addBedroom(bedroom_2);
        hotel.addBedroom(bedroom_3);

        assertEquals(3,hotel.getBedroomsHotel().size());
    }

    @Test
    public void canAddConferenceRooms() {
        hotel.addConferenceRoom(confRoom_1);
        assertEquals(1,hotel.getConferenceRoomsHotel().size());
    }


    @Test
    public void canCheckIfAvailable_Room() {
        hotel.addBedroom(bedroom_1);
        assertEquals(true, hotel.isAvailable_Bedroom(bedroom_1));
    }




    @Test
    public void canCheckInGuests_Room() {
        hotel.addBedroom(bedroom_1);
        hotel.checkInGuest_Bedroom(1,guest_1);
        assertEquals(0, bedroom_1.getCapacity() );
//        assertTrue(hotel.checkInGuest(1, guest_1));
    }




    @Test
    public void canCheckOutGuests() {
        hotel.addBedroom(bedroom_1);
        hotel.checkInGuest_Bedroom(1,guest_1);
        assertEquals(0, bedroom_1.getCapacity() );
        hotel.checkOutGuest_Bedroom(1, guest_1);
        assertEquals(1,bedroom_1.getCapacity());
        assertEquals(0,bedroom_1.getGuests().size());
//        checkOutGuest_Bedroom
    }



    @Test
    public void canFindRoomByNumber() {

        hotel.addBedroom(bedroom_1);
        hotel.addBedroom(bedroom_2);
        hotel.addBedroom(bedroom_3);

        assertEquals(bedroom_2,hotel.findBedroomByNumber(2));

//        findBedroomByNumber(Integer bedroomNum)
    }


    @Test
    public void canFindConfRoomByName() {

    }

    @Test
    public void canCreateBookings() {
        hotel.addBedroom(bedroom_1);
        hotel.bookRoom(bedroom_1, 2);

        assertEquals(1, hotel.getAllBookings().size());
    }

    @Test
    public void canCheckIFBooked() {
        hotel.addBedroom(bedroom_1);
        hotel.addBedroom(bedroom_2);
        hotel.bookRoom(bedroom_1, 2);
        assertTrue(hotel.isBooked(bedroom_1));
        assertFalse(hotel.isBooked(bedroom_2));
    }


    @Test
    public void canCalculateTotalForBooking() {
        hotel.addBedroom(bedroom_1);
        hotel.bookRoom(bedroom_1, 5);
        Booking booking_1 = hotel.getAllBookings().get(0);
        assertEquals(50.00, hotel.calculateTotalBillForBooking(booking_1),0.01);
    }

    @Test
    public void canGetVacantBedrooms() {
        hotel.addBedroom(bedroom_1);
        hotel.addBedroom(bedroom_2);
        hotel.checkInGuest_Bedroom(1,guest_1);
        hotel.bookRoom(bedroom_1, 2);
        assertEquals(bedroom_2, hotel.getVacantBedrooms().get(0) );
    }

}
