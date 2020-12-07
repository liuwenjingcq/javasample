package com.stream;

import java.util.List;
import java.util.*;

public class StreamReduceV1 {
    public static void main(String[] args) {
        //按行读取配置文件
        List<String> props = List.of("profile = native", "debug=true", "logging=warn", "interval=500");
        Map<String, String> map = (Map<String, String>) props.stream()
                //把k=v 转换为map[k]=v
                .map(kv -> {
                    String[] ss = kv.split("\\=", 2);
                    return Map.of(ss[0], ss[1]);
                })
                //把所有map聚合到一个map
                .reduce(new HashMap<String, String>(), (m, kv) -> {
                    m.putAll(kv);
                    return m;
                });
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
    }
}
