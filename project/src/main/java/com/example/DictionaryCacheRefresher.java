package com.example;

import java.util.ArrayList;
import java.util.List;

public class DictionaryCacheRefresher extends Thread {
    private final DictionaryFileReader dictionaryFileReader;
    private List<DictionaryValue> lastValues = new ArrayList<>();
    public DictionaryCacheRefresher() {
        this.dictionaryFileReader = new DictionaryFileReader("src/main/resources/dictionaries.csv");
    }

    @Override
    public void run() {
        while (!isInterrupted()) {

            List<DictionaryValue> values = dictionaryFileReader.getDictionaryValues();

            if (!values.equals(lastValues)) {
                DictionaryCache cache = DictionaryCache.getInstance();

                cache.setItems(values);

                for (DictionaryValue dictionaryValue : cache.getItems()) {
                    System.out.println(dictionaryValue);
                }

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        }

    }
}
