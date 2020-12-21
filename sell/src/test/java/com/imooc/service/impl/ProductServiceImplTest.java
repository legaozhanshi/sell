package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jinhaoliang
 * @version 1.0
 * @date 2020/12/20 19:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductServiceImplTest.class)
@EnableJpaRepositories(basePackages = "com.imooc")
@EntityScan("com.imooc")
@ComponentScan("com.imooc")
@EnableAutoConfiguration(exclude = { JpaRepositoriesAutoConfiguration.class })
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456", productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());

    }


    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,2);
       Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("9981");
        productInfo.setProductName("烧鹅");
        productInfo.setProductPrice(new BigDecimal(98));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("名探烧鹅");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType("10");
        ProductInfo result = productService.save(productInfo);

    }
}