class ShortcutName{
    public static void main(String[] args){
        String str = "Riddhi Patra";
        String[] arr = str.split("\\s+");
        StringBuilder strb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            
            if(i<arr.length-1){
                strb.append(arr[i].charAt(0));
                strb.append(".");
            }
            if(i==arr.length-1){
                strb.append(arr[i]);
            }
            
        }
        System.out.println(strb);
    }
}