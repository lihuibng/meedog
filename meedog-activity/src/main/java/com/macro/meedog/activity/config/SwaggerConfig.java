package com.macro.meedog.activity.config;

import com.macro.meedog.common.config.BaseSwaggerConfig;
import com.macro.meedog.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.macro.meedog.activity.controller")
                .title("meedog-activity系统")
                .description("SpringBoot版本中的一些示例")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
