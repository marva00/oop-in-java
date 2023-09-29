public class Circle{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;

    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double calArea(){
        return Math.PI*radius*radius;
    }

    public double calCircumference(){
        return 2*(Math.PI*radius);
    }
    public static void  main(String[] args) {
            Circle c1=new Circle(5.0);
            Circle c2=new Circle(7.0);
            System.out.println("radius is"+c1.calArea());
            System.out.println("circumference is"+c1.calCircumference());

    }

}
