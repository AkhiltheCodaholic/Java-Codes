public class sepeline {

    public static void main(String[] args) {
        String text="Wangshek Reddy";
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' '){
                System.out.println(text.charAt(i));
            }
        }
    }
}