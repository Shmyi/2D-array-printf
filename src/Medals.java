/*
File name: [Medals.java ]
Author: [ Yi Chen, 041138529]
Course: CST8284 – OOP
Assignment: [LabEx02]
Date: [9/11/2024]
Professor: [George Kriger]
Lab Section:332
Purpose: [LabEx02]
*/
/**
*   This program prints a table of medal winner counts with row totals.
*   @author Yi Chen
*/
public class Medals
{
/**
 * This main method is the entry for this program
 * @param args Command line arguments
 */
   public static void main(String[] args)
   {
	   /**
	    * The total countries shows in the table
	    * There are three type of medals in the table 
	    */
      final int COUNTRIES = 8;
      final int MEDALS = 3;
/**
 * Declare the names in the array of countries
 * @para countries Array of country names
 */
      String[] countries =
         {
            "Canada",
            "Italy",
            "Germany",
            "Japan",
            "Kazakhstan",
            "Russia",
            "South Korea",
            "United States"
         };
/**
 * Declare the 2D array of medals counts for each corresponds countries 
 * @para counts array of medals counts
 */
      int[][] counts =
         {
            { 0, 3, 0 },
            { 0, 0, 1 },
            { 0, 0, 1 },
            { 1, 0, 0 },
            { 0, 0, 1 },
            { 3, 1, 1 },
            { 0, 1, 0 },
            { 1, 0, 1 }
         }; 
     
      //TODO replace println() below with printf() to format the columns
 	  System.out.printf("%15s%8s%8s%8s%8s%n", "Country", "Gold", "Silver", "Bronze", "Total");

 	  int[] columnTotals = new int[MEDALS];
      
      // Print countries, counts, and row totals
      for (int i = 0; i < COUNTRIES; i++)
      {
         // Process the ith row
    	 // TODO Use printf() to print country name as a field of 15 bytes as a String value:
         System.out.printf("%15s", countries[i]);

         int rowTotal = 0; 

         // Print each row element and update the row total
         for (int j = 0; j < MEDALS; j++)
         {
            System.out.printf("%8d", counts[i][j]);
            
            // TODO calculate the total for each row
            rowTotal += counts[i][j];
            columnTotals[j] += counts[i][j];
         }
         // Display the row total and print a new line
         // TODO use printf() to print  total for each row as a field of size 8 and numeric data type. Include newline after printing each value
         System.out.printf("%8d%n", rowTotal);
      }
      
      // TODO - Define an array of size 3 to hold the total for each column. 
      //        Modify the above code to keep total for each medal type, and then use a for loop to print total line below
      int[] medalsTotals = new int[MEDALS];

          System.out.printf("%15s", "Medal Total");
          for (int j = 0; j < MEDALS; j++) {
        	// Print totals for each column
        	  medalsTotals[j] = columnTotals[j];
              System.out.printf("%8d", medalsTotals[j]); 
          }

          // Calculate and print the grand total of all medals
          int grandTotal = 0;
          for (int i = 0; i< MEDALS; i++) {
        	  grandTotal += medalsTotals[i];
          }
          System.out.printf("%8d%n", grandTotal);
      }
}


