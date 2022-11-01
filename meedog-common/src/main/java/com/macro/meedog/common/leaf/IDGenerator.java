package com.macro.meedog.common.leaf;

import com.macro.meedog.common.net.HttpUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.HashMap;

/**
 * @author "xxxxxx"
 * @modified 2020/11/13 9:16 下午
 */

@Component
public class IDGenerator {

    public Long generate() {
        try {
            String host = "http://"xxxxxx":8080";
            String path = "/api/snowflake/get/test";
            HashMap<String, String> headers = new HashMap<String, String>();
            //headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            HttpResponse response = HttpUtils.doGet(host, path, "GET", headers, null);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream in = entity.getContent();
                long count = entity.getContentLength();
                byte[] bytes = new byte[(int) count];
                in.read(bytes);
                Long id = Long.parseLong(new String(bytes));
                return id;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }
    /*public static void main(String[] args) {
        IDGenerator id = new IDGenerator();
        System.out.println(id.generate());
    }*/
}
