package com.macro.meedog.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * @author "xxxxxx"
 * @modified 2020/11/14 3:44 下午
 */
@Configuration
public class MailConfig {
    @Bean
    public JavaMailSenderImpl mailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        javaMailSender.setProtocol("smtp");
        javaMailSender.setHost("smtp.163.com");
        javaMailSender.setPort(465);
        javaMailSender.setUsername(""xxxxxx"");
        javaMailSender.setPassword("xxxxxx");
        javaMailSender.setDefaultEncoding("UTF-8");
        Properties prop = new Properties();
        prop.setProperty("mail.smtp.auth", "false");
        prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        javaMailSender.setJavaMailProperties(prop);

        return javaMailSender;
    }
}
