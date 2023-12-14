package main;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 基于Java图形库的简单函数调用图实现
 */
public class MyGraphic extends JFrame {
    private final Location location;
    private final Map<String, Location> mainMap;
    private Map<Integer, MyStr> strMap;

    public MyGraphic(Map<Integer, MyStr> map) {
        setSize(600, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        MyCanvas myCanvas = new MyCanvas();
        add(myCanvas);
        mainMap = new HashMap<>();
        strMap = new HashMap<>();
        location = new Location((getSize().width) / 2, 50);
        strMap = map;
    }

    class Location {
        private int x;
        private int y;
        private int count1 = 2;
        private boolean count2 = true;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Location myGetLocation() {
            if (count1 % 3 == 0) {
                if (count2) {
                    location.x += 100;
                    count2 = false;
                } else location.x += 200;
                location.y += 100;
            } else location.x -= 100;
            count1++;
            return new Location(location.x, location.y);
        }
    }

    static class MyStr {
        private final String str1;
        private final String str2;

        public MyStr(String str1, String str2) {
            this.str1 = str1;
            this.str2 = str2;
        }
    }

    class MyCanvas extends Canvas {
        @Override
        public void paint(Graphics graph) {
            int l = 50;
            for (int i = 0; i < strMap.size(); i++) {
                String str1 = strMap.get(i).str1;
                String str2 = strMap.get(i).str2;
                if (mainMap.get(str1) == null) mainMap.put(str1, location.myGetLocation());
                if (mainMap.get(str2) == null) mainMap.put(str2, location.myGetLocation());
                int x1 = mainMap.get(str1).x;
                int y1 = mainMap.get(str1).y;
                int x2 = mainMap.get(str2).x;
                int y2 = mainMap.get(str2).y;
                int len1 = getLen(l, str1);
                int len2 = getLen(l, str2);
                Location strL1 = getStrLocation(x1, y1, len1 / 2, str1);
                Location strL2 = getStrLocation(x2, y2, len2 / 2, str2);
                graph.setColor(Color.blue);
                graph.drawString(str1, strL1.x, strL1.y);
                graph.drawString(str2, strL2.x, strL2.y);
                if (str1.equals(str2)) {
                    graph.draw3DRect(x1, y1, len1, len1, true);
                } else {
                    graph.drawOval(x1, y1, len1, len1);
                    graph.drawOval(x2, y2, len2, len2);
                }
                //如果是同一个节点就连线否则不连线
                if (!str1.equals(str2)) {
                    if (i % 2 == 0) graph.setColor(Color.MAGENTA);
                    else graph.setColor(Color.GREEN);
                    graph.drawLine(x1 + len1 / 2, y1 + len1, x2 + len2 / 2, y2);
                }
            }
        }

        //传入直径，和字符串长度，返回直径
        private int getLen(int l, String str) {
            for (int i = 1; i < str.length(); i++) {
                if (i % 5 == 0) l = l + l / 4;
            }
            return l;
        }

        //根据字符串的长度改变其在节点中的位置
        public Location getStrLocation(int x, int y, int r, String str) {
            x += (r - 4);
            y += (r + 5);
            if (str.length() > 1) {
                for (int i = 0; i < str.length(); i++) x -= 1;
            }
            return new Location(x, y);
        }
    }
}
