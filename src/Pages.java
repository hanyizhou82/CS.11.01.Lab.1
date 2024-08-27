import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = reader.nextInt();
        reader.close();
        // Calculate the number of pages to read before giving up on a book
        int pagesToRead = 100 - age;

        // Display the result
        System.out.println(age + "-year olds should read at least " + pagesToRead + " pages before giving up on a book.");
    }
}
