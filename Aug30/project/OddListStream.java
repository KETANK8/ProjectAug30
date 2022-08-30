/**
 * @author Ketan Kumar
 * Illustrating to filter odd value of Array List and displaying odd element using Stream filter.
 *
 */

package Aug30.project;

import java.util.ArrayList;
import java.util.Scanner;

public class OddListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int cycle = 0;
		
		while(cycle<2) {
			
			System.out.println("\n1 - Print Odd values \n2 - Exit \nEnter : ");
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
		
			// demonstration of filter method and forEach method
			// to print all the odd value from Array List
			number.stream().filter(x->x%2!=0).forEach(y->System.out.println(y));
			}
		// closing scanner object
		scan.close();
		}
}
	