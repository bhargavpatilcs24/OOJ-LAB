package Week7;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);

            System.out.println("File content:");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File does not exist.");
        }
    }
}