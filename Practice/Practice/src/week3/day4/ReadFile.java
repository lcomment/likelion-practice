package week3.day4;

import java.io.*;
import java.nio.file.Files;

public class ReadFile {
    private String name;

    public ReadFile(String name){
        this.name = name;
    }

    byte readByte() throws IOException {
        File file = new File(this.name);
        byte[] fileContent = Files.readAllBytes(file.toPath());
        return fileContent[0];
    }
}
