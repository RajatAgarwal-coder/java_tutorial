import java.util.Scanner;

public class LEVEL4 {  // Name of Public Class should be same as of file name
    // One file
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Assignment Operator

        String assign = "Assignment";  // = assign Right Hand Operand's Value to left hand operand's
        
        // Programming Challenges

        // Challenge 7

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st Number to swap : ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd Number to swap : ");
        int num2 = scan.nextInt();

        int firstnum = num2;
        num2 = num1;
        num1 = firstnum;

        System.out.println("Value of 1st Number = "+num1);
        System.out.println("Value of 2nd Number = "+num2);

        // Arithmetic Operator

        int oper1 = 8;
        int oper2 = 5;

        // 1. Addition Operator :- Used to add the operand
        int add = oper1 + oper2;
        System.out.println("Addition Operator = "+add);

        // 2. Subtraction Operator :- Used to subtract the operand
        int sub = oper1 - oper2;
        System.out.println("Subtraction Operator = "+sub);

        // 3. Multiplication Operator :- Used to multiply the operand
        int multi = oper1 * oper2;
        System.out.println("Multiplication Operator = "+multi);

        // 4. Division Operator :- Used to divide the operand
        float div = oper1 / oper2;  // It gives result in int because we has divided 2 int
        System.out.println("Division Operator = "+div);

        // 5. Modulus Operator :- Used to get the remainder of the operand
        int modulo = oper1 % oper2;
        System.out.println("Modulus Operator = "+modulo);

        // Order of Operation

        System.out.println(8*8-3);// Precedence of different operators is according to BODMAS

        System.out.println(81/3/3); // Precedence of same operators is from left to right

        System.out.println(81/(3/3 + 8)); // Using bracket we can make precedence of our own

        // Shorthand Operator :- Used to shorten the code and the value to the same identifier

        int x = 55;

        // 1. Addition Assignment Operator 
        x += 5; // ----> x = x+5
        System.out.println("Addition Assignment Operator = "+x);

        // 2. Subtraction Assignment Operator 
        x -= 5; // ----> x = x-5
        System.out.println("Subtraction Assignment Operator = "+x);

        // 3. Multiplication Assignment Operator 
        x *= 5; // ----> x = x*5
        System.out.println("Multiplication Assignment Operator = "+x);

        // 4. Division Assignment Operator 
        x /= 5; // ----> x = x/5
        System.out.println("Division Assignment Operator = "+x);

        // 5. Remainder Assignment Operator 
        x %= 5; // ----> x = x%5
        System.out.println("Remainder Assignment Operator = "+x);

        // Unary Operators :- This Operators works on 1 number only

        int oper = 86;
        System.out.println("Operand without operation = "+oper);

        // 1. - operator :- - operator is used to convert positive value to negative value and negative value to positive value
        int y = - oper; 
        System.out.println("- operator = "+y);

        // 2. Pre Increment Operator (++x) :- First increase the value then use it
        System.out.println("Pre Increment Operator = "+ ++oper);
        System.out.println("Value of operend after operation = "+oper);

        // 3. Pre Decrement Operator (--x) :- First decrease the value then use it
        System.out.println("Pre Decrement Operator = "+ --oper);
        System.out.println("Value of operend after operation = "+oper);

        // 4. Post Increment Operator (x++) :- First use the value then increase it
        System.out.println("Post Increment Operator = "+ oper++);
        System.out.println("Value of operend after operation = "+oper);

        // 5. Post Decrement Operator (x--) :- First use the value then decrease it
        System.out.println("Post Decrement Operator = "+ oper--);
        System.out.println("Value of operend after operation = "+oper);

        // Programming Challenges

        // Challenge 8

        System.out.print("Enter 1st Number = ");
        float user_num1 = scan.nextFloat();
        System.out.print("Enter 2nd Number = ");
        float user_num2 = scan.nextFloat();

        System.out.println("Addition of given number = "+ (user_num1+user_num2));
        System.out.println("Subtraction of given number = "+ (user_num1-user_num2));
        System.out.println("Multiplication of given number = "+ (user_num1*user_num2));
        System.out.println("Division of given number = "+ (user_num1/user_num2));
        System.out.println("Modulus of given number = "+ (user_num1%user_num2));
        
        // Challenge 9 is already coevered in Challenge 8 

        // Challenge 10

        System.out.print("Please Enter Length of A Side = ");
        int side1 = scan.nextInt();
        System.out.print("Please Enter Length of B Side = ");
        int side2 = scan.nextInt();
        System.out.print("Please Enter Length of C Side = ");
        int side3 = scan.nextInt();
        System.out.print("Please Enter Length of D Side = ");
        int side4 = scan.nextInt();

        System.out.println("Perimeter using given sides = "+(side1+side2+side3+side4));

        // Challenge 11

        System.out.print("Enter the Height of Triangle : ");
        float height = scan.nextInt();
        System.out.print("Enter the Base of Triangle : ");
        float base = scan.nextInt();

        System.out.println("Area of Triangle = "+1.0/2.0*base*height);  
        // Here we use 1.0 and 2.0 because in 1/2 both are integer they resolve and give integer that is 0 

        // Challenge 12

        System.out.print("Enter the Principal Amount : ");
        float prin = scan.nextFloat();
        System.out.print("Enter the Duartion in years : ");
        float time = scan.nextFloat();
        System.out.print("Enter the Rate of Interest per year : ");
        float interest = scan.nextFloat();

        System.out.println("Your Simple Interest = "+(prin*time*interest)/100);
        
        // Challenge 13

        double compint = prin * Math.pow(1 + interest/100, time); // Math.pow is used to calculate the power Math.pow(base,power)
        // Math.pow return only Double Data Type
        System.out.println("Your Compound Interest = "+compint);

        // Challenge 14

        System.out.print("Enter the Temperature of Fahrenhiet : ");
        float fran = scan.nextInt();
        System.out.println("Your Temperature in Celsius = "+(fran - 32)* 5.0 /9.0);

        // If-else Statement  

        // If Statement Syntax :- if(condition){body}
        // Else Statement Syntax :- else{body}  It is printed only when condition in it is false

        boolean gender_male = true;

        if(gender_male){
            System.out.println("Your Name Start with Mr.");
        }
        else{
            System.out.println("Your Name Start with Ms.");
        }

        // We can use Nested if-else Statement also

        // else if is used to write more conditions

        boolean isseniorcitizen = true;
        boolean isadult = false;

        if(isseniorcitizen){
            System.out.println("Hello Senior Citizen");
        }
        else if(isadult) {
                System.out.println("Hello Adult");
        }
        else{
                System.out.println("Hello Child");
        }

    }

}