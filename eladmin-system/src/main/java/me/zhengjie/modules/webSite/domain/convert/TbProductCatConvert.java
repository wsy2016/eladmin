package me.zhengjie.modules.webSite.domain.convert;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.collection.CollectionUtil;
import me.zhengjie.modules.webSite.domain.TbProductCat;
import org.springframework.data.domain.Page;
import me.zhengjie.modules.webSite.domain.dto.*;



/**
 * 
 * @author Sun
 * @date 2016年6月6日 上午11:07:34
 * @version 1.0
 */
public class TbProductCatConvert {

    /**
     * 将POJO实体转换为业务实体
     *
     * @param  tbProductCat POJO实体
     * @return TbProductCatDTO 业务实体
     */
    public static final TbProductCatDTO convertToDTO(TbProductCat tbProductCat) {
        if (null == tbProductCat) {
            return null;
        }

        TbProductCatDTO tbProductCatDTO = new TbProductCatDTO();
        tbProductCatDTO.setId(tbProductCat.getId());
        tbProductCatDTO.setPrientId(tbProductCat.getPrientId());
        tbProductCatDTO.setName(tbProductCat.getName());
        tbProductCatDTO.setStatus(tbProductCat.getStatus());
        tbProductCatDTO.setSortOrder(tbProductCat.getSortOrder());
        tbProductCatDTO.setUpdatetime(tbProductCat.getUpdatetime());
        tbProductCatDTO.setCreatetime(tbProductCat.getCreatetime());
        return tbProductCatDTO;
    }

    /**
     * 将POJO实体对象集合转换为业务对象集合
     *
     * @param list POJO实体对象集合
     * @return List<TbProductCatDTO> 业务对象集合
     */
    public static final List<TbProductCatDTO> convertToDTOs(List<TbProductCat> list ) {
        if (CollectionUtil.isEmpty(list)) {
            return new ArrayList<TbProductCatDTO>();
        }
        List<TbProductCatDTO> tbProductCats = new ArrayList<TbProductCatDTO>();

        for (TbProductCat tbProductCat : list) {
            tbProductCats.add(convertToDTO(tbProductCat));
        }
        return tbProductCats;
    }


    /**
     * 将业务实体转换为POJO实体
     *
     * @param  tbProductCatDTO 业务实体类
     * @return TbProductCat POJO实体
     */
    public static final TbProductCat convertToBean(TbProductCatDTO tbProductCatDTO) {
        if (null == tbProductCatDTO) {
            return null;
        }

        TbProductCat tbProductCat = new TbProductCat();
        tbProductCat.setId(tbProductCatDTO.getId());
        tbProductCat.setPrientId(tbProductCatDTO.getPrientId());
        tbProductCat.setName(tbProductCatDTO.getName());
        tbProductCat.setStatus(tbProductCatDTO.getStatus());
        tbProductCat.setSortOrder(tbProductCatDTO.getSortOrder());
        tbProductCat.setUpdatetime(tbProductCatDTO.getUpdatetime());
        tbProductCat.setCreatetime(tbProductCatDTO.getCreatetime());
        return tbProductCat;
    }

    /**
     * 将业务实体对象集合转换为持久化对象集合
     *
     * @param tbProductCatDTOs 业务实体对象集合
     * @return List<TbProductCat> 持久化对象集合
     */
    public static final List<TbProductCat> convertToBeans(List<TbProductCatDTO> tbProductCatDTOs) {
        if (CollectionUtil.isEmpty(tbProductCatDTOs)) {
            return new ArrayList<TbProductCat>();
        }
        List<TbProductCat> listTbProductCat = new ArrayList<TbProductCat>();

        for (TbProductCatDTO tbProductCatDTO : tbProductCatDTOs) {
            listTbProductCat.add(TbProductCatConvert.convertToBean(tbProductCatDTO));
        }
        return listTbProductCat;
    }

}
