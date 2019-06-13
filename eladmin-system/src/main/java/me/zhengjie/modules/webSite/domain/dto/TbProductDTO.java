package me.zhengjie.modules.webSite.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 业务实体
 *
 * @author wsy
 * @version $v: 1.0.0, $time:2017-07-17 17:57:00 Exp $
 */
@Data
public class TbProductDTO implements Serializable {

    /** 主键 **/
    private Long id;

    /** 名称 **/
    private String name;

    /** 标题 **/
    private String title;

    /** 图片 **/
    private String image;

    /** 类目ID **/
    private Long cid;

    /** 状态 **/
    private Boolean enabled;

    /**  **/
    private Date updatetime;

    /**  **/
    private Date createtime;




}
