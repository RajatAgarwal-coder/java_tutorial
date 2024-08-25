import java.util.Scanner;

public class LEVEL4Part2 {
    
    public static void main(String[] args) {

        // Relational Operators :- It takes 2 number and return a boolean value

        // 1. == Operator :- It check values on both side of == is same or not

        // 2. != Operator :- It reverses the boolean we get using ==

        // 3. > Operator ------
        //                    |
        // 4. < Operator ------
        //                    | ---------->  This operator are used to compare the values and returns a boolean value
        // 5. >= Operator -----
        //                    |
        // 6. <= Operator -----

        // Order of Relational Operator is less then arithmetic operator like 3+2>3+1

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Congrulation! Your are eligible for Driving License");
        }
        else{
            System.out.println("Opps! Your are not eligible for Driving Licens");
        }

        // Logical Operator :- Used to check multiple condition

        // 1. And(&&) Operator :- All conditions must be true for true result

        // 2. Or(||) Operator :- It gives true if only condition is true

        // 3. Not(!) Operator :- It is applied on only 1 condition and reverse the value of boolean 

        // Lover Priority from both relational and arithmetic operators 

        System.out.print("Enter Your Age : ");
        int pass_age = scan.nextInt();
        scan.nextLine(); // Consume the left-over newline
        
        System.out.print("Enter Your Gender : ");
        String gender = scan.next();

        if (pass_age < 5) {
            System.out.println("You are eligible for 75% discount");
        }
        else if (gender.equals("female")) {
            System.out.println("You are eligible for 50% discount");
        }
        else if (pass_age > 60 && gender.equals("male")) {
            System.out.println("You are eligible for 25% discount");
        }
        // For String Comparision we use .equals because == operator checks whether the two string 
        // references point to the same object in memory, not whether the contents of the strings are the same.
        else{
            System.out.println("You are eligible for 0% discount");
        }

        // Programming Challenges

        // Challenge 15

        System.out.print("Please Enter a Number : ");
        float num = scan.nextFloat();

        if (num > 0) {
            System.out.println("The Given Number is Positive");
        }
        else if (num < 0) {
            System.out.println("The Given Number is Negative");
        }
        else{
            System.out.println("The Given Number is Zero");
        }

        // Challenge 16

        if (num % 2 == 1) {
            System.out.println("The Given Number is Odd");
        }
        else{
            System.out.println("The Given Number is Even");
        }

        // Challenge 17

        System.out.print("Please Enter 3 numbers (give space/enter between them) : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+" is the greatest number");
        }

        else if (num2 > num3 && num2 > num1) {
            System.out.println(num2+" is the greatest number");    
        }

        else{
            System.out.println(num3+" is the greatest number");
        }

        // Challenge 18

        System.out.print("Please Enter the Year : ");
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
            System.out.println(year+" is the leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

        // Challenge 19

        System.out.print("Enter the Percentage you has scored : ");
        float percent = scan.nextInt();

        if (percent >= 90) {
            System.out.println("Your Grade is A");
        }
        else if (percent >= 75) {
            System.out.println("Your Grade is B");
        }
        else if (percent >= 60) {
            System.out.println("Your Grade is C");
        }
        else if (percent >= 30) {
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Your Grade is E");
        }

        // Challenge 20

        System.out.print("Please Enter Your Age = ");
        int user_age = scan.nextInt();

        if (user_age <= 13) {
            System.out.println("Your are a Child");
        }
        else if (user_age <= 20) {
            System.out.println("Your are a Teenager");
        }
        else if (user_age <= 60) {
            System.out.println("Your are a Adult");
        }
        else {
            System.out.println("Your are a Senior Citizen");
        }

        // Bitwise Operator

        // Challenge 21

        System.out.print("Enter the first number : ");
        int numb1 = scan.nextInt();
        System.out.print("Enter the second number : ");
        int numb2 = scan.nextInt();

        System.out.println("Bitwise And = "+ (numb1 & numb2));  // Bitwise And :- Both bit 1 then 1 otherwise 0

        // Challenge 22

        System.out.println("Bitwise Or = "+ (numb1 | numb2));  // Bitwise Or :- Both bit 0 then 0 otherwise 1

        // Challenge 23

        System.out.println("Bitwise Xor = "+ (numb1 ^ numb2));  // Bitwise Xor :- Both bit same then 0 otherwise 1
        
        // Challenge 24

        System.out.println("Bitwise Not = "+ (~ numb1));  // Bitwise Not/Compliment :- Convert bit 1 to 0 and 0 to 1

        // Challenge 25

        System.out.println("Left Shifth = "+ (numb1 << 1));  // (It is like * by 10 in binary and * by 2 in decimal)
        // Bitwise Left Shifth :- Shift given number of digits to left and enter 0 at right
        
        // Challenge 26

        System.out.println("Right Shifth = "+ (numb1 >> 1));  // (It is like / by 10 in binary and / by 2 in decimal)
        // Bitwise Right Shifth :- Shift given number of digits to right and enter 0 at left
        
        // Challenge 27

        // Last Bit of Even Number is 0 and Odd Number is 1

        int first_num = numb1 & 1; // We are replacing other digit by 0 except last bit  0000 = 0  0001 = 1

        if (first_num == 0){
            System.out.println("First Number is Even");
        }
        else{
            System.out.println("First Number is Odd");
        }

    }

}
