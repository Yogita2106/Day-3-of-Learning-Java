interface Flyable {
    void fly();
    
}
class Bird implements Flyable{
    public void fly(){
        System.out.println("Bird chrips!");
    }

}
class Airplane implements Flyable{
    public void fly(){
        System.out.println("Airplanes flies in sky!");
    }

}
public class interfacemain{
    public static void main(String[] args) {
        Bird b1 = new Bird();
        Airplane a1 = new Airplane();
        b1.fly();
        a1.fly();
    }
}