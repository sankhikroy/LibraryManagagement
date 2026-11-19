import java.util.*;
public class issueCOUNTER {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library obj = new Library();
        boolean running = true;
        while (running) {
            System.out.println("Press 1 for add book\nPress 2 for view book\n Press 3 to borrow book\nPress 4 to return book press 5 to exit");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Book Id");
                    int id = in.nextInt();
                    in.nextLine();
                    System.out.println("Enter Author Name");
                    String aname = in.nextLine();
                    System.out.println("Enter Book name");
                    String bname = in.nextLine();
                    Book adbook = new Book(id, aname, bname);
                    obj.addbook(adbook);
                    System.out.println("Books added successful");
                    break;
                case 2:
                    obj.viewbook();
                    break;
            case 3:
                System.out.println("Enter Book id to borrow");
                int borrowid = in.nextInt();
                obj.borrowbook(borrowid);
                break;
                case 4:
                    System.out.println("Enter Book id to return");
                    int returnid=in.nextInt();
                    obj.returnbook(returnid);
                    break;
                case 5:
                    running=false;
                    System.out.println("Thanks for using app");
                    break;
                default:
                    System.out.println("Please enter correct value");
        }
    }
        in.close();
    }}