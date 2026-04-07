public class GachonUniversity {
    public static void main(String[] args) {

        int k = 20;

        k += 7;   // k = 27  (20 + 7)
        System.out.println(k);  // Output: 27
        
        k *= 2;   // k = 54  (27 * 2)
        System.out.println(k);  // Output: 54
        
        k -= 4;   // k = 50  (54 - 4)
        System.out.println(k);  // Output: 50
        
        k /= 10;  // k = 5   (50 / 10, integer division)
        System.out.println(k);  // Output: 5
        
        k %= 2;   // k = 1   (remainder of 5 / 2)
        System.out.println(k);  // Output: 1
    }
}