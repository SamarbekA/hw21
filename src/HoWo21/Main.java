package HoWo21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("Alphabet&Numbers.txt")){
            for (char letter = 'A'; letter <= 'Z'; letter++) {
            String string = letter + " " + Character.toLowerCase(letter)+" \n";
            fileWriter.write(string);
            }
            for (char i ='0'; i <= '9'; i++) {
                fileWriter.write(i+"\n");
            }
            }catch (IOException e) {
                System.out.println();
            }

        try (FileReader fileReader = new FileReader("Alphabet&numbers.txt")){
            Scanner scanner = new Scanner(fileReader);
            int i = 1;
            while (scanner.hasNext()) {
                System.out.println(i + ". " + scanner.nextLine());
                i++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
