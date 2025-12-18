import java.util.*;
class Sorted{
    public static void main(String[] ritam){
        String sen = "Hello Ritam is doing work";

        String[] words = sen.split(" ");

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        for (String word : words) {
            System.out.println(word);
        }
    }
    
}