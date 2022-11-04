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

		

	}
	public static void main(String[] args) {

	}

}
