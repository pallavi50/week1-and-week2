import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;
        
        // Input
        System.out.print("Enter base (in cm): ");
        base = sc.nextDouble();
        
        System.out.print("Enter height (in cm): ");
        height = sc.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert to square inches (1 inch = 2.54 cm)
        double areaIn = areaCm / (2.54 * 2.54);

        // Output
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f", areaIn, areaCm);

        sc.close();
    }
}