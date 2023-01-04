import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        // Elements 

        int userIn; 
        int userChoice; 
       
        String childFirstName1; 
        String childLastName1; 
        String childStatus1; 
        String childAddress1; 
        String childGift1; 
        
        
        // Naughty & Nice List Array 

        String santasList[][] = {

                    {"First Name","Last Name","Naughty/Nice","Street", "Gift"},
                    {"LoGaN", "may", "Naughty", "7730 Whitemarsh Court", "deOdeRant"},
                    {"Cecilia",	"bOYer", "Nice", "8686 Elm St.","PUddle"},
                    {"lorElAi",	"moRsE",  "Naughty", "8529 Birchpond St.", "TOMAto"},
                    {"rory", "black", "Naughty", "39   Fairfield Ave.", "lamp ShaDe"},
                    {"Denzel", "SancHez", "", "961  Hanover Ave.","shOEs"}, 
                    {"maNUEL", "Lambert", "Nice","698  Arrowhead Rd.", "chArgEr"},
                    {"Trinity",	"FISHER", "Nice", "49 Arlington Avenue", "winDow"},
                    {"maTthiA", "hayEs", "Nice", "23   Woodside Ave.", "LOTION"},
                    {"Sophia",	"SToUT", "Naughty",	"7640 Andover Dr.",	"teddY beAr"},
                    {"keNNedy",	"Dunlap", "", "63   Cypress Rd.", "pAnts"}, 
                    {"","","","",""},
                    {"","","","",""},
                    {"","","","",""},
                    {"","","","",""},
                    {"","","","",""},
                    {"","","","",""},
                    {"","","","",""},
                    {"","","","",""},
                    {"","","","",""},
                    {"","","","",""},     
            };
            
                printArray(santasList);

                // Change data to uppercase
                for (int row = 0; row < santasList.length; row++) { 
                    
                    for (int column = 0; column < santasList[row].length; column++) { 
                        santasList[row][column] = santasList[row][column].toUpperCase();
                    }

                }

                
           
        // Loops to add new children to the Array List or to Search for kids that are already on the list

        // Inital Prompt 

        do { 
            System.out.println(Colors.ANSI_BLUE + "Would you like to add another child to this list?");
                Thread.sleep(500);
            System.out.println("Or view the list?");
                Thread.sleep(500);
            System.out.println("Type \'1\' to add a child.");
            System.out.println("Type \'2\' to view the existing list.");
            System.out.println("Type \'0\' to exit.");
                
            userIn = in.nextInt();
            userChoice = 0;
            userChoice = userIn;
            


        // Inner Loop w/results    


            // Error Handling

            while(userChoice != 1 && userChoice != 2 && userChoice != 0) { 

                System.out.println("Invalid input. Try again."); 

                System.out.println("Type '1' to add a child.");

                System.out.println("Type '2' to view the existing list.");

                userChoice = in.nextInt();

            } 
            

            

            // View Santa's list

            if (userChoice == 2) {
                
                System.out.println("Okay! Initializing Santa's list now...");
                Thread.sleep(1000);
                
                printArray(santasList);


            }
            
            // Add a new child to the list 

            else if (userChoice == 1) { 

                // Recieving user input and storing the child's information 

                System.out.println("Okay! Let's get started..." + Colors.ANSI_RESET); 
                Thread.sleep(500);

                System.out.println(Colors.ANSI_PURPLE + "Input the child's first name");
                in.nextLine();
                childFirstName1 = in.nextLine();
                
                System.out.println("First Name: " + childFirstName1 + Colors.ANSI_RESET);
                Thread.sleep(500); 
                System.out.println(Colors.ANSI_BLACK + "Input the child's last name"); 
                childLastName1 = in.nextLine();
                
                System.out.println("Last Name: " + childLastName1 + Colors.ANSI_RESET);
                Thread.sleep(500); 
                System.out.println(Colors.ANSI_CYAN + "Input the child's naughty or nice status"); 
                childStatus1 = in.nextLine();
                
                System.out.println("Status: " + childStatus1 + Colors.ANSI_RESET);
                Thread.sleep(500); 
                System.out.println(Colors.ANSI_YELLOW + "Input the child's address"); 
                childAddress1 = in.nextLine();
                
                System.out.println("Address: " + childAddress1 + Colors.ANSI_RESET);
                Thread.sleep(500);  
                System.out.println(Colors.ANSI_RED + "Input the child's gift"); 
                childGift1 = in.nextLine();
                System.out.println("Gift: " + childGift1 + Colors.ANSI_RESET);
                Thread.sleep(500); 

                System.out.println(Colors.ANSI_GREEN + "All done! " + childFirstName1 + " has been added to Santa's list!");
                
                for (int row = 0; row < santasList.length; row++) { 
                    if (santasList[row][0].equals("")
                        && santasList[row][1].equals("") 
                        && santasList[row][2].equals("") 
                        && santasList[row][3].equals("") 
                        && santasList[row][4].equals("") 
                    ) { 
                        santasList[row][0] = childFirstName1; 
                        santasList[row][1] = childLastName1; 
                        santasList[row][2] = childStatus1; 
                        santasList[row][3] = childAddress1; 
                        santasList[row][4] = childGift1; 

                        printArray(santasList);
                        break;
                    }

                }
                
                
    

            }
          
            else if (userChoice == 0) { 
                System.exit(0);

            }
        

            
        } while(true); 
    }

    // Printing Santa's List

    public static void printArray(String[][] array) {
        for (int row = 0; row < array.length; row++) {
            if (array[row][2].toUpperCase().equals("NAUGHTY")) {
                System.out.println(Colors.ANSI_RED);
            } else if (array[row][2].toUpperCase().equals("NICE")) {
                System.out.println(Colors.ANSI_GREEN);
            } else {
                System.out.println(Colors.ANSI_YELLOW);
            }
            if (array[row][2].toUpperCase().equals("NAUGHTY")) {
                array[row][4] = ("COAL");
            }
            for (int column = 0; column < array[row].length; column++) {
                System.out.println(array[row][column].toUpperCase());
            }
            System.out.println(Colors.ANSI_RESET);

        }

    }

}
