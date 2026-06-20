package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
                rawData.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return rawData.toString();

    }

    public List<DictionaryValue> getDictionaryValues() {
        List<DictionaryValue> dictionaryValues = new ArrayList<>();
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isBlank()) continue;
                String[] s = line.split(",");
                int id = Integer.parseInt(s[0].trim());
                int intKey = Integer.parseInt(s[1].trim());
                String stringKey = s[2].trim();
                String stringName = s[3].trim();
                String value = s[4].trim();
                dictionaryValues.add(new DictionaryValue(id, intKey, stringKey, stringName, value));
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return dictionaryValues;
    }
}
