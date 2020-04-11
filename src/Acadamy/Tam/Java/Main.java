package Acadamy.Tam.Java;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static NormalArrays grocArray = new NormalArrays();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstraction();
        while (!quit) {
            System.out.printf("Enter you choice: \r");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 0:
                        printInstraction();
                        break;
                    case 1:
                        grocArray.printArrayListIteams();
                        break;
                    case 2:
                        addItem();
                        break;
                    case 3:
                        modifyItem();
                        break;
                    case 4:
                        removeItem();
                        break;
                    case 5:
                        serachItem();
                        break;
                    case 6:
                        System.out.println("See you!.");
                        quit = true;
                        break;
                    default:
                        System.out.println("Wrong Input!");


                }
            } else {
                System.out.println("Invalid Input!");
                scanner.nextLine();
            }
        }
    }

    public static void printInstraction() {
        System.out.println("\npress:");
        System.out.println("\t0-to print choice option.");
        System.out.println("\t1-to print the list of grocry items.");
        System.out.println("\t2-to add an item to list.");
        System.out.println("\t3-to modify an item to list.");
        System.out.println("\t4-to remove an item from list.");
        System.out.println("\t5-to search an item from list.");
        System.out.println("\t6-to quit an application.");
    }

    public static void addItem() {
        System.out.println("please enter the grocry item : ");
        grocArray.addArrayItem(scanner.nextLine());

    }

    public static void modifyItem() {
        System.out.println("please enter the old iteam : ");
        String oldItem = scanner.nextLine();
        System.out.println("please enter the replacment item : ");
        String newItem = scanner.nextLine();
        grocArray.modifyGroceryItem(oldItem, newItem);

    }

    public static void removeItem() {
        System.out.println("please enter item Name");
        String itemName = scanner.nextLine();
        ;
        grocArray.removeArrayItem(itemName);
    }

    public static void serachItem() {
        System.out.println("please enter the iteam name : ");
        String itemName = scanner.nextLine();
        grocArray.findByItem(itemName);
    }

}
