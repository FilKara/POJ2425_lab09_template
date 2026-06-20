package com.example;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class DictionaryCache {
    private static DictionaryCache instance;
    private volatile List<DictionaryValue> items = new ArrayList<>();

    private DictionaryCache() {}

    public static synchronized DictionaryCache getInstance() {
        if (instance == null) instance = new DictionaryCache();
        return instance;
    }

    public synchronized void setItems(List<DictionaryValue> items) {
        this.items = new ArrayList<>(items);
    }

    public synchronized List<DictionaryValue> getItems() {
        return new ArrayList<>(items);
    }

}
