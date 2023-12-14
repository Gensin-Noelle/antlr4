package Mytest;

import Genshin.GenshinLexer;
import Genshin.GenshinParser;
import main.CalcListener;
import main.MyListener;
import main.MyListener2;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyListenerTest {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("src/main/java/MyFile/calcTest");
        CharStream input = CharStreams.fromStream(is);
        GenshinLexer lexer = new GenshinLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GenshinParser parser = new GenshinParser(tokens);
        ParseTree tree = parser.r();
        CalcListener.MyWalker myWalker = new CalcListener.MyWalker();
        MyListener ml = new MyListener();     //函数调用图
        CalcListener cl = CalcListener.getCl();//函数调用
        myWalker.walk(ml, tree);
        ml.relation.displayRelation();
        myWalker.walk(cl, tree);

//        MyListener2 ml2 = new MyListener2();
//        myWalker.walk(ml2, tree);
//        Files.writeString(Path.of("src/main/java/MyFile/funCall.dot"), ml2.graph.toDot());
    }
}
