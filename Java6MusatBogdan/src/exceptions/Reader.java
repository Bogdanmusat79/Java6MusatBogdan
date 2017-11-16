/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Bogdan
 */
public class Reader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader r = new BufferedReader (new FileReader ("text.txt"));
        try {
            String firstLine = r.readLine();}
        catch (IOException e){
            System.out.println("Cannot read first line from text.txt: " + e.getMessage());
        }finally{
            r.close();
                }
        }

    
        }
    

       

