package main;

import Genshin.GenshinBaseListener;
import Genshin.GenshinParser;

public class MyListener extends GenshinBaseListener {
    public Relation relation = new Relation();

    @Override
    public void enterFunctionDecl(GenshinParser.FunctionDeclContext ctx) {
        relation.getMainList().add(ctx.ID().getText());
    }

    @Override
    public void enterCall(GenshinParser.CallContext ctx) {
        relation.getCallList().add(ctx.ID().getText());
    }

    @Override
    public void enterIF(GenshinParser.IFContext ctx) {
        relation.getCallList().add("if");
    }

    @Override
    public void enterFor(GenshinParser.ForContext ctx) {
        relation.getCallList().add("for");
    }

    @Override
    public void exitFunctionDecl(GenshinParser.FunctionDeclContext ctx) {
        relation.getCallList().add("EOF");
    }
}
