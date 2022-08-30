/**
 * @author Ketan Kumar
 * Illustrating Product of Array List element with a value and storing result in new list using Stream.
 *
 */

package Aug30.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListProductStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create a list of integers
		Scanner scan = new Scanner(System.in);
		int cycle = 0;
		
		while(cycle<2) {
			
			System.out.println("\n1 - Print Table \n2 - Exit \nEnter : ");
			cycle = scan .nextInt();
			if(cycle>1)
				System.exit(0);
		
			System.out.println("Enter No of Elements : ");
			int no = scan .nextInt();
			
			//Creating Array List to store elements
			ArrayList<Integer> number = new ArrayList<Integer>();
			for(int i = 1;i<=no;i++) {
				
				//Passing i in the ArrayList to store numbers in list
				number.add(i);
			}
			System.out.println("Enter the Value of Multiplier : ");
			int value = scan .nextInt();
	  
			// demonstration of map method and collect method 
			// to perform multiplication on elements of ArrayList and storing data in new list
			List<Integer> product = number.stream().map(x -> x*value).collect(Collectors.toList());
			System.out.print("\nResult : ");
			System.out.println(product);
		}
		// closing scanner object
		scan.close();
	}

}
