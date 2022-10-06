package week3.day4;

import java.io.IOException;

public class ReadFileMain {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("./sample.txt");
        System.out.println(readFile.readByte());
    }
}
