package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author jinhaoliang
 * @version 1.0
 * @date 2020/12/20 18:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductCategoryRepositoryTest.class)
@EnableJpaRepositories(basePackages = "com.imooc")
@EntityScan("com.imooc")
@EnableAutoConfiguration(exclude = { JpaRepositoriesAutoConfiguration.class })
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("烤鸡");
        productInfo.setProductPrice(new BigDecimal(98));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("炭炉烧鸡");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType("10");
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() throws Exception{
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }


}