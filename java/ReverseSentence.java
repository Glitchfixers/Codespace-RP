import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ReverseSentence{
    public static void main(String[] args)throws IOException{
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // System.out.print("Enter your name: ");
        // String name = reader.readLine();
        // System.out.println("Hello, " + name);


        String str = "Hello from RCCIIT";
        String[] arr = str.split("\\s+");
        StringBuilder strb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            strb.append(arr[i]);
            if(i>0){
                strb.append(" ");
            }
        }
        System.out.println(strb);
    }
}