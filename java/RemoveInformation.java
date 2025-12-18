class RemoveInformation{
    public static void main(String[] args) {
        String s = "RCC Institute of Information Technology";
        String[] arr = s.split("\\s+");
        StringBuilder str = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("Information")){
                continue;
            }
            str.append(arr[i]);
            str.append(" ");
        }
        System.out.println(str);
    }
}