
import java.util.ArrayDeque;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

	      System.out.println("[1] Store item (push)");
	      System.out.println("[2] View warehouse stack");
	      System.out.println("[3] Register arriving truck (enqueue)");
	      System.out.println("[4] View waiting trucks");
	      System.out.println("[5] Load next truck (pop item + poll truck");
	      System.out.println("[0] Exit");
	      System.out.print("Enter choice: ");
	      choice = sc.nextInt();
	      
	      switch (choice) {

	        case 1: storeItem(); break;
	        case 2: viewWarehouse(); break;
	        case 3: registerTruck(); break;
	        case 4: viewTrucks(); break;
	        case 5: loadTruck(); break;
	        case 0: System.out.println("See ya!"); break;
	        default: System.out.println("Invalid choice!");
	        
	      }	     
	 while (choice != 0);	      
	}

static void storeItem() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Code: ");
    String code = sc.nextLine();
    System.out.print("Enter Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Quantity: ");
    int quantity = sc.nextInt(); sc.nextLine();
    Item c = new Item(code, name, quantity);
    System.out.println("Stored: " + c);
    
}

static void viewWarehouse() {
	System.out.print("No Warehouse found. ");
    
}

static void registerTruck() {
    Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Code: ");
    String code = sc.nextLine();
    System.out.print("Enter Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Quantity: ");
    int quantity = sc.nextInt(); sc.nextLine();
    Item c = new Item(code, name, quantity);
    System.out.println("Stored: " + c);
}

static void loadTruck() {
    Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Code: ");
    String code = sc.nextLine();
    System.out.print("Enter Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Quantity: ");
    int quantity = sc.nextInt(); sc.nextLine();
    Item c = new Item(code, name, quantity);
    System.out.println("Stored: " + c);
}

static void viewTrucks() {
	
}
	}
	
