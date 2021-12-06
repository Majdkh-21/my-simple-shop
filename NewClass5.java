package as4qs1;

import java.util.Scanner;

public class NewClass5 {
public static double calculateTax( int sum){
       double taxsum=0.15*sum;
    
    
    
    
    
    
    return taxsum;
}
    public static boolean isCorrectMobile(String mobile) {
        Scanner input = new Scanner(System.in);

        while (mobile.length() != 10 && mobile.charAt(0) != 0) {
                                System.out.print(" Enter your Mobile Number (must be 10 digits and start with 0):");

            mobile = input.nextLine();
        }
        return (mobile.length() != 10 && mobile.charAt(0) != 0);
    }

    public static String generateOrderNum(String name) {
        Scanner input = new Scanner(System.in);

        int rando = 10 + (int) (Math.random() * 100);

        char fistleater = (name.charAt(0));

        return (fistleater + "_" +  rando);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = 0;
        int s = 0;
        int g = 0;
        int Quantity = 0;
        int sum = 0;
        String user = "";
        while (!"c".equals(user) || !"C".equals(user)) {

            System.out.println("----------------------------------------------------\n"
                    + "Welcome to Majd Khalid Perfumes Shop\n"
                    + "----------------------------------------------------\n"
                    + "B: Bamboo, GUCCI 200SR\n"
                    + "S: Si, Giorgio Armani 400SR\n"
                    + "G: Gris, Dior 600SR\n"
                    + "C: Confirm and Exit\n"
                    + "----------------------------------------------------");

            System.out.print("Enter your selection:");

            user = input.nextLine();

            if ("c".equals(user) || "C".equals(user)) {
                if (Quantity > 0) {
               System.out.print("Enter your Name:");
              String name = input.nextLine();
              System.out.print(" Enter your Mobile Number (must be 10 digits and start with 0):");
              String mobile = input.nextLine();
                    generateOrderNum(name);
                    isCorrectMobile(mobile);
                    System.out.println("hi " + name + ",order number:" + generateOrderNum(name));
                    System.out.println("----------------Details------------------");
                    System.out.println("Item                  Quantity      Item Total");
                    System.out.printf("%4s %9d %12d \n","Bamboo, GUCCI    " , b , (b * 200));
                    System.out.printf("%4s %4d %12d \n","Si, Giorgio Armani    " , s , (s * 200));
                    System.out.printf("%4s %7d %13d \n","Gris, Dior         " , g , (g * 200));
               System.out.println("----------------------------------------");
               System.out.println("Subtotal:"+sum);
               System.out.println("Subtotal:"+calculateTax(sum));
               System.out.println("Total Price:"+(calculateTax(sum)+sum)+" SAR");

                }
                break;
            }
            switch (user) {

                case "b":
                case "B":
                    b++;
                    sum += 200;
                    Quantity++;
                    System.out.println("Quantity:" + Quantity);

                    break;
                case "S":
                case "s":
                    s++;
                    sum += 400;
                    Quantity++;
                    System.out.println("Quantity:" + Quantity);

                    break;
                case "g":
                case "G":
                    g++;
                    sum += 600;
                    Quantity++;
                    System.out.println("Quantity:" + Quantity);

                    break;
                default:
                    System.out.println("Wrong Selection! Try again");

            }
        }
      
        
    }
}
