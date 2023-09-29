
public class Shop {
    public static void main(String[] args) {

      //  Product p4=new Product("",1,1);
      // Product.staticMethod();

       Product p1=new Product("LCD", 50000, 2,new Manufacture(15,9,2021));
       Product p2=new Product("Keboard",700,10,new Manufacture(10,7,2023));
      // Product p3=new Product("Keboard wireless",700,10,new Manufacture(23,9,2023));
      // p1.setName("bag"); 
       //p1.setDate(new Manufacture(10,2,2003));
       System.out.println(p1);
      System.out.println(p2);
      //System.out.println(p3);
      System.out.println(p1.isLatest(p1,p2));
    }
    
}
 
