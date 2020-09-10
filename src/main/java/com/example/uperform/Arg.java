package com.example.uperform;

public class Arg {

    public String key;

    public String value;

    public Arg(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public ValueType getValueType() {
        if (isInt(value)) {
            return ValueType.Int;
        }

        if (isString(value)) {
            return ValueType.Str;
        }

        return ValueType.UnKnow;
    }

    public Boolean isInt(String number) {
        try {
            Integer.valueOf(number);
        } catch (Exception e) {
            return false;
        }

        return true;
    }


    public Boolean isString(String number) {
        return true;
    }

    @Override
    public String toString() {
        return "Arg{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
