/* Create a class called DuplicateRemover. Create an instance method called remove
   that takes a single parameter called dataFile (representing the path to a text file)
   and uses a Set of Strings to eliminate duplicate words from dataFile. The unique words
   should be stored in an instance variable called uniqueWords. Create an instance method
   called write that takes a single parameter called outputFile (representing the path to a text file)
   and writes the words contained in uniqueWords to the file pointed to by outputFile.
   The output file should be overwritten if it already exists, and created if it does not exist.
 */

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DuplicateRemover {
    private ArrayList<String> uniqueWords = new ArrayList<String>();
    private FileReader inFile = null;
    private FileWriter outFile = null;

    //make a constructor, probably
    public DuplicateRemover(){
        //default constructor
    }

    private void closeFileReader(FileReader fileName){
        try {
            if (fileName != null) { // Ensure "file" references a valid object
                System.out.println("Closing file.");
                fileName.close(); // close() may throw IOException if fails
            }
        } catch (IOException closeExcpt) {
            System.out.println("Error closing file: " + closeExcpt.getMessage());
        }
    }

    private void closeFileWriter(FileWriter fileName){
        try {
            if (fileName != null) { // Ensure "file" references a valid object
                System.out.println("Closing file.");
                fileName.close(); // close() may throw IOException if fails
            }
        } catch (IOException closeExcpt) {
            System.out.println("Error closing file: " + closeExcpt.getMessage());
        }
    }

    public void remove(String dataFile){
        try {
            //read in data file
            inFile = new FileReader(dataFile);
            System.out.println("Opening file: " + dataFile);

            //determine unique words
            System.out.println("Determining unique words...");
            //split the string by spaces
            //add to array
            //store unique words in associated DuplicateRemover object
        } catch (IOException excpt){
            System.out.println("Caught IOException: " + excpt.getMessage());
        } finally {
            closeFileReader(inFile);
        }

    }

    public void write(String outputFile){
        try {
            outFile = new FileWriter(outputFile);

            //print the current collection of unique words to outputFile
            System.out.println("Writing to file: " + outputFile);
        } catch (IOException excpt){
            System.out.println("Caught IOException: " + excpt.getMessage());
        } finally {
            closeFileWriter(outFile);
        }

    }
}
