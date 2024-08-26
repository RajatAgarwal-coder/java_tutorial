import java.util.Scanner;

public class LEVEL5Part2 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        // Programming Challenges

        // Challenge 28

        float number = input();
        printtable(number);
        
        // Challenge 29

        float user_input = input();

        float odd_add_result = sumodd(user_input);
        System.out.println("Sum of Odd Number = "+odd_add_result);

        // Challenge 30

        int numb = (int) input();

        if (numb < 0) {
            System.out.println("Factorial is not possible of this number");
        }
        else{
            long fact_result = fact(numb);
            System.out.println("Factorial of the Given Number = "+fact_result);
        }

        // Challenge 31

        int user_value = (int) input();
        int sod = digitsum(user_value);
        System.out.println("Sum of digits of given integer = "+sod);

        // Challenge 32

        int num1 = (int) input();
        int num2 = (int) input();
         
        int lcm = findlcm(num1,num2);
        System.out.println("LCM of Given Numbers = "+lcm);

        // Challenge 33

        int numb1 = (int) input();
        int numb2 = (int) input();

        int gcd = findgcd(numb1, numb2);
        System.out.println("GCD of Given Numbers = "+gcd);

        // Challenge 34

        int user_num = (int) input();
        boolean isprime = checkprime(user_num);

        if(isprime){
            System.out.println("The Number is Prime");
        }
        else{
            System.out.println("The Number is not Prime");
        }

        // Challenge 35
        
        System.out.print("Enter a Number : ");
        int user_number = scan.nextInt();

        int revnum = reverse(user_number);
        System.out.println("The Number after reversing the digits = "+revnum);

        // Challenge 36

        int stopnumber = (int) input();
        
        System.out.println("Here is the Fibonacci Series");
        fiboseries(stopnumber);

        // Challenge 37

        int userNum = (int) input();

        checkarmstrong(userNum);

        // Challenge 38

        int user_number1 = (int) input();

        int num_reverse = reverse(user_number1);

        if (user_number1 == num_reverse) {
            System.out.println("The Entered Number is Palindrome");
        }
        else{
            System.out.println("The Entered Number is not Palindrome");
        }

        // Challenge 39 we has already done in Part1
 
    }

    public static float input(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter a Number : ");
        float number = scan.nextFloat();
        return number;
    }
    
    public static void printtable(float num){
        int multi = 1;

        while (multi <= 10) {
            System.out.println(num +" * "+ multi +" = "+ (num * multi));
            multi++;
        }
    }

    public static float sumodd(float user_val){
        float sum_odd = 0;

        while (user_val >=0) {

            if (user_val % 2 == 1) {
                sum_odd +=  user_val;
            }
            
            user_val--;
        }
        return sum_odd;
    }

    public static long fact(int number){
        long factorial = 1;

        while (number > 0) {
            factorial *= number;
            number--;
        }

        return factorial;
    }

    public static int digitsum(int value){
        int sum = 0;
        
        while (value > 0) {
            sum += (value % 10);
            value = value / 10;
        }

        return sum;
    }

    public static int findlcm(int num1,int num2) {
        int multiby = 1;

        while (true) {
            int factor = num1 * multiby;

            if (factor % num2 == 0) {
                return factor;
            }
            multiby++;    
        }
    }

    public static int findgcd(int num1,int num2){
        int gcd = 1;
        int start = 2;
        int end = Math.min(num1, num2);

        while (start <= end) {

            if (num1 % start == 0 && num2 % start == 0) {
                gcd = start;
            }
            start++;
        }
        return gcd;
    }

    public static boolean checkprime(int num) {
        int numb = 2;

        while (numb < num) {
            if (num % numb == 0 ) {
                return false;
            }
            numb++;
        }
        return true;
    }

    public static int reverse(int num) {
        int newnum =0;

        while (num > 0) {
            int digit = num % 10;
            newnum = newnum * 10 + digit;
            num /= 10;
        }
        return newnum;

    }

    public static void fiboseries(int num) {
        if (num < 0) return;

        System.out.print("0 ");
        if (num == 0) return;
        
        System.out.print("1 ");

        int first = 0 , second = 1;

        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");

            first = second;
            second = third;
        }
        
    }

    public static void checkarmstrong(int num) {
        int sum = powdigit(num);

        if (sum == num) {
            System.out.println("Your Given Number is Armstrong");
        }
        else{
            System.out.println("Your Number is not Armstrong");
        }
    }

    public static int powdigit(int num) {
        int sum = 0;
        int count = countnum(num);
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, count);
            num /= 10;
        }
        return sum;
    } 
    
    public static int countnum(int number) {
        int count = 0;

        while (number > 0) {
            count += 1;
            number /= 10;
        }
        return count;
    }
}