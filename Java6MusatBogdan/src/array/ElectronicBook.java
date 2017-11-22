package array;


import array.EBook;



/*
 * ElectronicBook 
 */

/**
 *
 * @author Bogdan
 */

public class ElectronicBook {
    public static void main(String[] args) {
    //define Books
     EBook eb1 = new EBook("Seara pe deal","1234567891012","Mihai Eminescu","www.mystore.ro/seara","bestsell","nemira",20.00,"ebook","1885");
     EBook eb2 = new EBook("Zdreanta","123222789101222","Tudor Arghezi","www.mystore.ro/zdreanta","bestbuy","libris",15.00,"ebook","19542");
     IBook ib1 = new IBook("El Zorab","1233337891012","George Cosbuc","www.mystore.ro/Elzorab","bestprice","art",17.00,"ibook","1189");

//create Array
    
     ElectronicBook[] carti = {eb1,eb2,ib1};
    
     //method for print
    for(ElectronicBook currentEBook : carti){
            currentEBook.printElectronicBook();
       }
}
}
   


    

