// Authors: Tristen Tulkens, Peter Adamson

import java.util.Scanner;

public class ListDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DoublyLinkedList List = new DoublyLinkedList();

		String name = null;
		int birthYear;

		do{

			System.out.printf("Enter the name or x to exit: ");
			name = scan.next();

			System.out.printf("\nEnter the year of birth or 0 to exit: ");
			birthYear = scan.nextInt();
			scan.nextLine();
			
			if( name.compareToIgnoreCase("x") != 0 && birthYear != 0 ) {

				List.addLast(new Ancestor(name, birthYear));
				System.out.printf("\n\n%s", List.toStringAscending());
				System.out.printf("\n\n");
			
			}

		} while( name.compareToIgnoreCase("x") != 0 && birthYear != 0);

		System.out.printf("\n\n%s", List.toStringAscending());
		System.out.println();
		System.out.printf("\n\n%s", List.toStringDescending());
		System.out.println();
			
	}
}
