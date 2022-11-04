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
            // temporary Nodes for aim
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

            void add() {

                System.out.println("\nPlease enter infos of student: ");
    
                System.out.print("No: ");
                no = scan.nextInt();
                scan.nextLine();
    
                System.out.print("Name: ");
                name = scan.nextLine();
    
                System.out.print("Surname: ");
                surname = scan.nextLine();
    
                System.out.print("Visa: ");
                visa = scan.nextInt();
    
                System.out.print("Finale: ");
                finale = scan.nextInt();
    
                Node pointer = new Node(no, name, surname, visa, finale);
    
                if (head == null) {
                    head = pointer;
                    tail = pointer;
                    System.out.println("Added first student");
                } else {
                    pointer.next = head;
                    head = pointer;
                    System.out.println("The student is registered");
                    System.out.println();
                }
    
            }

            

        }

    public static void main(String[] args) {



    }

}
