package tom;

import java.util.Scanner;

public class Tom {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter temperature in degrees celcius: \n");
        String input = scanner.nextLine();
        float number = Float.parseFloat(input);

        Double Farenheit = ((number * 1.8) + 32);
        System.out.println(" The temperature in Farenheit is : " + Farenheit + ".");
    }

}
