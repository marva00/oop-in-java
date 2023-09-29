public class Setget{
    String name;
    int age;
    //getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String MARVA){
       this.name="MARVA";
    }
    public void setAge(int 20){
        this.age=20;
    }
    public static void main(String[] args){
    Setget myobj = new Setget();
    myobj.setName("MARVA");
    myobj.setAge(20);
    System.out.println(myobj.getName());
    System.out.println(myobj.getAge());


    }
}



public class PrintIt{
public static void myPrinter(String[] arg){
    System.out.println(arg);
}
}




