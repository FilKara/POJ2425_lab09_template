package com.example;

public class DictionaryValue {
    private int id;
    private int intKey;
    private String stringKey;
    private String dictionaryName;
    private String value;

    public DictionaryValue(int id, int intKey, String stringKey, String dictionaryName, String value) {
        this.id = id;
        this.intKey = intKey;
        this.stringKey = stringKey;
        this.dictionaryName = dictionaryName;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public int getIntKey() {
        return intKey;
    }

    public String getStringKey() {
        return stringKey;
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public String getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIntKey(int intKey) {
        this.intKey = intKey;
    }

    public void setStringKey(String stringKey) {
        this.stringKey = stringKey;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
