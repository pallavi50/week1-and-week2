import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;

        // Input
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();

        // Conversion formula
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Output
        System.out.printf("The %.2f celsius is %.2f fahrenheit", celsius, fahrenheitResult);

        sc.close();
    }
}