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
@Table(name = "tb_product")
public class TbProduct implements Serializable {

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


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "title", length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "image", length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "cid", length = 11)
    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @Column(name = "enabled", length = 1)
    public  Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
