/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Arrays;


/**
 *
 * @author Bogdan
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EBook eb1 = new EBook("Seara pe deal","1234567891012","Mihai Eminescu","www.mystore.ro/seara","bestsell","nemira",20.00,"ebook","1885");
       EBook eb2 = new EBook("Zdreanta","123222789101222","Tudor Arghezi","www.mystore.ro/zdreanta","bestbuy","libris",15.00,"ebook","19542");
       IBook ib1 = new IBook("El Zorab","1233337891012","George Cosbuc","www.mystore.ro/Elzorab","bestprice","art",17.00,"ibook","1189");
       ElectronicBook[]carti = {eb1,eb2,ib1};
       
        
       System.out.println(carti);
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
        }
    

    private static class ElectronicBook {

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
    }
    
}
