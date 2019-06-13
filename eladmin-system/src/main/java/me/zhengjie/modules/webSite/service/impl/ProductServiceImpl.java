package me.zhengjie.modules.webSite.service.impl;

import com.alipay.api.domain.Product;
import me.zhengjie.modules.webSite.domain.TbProduct;
import me.zhengjie.modules.webSite.domain.convert.TbProductConvert;
import me.zhengjie.modules.webSite.domain.dto.TbProductDTO;
import me.zhengjie.modules.webSite.repository.ProductRepository;
import me.zhengjie.modules.webSite.service.ProductService;

import me.zhengjie.utils.PageUtil;
import me.zhengjie.utils.QueryHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;

/**
 * Description:
 *
 * @author: wsy
 * @date: 2019/6/12 19:59
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;


    @Override
    public TbProductDTO findById(Long id) {
        return TbProductConvert.convertToDTO(repository.findById(id).get());
    }

    @Override
    public TbProductDTO create(TbProduct resources) {
        return TbProductConvert.convertToDTO(repository.save(resources));
    }

    @Override
    public void update(TbProduct resources) {
        repository.save(resources);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public Object queryAll(Pageable pageable) {
        return PageUtil.toPage(repository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root, null, criteriaBuilder), pageable));

    }
}
