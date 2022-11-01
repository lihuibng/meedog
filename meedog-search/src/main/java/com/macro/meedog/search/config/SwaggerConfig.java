package com.macro.meedog.search.config;

import com.macro.meedog.common.config.BaseSwaggerConfig;
import com.macro.meedog.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.macro.meedog.search.controller")
                .title("meedog搜索系统")
                .description("meedog搜索相关接口文档")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }
}
