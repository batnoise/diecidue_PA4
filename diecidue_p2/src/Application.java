/*Create a separate class called Application that contains a main method which
  illustrates the use of DuplicateCounter by calling both the count and write methods.
  Your input file must be called problem1.txt and your output file must be called unique_word_counts.txt.
 */

public class Application {
    public static void main(String[] args){

        DuplicateCounter duplicateRemover = new DuplicateCounter();

        duplicateRemover.count("problem1.txt");
        duplicateRemover.write("unique_word_counts.txt");
    }

}
