package Opgave_2_17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Opgave_2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert a temperature between -58 and 41 fahrenheit");
        double temp = input.nextDouble();
        if (temp <= 41 && temp >= -58) {
            System.out.println("insert wind speed above 2 miles per hour");
            double windSpeed = input.nextDouble();
            if (windSpeed >= 2) {
                double NWS = tempCall(temp, windSpeed);
                System.out.println("How cold is it outside? here is the answer in wind-chill temperature: " + NWS);
            } else {
                System.out.println("Error wind speed cannot be below 2 miles per hour");
            }
        } else {
            System.out.println("Error cannot be below -58 or above 41 fahrenheit.");
        }

    }

    public static double tempCall(double temperature, double windSpeed) {
        double temp1 = 35.74 + 0.6215 * temperature;
        double temp2 = Math.pow(35.75 * windSpeed, 0.16) + Math.pow(0.4275 * temperature * windSpeed, 0.16);
        double sum = temp1 - temp2;
        //35.74 + 0.6215 * temperature - Math.pow(35.75*windSpeed,0.16) + Math.pow(0.4275 * temperature * windSpeed, 0.16);
        return sum;
    }
}