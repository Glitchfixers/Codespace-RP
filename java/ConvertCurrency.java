class ConvertCurrency{

    double convertCurrency(double a){
         return a*83;
    }
    double convertCurrency(double a,boolean flag){
        return a*90;
    }
    double convertCurrency(double[] arr){
        return arr[0]*83 + arr[1]*90;

    }
    public static void main(String[] args){
        ConvertCurrency c = new ConvertCurrency();
        System.err.println(c.convertCurrency(123));
        System.err.println(c.convertCurrency(123));
        System.err.println(c.convertCurrency(new double[]{123,123}));
    }
}