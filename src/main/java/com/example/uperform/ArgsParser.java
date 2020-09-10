package com.example.uperform;

import java.util.List;

public class ArgsParser {

    private Schema schema;

    public ArgsParser(Schema schema) {
        this.schema = schema;
    }

    public ParserResult parse(String inputString) {
        // -k v
        Arg arg = splitInput(inputString);

        if (!validateWithSchema(arg)) {
            throw new InputInvalidateException();
        }

        return new ParserResult(arg.getKey(), arg.getValue(), arg.getValueType());
    }


    public Boolean validateInput(String inputString) {
        return inputString.trim().startsWith("-");
    }


    public Boolean validateWithSchema(Arg arg) {
        if (!arg.getKey().equals(schema.getKey())) {
            return false;
        }

        if (!checkSchemaValueType(arg.getValue())) {
            return false;
        }

        if (arg.getValue() == null && schema.getValueRequired()) {
            return false;
        }

        return true;
    }


    public Boolean checkSchemaValueType(String value) {

        switch (schema.getValueType()) {
            case Int:
                return isInt(value);
            case Str:
                return isString(value);
            default:
                throw new InputInvalidateException();
        }

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

    public Arg splitInput(String inputString) {
        if (!validateInput(inputString)) {
            throw new InputInvalidateException();
        }

        String[] input = inputString.split(" ");

        if (input.length == 1) {
            String key = input[0];
            return new Arg(key.substring(1), null);
        }

        return new Arg(input[0].substring(1), input[1]);
    }


}
