package linkedlists;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LoopDetection {

    public static Node detectLoop(Node n) {
        return detectLoop_(n, Collections.emptyMap());
    }

    public static Node detectLoop_(Node n, Map<Integer, Boolean> map) {
        if (map.containsKey(n.data)) {
            return n;
        }

        if (n.next == null) {
            return null;
        }

        Map<Integer, Boolean> newMap = new HashMap<>();
        newMap.putAll(map); // mutable :/
        newMap.put(n.data, true);

        return detectLoop_(n.next, newMap);
    }
}