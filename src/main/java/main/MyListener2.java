package main;

import Genshin.GenshinBaseListener;
import Genshin.GenshinParser;

public class MyListener2 extends GenshinBaseListener {
    public Graph graph = new Graph();
    String curFunName = null;

    @Override
    public void enterFunctionDecl(GenshinParser.FunctionDeclContext ctx) {
        curFunName = ctx.ID().getText();
        graph.addNode(curFunName);
    }

    @Override
    public void enterCall(GenshinParser.CallContext ctx) {
        String callee = ctx.ID().getText();
        graph.addEdge(curFunName, callee);
    }
}
