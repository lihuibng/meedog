package com.macro.meedog.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 *
 * @author macro
 * @date 2019/4/8
 */
@Configuration
@MapperScan({"com.macro.meedog.mapper", "com.macro.meedog.search.dao"})
public class MyBatisConfig {
}
