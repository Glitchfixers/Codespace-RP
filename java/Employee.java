class Employee{
    Employee(int id,String name){
        System.out.println(id + name);
    }
    Employee(int id,String name,String dept, double salary){
        System.out.println(id + name + dept + salary);
    }
    Employee(int id, String name,String dept){
        System.out.println(id + name + dept);
    }
    public static void main(String[] args){
        Employee e = new Employee(23,"Ritam");
        Employee e1 = new Employee(23,"Debangshu","Quality Analyst");
        Employee e2 = new Employee(23,"Urismita","IT",20000);
    }
}