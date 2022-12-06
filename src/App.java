

public class App {

    public static void main(String[] args) throws Exception {
        

String list[][] = {{"First Name","Last Name","Naughty/Nice","Street", "Gift"},
                    {"LoGaN", "may", "Naughty", "7730 Whitemarsh Court", "deOdeRant"},
                    {"Cecilia",	"bOYer", "Nice", "8686 Elm St.","PUddle"},
                    {"lorElAi",	"moRsE",  "Naughty", "8529 Birchpond St.", "TOMAto"},
                    {"rory", "black", "Naughty", "39   Fairfield Ave.", "lamp ShaDe"},
                    {"Denzel", "SancHez", "961  Hanover Ave.","shOEs"}, 
                    {"maNUEL", "Lambert", "Nice","698  Arrowhead Rd.", "chArgEr"},
                    {"Trinity",	"FISHER	Nice", "49 Arlington Avenue", "winDow"},
                    {"maTthiA", "hayEs", "Nice", "23   Woodside Ave.", "LOTION"},
                    {"Sophia",	"SToUT", "Naughty",	"7640 Andover Dr.",	"teddY beAr"},
                    {"keNNedy",	"Dunlap", "63   Cypress Rd.", "pAnts"}, 
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
                
    }

    public static String[] printArray(String[] array) { 
        for (int i = 0; i < array.length; i++) { 
            System.out.println(array[i]); 
    }
    return array;
}
public static int[] printArray(int[] array) { 
    for (int i = 0; i < array.length; i++) { 
        System.out.println(array[i]); 
    }
    return array; 

}

}