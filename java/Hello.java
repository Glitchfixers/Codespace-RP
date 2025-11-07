class Hello {
    void greet() {
        System.out.println("Greetings from the greet method!");
    }
    public static void main(String[] a) {
        System.out.println("Hello, World!");
        System.out.println(3 + 5);
        Hello h = new Hello();
        h.greet();
    }

}