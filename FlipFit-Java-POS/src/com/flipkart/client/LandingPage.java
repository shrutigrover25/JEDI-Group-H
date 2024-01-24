package com.flipkart.client;

import java.util.Scanner;

class ColorFormatter {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static String format(String text, String color) {
        return color + text + RESET;
    }
}

public class LandingPage {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int choice;

        do {
            System.out.println(ColorFormatter.format("<-------------Welcome to FlipFit Application--------->", ColorFormatter.BLUE));
            System.out.println("Enter the Choice :-->");
            System.out.println("Choice Menu :---- " + ColorFormatter.format("1. Login", ColorFormatter.GREEN));
            System.out.println("                 " + ColorFormatter.format("2. Registration Of the GYM Customer", ColorFormatter.GREEN));
            System.out.println("                 " + ColorFormatter.format("3. Registration Of the GYM Owner", ColorFormatter.GREEN));
            System.out.println("                 " + ColorFormatter.format("4. Update Password", ColorFormatter.GREEN));
            System.out.println("                 " + ColorFormatter.format("5. Exit", ColorFormatter.GREEN));
            System.out.printf("Enter the choice: ");
            choice = inp.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(ColorFormatter.format("You chose Login", ColorFormatter.GREEN));

                    // Read user input for login details
                    System.out.print("Enter the " + ColorFormatter.format("UserName", ColorFormatter.BLUE) + ": ");
                    String userName = inp.next();
                    System.out.print("Enter the " + ColorFormatter.format("Passcode", ColorFormatter.BLUE) + ": ");
                    String passcode = inp.next();

                    // Read user input for role
                    System.out.println("Enter the " + ColorFormatter.format("Role", ColorFormatter.BLUE) + " ");
                    System.out.println("    1. " + ColorFormatter.format("Gym Customer", ColorFormatter.BLUE));
                    System.out.println("    2. " + ColorFormatter.format("Gym Owner", ColorFormatter.BLUE));
                    System.out.println("    3. " + ColorFormatter.format("Gym Admin", ColorFormatter.BLUE));

                    int roleChoice = inp.nextInt();
                    int gymavail;

                    // Perform actions based on the user's role
                    switch (roleChoice) {
                        case 1:
                            do {
                                System.out.println("\nThe menu for " + ColorFormatter.format("Gym Customer", ColorFormatter.GREEN) + " is: ");
                                System.out.println("    1. " + ColorFormatter.format("Select the Gym at Bangalore", ColorFormatter.GREEN));
                                System.out.println("    2. " + ColorFormatter.format("View Gym availability", ColorFormatter.GREEN));
                                System.out.println("    3. " + ColorFormatter.format("Fetch user history", ColorFormatter.GREEN));
                                System.out.println("    4. " + ColorFormatter.format("View Gym Details", ColorFormatter.GREEN));
                                System.out.println("    5. " + ColorFormatter.format("Edit Profile", ColorFormatter.GREEN));
                                System.out.println("    6. " + ColorFormatter.format("Exit", ColorFormatter.GREEN));

                                // Implement Gym Customer menu
                                gymavail = inp.nextInt();

                                switch (gymavail) {
                                    case 2:
                                        System.out.println("1. " + ColorFormatter.format("Bellandur", ColorFormatter.YELLOW));
                                        System.out.println("2. " + ColorFormatter.format("Whitefield", ColorFormatter.YELLOW));

                                        int slots = inp.nextInt();

                                        switch (slots) {
                                            case 1:
                                                System.out.println("The gyms at " + ColorFormatter.format("Bellandur", ColorFormatter.YELLOW) + ":");
                                                System.out.println("    1. " + ColorFormatter.format("Fit and Fly", ColorFormatter.PURPLE));
                                                System.out.println("    2. " + ColorFormatter.format("Cultfit", ColorFormatter.PURPLE));

                                                int gymno = inp.nextInt();

                                                switch (gymno) {
                                                    case 1:
                                                        System.out.println("The number of slots at " + ColorFormatter.format("Fit and Fly", ColorFormatter.BLUE) + " are 20");
                                                        break;

                                                    case 2:
                                                        System.out.println("The number of slots at " + ColorFormatter.format("Cultfit", ColorFormatter.BLUE) + " are 10");
                                                        break;
                                                }
                                                break;

                                            case 2:
                                                System.out.println("The gyms at " + ColorFormatter.format("Whitefield", ColorFormatter.YELLOW) + ":");
                                                System.out.println("    1. " + ColorFormatter.format("Fitness Hub", ColorFormatter.PURPLE));
                                                System.out.println("    2. " + ColorFormatter.format("Fit and 7", ColorFormatter.PURPLE));

                                                int gymno2 = inp.nextInt();

                                                switch (gymno2) {
                                                    case 1:
                                                        System.out.println("The number of slots at " + ColorFormatter.format("Fitness Hub", ColorFormatter.BLUE) + " are 20");
                                                        break;

                                                    case 2:
                                                        System.out.println("The number of slots at " + ColorFormatter.format("Fit and 7", ColorFormatter.BLUE) + " are 10");
                                                        break;
                                                }
                                                break;
                                                
                                        }
                                        
                                }
                                
                               
                           }while(gymavail!=6);
                           break;
                        
                            case 2:
                                System.out.println("The menu for Gym Owner is: "+ ColorFormatter.GREEN);
                                System.out.println("1. Add a new gym"+ColorFormatter.GREEN);
                                System.out.println("2. Edit Gym details"+ColorFormatter.GREEN);
                                System.out.println("3. Delete Gym profile"+ColorFormatter.GREEN);
                                System.out.println("4. Edit slots in the Gym"+ColorFormatter.GREEN);
                                System.out.println("5. Add slots for the gym"+ColorFormatter.GREEN);
                                System.out.println("6. Edit Profile"+ColorFormatter.GREEN);
                                break;
                            case 3:
                                System.out.println("The menu for Gym Admin is: "+ColorFormatter.GREEN);
                                System.out.println("1. Approve Gym requests"+ColorFormatter.GREEN);
                                System.out.println("2. Refuse Gym requests"+ColorFormatter.GREEN);
                                System.out.println("3. View Pending Requests"+ColorFormatter.GREEN);
                                System.out.println("4. Remove slots for the gym"+ColorFormatter.GREEN);
                                System.out.println("5. View booked slots for the gym"+ColorFormatter.GREEN);
                                System.out.println("7. Add new Admin"+ColorFormatter.GREEN);
                                break;
                            default:
                                System.out.println("Invalid role choice"+ColorFormatter.GREEN);
                                break;
                        }
                        break;
                
                        
                    case 2:
                        System.out.println("You chose Registration Of the GYM Customer"+ColorFormatter.PURPLE);
                        break;
                    case 3:
                        System.out.println("You chose Update Password"+ColorFormatter.PURPLE);
                        break;
                    case 4:
                        System.out.println("You chose Exit"+ColorFormatter.PURPLE);
                        break;
                    default:
                        System.out.println("Invalid choice"+ColorFormatter.PURPLE);
                }
            } while (choice != 5);

//            System.out.println("FINISH!!!!");
        }
    }
                                        


