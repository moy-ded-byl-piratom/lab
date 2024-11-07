import java.util.Date;

public class HotelFacade {
public void BookingNewRoom(Date startdata,Date enddata, int people, String service, int room, String massage, Date time){
    RoomBookingSystem bookingRoom = new RoomBookingSystem();
    bookingRoom.booking(startdata,enddata,people,service);

    CleaningService cleaningService = new CleaningService();
    cleaningService.cleaning(room);

    Notification notification = new Notification();
    notification.sendNotification(massage);

    RestaurantSystem restaurantSystem = new RestaurantSystem();
    restaurantSystem.bookingTable(people,time);
}
}
