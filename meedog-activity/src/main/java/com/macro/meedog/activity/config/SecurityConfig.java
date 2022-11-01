package com.macro.meedog.activity.config;

import com.macro.meedog.activity.bo.AdminUserDetails;
import com.macro.meedog.mapper.UserAdminMapper;
import com.macro.meedog.model.UserAdmin;
import com.macro.meedog.model.UserAdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * SpringSecurity相关配置
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserAdminMapper uAdminMapper;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()//配置权限
                .antMatchers("/**").permitAll()
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

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                UserAdminExample example = new UserAdminExample();
                example.createCriteria().andUsernameEqualTo(username);
                List<UserAdmin> uAdminList = uAdminMapper.selectByExample(example);
                if (uAdminList != null && uAdminList.size() > 0) {
                    return new AdminUserDetails(uAdminList.get(0));
                }
                throw new UsernameNotFoundException("用户名或密码错误");
            }
        };
    }
}
