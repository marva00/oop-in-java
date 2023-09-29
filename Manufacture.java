public class Manufacture {
   private int date;
   private int month;
   private int year;
    
Manufacture(int date,int month,int year){
    this.date=date;
    this.month=month;
    this.year=year;
}

public int getDate(){
    return date;
}
public void setDate(int date){
    this.date=date;
}
public int getYear(){
    return year;
}
public void setYear(int year){
    this.year=year;
}
public int getMonth(){
    return date;
}
public void setMonth(int month){
    this.month=month;
}

public String toString(){
    String manufactDate=String.format("%d/%d/%d",date,month,year);
    return manufactDate;
}


public Manufacture latest(Manufacture d1,Manufacture d2){
    return d1.getMonth()<d2.getMonth()?d2:d1;
}














}
