public class practice1 {
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        
        for(int i = 0; i < words.length; i++) {
            if(words[i].contains("a")) {
                System.out.print(i + " ");
            }
        }
    }
}

