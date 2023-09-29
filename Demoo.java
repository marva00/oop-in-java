import java.util.Scanner;

public class Demoo {
    public static void main(String[] args){
       // Music m1=new Music("LoveStory",   new Artist("Taylor","British",3),  4 , "melody", "love",   new Date(15,9,2021));
       // Music m2=new Music("Calm Down",   new Artist("Saleena","British",5), 5 , "Hip Hop","tom1",   new Date(10,9,2019));
        //Music m3=new Music("Jeena Jeena", new Artist("Atif","Pakistani",6),  8 , "soft",   "love",   new Date(17,3,2012));
        //Music m4=new Music("Dynamite",    new Artist("BTS","Korea",8),       3 , "kpop",   "dynamite",new Date(10,2,2023));
        //Music m5=new Music("Butter",      new Artist("BTS","Korea",5),       7 , "kpop",   "butter",  new Date(1,9,2022));

        //System.out.println(m1);
        //System.out.println(m2);        
        //System.out.println(m3);
        //System.out.println(m4);
        //System.out.println(m5);

//if(m1.getTitle()==(m2.getTitle())){
    //System.out.println("objects are equal");
    
//}
//else{
   // System.out.println("objects are not equal");
//}
 //   }

 
// Music list[]=new Music[10];
//list[0]=m1;
//list[1]=m2;
//list[2]=m3;
//list[3]=m4;
//list[4]=m5;
//for(int i=0; i<=10;i++){
 //   System.out.println(list[i]);
 //  }

//}
System.out.println("input Title name");
Scanner in = new Scanner(System.in);
String Title = in.nextLine();
System.out.println("input artist name");
String Artist = in.nextLine();
System.out.println("input duration of song");
int duration = in.nextInt();
System.out.println("input gener");
String gener = in.nextLine();
System.out.println("input albumname");
String albumname = in.nextLine();
System.out.println("input releasedate of song");
String releasedate = in.nextLine();
//Music m1=new Music(Title,Artist,duration,gener,albumname,releasedate);
//System.out.println(m1);
 

}
}