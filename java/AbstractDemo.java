

abstract class AbstractDemo {
    int x,y;
    void display() {
        System.out.println("This is a concrete method in an abstract class.");
    }
}

class DemoAbstract extends AbstractDemo {
    public static void main(String[] args) {
        DemoAbstract obj = new DemoAbstract();
    }
}