public class DVD extends LibraryItem{
    private double durationMinutes;
    public DVD(String title, String author, int year, double durationMinutes){
        super(title, author, year);
        this.durationMinutes = durationMinutes;
    }
    @Override
    public String getType(){
        return "DVD";
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Duration: " + durationMinutes + " min");
    }
}