public class ThisMethord {
    double area;
    final double pi = 3.14;
    // Area of Circle. -> 3.14*r*r
    void area(double radius){
        area = pi*(radius*radius);
        System.out.println("\nArea of Circle: "+area);
    }
    // Area of Sphere -> 4*3.14*r*r
    void area(double num, double radius){
        area(3);
        area = num*pi*(radius*radius);
        System.out.println("\nArea of Sphere: "+area);
    }
    // Area of Triangle. -> 0.5*base*height
    void area(double num,double base,double height){
        area(4,3);
        area = num*(base*height);
        System.out.println("\nArea of Triangle: "+area+"\n");
    }
    public static void main(String args[]){
        ThisMethord obj = new ThisMethord();
        obj.area(0.5,4,5);
    }
}