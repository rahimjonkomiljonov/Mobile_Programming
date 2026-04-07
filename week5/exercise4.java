import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String name = obj.next();
        System.out.print("Enter your work years please: ");
        int age = obj.nextInt();
        System.out.println("Hi, my name is " + name + " I have been working as a programmer for " + age +" years.");
    }
}
