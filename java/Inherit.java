class Nokia1{
    int x,y;
    Nokia1(int a, int b){
        x = a;
        y = b;
        System.out.println("Parent constructor is executed.");
    }
    void f1(){
        System.out.println("parent function 1 is executed.");
    }
    void f2(){
        System.out.println("parent function 2 is executed.");
    }
}

class Nokia2 extends Nokia1{
    int z;
    void f3(){
        System.out.println("child fumction 1 is executed.");
    }
    void f4(){
        System.out.println("child function 2 is executed.");
    }
    Nokia2(){
        super(6,7);
        System.out.println("Child constructor is executed.");
    }
}

// class Nokia3 extends Nokia1{

// }
class Inherit{
    public static void main(String[] args) {
        System.out.println("This is Inherit class.");
        Nokia2 n = new Nokia2();
        // n.f1();
        // n.f2();
        // n.f3();
        // n.f4();
    }
}