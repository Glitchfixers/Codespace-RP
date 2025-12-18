import java.util.*;
public class Reverse{
    public static void main(String[] ritam){
        String a = "Ritam";
        char[] arr = a.toCharArray();
        
        for(int i=0;i<a.length();i++){
            arr[i] = a.charAt(a.length()-i-1);
        }
        for(char ele: arr){
            System.out.println(ele);
        }
        System.out.println(String.valueOf(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr)); 
        
    }
}