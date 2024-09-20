public class Artwork {
    int year;
    String title;
    Artist artist;

    Artwork(String title, int year, Artist artist){
        this.title=title;
        this.year=year;
        this.artist=artist;
    }

    public String getTitle(){
        return title;
    }
    public Artist geArtist(){
        return artist;
    }
    public int getYear(){
        return year;
    }


}
