class ExceptionHandling{
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code...");

    }
}