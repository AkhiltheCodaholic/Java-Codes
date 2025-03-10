public class MutableString {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("java");
        System.out.println(sb);
        sb.append("is very easy");
        System.out.println(sb);
        System.out.println(("length = ")+sb.length());
        System.out.println(sb.replace(3, 8, "Hello"));
        System.out.println("delete = "+ sb.delete(4,8 ));
        System.out.println(sb.reverse());
    }
}