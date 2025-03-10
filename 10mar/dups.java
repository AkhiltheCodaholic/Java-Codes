public class dups {

    public static void main(String[] args) {
        String text = "waangshekk";

        for (int i = 0; i < text.length()-1; i++) {
            for (int j = i+1; j < text.length(); j++) {
                if(text.charAt(i) == text.charAt(j)){
                    System.out.println(text.charAt(j));
                }
            }
            
        }
    }
}