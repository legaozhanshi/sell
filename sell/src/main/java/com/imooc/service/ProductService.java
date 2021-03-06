package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author jinhaoliang
 * @version 1.0
 * @date 2020/12/20 18:53
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询上架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存


    //减库存
}
