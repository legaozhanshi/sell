package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jinhaoliang
 * @version 1.0
 * @date 2020/12/20 18:23
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 查询商家商品
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
