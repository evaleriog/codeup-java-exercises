package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        setName(name);
        setCategory(category);
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
