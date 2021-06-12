/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepartion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import joinery.DataFrame;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Sondos
 */
public class TextFile {

    //private static Object p;
    
    public static void main (String args[]) throws FileNotFoundException, IOException{
        FileInputStream is ;
        is = new FileInputStream ("C:\\Users\\Sondos\\Downloads\\1st Task_Code.txt");
         String content =IOUtils.toString(is ,StandardCharsets.UTF_8);
        System.out.println("content" + content);
        
        
        List <String> lines = IOUtils.readLines(is, StandardCharsets.UTF_8);
        System.out.println("lines" + lines);

    DataFrame <Object> df = new DataFrame.CSVReader("C:\\Users\\Sondos\\Downloads\\Cities.csv"); 
    
    }
    private FileInputStream is;
    
    
}
