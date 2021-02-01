package numbershape;

import java.util.Scanner;

public class NumberShape {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");

        int userNum = input.nextInt();

        for (int i = 1; i <= userNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        for (int i = userNum; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

//for (int i = userNum; i >= 1; i--) {
        //    for (int j = 1; j <= i; j++) {
        //        System.out.print(j + " ");
        //     }
        //     System.out.println("");
        //  }
    }

}
