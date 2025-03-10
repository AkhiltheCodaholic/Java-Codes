public class countvc {
    public static void main(String[] args) {
        String text = "abcD!efi";
        String lower = text.toLowerCase();
        //System.out.println(lower);

        String vowels = "aeiou";
        String consts = "bcdfghjklmnpqrstvwxyz";
        int count = 0;
        int countc = 0;
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if(text.charAt(i) == vowels.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println("Vowels: "+ count);
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < consts.length(); j++) {
                if(text.charAt(i) == consts.charAt(j)){
                    countc++;
                }
            }
        }
        System.out.println("Constants: "+ countc);
        sum = count + countc;
        System.out.println(sum);
    }
}