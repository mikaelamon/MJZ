import java.util.Scanner;

public class LabTask {
    public static void main(String[] args) {
        // create a scanner
        Scanner sc = new Scanner(System.in);
        // create a variable to store the user's answer
        char again;

        // do while loop to repeat the program


        do {
            // to store numbers in rows in columns.
            int[][] matrix = new int[3][3];
            int[] rowSum = new int[3];
            int[] colSum = new int[3];

            System.out.println("Enter 9 elements:");
            
            // to get the 9 numbers from the user
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                // to save the number from the matrix and adds numbers to rows and columns
                    matrix[i][j] = n;
                    rowSum[i] += n;
                    colSum[j] += n;
                }
            }
            System.out.println("==============================");
             // to display the matrix and each rows sum
            System.out.println("Matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println("| " + rowSum[i]);
            }
             System.out.println("==============================");

            // to display the sum of each column
            System.out.println("Column Sum:");

            // to store the total sum 
            int total = 0;

            for (int j = 0; j < 3; j++) {
                System.out.print(colSum[j] + "\t");
                total += colSum[j];
            }
             System.out.println("| " + total);
            

            System.out.println();
         
            // to store the sum of two diagonals
            int ds1 = 0;
            int ds2 = 0;

            // to calculate the sum of both diagonals
            for (int i = 0; i < 3; i++) {
                ds1 += matrix[i][i];
                ds2 += matrix[i][2 - i];
            }
             System.out.println("==============================");

            // to display both diagonals
            System.out.println("Diagonal Sum 1: " + ds1);
            System.out.println("Diagonal Sum 2: " + ds2);

            // to ask the user to repeat the program
            System.out.print("Try Again [y/n]: ");
            again = sc.next().charAt(0);

            // it repeats if the answer is y or Y
        } while (again == 'y' || again == 'Y');

        System.out.println("Program Ended.");
    }
}


//Modify the same code and display also the TOTAL of all COULMN SUM