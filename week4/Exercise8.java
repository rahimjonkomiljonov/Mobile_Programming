public class Exercise8 {
    public static void main(String[] args) {
        String str = "Java is name of coffee   ";
        
        // codePointAt()
        System.out.println("codePointAt(0): " + str.codePointAt(0));
        
        // codePointBefore()
        System.out.println("codePointBefore(1): " + str.codePointBefore(1));
        
        // contains()
        System.out.println("contains(\"name\"): " + str.contains("name"));
        
        // endsWith()
        System.out.println("endsWith(\"coffee\"): " + str.endsWith("coffee"));
        
        // isEmpty()
        System.out.println("isEmpty(): " + str.isEmpty());
    }
}
