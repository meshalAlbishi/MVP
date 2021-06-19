


import Classes.sports.Basketball;
import Classes.sports.Handball;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author MESHAL
 */
public class Main {

    public static Scanner input;

    public static void main(String[] args) throws FileNotFoundException {
        start();
    }

    private static void start() throws FileNotFoundException {
        openFiles();
    }

    // open files method
    private static void openFiles() throws FileNotFoundException {
        try {
            File file = new File("statics");

            File staticFiles[] = file.listFiles();
            for (int i = 0; i < staticFiles.length; i++) {

                File staticFile = staticFiles[i];
                readFile(staticFile);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFile(File staticFile) throws FileNotFoundException, Exception {
        input = new Scanner(staticFile);

        while (input.hasNext()) {

            String sportType = input.next();

            switch (sportType) {

                case "BASKETBALL":
                    Basketball basketball = new Basketball(input);
                    break;
                // ---------------------   

                case "HANDBALL":
                    Handball handball = new Handball(input);
                    break;
                // ---------------------                    
            }

        }
    }
    
  
    
    
}