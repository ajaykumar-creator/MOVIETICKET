package MovieTicketBookingSystem;

public class GoldScreen extends Screen {

    public GoldScreen(String bookingId, int ticketPrice, int snackPrice, ViewerInterface viewer) {
        this.setBookingId(bookingId);
        this.setTicketPrice(ticketPrice);
        this.setSnackPrice(snackPrice);
        this.setViewer(viewer);
    }
}
