package Files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.delete()) {
            System.out.println("Plik usuniety");
        } else {
            System.out.println("Usuniecie nie powiodlo sie");
        }
    }
}
