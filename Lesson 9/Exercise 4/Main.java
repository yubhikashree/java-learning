public class Main{
    public static void main(String[] args){
        Book b1 = new Book("The Pragmatic Programmer", "Andy Hunt", 1999, 352);
        Book b2 = new Book("Clean Code", "Robert C. Martin", 2008, 464);
        Magazine m1 = new Magazine("National Geographic", "Various", 2024, "Vol. 245");
        Magazine m2 = new Magazine("Science Today", "Editorial Team", 2023, "Issue 18");
        DVD d1 = new DVD("Interstellar", "Christopher Nolan", 2014, 169.0);
        DVD d2 = new DVD("Inception", "Christopher Nolan", 2010, 148.0);
        LibraryItem[] items = {b1, b2, m1, m2, d1, d2};
        int books = 0;
        int magazines = 0;
        int dvds = 0;
        System.out.println("===== Library Catalogue =====");
        for (LibraryItem item : items){
            System.out.println("[" + item.getType() + "]");
            item.displayInfo();
            System.out.println();
            if (item.getType().equals("Book")) {
                books++;
            } else if (item.getType().equals("Magazine")) {
                magazines++;
            } else if (item.getType().equals("DVD")) {
                dvds++;
            }
        }
        System.out.println("Books: " + books + " | Magazines: " + magazines + " | DVDs: " + dvds);
    }
}