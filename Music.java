public class Music {
    public String title;
    public Artist artist;
    public int duration;
    public String gener;
    public String albumname;
    public Date releasedate;

    
    Music(String title,Artist artist,int duration,String gener,String albumname,Date releasedate){
    this.title=title;
    this.artist=artist;
    this.duration=duration;
    this.gener=gener;
    this.albumname=albumname;
    this.releasedate=releasedate;

    }
    public String getTitle(){
        return title;
     }
     public void setTitle(String title){
        this.title=title;

     }

     public Artist getArtist(){
        return artist;
     }
     public void setArtist(Artist artist){
        this.artist=artist;

     }

     public int getDuration(){
        return duration;
     }
     public void setDuration(int duration){
        this.duration=duration;

     }
     public String getGener(){
        return gener;
     }
     public void setGener(String gener){
        this.gener=gener;

     }
     public String getAlbumname(){
        return albumname;
     }
     public void setAlbumname(String albumname){
        this.albumname=albumname;

     }
     public Date getReleasedate(){
        return releasedate;
     }
     public void setReleasedate(Date releasedate){
        this.releasedate=releasedate;

     }
     public String toString(){
        String Songs=String.format("%3s\t%13s\t%13d\t%13s\t%13s\t%13s\t",title,artist,duration, gener,albumname, releasedate);
        
            return Songs;
        }
}
