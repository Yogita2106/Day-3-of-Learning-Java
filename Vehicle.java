abstract class Vehicle {
   abstract public void start();
   public abstract void stop();
   
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.stop();
        Bike b1 = new Bike();
        b1.start();
        b1.stop();
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("The car starts here!");
    }
    public void stop(){
        System.out.println("The car stops here!");
    }


}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike starts here!");
    }
    public void stop(){
        System.out.println("Bike stops here!");
    }
   
   

}

