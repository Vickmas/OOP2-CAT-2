package QuestionOne;
/*
 * GROUP 6 MEMBERS
1.VICTOR MAINA                J17-1382-2022
2.CALVIN KIMANI	              J17-2089-2022
3.JEREMIAH MBAI	              J17-1369-2022
 */
import java.util.Scanner;

//Introduction of Class CashPurchases
class CashPurchases 
{
	//Private Member Variables
    private String itemCode;
    private int quantity;
    private double itemCost;
    private double totalCost;

    public void set(String code, int qty, double cost) 
    {
    	//Public Member Functions
        itemCode = code;
        quantity = qty;
        itemCost = cost;
        totalCost = calculateTotal();
    }
  //Definition of the Total Cost
    private double calculateTotal() 
    {
        return itemCost * quantity;
    }
  //Definition of the Final Display after the input
    public void display() 
    {
        System.out.println("Item Code/Name: " + itemCode);
        System.out.println("Quantity: " + quantity);
        System.out.println("Item Cost: Ksh " + String.format("%.2f", itemCost));
        System.out.println("Total Cost: Ksh " + String.format("%.2f", totalCost));
    }
  //Acquiring the total cost of each item
    public double getTotalCost() 
    {
        return totalCost;
    }
}

public class shop 
{
	//A driver (main ()) function definition to ensure your program executes. 
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        //An Array of objects for your class 
        int numItems;
        do 
        {
            System.out.println("Enter the number of items (Max 20): ");
            numItems = scanner.nextInt();
        } 
        while (numItems <= 0 || numItems > 20);

        CashPurchases[] purchases = new CashPurchases[numItems];

        for (int i = 0; i < numItems; i++) 
        {
        	//Outlining the Array of objects for your class
            System.out.println("Enter details for item " + (i + 1) + ":");
            CashPurchases purchase = new CashPurchases();

            System.out.println("Enter Item Code/Name: ");
            String code = scanner.next();

            System.out.println("Enter Quantity: ");
            int quantity = scanner.nextInt();

            System.out.println("Enter Item Cost: ");
            double cost = scanner.nextDouble();

            purchase.set(code, quantity, cost);
            purchases[i] = purchase;
        }
      //Final Display of the Items Purchased
        System.out.println("The Details of the Items purchased are: ");
        for (CashPurchases purchase : purchases) 
        {
            purchase.display();
            System.out.println();
        }
    }
}
