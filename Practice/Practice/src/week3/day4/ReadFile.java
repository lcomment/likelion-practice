package week3.day4;

import java.io.*;
import java.nio.file.Files;

public class ReadFile {
    private String name;

    public ReadFile(String name){
        this.name = name;
    }

    void readByte(int n) throws IOException {
        File file = new File(this.name);
        byte[] fileContent = Files.readAllBytes(file.toPath());

        for(int i=0 ; i<n ; i++){
            System.out.println((char)fileContent[i]);
        }
    }
}
