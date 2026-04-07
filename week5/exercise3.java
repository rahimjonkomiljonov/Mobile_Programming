import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the text:");
        String sen = obj.nextLine();
        System.out.println(sen.toUpperCase());
    }
}
