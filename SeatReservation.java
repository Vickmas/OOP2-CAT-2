package QuestionTwo;
/*
 * GROUP 6 MEMBERS
1.VICTOR MAINA                J17-1382-2022
2.CALVIN KIMANI	              J17-2089-2022
3.JEREMIAH MBAI	              J17-1369-2022
 */
import java.util.Scanner;

//Introduction of Class SeatReservation
public class SeatReservation 
{
	// Boolean used to implement True or False
	private static boolean[] seats = new boolean[21]; 

    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
     // The First Introduction Portrayed to the Customer
        while (true) 
        {
            System.out.println("Welcome to the Seat Reservation System");
            System.out.println("Please enter your desired Section Class");
            System.out.println("1. Reserve a seat in Business Class");
            System.out.println("2. Reserve a seat in Economy Class");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            // Implementation of the Customer's choice 
            switch (choice) 
            {
                case 1:
                    reserveSeat("Business Class", 1, 10);
                    return;
                case 2:
                    reserveSeat("Economy Class", 11, 20);
                    return;
                case 3:
                    System.out.println("Thank you for using the Seat Reservation System.");
                    System.out.println("May you have a lovely time!");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    System.out.println("Please enter a valid choice as showcased!");
                    break;
            }
        }
    }

    private static void reserveSeat(String section, int start, int end) 
    {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        for (int i = start; i <= end; i++) 
        {
            if (!seats[i]) 
            {
            	// Display of the Customer's Choice
            	seats[i] = true;
                System.out.println("You have been assigned Class Section: " + section);
                System.out.println("You have been assigned Seat Number: " + i);
                System.out.println("Thank You for choosing us.");
                System.out.println("May you have a good flight!");
                return;
            }
        }
     // If one of the Seat Section are Fully Occupied
        System.out.println("Sorry, the " + section + " is full.");
        System.out.println("Would you like to be placed in the other section? (yes/no)");
        String answer = scanner.next();
        
     // If the answer is YES
        if (answer.equalsIgnoreCase("yes")) 
        {
            String newSection = section.equals("Business Class") ? "Economy Class" : "Business Class";
            int newStart = section.equals("Business Class") ? 11 : 1;
            int newEnd = section.equals("Business Class") ? 20 : 10;
            reserveSeat(newSection, newStart, newEnd);
        } 
     // If the answer is NO
        else 
        {
            System.out.println("Sorry. Please wait for the next flight that leaves in 3 hours.");
        }
    }
}
