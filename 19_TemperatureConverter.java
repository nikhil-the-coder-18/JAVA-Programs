// Write a Program to Convert Temprature. 

import java.util.Scanner;
public class TemperatureConverter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Converter !");

        System.out.print("Enter Your Fahrenheit : ");
        float f = input.nextFloat();

        float Celsius = (f-32) * 5.0f / 9.0f;

        System.out.println("Your Celsius is = " + Celsius + "C");
    }
}