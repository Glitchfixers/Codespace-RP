class A{
    public void ankan(){
        System.out.println("Hello");
    }
}


class MethodOverriding extends A{
    public void ankan(){
        System.out.println("Child Class");
    }
    public static void main(String[] args) {
        MethodOverriding m = new MethodOverriding();
        m.ankan();
    }
}