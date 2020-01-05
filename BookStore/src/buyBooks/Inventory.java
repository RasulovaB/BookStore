package buyBooks;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Inventory {
	
		//declare and initialize final constant names
		private final int MAX_RECORDS = 50;
		private final int RESET_VALUE = 0;
		private final int NUMBER_COUNTER = 2;
		private final int NEGATIVE_NUMBER = -1;
		//declare and initialize variable names
		private int[] isbn = new int[MAX_RECORDS];
		private String[] bookName = new String[MAX_RECORDS];
		private double[] bookPrice = new double[MAX_RECORDS];
		private int[] bookQty = new int[MAX_RECORDS];
		private double[] bookTotal = new double[MAX_RECORDS];
		private int[] numberBookCount = new int[NUMBER_COUNTER];
		private int[] numberFileCount = new int[NUMBER_COUNTER];
		private String howMany = "";
		private int idIndex = 0;
		private int bookCount = 0;
		
		
		//set file name
		public void setLoadFile(String borrowedFileName)
		{
			bookCount = RESET_VALUE;
			try
			{
				
				Scanner scan = new Scanner(new File(borrowedFileName));
				numberFileCount[0]++;

				while(scan.hasNextLine() == true && bookCount < MAX_RECORDS)
				{
					isbn[bookCount] = scan.nextInt();
					bookName[bookCount] = scan.next();
					bookPrice[bookCount] = scan.nextDouble();

					bookCount++;

				}//end of while loop

				//close the file
				scan.close();
				
				//invoke setBubleSort
				//setBubleSort();

			}//end of try

			catch(IOException ex)
			{
				bookCount = NEGATIVE_NUMBER;
				numberFileCount[1]++;
			}//END OF CATCH
		}//END OF setLoadFile



}
