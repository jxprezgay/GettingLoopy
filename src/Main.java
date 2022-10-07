import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //A
        for (int x=0; x <= 30; x++)
        {
            System.out.println(x);
        }
        System.out.println();
        for (int x=30; x >= 0; x--)
        {
            System.out.println(x);
        }
        System.out.println();
        for (int x=0; x <= 18; x+=3)
        {
            System.out.println(x);
        }
        System.out.println();
        for (int x=10; x >= 0; x-=2)
        {
            System.out.println(x);
        }
        System.out.println();
        //B
        int x = 1;
        for (int row = 0; row < 5; row++){

            for (int column = 0; column < x; column ++){
                System.out.print("*");
            }
            x++;
            System.out.println();
        }
        System.out.println();
        int y = 0;
        for (int row = 0; row < 5; row++){
            for (int column = 5; column > y; column --){
                System.out.print("*");
            }
            y++;
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < 5; row++ ){
            for (int column = 0; column < 5; column ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //Letter
        for (int row = 0; row < 2; row++ ){
            for (int column = 0; column < 19; column ++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 0; row < 4; row++ ){
            System.out.print("       ");
            for (int column = 0; column < 5; column ++){
                System.out.print("*");
            }
            System.out.println();
        } for ( x=0; x < 1; x++){
        System.out.println("****   *****");
        }
        for ( x=0; x < 1; x++){
            System.out.println(" ****  *****");
        }
        for ( x=0; x < 1; x++){
            System.out.println("  *** ***** ");
        }
        for ( x=0; x < 1; x++){
            System.out.println("   *******  ");
        }



    }
}