package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DictionaryFileReader {

    private String filePath;
    public DictionaryFileReader(String filePath) {
        this.filePath = filePath;
    }

    public String getRawFileData() {
        StringBuilder rawData = new StringBuilder();
        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                rawData.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return rawData.toString();

    }
}
