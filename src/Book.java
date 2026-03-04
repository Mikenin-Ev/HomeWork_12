public class Book {
    private String title;
    private Author author;
    private int publicationYer;

    public Book(String title, Author author, int publicationYer) {
        this.title = title;
        this.author = author;
        this.publicationYer = publicationYer;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYer() {
        return publicationYer;
    }

    public void setPublicationYer(int publicationYer) {
        this.publicationYer = publicationYer;
    }
}
