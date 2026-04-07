import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive valid number (X): ");
        double x = scanner.nextDouble();
        
        // Calculate the fractional part by subtracting the integer part
        int integerPart = (int) x;
        double fractionalPart = x - integerPart;
        
        System.out.println("answer = " + fractionalPart);
        
        scanner.close();
    }
}
