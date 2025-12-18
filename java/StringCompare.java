class StringCompare{
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Heleeto";
        boolean flag = true;
        if(a.length()!=b.length()){
            flag = false;
            System.out.println("Not equal");
        }
        else{for(int i=0;i<a.length();i++){
            
            if(a.charAt(i)==b.charAt(i)){
                flag = true;
                
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        }    
        
    }

}