package week3.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesRead {
    public static void main(String[] args) throws IOException {
        File dir = new File("./");
        File[] files = dir.listFiles();

        if (files != null) {
            for(File f : files)
                System.out.println(f);
        }


        System.out.println(readChar("./smaple.txt", 3));
    }
    static char readChar(String filename) throws IOException {
        FileReader fileReader = new FileReader("./sample.txt");
        return (char)fileReader.read();
    }
    static String readChar(String filename, int n) throws IOException {
        FileReader fileReader = new FileReader("./sample.txt");
        String read = "";
        for(int i=0 ; i<n ; i++){
            read += (char)fileReader.read();
        }
        return read;
    }
}
