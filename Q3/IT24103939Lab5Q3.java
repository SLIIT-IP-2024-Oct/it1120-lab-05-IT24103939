import java.util.Scanner;

public class IT24103939Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_10 = 10;
        final int DISCOUNT_20 = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start date of reservation (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter end date of reservation (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int daysReserved = endDate - startDate;
        double totalCost = daysReserved * ROOM_CHARGE_PER_DAY;

        if (daysReserved > 3) {
            int discountRate = (daysReserved >= 5) ? DISCOUNT_20 : DISCOUNT_10;
            totalCost -= totalCost * discountRate / 100.0;
        }

        System.out.println("Number of days reserved: " + daysReserved);
        System.out.printf("Total amount to be paid: Rs. %.2f%n", totalCost);
    }
}
