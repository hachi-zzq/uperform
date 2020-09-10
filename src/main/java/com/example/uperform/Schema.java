package com.example.uperform;

public class Schema {

    private String key;

    private ValueType valueType;

    private Boolean valueRequired;

    private String defaultValue;

    public Schema(String key, ValueType valueType, Boolean valueRequired, String defaultValue) {
        this.key = key;
        this.valueType = valueType;
        this.valueRequired = valueRequired;
        this.defaultValue = defaultValue;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public Boolean getValueRequired() {
        return valueRequired;
    }

    public void setValueRequired(Boolean valueRequired) {
        this.valueRequired = valueRequired;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
