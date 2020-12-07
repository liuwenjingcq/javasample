package com.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students {
    List<Student> list;
    Map<String, Integer> cache;

    Students(List<Student> list){
        this.list = list;
        cache = new HashMap<>();
    }

    int getScore(String name) {
        Integer score = this.cache.get(name);
        if (score == null) {
            //TODO:
        }
        return score == null ? -1 : score.intValue();
    }

    Integer findInList(String name) {
        for (var ss : this.list) {
            if (ss.name.equals(name)) {
                return ss.score;
            }
        }
        return null;
    }
}
