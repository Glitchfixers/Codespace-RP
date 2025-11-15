interface Hello {
    int x=5;
    void method1();
}

class Inter implements Hello {
    public void method1() {
        System.out.println("This is method 1 implementation.");
    }

    public void method2() {
        System.out.println("This is method 2 implementation.");
    }

    public static void main(String[] args) {
        Inter obj = new Inter();
        obj.method1();
        obj.method2();
        System.out.println("Value of x: " + x);
    }
}