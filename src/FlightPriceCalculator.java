import java.util.Scanner;
public class FlightPriceCalculator {

    static public void main (String[] args) {
        System.out.println("Welcome to Flight Ticket Price Calculator App");
        Scanner input = new Scanner (System.in);

        System.out.println("What is the distance? (KM) ");
        double distance = input.nextInt();

        double mainPrice = distance * 0.1 ;

        System.out.println(" How old is the passenger? ");
        int age = input.nextInt();
        while (!(age > 0) || age > 200) {System.out.println(" Please enter the valid data ");}

        System.out.println (" What is the flight direction?\n" +
                "1- One way \n" +
                "2- Returning \n");

        System.out.println("Please choose 1 or 2 ");


        int a = 0;

        do {
            int choosing = input.nextInt();
            if (!(choosing==1 || choosing==2)){
                System.out.println("Please choose 1 or 2 ");
            }
            else{ a++;
                mainPrice = mainPrice * choosing;
                // Discount Calculating
                if (age < 12) { mainPrice = mainPrice * 0.5; System.out.println("There is discount for 0-12 age");}
                else if (12 <= age && 24>= age) { mainPrice = mainPrice * 0.9;System.out.println("There is discount for 12-24 age"); }
                else if (age> 65) {mainPrice= mainPrice * 0.7;System.out.println("There is discount for 65+ age");}

                if (choosing ==2 ) {mainPrice=mainPrice*0.8;}
                else {System.out.println("No discount for Flight Direction");}

                System.out.println("Total price: "+ mainPrice + "USD");
                System.out.println("Thank you for choose us.");
            }
        }
        while( a == 0  );



    }
}
