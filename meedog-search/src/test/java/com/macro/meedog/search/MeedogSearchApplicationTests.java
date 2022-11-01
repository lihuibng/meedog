package com.macro.meedog.search;

import com.macro.meedog.search.domain.EsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.IndexOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MeedogSearchApplicationTests {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGetAllEsUserList() {

    }

    @Test
    public void testEsUserMapping() {
        IndexOperations indexOperations = elasticsearchTemplate.indexOps(EsUser.class);
        indexOperations.putMapping(indexOperations.createMapping(EsUser.class));
        Map mapping = indexOperations.getMapping();
        System.out.println(mapping);
    }

}
