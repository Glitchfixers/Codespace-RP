class Example{
    private int x,y;
    void f1(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println(x);

    }
}

class This{
    public static void main(String[] args) {
        System.out.println("This is This class.");
        Example e = new Example();
        e.f1(3,6);
    }
}