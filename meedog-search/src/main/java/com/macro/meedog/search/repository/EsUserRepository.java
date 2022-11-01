package com.macro.meedog.search.repository;

import com.macro.meedog.search.domain.EsUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;
//import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

/**
 * 人ES操作类
 * Created by macro on 2018/6/19.
 */
@EnableReactiveElasticsearchRepositories
public interface EsUserRepository extends ElasticsearchRepository<EsUser, Long> {
    /**
     * 搜索查询
     *
     * @param nickname 人名称
     * @param wechat   人关键字
     * @param page     分页信息
     * @return
     */
    Page<EsUser> findByNicknameOrWechat(String nickname, String wechat, Pageable page);

}
