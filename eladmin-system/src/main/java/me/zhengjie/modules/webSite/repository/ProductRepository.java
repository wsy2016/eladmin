package me.zhengjie.modules.webSite.repository;

import me.zhengjie.modules.webSite.domain.TbProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author Zheng Jie
* @date 2019-04-10
*/
public interface ProductRepository extends JpaRepository<TbProduct, Long>, JpaSpecificationExecutor<TbProduct> {
}