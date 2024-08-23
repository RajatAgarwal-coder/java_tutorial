import java.lang.*;
import java.util.Scanner;  //  Used to take input from user

public class LEVEL3 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Variable Declaration

        // 1. To declare Integer variable

        byte var_byte1 = 55; 
        System.out.println(var_byte1);

        short var_short = 556;
        System.out.println(var_short);

        int var_int = 415;
        System.out.println(var_int);

        long var_long = 64645455l;  //  l is used to denote that it is long value
        System.out.println(var_long);

        // 2. To declare Character variable

        char var_char1 = '\u0000';
        System.out.println(var_char1);

        char var_char2 = 'a';
        System.out.println(var_char2);

        // 3. To declare Decimal variable

        float var_float1 = 45.54f;  // f is used to denote that it is float value
        System.out.println(var_float1);
        
        float var_float2 = 5;  // It automatically consider 5 as 5.0
        System.out.println(var_float2);

        double var_double1 = 12512.52752d;  //  d is used to denote that it is double value
        System.out.println(var_double1);  // Except float all decimals are cosider as double

        double var_double2 = 5.0;
        System.out.println(var_double2);

        // 4. To declare Boolean variable (True or False)

        boolean var_boolean = true;
        System.out.println(var_boolean);

        // 5. To declare String variable

        String var_string = "Rajat Agarwal";  // Strings are always declare in double quotes
        System.out.println(var_string);

        int num1 = 55;  //  Both ways are right to declare the variable
        int num2;  //  It is declaration and assigining value is initialisation

        num2 = 88;
        System.out.println(num2);

        num2 = 254;  // It re-write the value written in memory location
        System.out.println(num2);

        // Java Identifiers are Case Sensitive means num1 and NUM1 both are consider different

        // int num = 55;  int is Data Type , num is Identifier , 55 is Literal

        // Escape Sequence

        System.out.println("Escape\tSequence\t");  //  \t used to insert a tab space after the text

        System.out.println("Escape\bSeque\bnce");  //  \b used to insert a backspace

        System.out.println("Escape\nSequence");  //  \n used to insert a new line after the text

        System.out.println("Escape \'Sequence\'");  //  \' used to insert single quotes characeter
        
        System.out.println("Escape \"Sequence\"");  //  \" used to insert double quote character

        System.out.println("Escape \\Sequence\\");  //  \\ used to insert backslash character

        // Programming Challenges

        // Challenge 4

        System.out.println("*\n* *\n* * *\n* * * *\n* * * * *");
        
        System.out.println();

        System.out.println("* * * * *\n* * * *\n* * *\n* *\n*");

        System.out.println();

        System.out.println("        *\n      * *\n    * * *\n  * * * *\n* * * * *");

        // User Input

        Scanner input = new Scanner(System.in);  // Object Declaration

        System.out.print("Please Enter Your Name : ");
        String name = input.nextLine();  // Used to input string from user
        System.out.println(name);

        System.out.print("Please Enter if are foodie or not : ");
        boolean isfoodie = input.nextBoolean();  // Used to input boolean from user

        System.out.print("Please Enter a Small Integer Number : ");
        short number1 = input.nextShort();  // Used to input small integer from user

        System.out.print("Please Enter a Long Integer Number : ");
        long number2 = input.nextLong();  // Used to input long integer from user

        System.out.print("Please Enter a Small Decimal Number : ");
        float number3 = input.nextFloat();  // Used to input small decimal from user

        System.out.print("Please Enter a Long Decimal Number : ");
        double number4 = input.nextDouble();  // Used to input long decimal from user

        // Programming Challenges

        // Challenge 5

        System.out.print("Please Enter Your Name : ");
        input.nextLine();  // Consume the leftover newline because it is not comsume by double
        String user_name = input.nextLine();
        System.out.println("Welcome "+user_name+" to my Java Tutorial");

        // Challenge 6

        System.out.print("Please Enter the First Number : ");
        float fl1 = input.nextFloat();

        System.out.print("Please Enter the Second Number : ");
        float fl2 = input.nextFloat();

        double sum = fl1 + fl2;
        System.out.println("Sum of the given number = "+sum);

        // Type Conversion

        // 1. Automatic/Implicit Type Conversion

        float mynum = 55;  // Here Container is big and value is small so it is automatically converted into float
        System.out.println(mynum);

        // 2. Explicit Type Conversion / Casting

        int mynum2 = (int) 55.45;  //  Here Container is small and value is big so we have to externally convert it
        System.out.println(mynum2);  // In this lose of data is also their such that 55.45 ---> 55
    
    }
    
}