package MovieTicketBookingSystem;

public interface ViewerInterface {
    public int getNumberOfSeats();
    public void setNumberOfSeats(int numberOfSeats);
    public String getScreenType();
    public void setScreenType(String screenType);
    public String getWantSnacks();
    public void setWantSnacks(String wantSnacks);
    public int getSnackQuantity();
    public void setSnackQuantity(int snackQuantity);


    public ScreenInterface[] getScreen();
    public void setScreen(ScreenInterface[] screen);

}