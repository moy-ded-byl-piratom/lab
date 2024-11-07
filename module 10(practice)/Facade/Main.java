import java.util.Date;

public class Main {
    public static void main(String[] args){
        Date startdata = new Date(2024,11,12);
        Date enddata = new Date(2024,11,13);
        Date time = new Date(2024,11,13);

        HotelFacade hotelFacade = new HotelFacade();
        hotelFacade.BookingNewRoom(startdata,enddata,3,"Allservice",28,"Room dooked",time);

    }
}
