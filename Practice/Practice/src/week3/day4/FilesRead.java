package week3.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilesRead {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("./");
        File[] files = dir.listFiles();

        if (files != null) {
            for(File f : files)
                System.out.println(f);
        }
    }
}
