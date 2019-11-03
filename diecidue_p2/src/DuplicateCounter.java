/*Create a class called DuplicateCounter. Create an instance method called count
that takes a single parameter called dataFile (representing the path to a text file)
and uses a Map of Strings to count how many times each word occurs in dataFile.
The counts should be stored in an instance variable called wordCounter. Create an
instance method called write that takes a single parameter called outputFile
(representing the path to a text file) and writes the contents of wordCounter to
the file pointed to by outputFile. The output file should be overwritten if it
already exists, and created if it does not exist.
*/

import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DuplicateCounter {
    private HashMap<String, Integer> uniqueWords = new HashMap<>();
    private FileReader inFile = null;
    private FileWriter outFile = null;

    public DuplicateCounter(){
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

    public void count(String dataFile){
        try {
            //read in data file
            inFile = new FileReader(dataFile);
            System.out.println("Opening file: " + dataFile);

            //determine unique words
            System.out.println("Determining unique words...");
            //split the string by spaces
            //add to map
            //increase count with each occurrence of repeated word
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
            //outFile.write("testing");
            System.out.println("Writing to file: " + outputFile);
        } catch (IOException excpt){
            System.out.println("Caught IOException: " + excpt.getMessage());
        } finally {
            closeFileWriter(outFile);
        }

    }
}
