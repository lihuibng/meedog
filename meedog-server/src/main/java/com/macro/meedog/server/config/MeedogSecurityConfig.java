package com.macro.meedog.server.config;

import com.macro.meedog.security.config.SecurityConfig;
import com.macro.meedog.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * meedog-security模块相关配置
 * Created by macro on 2019/11/5.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MeedogSecurityConfig extends SecurityConfig {

    @Autowired
    private UserService userService;

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return username -> userService.loadUserByUsername(username);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()//配置权限
                //.antMatchers("/**").permitAll()
                .antMatchers(
                        HttpMethod.GET,
                        "/image/get/**"
                ).permitAll()
                .and()//启用基于http的认证
                .httpBasic()
                .realmName("/")
                .and()//配置登录页面
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error=true")
                .and()//配置退出路径
                .logout()
                .logoutSuccessUrl("/")
//                .and()//记住密码功能
//                .rememberMe()
//                .tokenValiditySeconds(60*60*24)
//                .key("rememberMeKey")
                .and()//关闭跨域伪造
                .csrf()
                .disable()
                .headers()//去除X-Frame-Options
                .frameOptions()
                .disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
    }
}
