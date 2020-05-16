package khg.com;

import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashMapAndTable {

    public static void main(String[] args){
        Map hashtable = new Hashtable();
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // 第一种遍历方式
        System.out.println("第一种遍历方式：通过遍历 Map 的 keySet，遍历 Key 和 Value");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // 第二种遍历方式(如果在遍历过程中，有删除某些Key-Value的需求，可以使用这种遍历方式)
        System.out.println("\n第二种遍历方式：通过Iterator 迭代器遍历 Key 和 Value");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 第三种遍历方式(推荐，尤其是容量大时)
        System.out.println("\n第三种遍历方式：通过遍历 Map 的 entrySet，遍历 Key 和 Value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 第四种遍历方式
        System.out.println("\n第四种遍历方式：通过遍历 Map 的 values，只能遍历 Value，获取不到对应的 Key");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 第五种遍历方式（JDK 1.8支持的 Lambda 表达式，强烈推荐！！！）
        System.out.println("\n第五种遍历方式：通过 Lambda 表达式，遍历 Key 和 Value");
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });


        hashtable.put(null,"null");
        hashtable.put("l","1");


    }



}
