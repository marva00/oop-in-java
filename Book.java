public class Book {
   private String author;
   private  String title;
    
   public String getTitle(){
    return title;
   }
   public String getAuthor(){
    return author;
   }
   public void setTitle(String T){
    this.title=T;

   }
   public void setAuthor(String A){
    this.author=A;
   }
   public static void main(String[] args) {
    Book myBook=new Book();

    myBook.setTitle="Alchemist";
    myBook.setauthor="Polo Coelho";
    System.out.println(myBook.getTitle());
    System.out.println(myBook.getAuthor());
   // System.out.println();
   }

}
