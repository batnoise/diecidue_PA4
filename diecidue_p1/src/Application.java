/*Create a separate class called Application that contains a main method which
  illustrates the use of DuplicateRemover by calling both the remove and write methods.
  Your input file must be called problem1.txt and your output file must be called unique_words.txt.
 */

public class Application {
    public static void main(String[] args){

        DuplicateRemover duplicateRemover = new DuplicateRemover();

        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");
    }
}
