package MovieTicketBookingSystem;


import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ViewerInterface viewer1 = new Viewer();

        System.out.println("VIEWER1----------------");
        System.out.println("Enter number of seats: ");
        viewer1.setNumberOfSeats(new BigInteger(scanner.nextLine()).intValue());

        System.out.println("Enter screen type (GOLD/SILVER): ");
        viewer1.setScreenType(scanner.nextLine());

        System.out.println("Want snacks? (YES/NO): ");
        viewer1.setWantSnacks(scanner.nextLine());

        if (viewer1.getWantSnacks().equals("YES")){
            System.out.println("Enter snack quantity: ");
            viewer1.setSnackQuantity(new BigInteger(scanner.nextLine()).intValue());
        }
        else{
            System.out.println("no snaks required");
        }



        ViewerInterface viewer2 = new Viewer();

        System.out.println("VIEWER2----------------");
        System.out.println("Enter number of seats: ");
        viewer2.setNumberOfSeats(new BigInteger(scanner.nextLine()).intValue());

        System.out.println("Enter screen type (GOLD/SILVER): ");
        viewer2.setScreenType(scanner.nextLine());

        System.out.println("Want snacks? (YES/NO): ");
        viewer2.setWantSnacks(scanner.nextLine());

        if (viewer2.getWantSnacks().equals("YES")){
            System.out.println("Enter snack quantity: ");
            viewer2.setSnackQuantity(new BigInteger(scanner.nextLine()).intValue());
        }
        else{
            System.out.println("no snaks required");
        }



        if (viewer1.getScreenType().equals("GOLD")) {

            ScreenInterface gold = new GoldScreen("MG123", 500, 150, viewer1);
            int[][] goldScreen = new int[6][5];
            goldScreen[0] = new int[]{1, 2, 3, 4, 5};

            for (int i = 0; i < goldScreen.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < goldScreen[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print("  ");
                    }
                    System.out.print(goldScreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = 0; i < viewer1.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBookedSeat = false;
                while (!isValidSeat || !isAlreadyBookedSeat)
                    try {
                        System.out.println("Enter the Seat");
                        String row = scanner.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        BigInteger seat = new BigInteger((String.valueOf(ch[1])));
                        int finalSeat = seat.intValue() - 1;
                        if (goldScreen[finalRow + 1][finalSeat] == 1) {
                            isAlreadyBookedSeat = true;
                            System.out.println("This seat is already booked, try for a new seat");

                        }
                        goldScreen[finalRow + 1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat = true;
                    } catch (Exception e) {
                        System.out.println("This is an invalid seat, Please enter a valid seat");
                        isValidSeat = false;
                    }
            }






            viewer1.getScreen()[0] = gold;

            System.out.println("BookingID:");
            System.out.println(gold.getBookingId());

            gold.calculateTicketPrice();
            gold.calculateSnackPrice();
            gold.generateBill();
            gold.applyDiscount();
        }
        else if (viewer1.getScreenType().equals("SILVER")) {

            ScreenInterface silver = new SilverScreen("MS123", 200, 80, viewer1);
            int[][] silverScreen = new int[6][5];
            silverScreen[0] = new int[]{1, 2, 3, 4, 5};

            for (int i = 0; i < silverScreen.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < silverScreen[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print("  ");
                    }
                    System.out.print(silverScreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = 0; i < viewer1.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBookedSeat = false;
                while (!isValidSeat || !isAlreadyBookedSeat)
                    try {
                        System.out.println("Enter the Seat");
                        String row = scanner.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        BigInteger seat = new BigInteger((String.valueOf(ch[1])));
                        int finalSeat = seat.intValue() - 1;
                        if (silverScreen[finalRow + 1][finalSeat] == 1) {
                            isAlreadyBookedSeat = true;
                            System.out.println("This seat is already booked, try for a new seat");

                        }
                        silverScreen[finalRow + 1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat = true;
                    } catch (Exception e) {
                        System.out.println("This is an invalid seat, Please enter a valid seat");
                        isValidSeat = false;
                    }
            }

            viewer1.getScreen()[1] = silver;

            System.out.println("BookingID:");
            System.out.println(silver.getBookingId());

            silver.calculateTicketPrice();
            silver.calculateSnackPrice();
            silver.generateBill();
            silver.applyDiscount();
        }
        else {
            System.out.println("VIEWER1----------------");
            System.out.println("Screen type is not valid");
        }


        if (viewer2.getScreenType().equals("GOLD")) {

            ScreenInterface gold = new GoldScreen("MG124", 500, 150, viewer2);
            int[][] goldScreen = new int[6][5];
            goldScreen[0] = new int[]{1, 2, 3, 4, 5};

            for (int i = 0; i < goldScreen.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < goldScreen[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print("  ");
                    }
                    System.out.print(goldScreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = 0; i < viewer2.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBookedSeat = false;
                while (!isValidSeat || !isAlreadyBookedSeat)
                    try {
                        System.out.println("Enter the Seat");
                        String row = scanner.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        BigInteger seat = new BigInteger((String.valueOf(ch[1])));
                        int finalSeat = seat.intValue() - 1;
                        if (goldScreen[finalRow + 1][finalSeat] == 1) {
                            isAlreadyBookedSeat = true;
                            System.out.println("This seat is already booked, try for a new seat");

                        }
                        goldScreen[finalRow + 1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat = true;
                    } catch (Exception e) {
                        System.out.println("This is an invalid seat, Please enter a valid seat");
                        isValidSeat = false;
                    }
            }

            viewer2.getScreen()[0] = gold;

            System.out.println("BookingID:");
            System.out.println(gold.getBookingId());

            gold.calculateTicketPrice();
            gold.calculateSnackPrice();
            gold.generateBill();
            gold.applyDiscount();
        }
        else if (viewer2.getScreenType().equals("SILVER")) {

            ScreenInterface silver = new SilverScreen("MS124", 200, 80, viewer2);
            int[][] silverScreen = new int[6][5];
            silverScreen[0] = new int[]{1, 2, 3, 4, 5};

            for (int i = 0; i < silverScreen.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < silverScreen[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print("  ");
                    }
                    System.out.print(silverScreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = 0; i < viewer2.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBookedSeat = false;
                while (!isValidSeat || !isAlreadyBookedSeat)
                    try {
                        System.out.println("Enter the Seat");
                        String row = scanner.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        BigInteger seat = new BigInteger((String.valueOf(ch[1])));
                        int finalSeat = seat.intValue() - 1;
                        if (silverScreen[finalRow + 1][finalSeat] == 1) {
                            isAlreadyBookedSeat = true;
                            System.out.println("This seat is already booked, try for a new seat");

                        }
                        silverScreen[finalRow + 1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat = true;
                    } catch (Exception e) {
                        System.out.println("This is an invalid seat, Please enter a valid seat");
                        isValidSeat = false;
                    }
            }

            viewer2.getScreen()[1] = silver;

            System.out.println("BookingID:");
            System.out.println(silver.getBookingId());

            silver.calculateTicketPrice();
            silver.calculateSnackPrice();
            silver.generateBill();
            silver.applyDiscount();
        }
        else {
            System.out.println("VIEWER2----------------");
            System.out.println("Screen type is not valid");
        }
    }
}
