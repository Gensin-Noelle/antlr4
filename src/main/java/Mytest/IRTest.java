package Mytest;

import Genshin.GenshinLexer;
import Genshin.GenshinParser;
import main.IRVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

public class IRTest {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/main/java/MyFile/IRTest");
        CharStream c = CharStreams.fromStream(file);
        GenshinLexer lexer = new GenshinLexer(c);
        CommonTokenStream token = new CommonTokenStream(lexer);
        GenshinParser parser = new GenshinParser(token);
        ParseTree tree = parser.r();
        IRVisitor visitor = new IRVisitor();
        visitor.visit(tree);
    }
}
