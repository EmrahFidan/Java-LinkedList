import java.util.Scanner;

public class studentRegisterSystem {

        static class Node {

            int no;
            String name;
            String surname;
            int visa;
            int finale;
            double grade;
            String state;
    
            Node next;
    
            // constructor
            public Node(int no, String name, String surname, int visa, int finale) {
                super();
                this.no = no;
                this.name = name;
                this.surname = surname;
                this.visa = visa;
                this.finale = finale;
    
                grade = visa * (0.4) + finale * (0.6);
    
                if (grade >= 50) {
                    state = "passed";
                } else {
                    state = "left";
                }
    
                next = null;
    
            }
    
        }

        static class List {

            Node head = null;
            Node tail = null;
            // geçiçi Nodes for aim
            Node temp = null;
            Node temp2 = null;
    
            int no;
            String name;
            String surname;
            int visa;
            int finale;
            double grade;
            String state;
    
            Scanner scan = new Scanner(System.in); // ctrl + shift + o

            


        }

    public static void main(String[] args) {



    }

}
