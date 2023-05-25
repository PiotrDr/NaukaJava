package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test.txt");
        File File;
        Scanner myReader = new Scanner(file);
        while(myReader.hasNext()) {
            String line = myReader.nextLine();
            System.out.println(line);
        }
        myReader.close();
    }
}
