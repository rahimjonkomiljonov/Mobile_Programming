import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the rib length (a): ");
        double a = scanner.nextDouble();
        
        double volume = Math.pow(a, 3);
        double surfaceArea = 6 * Math.pow(a, 2);
        
        System.out.println("Volume (V) = " + volume);
        System.out.println("Surface Area (S) = " + surfaceArea);
        
        scanner.close();
    }
}
