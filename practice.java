public class practice {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aba","cfg","madam"};
        
        for(int i = 0; i < words.length; i++) 
        {
            StringBuilder a = new StringBuilder(words[i]);
            String res = a.reverse().toString();
             if(words[i].equals(res))
             {
            	 System.out.println(words[i]);
            	 break;
             }
        }
    }
}  