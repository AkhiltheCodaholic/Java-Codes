public class PunctCount {
    public static void main(String[] args) {
        String text = "Hello world!!";
        String puncts = ",.!?";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for(int j = 0; j < puncts.length(); j++){
                if(text.charAt(i) == puncts.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}