import java.util.Random;

public class MadLib{
    public static void main(String[] args){
        // Define arrays of words for substitution
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};
        String[] verbs = {"ate", "jumped over", "sang to", "danced with", "tickled"};
        String[] objects = {"a cat", "a tree", "a pizza", "a book", "a monkey"};

        // Create a random number generator
        Random rand = new Random();

        // Generate random indices to select words from the arrays
        int nameIndex = rand.nextInt(names.length);
        int verbIndex = rand.nextInt(verbs.length);
        int objectIndex = rand.nextInt(objects.length);

        // Generate the madlib sentence
        String madlib = names[nameIndex] + " " + verbs[verbIndex] + " " + objects[objectIndex] + ".";

        // Print the madlib sentence
        System.out.println("Madlib: " + madlib);
    }
}