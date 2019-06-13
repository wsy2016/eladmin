package me.zhengjie.modules.webSite.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * 
 *
 * @author wsy
 * @version $v: 1.0.0, $time:2017-07-17 17:57:00 Exp $
 */
@Entity
@Table(name = "tb_product_cat")
public class TbProductCat implements Serializable {

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


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "prient_id", length = 11)
    public Long getPrientId() {
        return prientId;
    }

    public void setPrientId(Long prientId) {
        this.prientId = prientId;
    }

    @Column(name = "name", length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "status", length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "sort_order", length = 3)
    public Long getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updatetime")
    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createtime")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}
