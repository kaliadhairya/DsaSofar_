import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        reversePrintSentence(sentence);
        scanner.close();
    }

    public static void reversePrintSentence(String sentence) {
        String[] words = sentence.split(" ");
        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
