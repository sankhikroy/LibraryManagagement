public class Book {
    private int Id;
    private String author;
    private String Name;
    private boolean avalaible=true;
    public Book(int Id, String author, String Name) {
        this.Id = Id;
        this.author = author;
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isavalaible() {
        return avalaible;
    }

    public void setavalaible(boolean avalaible) {
        this.avalaible = avalaible;
    }
    @Override
    public String toString() {
        return "ID: " + getId() +
                " | Title: " + getName() +
                " | Author: " + getAuthor() +
                " | Available: " + (isavalaible() ? "Yes" : "No");
    }
}
