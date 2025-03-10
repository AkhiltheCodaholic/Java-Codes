class CountVowels{
    public static void main(String[] args) {
        char ch = 'B';
        char lower = Character.toLowerCase(ch);
        System.out.println(lower);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}