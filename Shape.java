public class Shape{
    void area(){
        System.out.println("Areas are:-");
    }
    public static void main(String[] args) {
       Shape sh = new Shape();
       Shape c1 = new Circle();
       Shape r1 = new Rectangle();
       Shape t1 = new Triangle();
       sh.area();
       c1.area();
       r1.area();
       t1.area();
    }
    }
class Circle extends Shape{
    float pi = 3.14f;
    int r= 4;
    float areac = pi*r*r;
    public void area(){
        System.out.println("Area of circle is:"+areac);

    }
}
class Rectangle extends Shape{
   float length = 4.3f;
   float breadth = 6.2f;
   float arear = length*breadth;
   public void area(){
    System.out.println("Area of rectangle is:"+arear);
   }

}
class Triangle extends Shape{
    float a = 0.5f;
    float baselength = 4.7f;
    float height = 6.7f;
    float areat = a*baselength*height;
    public void area(){
     System.out.println("Area of triangle is:"+areat);
    }
 
 }



