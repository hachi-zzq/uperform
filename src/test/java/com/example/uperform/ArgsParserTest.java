package com.example.uperform;


import org.junit.Test;

import static org.junit.Assert.*;

public class ArgsParserTest {


    @Test
    public void testParserWithValue() {
        Schema schema = new Schema("p", ValueType.Int, true, null);

        ArgsParser argsParser = new ArgsParser(schema);
        ParserResult parserResult = argsParser.parse("-p 100");

        assertEquals(parserResult.getKey(), "p");
        assertEquals(parserResult.getValue(), "100");
        assertEquals(parserResult.getValueType(), ValueType.Int);
    }
}
