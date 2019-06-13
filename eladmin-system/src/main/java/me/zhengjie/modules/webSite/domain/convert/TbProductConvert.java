package me.zhengjie.modules.webSite.domain.convert;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.collection.CollectionUtil;
import me.zhengjie.modules.webSite.domain.TbProduct;
import org.springframework.data.domain.Page;
import me.zhengjie.modules.webSite.domain.dto.TbProductDTO;


/**
 * 
 * @author Sun
 * @date 2016年6月6日 上午11:07:34
 * @version 1.0
 */
public class TbProductConvert {

    /**
     * 将POJO实体转换为业务实体
     *
     * @param  tbProduct POJO实体
     * @return TbProductDTO 业务实体
     */
    public static final TbProductDTO convertToDTO(TbProduct tbProduct) {
        if (null == tbProduct) {
            return null;
        }

        TbProductDTO tbProductDTO = new TbProductDTO();
        tbProductDTO.setId(tbProduct.getId());
        tbProductDTO.setName(tbProduct.getName());
        tbProductDTO.setTitle(tbProduct.getTitle());
        tbProductDTO.setImage(tbProduct.getImage());
        tbProductDTO.setCid(tbProduct.getCid());
        tbProductDTO.setEnabled(tbProduct.getEnabled());
        tbProductDTO.setUpdatetime(tbProduct.getUpdatetime());
        tbProductDTO.setCreatetime(tbProduct.getCreatetime());
        return tbProductDTO;
    }

    /**
     * 将POJO实体对象集合转换为业务对象集合
     *
     * @param list POJO实体对象集合
     * @return List<TbProductDTO> 业务对象集合
     */
    public static final List<TbProductDTO> convertToDTOs(List<TbProduct> list ) {
        if (CollectionUtil.isEmpty(list)) {
            return new ArrayList<TbProductDTO>();
        }
        List<TbProductDTO> tbProducts = new ArrayList<TbProductDTO>();

        for (TbProduct tbProduct : list) {
            TbProductDTO tbProductDTO = convertToDTO(tbProduct);
            tbProducts.add(tbProductDTO);
        }
        return tbProducts;
    }


    /**
     * 将业务实体转换为POJO实体
     *
     * @param  tbProductDTO 业务实体类
     * @return TbProduct POJO实体
     */
    public static final TbProduct convertToBean(TbProductDTO tbProductDTO) {
        if (null == tbProductDTO) {
            return null;
        }

        TbProduct tbProduct = new TbProduct();
        tbProduct.setId(tbProductDTO.getId());
        tbProduct.setName(tbProductDTO.getName());
        tbProduct.setTitle(tbProductDTO.getTitle());
        tbProduct.setImage(tbProductDTO.getImage());
        tbProduct.setCid(tbProductDTO.getCid());
        tbProduct.setEnabled(tbProductDTO.getEnabled());
        tbProduct.setUpdatetime(tbProductDTO.getUpdatetime());
        tbProduct.setCreatetime(tbProductDTO.getCreatetime());
        return tbProduct;
    }

    /**
     * 将业务实体对象集合转换为持久化对象集合
     *
     * @param tbProductDTOs 业务实体对象集合
     * @return List<TbProduct> 持久化对象集合
     */
    public static final List<TbProduct> convertToBeans(List<TbProductDTO> tbProductDTOs) {
        if (CollectionUtil.isEmpty(tbProductDTOs)) {
            return new ArrayList<TbProduct>();
        }
        List<TbProduct> listTbProduct = new ArrayList<TbProduct>();

        for (TbProductDTO tbProductDTO : tbProductDTOs) {
            listTbProduct.add(TbProductConvert.convertToBean(tbProductDTO));
        }
        return listTbProduct;
    }
    

}
