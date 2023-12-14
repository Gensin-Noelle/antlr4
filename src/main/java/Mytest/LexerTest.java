package Mytest;

import Genshin.GenshinLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.FileInputStream;
import java.io.IOException;


public class LexerTest {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("src/main/java/MyFile/LexerTest");
        CharStream input = CharStreams.fromStream(is);
        GenshinLexer lexer = new GenshinLexer(input);
        lexer.getAllTokens().forEach(System.out::println);
    }
}


