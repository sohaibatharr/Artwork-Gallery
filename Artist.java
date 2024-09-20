public class Artist {

    public String name;

    Artist(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void Display()
    {
        System.out.println("Name: "+ name);
    }
}
