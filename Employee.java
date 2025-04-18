public class Employee {
    void work(){
        System.out.println("Employees have to work hard!");
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee m1 = new Manager();
        Employee d1 = new Developer();
        emp.work();
        m1.work();
        d1.work();
    }
}
class Manager extends Employee{
    public void work(){
        System.out.println("Manager have to take care of the tasks!");
    }
}
class Developer extends Employee{
    public void work(){
        System.out.println("Developers have to develops new projects and updates currently running porjects!");
    }
}
