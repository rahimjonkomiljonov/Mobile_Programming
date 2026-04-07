public class Exercise6 {
    public static void main(String[] args) {
        String string1 = "I am, a student of the Gachon University!";
        String string2 = "and we are learning Java";
        
        System.out.println("Length of first string: " + string1.length());
        
        // First way of concatenation
        String string3 = string1.concat(string2);
        System.out.println(string3);
        
        // Second way of concatenation
        String string4 = "I am, a student of the Gachon University!".concat("and we are learning Java");
        System.out.println(string4);
        
        // Third way of concatenation
        System.out.println("I am, a student of the Gachon University!" + "and we are learning Java");
    }
}
