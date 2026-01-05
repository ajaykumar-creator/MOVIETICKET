package MovieTicketBookingSystem;

public abstract class Screen implements ScreenInterface {

    private String bookingId;
    private int ticketPrice;
    private int snackPrice;
    private int totalBill;
    private ViewerInterface viewer;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public void setViewer(ViewerInterface viewer) {
        this.viewer = viewer;
    }

    public void calculateTicketPrice() {
        this.ticketPrice = viewer.getNumberOfSeats() * this.ticketPrice;
        System.out.println("Ticket Price:");
        System.out.println(ticketPrice);
    }

    public void calculateSnackPrice() {
        if (viewer.getWantSnacks().equals("YES")) {
            this.snackPrice = viewer.getSnackQuantity() * this.snackPrice;
            System.out.println("Snack Price:");
            System.out.println(snackPrice);
        } else {
            System.out.println("No Snack required");
        }
    }

    public void generateBill() {
        this.totalBill = ticketPrice + snackPrice + 100;
        System.out.println("Total Bill:");
        System.out.println(totalBill);
    }

    public void applyDiscount() {
        if (viewer.getNumberOfSeats() >= 4) {
            int discount = totalBill * 10 / 100;
            int amount =this.totalBill-discount ;
            System.out.println("Discount Applied:");
            System.out.println(discount);
            System.out.println("Final Bill");
            System.out.println(amount);
        } else {
            System.out.println("No Discount");
        }
    }
}
