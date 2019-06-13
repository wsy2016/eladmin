package me.zhengjie.modules.webSite.service;

import com.alipay.api.domain.Product;

import me.zhengjie.modules.webSite.domain.TbProduct;
import me.zhengjie.modules.webSite.domain.dto.TbProductDTO;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;

/**
 * Description:
 *
 * @author: wsy
 * @date: 2019/6/12 19:58
 */
@CacheConfig(cacheNames = "product")
public interface ProductService {
    /**
     * findById
     * @param id
     * @return
     */
    @Cacheable(key = "#p0")
    TbProductDTO findById(Long id);

    /**
     * create
     * @param resources
     * @return
     */
    @CacheEvict(allEntries = true)
    TbProductDTO create(TbProduct resources);

    /**
     * update
     * @param resources
     */
    @CacheEvict(allEntries = true)
    void update(TbProduct resources);

    /**
     * delete
     * @param id
     */
    @CacheEvict(allEntries = true)
    void delete(Long id);

    /**
     * queryAll
     * @param pageable
     * @return
     */
    Object queryAll(Pageable pageable);
}
