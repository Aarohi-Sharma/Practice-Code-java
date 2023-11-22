class Library{
    String books[];
    int numb;
    Library(){
        this.books=new String[100];
    }
    void addBook(String book){
        this.books[numb]=book;
        numb++;
        System.out.println("book is added");
    }
    void showBook(){
        System.out.println("Available books are:");
        for (String book: this.books){
            if (book==null)
                continue;
            System.out.println(book);
        }
    }
    void issueBook(String book){
        for (int i=0; i<this.books.length; i++){
            if (this.books[i].equals(book)) {
                System.out.println("book issued");
                this.books[i] = null;
            }
        }
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class Main_51 {
    public static void main(String[] args) {
        Library central=new Library();
        central.addBook("kit");
        central.addBook("pit");
        central.showBook();
        central.issueBook("kit");
        central.showBook();
        central.addBook("kit");
        central.showBook();
    }
}
