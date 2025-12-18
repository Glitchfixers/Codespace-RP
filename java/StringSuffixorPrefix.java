public class StringSuffixorPrefix {

    public static void main(String[] args) {
        String a = "brown";
        String b = "own";
        boolean flag=true;
        if(a.length()<b.length()){
            throw new Error("You have done wrong");
        }
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)!=a.charAt(i+(a.length()-b.length()))){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Suffix of first");
        }
        else{
            System.out.println("Not suffix");
        }
    }
}