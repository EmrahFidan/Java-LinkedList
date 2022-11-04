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

            void delete() {


                if (head == null) {
                    System.out.println("empty list, added student please !!!");
                } else {
                    System.out.print("Movie Name for delete: ");
                    no = scan.nextInt();
                
    
                    if (no == head.no && head.next == null) {
                        // there is student one student on the list
                        head = null;
                        tail = null;
                        System.out.println("students list is empty !!!");
                    } else if (no == head.no && head.next != null) {
                        // there are student more than 1 on the list but I want to delete first element
                        head = head.next;
                        System.out.println("student named" + no + "has been deleted");
    
                    } else {
    
                        temp = head;
                        temp2 = head;
                        while (temp.next != null) {
                            if (no == temp.no) {
                                temp2.next = temp.next; // delete
                                System.out.println(no + "has been deleted");
                            }
                            temp2 = temp;
                            temp = temp.next;
                        }
                        if (no == temp.no) {
                            temp2.next = null; // because last Node
                            tail = temp2;
                            System.out.println(no + "has been deleted");
                        }
                    }
                }
            }

            void print() {
			
                if(head == null) {
                    System.out.println("students list empty !!!");
                }
                else {
                    temp = head;
                    while(temp != null) {
                        
                        System.out.println(" Student information number"+temp.no);
                        System.out.println("---------------------------");
                        
                        System.out.println("Name: 	 "+temp.name);
                        System.out.println("SurName: "+temp.surname);
                        System.out.println("Visa:    "+temp.visa);
                        System.out.println("Final:   "+temp.finale);
                        System.out.println("Grade:   "+temp.grade);
                        System.out.println("State:   "+temp.state);
                        
                        
                        temp = temp.next;
                    }
                }
            }

        }

    public static void main(String[] args) {



    }

}
