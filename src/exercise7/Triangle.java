package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void printTriangle (int size){
        for (int i = 1; i <= size; i++){
            printNumbers(i);
        }

        for (int i = size - 1; i >= 1; i--){
            printNumbers(i);
        }
    }

    public static void printNumbers (int size){
        for (int i = 1; i <= size; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        printTriangle(size);
    }
}
