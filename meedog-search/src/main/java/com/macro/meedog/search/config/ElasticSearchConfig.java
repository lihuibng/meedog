package com.macro.meedog.search.config;

import lombok.Data;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author "xxxxxx"
 * @modified 2021/3/31 7:46 下午
 */
@Configuration
@Component
@Data
public class ElasticSearchConfig {
    //@Autowired
    //CredentialsProvider credentialsProvider;
    /**
     * ES地址,ip:port
     */
    @Value("${spring.elasticsearch.rest.uris}")
    private String[] esUris;
    @Value("${spring.elasticsearch.rest.connection-timeout}")
    private int connectTimeOut; // 连接超时时间
    @Value("${spring.elasticsearch.rest.max-connection}")
    private int maxConnection; //最大连接数
    @Value("${spring.elasticsearch.rest.max-search-results}")
    private int maxSearchResults; //最大检索数据
    @Value("${spring.elasticsearch.rest.max-per-search-results}")
    private int maxPerSearchResults; //最大单次检索数据

    @Bean
    public RestClientBuilder restClientBuilder() {
        HttpHost[] hosts = Arrays.asList(esUris)
                .stream()
                .map(this::makeHttpHost)
                .filter(Objects::nonNull)
                .toArray(HttpHost[]::new);
        System.out.println("hosts:{}" + Arrays.toString(hosts));

        //配置权限验证
        /*
        String username;
        String password;
        credentialsProvider.setCredentials(
                AuthScope.ANY,
                new UsernamePasswordCredentials(username, password));
        */
        RestClientBuilder restClient =
                RestClient.builder(hosts).setHttpClientConfigCallback(
                        new RestClientBuilder.HttpClientConfigCallback() {
                            @Override
                            public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
                                return httpClientBuilder.setDefaultRequestConfig(RequestConfig.DEFAULT);

                            }
                        });
        return restClient;
    }


    @Bean(name = "highLevelClient")
    public RestHighLevelClient highLevelClient(@Autowired RestClientBuilder restClientBuilder) {
        return new RestHighLevelClient(restClientBuilder);
    }

    private HttpHost makeHttpHost(String s) {
        String[] address = s.split(":");
        String ip = address[0];
        int port = Integer.parseInt(address[1]);
        return new HttpHost(ip, port, "http");
    }

}
