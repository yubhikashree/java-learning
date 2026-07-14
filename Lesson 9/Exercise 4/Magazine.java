public class Magazine extends LibraryItem{
    private String issueNumber;
    public Magazine(String title, String author, int year, String issueNumber){
        super(title, author, year);
        this.issueNumber = issueNumber;
    }
    @Override
    public String getType(){ 
        return "Magazine"; 
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Issue number: " + issueNumber);
    }
}