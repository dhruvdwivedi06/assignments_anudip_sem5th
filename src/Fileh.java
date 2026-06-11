import java.io.*;
class Fileh {
    public static void main(String[] args)  {
        try {
            FileOutputStream fout = new FileOutputStream("abc.txt");
            String data = "This is a test";
            byte[] bytes = data.getBytes();
            fout.write(bytes);
            fout.close();

            System.out.println("FILE SUCCESSFULLY CREATED");
        }
        catch (Exception e) {
            System.out.println("FILE NOT CREATED" + e.getMessage());
        }
    }
}
