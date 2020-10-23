package com.example.json;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JsonApplicationTests {

    @Autowired
    JsonDiff jsonDiff;

    @Test
    void contextLoads() {
    }

    @Test
    void compareJSON1() {
        String str1 = "{\"username\":\"elephant\",\"age\":18,\"address\":[{\"province\":\"北京市\"},{\"city\":\"北京市\"},{\"disrtict\":\"海淀区\"}]}";
        String str2 = "{\"username\":\"elephant\",\"age\":18,\"address\":[{\"province\":\"上海市\"},{\"city\":\"上海市\"},{\"disrtict\":\"黄浦区\"}]}";
        JSONObject json1 = JSONObject.parseObject(str1);
        JSONObject json2 = JSONObject.parseObject(str2);
        jsonDiff.compareJSONObject(json1, json2, null);
    }

    @Test
    void compareJSON2() {
        String str1 = "{\"username\":\"elephant\",\"age\":18,\"address\":[{\"province\":\"北京市\"},{\"city\":\"北京市\"},{\"disrtict\":\"海淀区\"}]}";
        String str2 ="{username:\"elephant\",age:28}";
        JSONObject json1 = JSONObject.parseObject(str1);
        JSONObject json2 = JSONObject.parseObject(str2);
        jsonDiff.compareJSONObject(json1, json2, null);
    }

}
