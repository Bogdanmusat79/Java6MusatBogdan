/*
 * We are using ONE file for ONE public class and not write more public classes 
in one file!!!
 */
package arrays;
import java.util.Arrays; // this import is not used. We are removing these imports from our code before to deliver it.


/**
 *
 * @author Bogdan
 * 
 */
public class array { // Class names are written with CAPS!!!!!!!

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EBook eb1 = new EBook("Seara pe deal","1234567891012","Mihai Eminescu","www.mystore.ro/seara","bestsell","nemira",20.00,"ebook","1885");
       EBook eb2 = new EBook("Zdreanta","123222789101222","Tudor Arghezi","www.mystore.ro/zdreanta","bestbuy","libris",15.00,"ebook","19542");
       IBook ib1 = new IBook("El Zorab","1233337891012","George Cosbuc","www.mystore.ro/Elzorab","bestprice","art",17.00,"ibook","1189");
       ElectronicBook[]carti = {eb1,eb2,ib1};
       
       // as carti is a collection/array of ElectronicBooks you have to print
       // book by book.
       for(ElectronicBook currentEBook : carti){
            currentEBook.printElectronicBook();// I defined the method that prints an ElectronicBook
       }
    }
    
    
public static class EBook extends ElectronicBook {
        String bookTitle;
        String ISBN;
        String author;
        String link;
        String remarks;
        String publisher;
        Double price;
        String electronicFormat;
        String year;

        public EBook(String bookTitle, String ISBN, String author, String link, String remarks, String publisher, Double price, String electronicFormat, String year) {
            this.bookTitle = bookTitle;
            this.ISBN = ISBN;
            this.author = author;
            this.link = link;
            this.remarks = remarks;
            this.publisher = publisher;
            this.price = price;
            this.electronicFormat = electronicFormat;
            this.year = year;
        }    
                /**
         Print content of an electronic book.
         */
        @Override
        public void printElectronicBook(){
            System.out.println("---------- EBook ----------");
            System.out.println(" Title: "+bookTitle);
            System.out.println(" ISBN: "+ISBN);
            System.out.println(" Author: "+author);
            System.out.println(" Link: "+link);
            System.out.println(" Remarks: "+remarks);
            System.out.println(" Publisher: "+publisher);
            System.out.println(" Price: "+price);
            System.out.println(" Electronic format: "+electronicFormat);
            System.out.println(" Year: "+year);
            System.out.println("---------------------------");
        }
    }
    
   public static class IBook extends ElectronicBook {
        String bookTitle;
        String ISBN;
        String author;
        String link;
        String remarks;
        String publisher;
        Double price;
        String electronicFormat;
        String year;

        public IBook(String bookTitle, String ISBN, String author, String link, String remarks, String publisher, Double price, String electronicFormat, String year) {
            this.bookTitle = bookTitle;
            this.ISBN = ISBN;
            this.author = author;
            this.link = link;
            this.remarks = remarks;
            this.publisher = publisher;
            this.price = price;
            this.electronicFormat = electronicFormat;
            this.year = year;
        }    
        
        /**
         Print content of an electronic book.
         */
        @Override
        public void printElectronicBook(){
            System.out.println("---------- EBook ----------");
            System.out.println(" Title: "+bookTitle);
            System.out.println(" ISBN: "+ISBN);
            System.out.println(" Author: "+author);
            System.out.println(" Link: "+link);
            System.out.println(" Remarks: "+remarks);
            System.out.println(" Publisher: "+publisher);
            System.out.println(" Price: "+price);
            System.out.println(" Electronic format: "+electronicFormat);
            System.out.println(" Year: "+year);
            System.out.println("---------------------------");            
        }
    }
    

    abstract private static class ElectronicBook {

        public ElectronicBook() {
        String bookTitle;
        String ISBN;
        String author;
        String link;
        String remarks;
        String publisher;
        Double price;
        String electronicFormat;
        String year;
        }
        
        abstract void printElectronicBook();
    }
    
}
