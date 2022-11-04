import java.util.Scanner;

public class moviesLL {

	// I created a node structure
	static class Node {

		String movieName;
		String movieDirectory;
		String movieCategory;
		double movieIMDBrate;

		Node next;

		// constructor
		public Node(String movieName, String movieDirectory, String movieCategory, double movieIMDBrate) {
			super();
			this.movieName = movieName;
			this.movieDirectory = movieDirectory;
			this.movieCategory = movieCategory;
			this.movieIMDBrate = movieIMDBrate;

			next = null;

		}
	}

	// I created my Linked list
	static class MyLinkedList {

		Node head = null;
		Node tail = null;
		// temporary node
		Node temp = null;
		Node temp2 = null;

		String movieName;
		String movieDirectory;
		String movieCategory;
		double movieIMDBrate;
		
		Scanner scan = new Scanner(System.in);

		void add() {

			Scanner scan = new Scanner(System.in);
			
			System.out.print("MovieName: ");
			String movieName = scan.nextLine();
			
			System.out.print("MovieDirectory: ");
			String movieDirectory = scan.nextLine();
			
			System.out.print("MovieCategory: ");
			String movieCategory = scan.nextLine();
			
			System.out.print("MovieIMDBrate: ");
			double movieIMDBrate = scan.nextDouble();
			
			
			Node newNode = new Node(movieName, movieDirectory, movieCategory, movieIMDBrate);

			// if the list is empty 
			if (head == null) {
				head = newNode;
				tail = newNode;
				System.out.println();
				System.out.println("First movie is added");
			} 
			
			else {
				// control
				if(movieName.equalsIgnoreCase(head.movieName)) {
					System.out.println("Bu film zaten kayitli...");
					head = head.next;
					return;
				}
				// add it as the last element
				else {
			            tail.next = newNode;
			            tail = newNode;
				}
				
			}

			// adding in alphabetical order
			
			Node current = head,
			temp2 = null;
			 
	        String name;
	        String directory;
	        String category;
	        double ımdb;
	 
	        if (head == null) {
	            return;
	        }
	        else {
	            while (current != null) {
	                
	                temp2 = current.next;
	                int compare = current.movieName.compareTo(movieName);
	                
	                while (temp2 != null) {
	                    // the location of each entered value must be changed
	                    if (compare > 0) {
	                        name = current.movieName;
	                        directory = current.movieDirectory;
	                        category = current.movieCategory;
	                        ımdb = current.movieIMDBrate;
	                        
	                        current.movieName = temp2.movieName;
	                        current.movieDirectory = temp2.movieDirectory;
	                        current.movieCategory = temp2.movieCategory;
	                        current.movieIMDBrate = temp2.movieIMDBrate;
	                        
	                        temp2.movieName = name;
	                        temp2.movieDirectory = directory;
	                        temp2.movieCategory = category;
	                        temp2.movieIMDBrate = ımdb;
	                    }
	 
	                    temp2 = temp2.next;
	                }
	                current = current.next;
	            }
	        }
	}

				

}
	public static void main(String[] args) {

	}

}
