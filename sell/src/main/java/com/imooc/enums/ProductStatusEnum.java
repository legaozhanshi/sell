package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author jinhaoliang
 * @version 1.0
 * @date 2020/12/20 18:58
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "上架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String messgage) {
        this.code = code;
        this.message = messgage;
    }
}
