import java.util.Scanner;

public class LEVEL5 {
    
    /**
     * It is used to show document of our methods when we hover on them
     * @param args
     */
    public static void main(String[] args) {
        
        // This is Single Line Comment in Java

        /* This is Multi Line
           Comment in Java
        */

        // While Loop :- while (condition) { Body of Loop }

        Scanner input = new Scanner(System.in);

        int num = 1;  // Initialisation
        while (num <= 10) {  // Condition
            System.out.print(num +" ");  // Body of Loop
            num += 1;  // Update Statement
        }

        int count = 50;
        System.out.println();
        while (count >= 20) {
            System.out.print(count +" ");
            count -= 1;
        }

        System.out.println();

        int iterate = 1;
        while (iterate < 4) {
            int user_input = input.nextInt();
            System.out.println("Your Entered Number = "+user_input);
            iterate++;
        }

        // Function / Methods :- Block of code that can be reused when needed 
        // Syntax :- modifier return-type methodname (parameters){ body of method }

        greetuser();  // Method Call
        pattern1();   // main fuction is call by jvm
        pattern2();
        pattern3();

        // Return Statement :- Send a value back from function in the called variable It ends the function immediately

        float num1 = readnum() + 1;
        float num2 = readnum() + 2;

        System.out.println("Sum of the given number = "+(num1 + num2));

        // Argument and Parameters

        float val1 = readnum();
        float val2 = readnum();

        float sum = givesum(val1,val2);  // Here , Values in givesum are Arguments

        System.out.println("Sum of Numbers = "+sum);

    }

    public static void greetuser(){
        System.out.println("Good Morning! Welcome to my Tutorial");
    }

    public static void pattern1(){
        int row = 0;

        while (row < 5) {

            int star = 0;
            while (star <= row) {
                System.out.print("* ");
                star++;
            }

            row++;
            System.out.println();
        }
    }

    public static void pattern2(){
        int row = 5;

        while (row > 0) {

            int star = 0;
            while (star < row) {
                System.out.print("* ");
                star++;
            }

            row--;
            System.out.println();
        }
    }

    public static void pattern3(){
        int row = 0;

        while (row < 5) {
            
            int star = row + 1;
            int spaces = 5 - star;

            while (spaces > 0 ) {
                System.out.print("  ");
                spaces--;
            }

            while (star > 0) {
                System.out.print(" *");
                star--;
            }

            row++;
            System.out.println();

        }
    }

    public static float readnum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        float number = scan.nextFloat();
        return number;
    }

    public static float givesum(float num1,float num2){  // Here , Values in givesum() are Parametrer
        return num1 + num2;
    }

}
