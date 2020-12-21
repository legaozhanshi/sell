package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author jinhaoliang
 * @version 1.0
 * @date 2020/12/20 18:03
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /**名字**/
    private String productName;
    /**价格**/
    private BigDecimal productPrice;
    /**库存**/
    private Integer productStock;
    /**描述**/
    private String productDescription;
    /**小图**/
    private String productIcon;
    /**状态，0正常1下架**/
    private Integer productStatus;
    /**类目编号**/
    private String categoryType;
}

