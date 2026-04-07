public class exercise1 {
    public static void main(String[] args) {
        String text = "Education is the most powerful weapon which you can use to change the world";
        
        System.out.println("String: " + text);
        
        // 1. find idx=12 using charAt
        char charAt12 = text.charAt(12);
        System.out.println("Character at idx=12 using charAt(12): '" + charAt12 + "'");
        
        // 2. find substring = [4;14] using substring
        String subStr = text.substring(4, 14);
        System.out.println("Substring [4;14] using substring(4, 14): \"" + subStr + "\"");
        
        // 3. find char='p' using indexOf
        int indexOfP = text.indexOf('p');
        System.out.println("Index of char 'p' using indexOf('p'): " + indexOfP);
    }
}
