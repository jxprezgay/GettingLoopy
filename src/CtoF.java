import java.util.Scanner;

public class CtoF {
    public static void main(String[] args)
    {

        boolean num = false;
        double temp = 0;
        double newTemp;
        String trash;
        do {
            Scanner in = new Scanner(System.in);



            System.out.print("What is your temperature in Celsius: ");

            if(in.hasNextDouble()){
                temp = in.nextDouble();
                in.nextLine();
                num = false;



            } else {
                System.out.println("You entered an invalid number.");
                num=true;
            }

        }while(num == true);
        newTemp = (temp * 9/5) + 32;
        System.out.println("Your temperature in Fahrenheit is: " + newTemp);
    }
}