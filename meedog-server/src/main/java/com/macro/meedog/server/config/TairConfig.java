package com.macro.meedog.server.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/1/9 11:46 上午
 */

@Configuration
@Data
public class TairConfig {
    private List<String> configServers = new ArrayList<String>() {{
        add(""xxxxxx":5198");
    }};
    private String group = "group_1";
}
