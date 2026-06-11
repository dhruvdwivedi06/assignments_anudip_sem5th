import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            // Write Operation
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello, this is a file handling example in Java.");
            fw.close();

            System.out.println("Data written to file successfully.");

            // Read Operation
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nData read from file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}