/** FILENAME: [BookStore]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [To track books inventory and record sales]**/



package buyBooks;

import java.util.Scanner;



//declare and initialize class constants

public class MainClass {
	
	public static final String[] MAIN_MENU = {"LOAD INVENTORY", "QUIT"};
	public static final String[] SEARCH_MENU = {"SEARCH FOR A BOOK ID", "RETURN TO THE MAIN MENU"};
	public static final String[] SEARCH_RESULT = {"BOOK ID", "TITLE NAME", "BOOK PRICE","BOOK QTY","BOOK TOTAL"};
	public static final String[] TITLE_REPORT = {"SEARCH RESULTS","SEARCH REPORT","FILE PROCESSING REPORT","CONFIRMATION","ORDER REPORT"};
	public static final String[] ID_REPORT = {"SEARCH COUNT","IDs Found","IDs Not Found"};
	public static final String[] FILE_REPORT = {"FILE COUNT","FILES FOUND","FILES NOT FOUND"};
	public static final String[] PURCHASE_MENU = {"PURCHASE COPIES OF THE BOOK", "RETURN TO THE SEARCH MENU"};

	public static void main(String[] args) {
		
		//declare and initialize

				char menuSelection = ' ';
				String userName = "";

				Scanner input = new Scanner (System.in);

				//CREATE OBJECT
				Inventory bookInventory = new Inventory();
                //WriteBookOrders bookOrder = new WriteBookOrders();
				
				//call welcome banner
				displayWelcomeBanner();

				//assign userName
				/*User Input*/
				userName = getUserName(input);

				//Prime read of menuSelection
				menuSelection = validateMainMenu(input,MAIN_MENU );
				
				
				
				//close the Scanner
				input.close();
		

	}//END OF MAIN METHOD
	
	//display welcome banner
		public static void displayWelcomeBanner()
		{
			System.out.println("Welcome to our program BookStore!");
			System.out.println("This program will help to keep track of your inventory");
			System.out.println("and allow you to search for a specific record.");
			System.out.printf("%-10s\n","Let's begin!");
			System.out.println("_______________________________________________________");
			System.out.println();

		}//end of welcome banner
		//Get user name
		public static String getUserName(Scanner borrowedInput)
		{
			String localUserName = "";
			System.out.print("Provide user first name: ");
			localUserName = borrowedInput.nextLine();
			System.out.println("\n***** ***** ***** ***** ***** *****");
			System.out.println("Welcome " + localUserName + "!");
			System.out.println("***** ***** ***** ***** ***** *****");
			return localUserName;
		}//end of get user name


		//validate main menu input
		public static char validateMainMenu(Scanner borrowedInput, String[] borrowedMainMenu)
		{
			char localMenuSelection = ' ';
			//call display main menu
			displayMainMenu(borrowedMainMenu);

			//Prime read selection

			localMenuSelection = borrowedInput.nextLine().toUpperCase().charAt(0);

			//must validate input
			while (localMenuSelection != 'A' && localMenuSelection != 'Q')
			{
				System.out.println("*************************************************************");	
				System.out.printf("%-20s", "Invalid Selection.");	
				System.out.println("\nPlease try again. ");
				System.out.println("*************************************************************");
				//call displayMainMenu
				displayMainMenu(borrowedMainMenu);
				//Modify LCV
				localMenuSelection = borrowedInput.nextLine().toUpperCase().charAt(0);
			}//end of validate input
			return localMenuSelection;
		}//end of validateMainMenu

		//display main menu
		public static void displayMainMenu(String[] borrowedBorrowedMainMenu)
		{
			System.out.println();	

			System.out.println("\nNow select from our menu: ");
			System.out.println("_____________________________________________________________\n");
			System.out.print("MAIN MENU:\n");
			System.out.printf("\n%-1s%15s\n","[A]",borrowedBorrowedMainMenu[0]);
			System.out.printf("\n%-1s%5s\n","[Q]", borrowedBorrowedMainMenu[1]);
			System.out.println("_____________________________________________________________\n");
			System.out.print("\nPlease enter your selection here: ");
		}//end of display main menu

}//END OF MAIN CLASS
