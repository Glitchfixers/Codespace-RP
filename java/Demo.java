class Demo{
    int x,y;
    void f1(){
        x = 10;
        y = 20;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
    void f2(){

    }
    Demo(){
        System.out.println("This is a constructor.");
        x = 10;
        y = 20;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}