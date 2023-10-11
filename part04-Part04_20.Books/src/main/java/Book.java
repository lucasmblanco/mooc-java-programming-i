public class Book {
    private String name;
    private int pages;
    private int publicationYear;

    public Book(String name, int pages, int year){
        this.name = name;
        this.pages = pages;
        this.publicationYear = year;
    }

    public String getName(){
        return this.name;
    }

    public String getPages(){
        return this.pages + " pages";
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    @Override
    public String toString(){
        return this.getName() + ", " + this.getPages() + ", " + this.getPublicationYear();
    }
}
