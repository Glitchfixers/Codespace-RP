class Area{
    static void f1(){
        System.out.println("Inside f1 method of Area class.");
    }
}

class first{
    static void display(){
        System.out.println("Hello, World!");
    }
    void f1(){
        System.out.println("Inside f1 method.");
    }
    public static void main(String[] args){
        System.out.println("This is the first Java program.");
        display();
        //f1(); // This will cause a compilation error as f1 is not static
        Area.f1(); 
    }
}