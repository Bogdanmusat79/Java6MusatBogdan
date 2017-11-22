package array;

/*
 *EBook Class contains
 */

/**
 *
 * @author Bogdan
 */
public class EBook extends ElectronicBook {
        String bookTitle;
        String ISBN;
        String author;
        String link;
        String remarks;
        String publisher;
        Double price;
        String electronicFormat;
        String year; 
//create constructor
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
        //create printing model
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
 


  
  


