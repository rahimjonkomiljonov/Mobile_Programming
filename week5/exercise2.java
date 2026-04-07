import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter integer number : ");
        int intValue = obj.nextInt();
        System.out.println("The entered number is : " + intValue);

        System.out.println(); // space between results

        System.out.print("Enter the short value : ");
        short shortValue = obj.nextShort();
        System.out.println("The entered short value is : " + shortValue);

        System.out.println(); // space between results

        System.out.print("Enter the double value :");
        double doubleValue = obj.nextDouble();
        System.out.println("The entered double value is : "+doubleValue);

        System.out.println(); // space between results

        System.out.print("Enter the float value : ");
        float floatValue = obj.nextFloat();
        System.out.println("The entered float value is :" + floatValue);

        System.out.println(); // space between results

        System.out.print("Enter String value : ");
        String stringValue = obj.next();
        System.out.println("The string value is : "+ stringValue);

        System.out.println(); // space between results

        System.out.print("Enter the long value : ");
        long longValue = obj.nextLong();
        System.out.println("The entered long value is : "+longValue);

        obj.close();
    }
}
