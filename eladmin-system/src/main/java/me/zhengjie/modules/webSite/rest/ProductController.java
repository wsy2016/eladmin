package me.zhengjie.modules.webSite.rest;

import me.zhengjie.aop.log.Log;
import me.zhengjie.exception.BadRequestException;
import me.zhengjie.modules.system.domain.Job;
import me.zhengjie.modules.system.service.JobService;
import me.zhengjie.modules.system.service.dto.JobQueryCriteria;
import me.zhengjie.modules.webSite.domain.TbProduct;
import me.zhengjie.modules.webSite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 *
 * @author: wsy
 * @date: 2019/6/12 19:53
 */
@RestController
@RequestMapping("api")
public class ProductController {
    @Autowired
    private ProductService productService;

    private static final String ENTITY_NAME = "product";


    @Log("查询产品")
    @GetMapping(value = "/product")
    @PreAuthorize("hasAnyRole('ADMIN','USERJOB_ALL','USERJOB_SELECT','USER_ALL','USER_SELECT')")
    public ResponseEntity getJobs(Pageable pageable) {
        // 数据权限
        return new ResponseEntity(productService.queryAll(pageable), HttpStatus.OK);
    }

    @Log("新增产品")
    @PostMapping(value = "/product")
    @PreAuthorize("hasAnyRole('ADMIN','USERJOB_ALL','USERJOB_CREATE')")
    public ResponseEntity create(@Validated @RequestBody TbProduct resources){
        if (resources.getId() != null) {
            throw new BadRequestException("A new "+ ENTITY_NAME +" cannot already have an ID");
        }
        return new ResponseEntity(productService.create(resources), HttpStatus.CREATED);
    }

//    @Log("修改产品")
//    @PutMapping(value = "/product")
//    @PreAuthorize("hasAnyRole('ADMIN','USERJOB_ALL','USERJOB_EDIT')")
//    public ResponseEntity update(@Validated(Job.Update.class) @RequestBody TbProduct resources){
//        productService.update(resources);
//        return new ResponseEntity(HttpStatus.NO_CONTENT);
//    }

    @Log("删除产品")
    @DeleteMapping(value = "/product/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','USERJOB_ALL','USERJOB_DELETE')")
    public ResponseEntity delete(@PathVariable Long id){
        productService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
