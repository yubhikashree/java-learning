public class Book extends LibraryItem{
    private int pages;
    public Book(String title, String author, int year, int pages){
        super(title, author, year);
        this.pages = pages;
    }
    @Override
    public String getType(){
        return "Book";
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Pages: " + pages);
    }
}
