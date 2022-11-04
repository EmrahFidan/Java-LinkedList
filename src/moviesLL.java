
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

		
	public static void main(String[] args) {

	}

}
