package com.macro.meedog.server.service;

import com.macro.meedog.server.config.TairConfig;
import com.macro.meedog.server.domain.Image;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/1/3 4:01 下午
 */

public interface ImageService {

    /**
     * init
     *
     * @return
     */
    void init(TairConfig tairConfig);

    /**
     * store
     *
     * @param
     * @return
     */
    Long store(String imageName, byte[] imageContent);

    /**
     * loadAll
     *
     * @return Stream<Path>
     */
    List<Image> loadAll();

    /**
     * load
     *
     * @param id
     * @return Path
     */
    Image load(Long id);


    /**
     * deleteAll
     *
     * @return
     */
    void deleteAll();
}
