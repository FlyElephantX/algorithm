package com.example.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class JsonDiff {

    public void compareJSONObject(JSONObject json1, JSONObject json2, String key) {
        Iterator<String> iterator = json1.keySet().iterator();
        while (iterator.hasNext()) {
            key = iterator.next();
            compareObject(json1.get(key), json2.get(key), key);
        }
    }

    // 对象比较
    public void compareObject(Object obj1, Object obj2, String key) {
        if (obj1 instanceof JSONObject) {
            compareJSONObject((JSONObject)obj1, (JSONObject)obj2, key);
        } else if (obj1 instanceof JSONArray) {
            compareJSONArray((JSONArray)obj1, (JSONArray)obj2, key);
        } else if (obj1 instanceof String) {
            compareString((String)obj1, (String) obj2, key);
        } else {
            compareString(obj1.toString(), obj2.toString(), key);
        }
    }

    // 数组比较
    public void compareJSONArray(JSONArray arr1, JSONArray arr2, String key) {
        if (arr1 != null && arr2 != null) {
            Iterator iterator1 = arr1.iterator();
            Iterator iterator2 = arr2.iterator();
            while (iterator1.hasNext()) {
                compareObject(iterator1.next(), iterator2.next(), key);
            }
        } else {
            if (arr1 == null && arr2 == null) {
                System.err.println("key:" + key + "在json1和json2中均不存在");
            } else if (arr1 == null) {
                System.err.println("key:" + key + "在json1中不存在");
            } else if (arr2 == null) {
                System.err.println("key:" + key + "在json2中不存在");
            } else {
                System.err.println("key:" + key + "未知原因");
            }
        }
    }

    // 字符串比较
    public void compareString(String str1, String str2, String key) {
        if (!str1.equals(str2)) {
            System.out.println("不一致的key:" + key + "---Value1:" + str1 + "---Value2:" + str2);
        }
    }
}
