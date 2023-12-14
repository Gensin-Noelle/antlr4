package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 处理主函数与被调用函数的关系，将其映射在map中
 */
public class Relation {
    private final ArrayList<String> mainList;
    private final ArrayList<String> callList;

    Map<Integer, MyGraphic.MyStr> map;

    public Relation() {
        mainList = new ArrayList<>();
        callList = new ArrayList<>();
        map = new HashMap<>();
    }

    public ArrayList<String> getMainList() {
        return mainList;
    }

    public ArrayList<String> getCallList() {
        return callList;
    }

    public void displayRelation() {
        int count = 0;
        for (String i : mainList) {
            for (; count < callList.size(); count++) {
                if (callList.get(count).equals("EOF")) {
                    map.put(count, new MyGraphic.MyStr(i, i));
                    count++;
                    break;
                }
                map.put(count, new MyGraphic.MyStr(i, callList.get(count)));
                System.out.println(i + "->" + callList.get(count));
            }
        }
        new MyGraphic(map);
    }
}
