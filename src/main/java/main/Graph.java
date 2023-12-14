package main;

import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;

import java.util.List;
import java.util.Set;

public class Graph {
    private final Set<String> nodes = new OrderedHashSet<>();

    private final MultiMap<String, String> edges = new MultiMap<>();


    public void addNode(String node) {
        nodes.add(node);
    }


    public void addEdge(String caller, String callee) {
        edges.map(caller, callee);
    }


    public String toDot() {
        StringBuilder buf = new StringBuilder();
        int count;
        List<String> list = nodes.stream().toList();
        buf.append("digraph G {\n").append(" ranksep = 0.25;\n").append(" edge [arrowsize = 0.5]\n");

        buf.append("node [color = \"#FF0000\",fillcolor = \"#FF0000\",fontcolor = \"#000000\"," +
                "fontname = Helvetica,shape = circle,style = filled];\n");
        for (count = 0; count < list.size(); count++) {
            if (count % 4 == 0) buf.append(list.get(count)).append(";\n");
        }
        buf.append("node [color = \"#00BFFF\",fillcolor = \"#00BFFF\",fontcolor = \"#000000\"," +
                "fontname = Helvetica,shape = circle,style = filled];\n");
        for (count = 0; count < list.size(); count++) {
            if (count % 4 == 1) buf.append(list.get(count)).append(";\n");
        }

        buf.append(" node [color = \"#7CFC00\",fillcolor = \"#7CFC00\",fontcolor = \"#000000\"," +
                "fontname = Helvetica,shape = circle,style = filled];\n");
        for (count = 0; count < list.size(); count++) {
            if (count % 4 == 2) buf.append(list.get(count)).append(";\n");
        }

        buf.append("node [color = \"#FF00FF\",fillcolor = \"#FF00FF\",fontcolor = \"#000000\"," +
                "fontname = Helvetica,shape = circle,style = filled];\n");
        for (count = 0; count < list.size(); count++) {
            if (count % 4 == 3) buf.append(list.get(count)).append(";\n");
        }

        edges.getPairs().

                forEach(edge -> buf.append(" ").

                        append(edge.a).

                        append(" -> ").

                        append(edge.b).

                        append(";\n"));
        buf.append("}\n");
        return buf.toString();
    }
}
