class A{
    int x = 10;
    private int y = 20;
    static int z = 30;
    void display(){
        System.out.println(y);
    }
    static void displayStatic(){
        System.out.println("Static method in class A");
    }
}
class Second{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        A obj = new A();
        System.out.println(obj.x);
        obj.display();
        System.out.println(A.z);
        A.displayStatic();
    }
}