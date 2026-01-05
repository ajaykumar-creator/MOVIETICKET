package MovieTicketBookingSystem;

public class SilverScreen extends Screen {

    public SilverScreen(String bookingId, int ticketPrice, int snackPrice, ViewerInterface viewer) {
        this.setBookingId(bookingId);
        this.setTicketPrice(ticketPrice);
        this.setSnackPrice(snackPrice);
        this.setViewer(viewer);
    }
}
