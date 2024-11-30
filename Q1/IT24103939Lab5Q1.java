import java.util.Scanner;

public class IT24103939Lab5Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        int no1, no2, no3;
        int smallest;
        int largest;

        System.out.println("Enter the first integer: ");
        no1 = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        no2 = scanner.nextInt();

        System.out.println("Enter the third integer: ");
        no3 = scanner.nextInt();

        System.out.println("User entered number 1 = " + no1);
        System.out.println("User entered number 2 = " + no2);
        System.out.println("User entered number 3 = " + no3);

        
        if (no1 <= no2 && no1 <= no3) {
            smallest = no1;
        } else if (no2 <= no1 && no2 <= no3) {
            smallest = no2;
        } else {
            smallest = no3;
        }

       
        if (no1 >= no2 && no1 >= no3) {
            largest = no1;
        } else if (no2 >= no1 && no2 >= no3) {
            largest = no2;
        } else {
            largest = no3;
        }

        
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        scanner.close();
    }
}

