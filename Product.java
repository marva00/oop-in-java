
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private Manufacture date;
    static int counter=0;

   
    Product(String name, double price, int quantity, Manufacture date){
       // System.out.println("Constructor is called");
        this.id=counter++;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.date=date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Manufacture getDate(){
        return date;
   }

    public void setDate( Manufacture date){
        this.date=date;
    }

    public String toString(){
        String productDetails=String.format("%04d\t%-20s%.2f\t%d\t%s",id,name,price,quantity,date);
        return productDetails;
    }


   // public static void staticMethod(){

    //    //System.out.println(id);
    //    System.out.println("call of static method");
   // }
    //public void nonStatic(){
        //System.out.println(counter);
   // }

public Product isLatest(Product p1, Product p2){
    Manufacture temp = date.latest(p1.date,p2.date);
    return temp==p1.date?p1:p2;
}
   






}