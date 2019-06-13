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
public class TbProductCatDTO implements Serializable {

    /** 主键 **/
    private Long id;

    /** 父id **/
    private Long prientId;

    /** 名称 **/
    private String name;

    /** 状态 **/
    private String status;

    /** 排序 **/
    private Long sortOrder;

    /** 修改时间 **/
    private Date updatetime;

    /** 创建时间 **/
    private Date createtime;
}
