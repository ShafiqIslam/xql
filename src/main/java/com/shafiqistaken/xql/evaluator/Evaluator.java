package com.shafiqistaken.xql.evaluator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.shafiqistaken.xql.data.SheetData;
import com.shafiqistaken.xql.grammer.XqlLexer;
import com.shafiqistaken.xql.grammer.XqlParserParser;

public class Evaluator {
    public static SheetData eval(SheetData input, String expression) {
        CharStream inputCharStream = CharStreams.fromString(expression);
        XqlLexer lexer = new XqlLexer(inputCharStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        XqlParserParser parser = new XqlParserParser(commonTokenStream);

        parser.selectStatement();

        return input;
    }
}
