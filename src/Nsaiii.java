import java.util.Scanner;

public class Nsaiii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word 1");
        String word1 = scanner.next();
        System.out.println("Please enter the word 2");
        String word2 = scanner.next();

        String word1Concat = word1.concat(word2);
        String word2Concat = word2.concat(word1);

        if (word1Concat.equals(word2Concat)) {
            System.out.println("Alternates");
        } else {
            System.out.println("Does not alternate");
        }
    }
}
