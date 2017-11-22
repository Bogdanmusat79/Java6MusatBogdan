/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author gheor
 */
public class TestElectronicBook {

    /**
     * @param args the command line arguments
     */
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
