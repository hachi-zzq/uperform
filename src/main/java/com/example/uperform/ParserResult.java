package com.example.uperform;

public class ParserResult {

    private String key;

    private String value;

    private ValueType valueType;

    public ParserResult(String key, String value, ValueType valueType) {
        this.key = key;
        this.value = value;
        this.valueType = valueType;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public ValueType getValueType() {
        return valueType;
    }
}
