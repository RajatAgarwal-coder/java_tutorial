import java.util.Scanner;

public class LEVEL5Part3 {
    
    public static void main(String[] args) {

        // Arrays :- List of multiple value of same data type in a single variable
        // Array size cannot be changed after declaration
        // Array Length = Array's Last Index+ 1

        // Syntax 1 : datatype[] arrayname = new datatype[length]

        int[] myarray = new int[5];  // When value are not knowm
        myarray[0] = 11;
        myarray[3] = 22;
        myarray[4] = 33;
        myarray[1] = 44;
        myarray[2] = 55;

        // Syntax 2 : datatype[] arrayname = {values}

        int[] newarray = {1,2,3,4,5};  // When values are known

        // To acces a specific value . Syntax : arrayname[index_number]

        System.out.println(myarray[4]);
        System.out.println(newarray[2]);

        // Array Traversal
        int statindex = 0;

        while (statindex < newarray.length) {
            System.out.println(newarray[statindex]);
            statindex++;
        }

        // arratname.length gives the length of the array
        // System.out.println(newarray[55]);  
        // When we give index number more than the size of array than it gives ArrayIndexOutOfBounds error

        int[] arr = {3 , 6 , 8 , 87 , 4 , 68 , 23 , 9 , 98 , 34};

        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a Number you want ot search : ");
        int number = scan.nextInt();

        int index = 0;
        int find = 0;

        while (index < arr.length) {
            if (arr[index] == number) {
                find = 1;
            }
            index++;
        }
        if (find == 1) {
            System.out.println("Your Number was found in array");
        }
        else{
            System.out.println("Your Number was not found in array");
        }

        // 2-D Array :- It is a array of arrays  Syntax : int[][] arrayname = values

        int[][] newarr = new int[2][2];  // When number are not known
        newarr[0][0] = 11;
        newarr[0][1] = 22;
        newarr[1][0] = 33;
        newarr[1][1] = 44;

        int[][] myarr = { {11,22} , {33,44} };  // When numbers are known

        // Traversal of 2D Array
        int indexnum = 0;

        while (indexnum < newarr.length) {
            int innerindex = 0;

            while (innerindex < newarr[indexnum].length) {

                System.out.print(newarr[indexnum][innerindex] + " ");
                innerindex++;
            }
            System.out.println();
            indexnum++;
        }
        
    }

}