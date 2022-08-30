/**
 * @author Ketan Kumar
 * Illustrating to filter odd value of Array List and displaying Sum of odd element using Stream filter.
 *
 */

package Aug30.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumOfOddStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cycle = 0;
		
		while(cycle<2) {
			
			System.out.println("\n1 - Print Sum of Odd values \n2 - Exit \nEnter : ");
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
			List<Integer> oddList = number.stream().filter(x->x%2!=0).collect(Collectors.toList());
			System.out.println("\nOdd Values b/w  1-"+no+" : "+oddList);
			
			// demonstration of filter method and reduce method
			// to print all the odd value from Array List
			int result = number.stream().filter(x->x%2!=0).reduce(0,(y,x)-> y+x);
			System.out.println("\nSum of Odd values : "+result);
			}
		// closing scanner object
		scan.close();

	}

}
