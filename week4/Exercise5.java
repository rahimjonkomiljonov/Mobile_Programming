public class Exercise5 {
    public static void main(String[] args) {
        int a = 20;
        int b = 35;
        
        int c = (a % b == 0) ? a * b : a + b;
        
        System.out.println("c = " + c);
    }
}
