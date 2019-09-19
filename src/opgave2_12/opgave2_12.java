package opgave2_12;

import java.util.Scanner;

public class opgave2_12 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("****** indtast flyets acceleration ******");
        double acceleration = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("****** indtast flyets takeoff hastighed i  ******");
        double takeoff = input2.nextDouble();


    double length = (Math.pow(takeoff,2))/2*acceleration;
        System.out.println(length);

    }
}
