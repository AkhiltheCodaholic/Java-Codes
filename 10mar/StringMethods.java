public class StringMethods{
    public static void main(String[] args) {
        String s1 = "hyderabad";
        System.out.println("Length: "+ s1.length());
        System.out.println("CharAt: "+ s1.charAt(4));
        System.out.println("substring: "+ s1.substring(4,7));
        System.out.println("concat: "+ s1.concat("nexTurn"));

        String s2 = "ABCD";
        String s3 = "ABGH";

        System.out.println("compareTo: "+ s2.compareTo(s3));
        System.out.println();
    }
}